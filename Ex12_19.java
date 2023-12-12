public class Ex12_19 {
    public static void main(String[] args) {
        int n = 5;
        double result = calculateF(n);
        System.out.println("f(" + n + ")=" + result);
    }

    public static double calculateF(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n必須大於或等於1");
        }

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.sqrt(i);
        }

        return sum;
    }
}
