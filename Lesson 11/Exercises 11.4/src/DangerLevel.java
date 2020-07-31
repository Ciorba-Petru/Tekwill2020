public enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);
    int store;
    DangerLevel(int store){
        this.store = store;
    }
    public int getLevel() {
        return store;
    }

    }
     class Main {
        public static void main(String[] args) {


            DangerLevel high = DangerLevel.HIGH;
            DangerLevel medium = DangerLevel.MEDIUM;

            System.out.println(high.getLevel() > medium.getLevel());

        }
}
