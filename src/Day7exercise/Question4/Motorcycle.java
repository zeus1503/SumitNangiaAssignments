package Day7exercise.Question4;

class cycle{
    public void description() {
        System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }
}

    public class Motorcycle extends cycle {

        public static void main(String[] args) {
            Motorcycle mc =new Motorcycle();
            mc.description();
        }
        public void description() {
            System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
            super.description();
        }

    }


