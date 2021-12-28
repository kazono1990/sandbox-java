package jp.co.kazono.java.sample;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueSample {
    public static void main(String[] args) {
        // capacityに設定した個数までしか入れられないように
        Queue queue = new ArrayBlockingQueue(2);

        // offer() → Queueに入れられる場合はtrue、そうでない場合はfalse
        System.out.println(queue.offer(1));
        System.out.println(queue.offer(2));
        System.out.println(queue.offer(3));

        // peek() → Queueの先頭を参照 (取り出さない)
        System.out.println(queue.peek());
        System.out.println(queue.size());

        // poll() → Queueの先頭を取り出す
        System.out.println(queue.poll());
        System.out.println(queue.size());

        queue.clear();

        // add() → 追加するだけで上限は考慮しない
        // 上限を超えるとexceptionを投げて終了
        queue.add(1);
        queue.add(2);
        queue.add(3);
    }
}
