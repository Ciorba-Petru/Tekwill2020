public class Main {
    public static void main(String[] args) {

    }
    class CakeBox {
        private Cake cake;
        public void put(Cake cake) {
            this.cake = cake;
        }
        public Cake get() {
            return this.cake;
        }
    }
    class PieBox{
        private Pie pie;
        public void put(Pie pie) {
            this.pie = pie;
        }
        public Pie get() {
            return this.pie;
        }
    }
    class TartBox {
        private Tart tart;

        public void put(Tart tart) {
            this.tart = tart;
        }
        public Tart get() {
            return this.tart;
        }
    }
    class Box <B> {
        private B b;
        public void put(B b) {
            this.b = b;
        }
        public B get() {
            return this.b;
        }
    }
    class Cake {

    }
    class Pie {

    }
    class Tart {

    }
}
