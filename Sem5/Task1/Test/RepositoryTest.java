import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class RepositoryTest {
    public Repository repository = new Repository();
    public Contact contact1;
    public Contact contact2;
    public Contact contact3;
    public Contact contact4;

    @BeforeEach
    void setUp() {
        contact1 = new Contact.ContactBuilder().setName("Name1").setNachName("Famil1").build();
        contact2 = new Contact.ContactBuilder().setName("Name2").setNachName("Famil2").build();
        contact3 = new Contact.ContactBuilder().setName("Name3").setNachName("Famil3").build();
        contact4 = new Contact.ContactBuilder().setName("Name4").setNachName("Famil4").build();
        repository.add(contact1);
        repository.add(contact2);
        repository.add(contact3);
    }

    @Test
    void getById() {
        assertThat(repository.getById(1)).isEqualTo(contact1);
    }


    @Test
    void getByName() {
        assertThat(repository.getByName(contact1.getName()).get(0)).isEqualTo(contact1);
    }

    @Test
    void getAll() {
        int original = repository.getSize();
        assertThat(repository.getAll().size()).isEqualTo(original);
    }

    @Test
    void add() {
        int befor = repository.getSize();
        repository.add(contact4);
        assertThat(repository.getSize()).isEqualTo(befor+1);
    }

    @Test
    void update() {
        //TODO
    }

    @Test
    void delete() {
        int befor = repository.getSize();
        repository.delete(contact1);
        assertThat(repository.getSize()).isEqualTo(befor-1);
    }

    @Test
    void getSize() {
        assertThat(repository.getSize()).isEqualTo(3);
    }
}