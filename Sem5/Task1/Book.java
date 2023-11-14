//2023/11/14

import java.util.Date;
import java.util.List;

public class Book {
    private Repository repository = new Repository();

    public Contact newContact(String name, String nachName){
        return new Contact.ContactBuilder().setName(name).setNachName(nachName).build();
    }

    public Contact newContact(String name, String nachName, Date birthDay, String tel, String email){
        return new Contact.ContactBuilder().setName(name).setNachName(nachName)
                .setBirthDay(birthDay).setMail(email).setTel(tel).build();
    }

    public void addContact(Contact contact){
        repository.add(contact);
    }

    public void delContact(Contact contact){
        repository.delete(contact);
    }

    public Contact getById(int id){
        return repository.getById(id);
    }

    public List<Contact> getByName(String name){
        return repository.getByName(name);
    }

    @Override
    public String toString() {
        return repository.toString();
    }
}
