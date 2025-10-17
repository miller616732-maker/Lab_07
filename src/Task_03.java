import java.util.Random;
public class Task_03 {
    public static void main(String[] args) {
        boolean valid = false;
        Random rand = new Random();
        int rollOne = 0;
        int rollTwo = 0;
        int rollThree = 0;
        int rollSum = 0;
        int rollNumber = 0;
        System.out.printf("\n%s%6s%8s%10s%10s", "Roll Number", " Roll One", " Roll Two", " Roll Three", " Sum");
        while (!valid) {
            rollOne = rand.nextInt(6) + 1;
            rollTwo = rand.nextInt(6) + 1;
            rollThree = rand.nextInt(6) + 1;
            rollSum = (rollOne + rollTwo + rollThree);
            rollNumber++;
            System.out.printf("\n%10d%9d%9d%9d%12d", rollNumber, rollOne, rollTwo, rollThree, rollSum);
            if (rollOne == rollTwo && rollOne == rollThree) {
                valid = true;
            }
        }
        System.out.println("\nThe roll that worked was");
        System.out.printf("\n%s%s%s%s%s", "Roll Number, ", " Roll One, ", " Roll Two, ", " Roll Three, ", " Sum");
        System.out.printf("\n%10d%10d%10d%10d%10d", rollNumber, rollOne, rollTwo, rollThree, rollSum);
    }
}
