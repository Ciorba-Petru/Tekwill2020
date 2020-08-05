public class Announcement extends Publication {
    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);

        this.daysToExpire = daysToExpire;
    }

    public String getType() {
        return "Announcement";
    }

    public String getDetails() {
        return "daysToExpire" + "-" + daysToExpire;
    }
// write your code here
}