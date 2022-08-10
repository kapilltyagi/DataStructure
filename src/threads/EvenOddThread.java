package threads;

public class EvenOddThread {

    static int i = 1;

    void printEven(){
        while (i<10){
            synchronized (this){
                if(i%2 == 0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Thread.currentThread().getName()+" "+i);
                notify();
                i++;
            }
        }
    }

    void printOdd(){
        while (i<10){
            synchronized (this){
                if(i%2 != 0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Thread.currentThread().getName()+" "+i);
                notify();
                i++;
            }
        }
    }

    public static void main(String[] args) {
        EvenOddThread eot = new EvenOddThread();
        Thread even = new Thread(new Runnable() {
            @Override
            public void run() {
              eot.printEven();
            }
        },"Even");

        Thread odd = new Thread(new Runnable() {
            @Override
            public void run() {
                eot.printOdd();
            }
        },"Odd");

        even.start();
        odd.start();
    }
}
