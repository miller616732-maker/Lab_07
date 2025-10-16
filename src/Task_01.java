public class Task_01 {
    public static void main(String[] args) {
        int yourCount = 0;
        System.out.println("0 to 30");
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
            yourCount = yourCount + 1;
        }
        System.out.println("\n30 to 0");
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
            yourCount = yourCount - 1;
        }
        System.out.println("\n0 to 18 by 3");
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
            yourCount = yourCount + 1;
        }
        System.out.println("\n10 to 0 by 2");
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
            yourCount = yourCount + 1;
        }
    }
}