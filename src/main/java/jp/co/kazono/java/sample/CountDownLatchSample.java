package jp.co.kazono.java.sample;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchSample {

    private static final int LOOP_COUNT = 10;

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(LOOP_COUNT);
        new ThreadA(countDownLatch).start();
        new ThreadB(countDownLatch).start();
    }
}

class ThreadA extends Thread {
    CountDownLatch latch;
    public ThreadA (CountDownLatch latch) {
        this.latch = latch;
    }

    public void run () {
        System.out.println("ThreadA: Start.");
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ThreadA: Finished.");
    }
}

class ThreadB extends Thread {
    CountDownLatch latch;

    public ThreadB (CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadB: " + i);
            latch.countDown();
        }
    }
}
