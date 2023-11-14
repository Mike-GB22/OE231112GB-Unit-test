// 2023/11/14
import java.util.Date;

public class Contact {
    private int id;
    private String name;
    private String nachName;
    private String email;
    private String tel;
    private Date birthDay;

    private Contact(String name, String nachName, Date birthDay, String email, String tel){
        this.name = name;
        this.nachName = nachName;
        this.email = email;
        this.tel = tel;
        this.birthDay = birthDay;
    }

    static class ContactBuilder{
        private String name = "no name";
        private String nachName = "no family name";
        private String email;
        private String tel;
        private Date birthDay = new Date();


        public ContactBuilder setName(String name){
            this.name = name;
            return this;
        }

        public ContactBuilder setNachName(String name){
            this.nachName = name;
            return this;
        }

        public ContactBuilder setMail(String email){
            this.email = email;
            return this;
        }

        public ContactBuilder setTel (String tel){
            this.tel = tel;
            return this;
        }

        public ContactBuilder setBirthDay (Date birthDay){
            this.birthDay = birthDay;
            return this;
        }

        public Contact build(){
            return new Contact(name, nachName, birthDay, email, tel);
        }

    }

    public String getName() {
        return name;
    }

    public String getNachName() {
        return nachName;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        StringBuilder returnString = new StringBuilder();
        returnString.append("{[" + this.id + "] ");
        returnString.append(this.name + " ");
        returnString.append(this.nachName + " (");
        returnString.append(this.birthDay + ") ");
        returnString.append(this.email + ", ");
        returnString.append(this.tel + "} ");
        return returnString.toString();
    }
}
