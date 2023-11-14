public class Main {
    public static void main(String[] args) {
        Contact testContact1 = new Contact.ContactBuilder().setName("Ivan").setNachName("Ivanov").setTel("+7 928 123 4567").build();
        Contact testContact2 = new Contact.ContactBuilder().setName("Pert").setNachName("Petrovich").setTel("+7 908 123 4567").build();
        System.out.println(testContact1);
        System.out.println(testContact2);

        Repository repository = new Repository();
        repository.add(testContact1);
        repository.add(testContact2);
        System.out.println(repository);

        //Сквозной тест
        fullTest();
    }

    public static void fullTest(){
        System.out.println("--- BookTest ---");
        System.out.println("-1. Add 3 users");

        Book book = new Book();
        book.addContact(book.newContact("Sidr", "Sidorov"));
        book.addContact(book.newContact("Sidr", "Sidorovich"));
        book.addContact(book.newContact("Stepan", "Stepanov"));
        book.addContact(book.newContact("Artem", "Artenov"));

        System.out.println(book);

        System.out.println("-2. Find user with id = 1");
        System.out.println(book.getById(1));

        System.out.println("\n-3. Find users with name = Sidr");
        System.out.println(book.getByName("Sidr"));

        System.out.println("\n-4. Delete user with id = 2");
        book.delContact(book.getById(2));
        System.out.println(book);

    }
}
