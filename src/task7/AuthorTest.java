package task7;

public class AuthorTest {
    public static void main(String[] args) {
        Author obj = new Author("Bob", "first@gmail.com", 'm');
        System.out.println(obj.toString());
        System.out.println(obj.getEmail());
        obj.setEmail("first123@gmail.com");

        System.out.println(obj.toString());
        char bbb = obj.getGender();
        System.out.println(bbb);
    }
}