package jp.co.kazono.java.sample;

public class Permutation {

    // nPrを計算するメソッド
    public int calc(int n, int r) {
        int permutation = 1;
        for (int i = 1; i <= r; i++) {
            permutation = permutation * (n - i + 1);
        }
        return permutation;
    }

    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        System.out.println(permutation.calc(5, 2));
        System.out.println(permutation.calc(6, 2));
    }
}
