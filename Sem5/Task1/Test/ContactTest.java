import java.util.Date;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.assertj.core.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactTest {
    public String name = "name";
    public String nachName = "nachName";
    public Date birthDay;
    public String tel = "telefon";
    public String email = "email@email.ru";
    public Contact contact;
    public int id = 555777;
    public int idDefault = 0;

    @BeforeEach
    void setUp() {
        contact = new Contact.ContactBuilder().setName(name).setNachName(nachName)
                .setBirthDay(birthDay).setMail(email).setTel(tel).build();
    }

    @Test
    void getName() {
        assertThat(contact.getName()).isEqualTo(name);
    }

    @Test
    void getNachName() {
        assertThat(contact.getNachName()).isEqualTo(nachName);
    }

    @Test
    void getEmail() {
        assertThat(contact.getEmail()).isEqualTo(email);
    }

    @Test
    void getTel() {
        assertThat(contact.getTel()).isEqualTo(tel);
    }

    @Test
    void getBirthDay() {
        assertThat(contact.getBirthDay()).isEqualTo(birthDay);
    }

    @Test
    void getId() {
        assertThat(contact.getId()).isEqualTo(idDefault);
    }

    @Test
    void setId() {
        contact.setId(id);
        assertThat(contact.getId()).isEqualTo(id);
    }
}