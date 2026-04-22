public class Main {
    public static void main(String[] args) {
        Solution sl = new Solution();
        long kq1 = sl.fibonacci(12);
        long kq2 = sl.fibonacci(987654321);
        long kq3 = sl.fibonacci(0);
        long kq4 = sl.fibonacci(-100);
        System.out.println(kq1 + "|" + kq2 + "|" + kq3 + "|" + kq4);
    }
}
