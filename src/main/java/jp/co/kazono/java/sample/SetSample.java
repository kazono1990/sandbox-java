package jp.co.kazono.java.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetSample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] samples = new int[]{1, 1, 1, 2, 3, 4, 4, 5, 6, 7, 8, 8, 9, 10};

        for (int i : samples) {
            // HashSetはadd()で指定した要素がまだない場合はtrue、そうでない場合はfalseを返す
            System.out.println("Number: " + i + " Set Boolean: " + set.add(i));
        }
        // Clear
        set.clear();

        // List<Integer> list = Arrays.asList(samples)はできない。
        // Arrays.asListはプリミティブ型の配列全体を単一の要素として扱うっぽい。
        // ↓ みたいにすればいけるけどやりづらい。
        // Integer[] array = {new Integer(1), new Integer(2)};
        // List<Integer> list = Arrays.asList(array);
        List<Integer> list = new ArrayList<>(samples.length);
        for (int i = 0; i < samples.length; i++) {
            list.add(samples[i]);
        }

        // listをHashSetに変換する場合
        set = new HashSet<>(list);
        System.out.println("Length of samples: " + samples.length);
        System.out.println("Length of list: " + list.size());
        set.forEach(num -> System.out.println(num));
    }
}
