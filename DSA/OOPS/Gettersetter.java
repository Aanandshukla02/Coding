public class Gettersetter {
    public static void main(String[] args) {
        Book b1 = new Book(); // created a book object called b1
        b1.setTitle("To Kill a Mockingbird");
        System.out.println(b1.getTitle());
        b1.setAuthor("Harper Lee");
        System.out.println(b1.getAuthor());
        b1.setPages(281);
        System.out.println(b1.getPages());
        // b1.setTitle("1984");
        b1.setTitle("1984");
        System.out.println(b1.getTitle());
    }
}

class Book {
    // Properties and methods
    private String title;
    private String author;
    private int pages;

    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    int getPages() {
        return this.pages;
    }

    void setTitle(String newTitle) {
        this.title = newTitle;
    }

    void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    void setPages(int newPages) {
        this.pages = newPages;
    }
}
