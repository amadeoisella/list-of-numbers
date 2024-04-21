public class Main {
    public static void main(String[] args) {
        printNumbers(1, 1000000);
    }

    public static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i);
            if (i < end) {
                System.out.print(", ");
            }
        }
    }
}