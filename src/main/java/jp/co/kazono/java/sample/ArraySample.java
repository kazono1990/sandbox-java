package jp.co.kazono.java.sample;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySample {

    public static void main(String[] args) {
        // 0で初期化される
        int[] arr1 = new int[3];
        System.out.println(Arrays.toString(arr1));

        // 空配列
        int[] arr2 = new int[]{};
        System.out.println(Arrays.toString(arr2));

        // Listを配列に変換 (Integer以外)
        List<String> strList = new ArrayList<>();
        strList.add("hogehoge");
        String[] arr3 = strList.toArray(new String[strList.size()]);
        System.out.println(Arrays.toString(arr3));

        // Listを配列に変換 (Integerの場合)
        // org.apache.commons.lang3.ArrayUtilsにあるtoPrimitiveを利用すれば簡単に変換可能
        List<Integer> intList = new ArrayList<>();
        intList.add(0);
        int[] arr4 = ArrayUtils.toPrimitive(intList.toArray(new Integer[intList.size()]));
        System.out.println(Arrays.toString(arr4));
    }
}
