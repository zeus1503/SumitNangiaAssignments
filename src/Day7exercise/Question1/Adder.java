package Day7exercise.Question1;

class Adder extends Arithmetic{

    public static void main (String [] args) {
        Arithmetic arth = new Arithmetic();
        int a = arth.add(20,15);
        System.out.println(a);
    }
}
