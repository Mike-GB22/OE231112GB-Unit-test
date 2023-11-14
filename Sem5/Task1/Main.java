public class Main {
    public static void main(String[] args) {
        Contact testContact = new Contact.ContactBuilder().setName("Ivan").setNachName("Ivanov").setTel("+7 928 123 4567").build();
        System.out.println(testContact);
    }
}
