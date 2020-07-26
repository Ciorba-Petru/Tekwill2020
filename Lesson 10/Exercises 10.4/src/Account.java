public class Account {
    long balance;
    String ownerName;
    boolean locked;

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public boolean getLocked(){
        return locked;
    }
    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
