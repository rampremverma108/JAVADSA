public class GenerateBinaryDirect {
    public static void generateBinaryNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(Integer.toBinaryString(i) + " ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        generateBinaryNumbers(n); // Output: 1 10 11 100 101
    }
}