public class Newspaper extends Publication {
    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    public String getType() {
        return "Newspaper";
    }

    public String getDetails() {
        return "source" + "-" + source;
    }
// write your code here
}
