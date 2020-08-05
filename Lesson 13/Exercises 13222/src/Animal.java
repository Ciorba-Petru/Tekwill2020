class Animal {
    void makeNoise() {
        System.out.println("Default animal noise.");
    }
}

class Dog extends Animal {
    void makeNoise() {
        System.out.println("Bark!");
    }
    void doTricks() {
        System.out.println("Rolling over, etc.");
    }
}

class DemoPoly {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeNoise();
        //myDog.doTricks(); //COMPILER ERROR! NO SUCH METHOD IN Animal
        Dog dogRef = (Dog)myDog; //DOWNCAST REFERENCE BACK TO TYPE DOG
        dogRef.doTricks(); //NOW IT WORKS
    }
}