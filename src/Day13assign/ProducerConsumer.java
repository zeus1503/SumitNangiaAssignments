package Day13assign;

public class ProducerConsumer {


    public static void main(String[] args) {

        Crypto c = new Crypto();
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 1);
        p1.start();
        c1.start();

    }

}

class Crypto {
    private int contents;
    private boolean available = false;

    public synchronized int get() {
        while (available == false) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        available = false;
        notifyAll();
        return contents;
    }

    public synchronized void put(int value) {
        while (available == true) {
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        contents = value;
        available = true;
        notifyAll();
    }
}


class Consumer extends Thread {
    private Crypto crypto;
    private int number;

    public Consumer(Crypto c, int number) {
        crypto = c;
        this.number = number;
    }
    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = crypto.get();
            System.out.println("Consumer #" + this.number + " got: " + value);
        }
    }
}


class Producer extends Thread {
    private Crypto crypto;
    private int number;
    public Producer(Crypto c, int number) {
        crypto = c;
        this.number = number;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            crypto.put(i);
            System.out.println("Producer #" + this.number + " put: " + i);
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) { }
        }
    }
}
