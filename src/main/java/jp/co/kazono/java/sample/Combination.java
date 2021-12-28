package jp.co.kazono.java.sample;

public class Combination {

    // nCrを計算するメソッド
    public int calc(int n, int r) {
        int combination = 1;
        for (int i = 1; i <= r; i++) {
            combination = combination * (n - i + 1) / i;
        }
        return combination;
    }

    public static void main(String[] args) {
        Combination combination = new Combination();
        System.out.println(combination.calc(4, 3));
        System.out.println(combination.calc(5, 2));
    }
}
