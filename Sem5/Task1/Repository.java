//2023/11/14

import java.util.ArrayList;
import java.util.List;

public class Repository implements RepositoryInterface<Contact>{
    private int count = 0;
    private List<Contact> repository = new ArrayList();

    @Override
    public Contact getById(int id) {
        for(Contact contact: repository){
            if(contact.getId() == id) return contact;
        }
        return null;
    }

    @Override
    public List<Contact> getByName(String name) {
        List<Contact> returnList = new ArrayList<>();
        for(Contact contact: repository){
            if(contact.getName().equals(name)) returnList.add(contact);
        }
        return returnList;
    }

    @Override
    public List<Contact> getAll() {
        return new ArrayList<>(repository);
    }

    @Override
    public void add(Contact contact) {
        count++;
        contact.setId(count);
        repository.add(contact);
    }

    @Override
    public void update(Contact newContact) {
        for(int i = 0; i < repository.size(); i++){
            if(repository.get(i).getId() == newContact.getId()){
                repository.set(i, newContact);
                return;
            }
        }
    }

    @Override
    public void delete(Contact contact) {
        for(int i = 0; i < repository.size(); i++){
            if(repository.get(i).equals(contact)){
                repository.remove(i);
                return;
            }
        }
    }

    @Override
    public int getSize() {
        return repository.size();
    }

    @Override
    public String toString(){
        StringBuilder returnString = new StringBuilder();
        returnString.append("--- Repository ---\n");
        for (Contact contact : repository){
            returnString.append(contact);
            returnString.append("\n");
        }

        returnString.append("--- end ---\n");
        return returnString.toString();
    }
}
