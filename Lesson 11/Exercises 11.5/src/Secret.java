public enum Secret {
    STAR, CRASH, START;

    public static int findByStar() {
        int count = 0;
        for (Secret value : values()) {
            if (value == Secret.valueOf("STAR")) {
                 count++;
            }
        }
return count;
    }
}

class Main{
    public static void main(String[] args) {

        System.out.println(Secret.findByStar());// La consola arata 1, nu stiu exact cum sa caut anume fragmentul STAR
    }
}