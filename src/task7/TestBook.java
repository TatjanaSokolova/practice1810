package task7;

public class TestBook {
    public static void main(String[] args) {
        Author firstauthor = new Author("George Raymond Richard Martin", "grrm@gmail.com", 'm');
        Book firstbook = new Book("A Dance with Dragons: A Song of Ice and Fire: Book Five", firstauthor, 16.95, 500);
        System.out.println(firstbook.toString());

        Book secondbook = new Book("Harry Potter and the Philosopher's Stone",
                new Author("J. K. Rowling", "jkr@gmail.com", 'w'),
                29.95,
                888);

        String secondauthorname = secondbook.getAuthor().getName();
        String secondauthoremail = secondbook.getAuthor().getEmail();
        System.out.println(secondauthorname);
        System.out.println(secondauthoremail + "\n");

        System.out.println(firstbook.getAuthorName());
        System.out.println(firstbook.getAuthorEmail());
        System.out.println(firstbook.getAuthorGender());
    }
}
