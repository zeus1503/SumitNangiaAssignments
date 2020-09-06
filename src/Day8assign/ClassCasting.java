package Day8assign;

public class ClassCasting {


    public static class Animal {

        int a = 10;

        public Animal() {
        }
    }

    public  class Dog extends Animal{

        int b = 20;

    }

    public  class Man extends Dog {
        int c = 30;


    }

    public static void main(String[] args) {

        try {
            Animal a = new Animal();
            Dog d = (Dog) a; // No problem here
            Man m = (Man) d; // Raises class cast exception; you can't cast a dog to man.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
