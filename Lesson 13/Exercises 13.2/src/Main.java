public class Main {
    public static void main(String[] args) {
        Publication p = new Publication("The new era");
        Publication p1 = new Newspaper("Football results", "Sport news");
        Publication p2 = new Article("Why the Sun is hot", "Dr James Smith");
        Publication p3 = new Announcement("Will sell a house", 30);
        System.out.println(p1.getInfo());

    }
}
