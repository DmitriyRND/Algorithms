package Search;

import java.util.Scanner;

public class SearchMaxNumberArray {
    public static void main(String[] args) {


        System.out.println("Максимальное число котрое вы ввели =" + " " +maxNumber());
    }

    public static int maxNumber() {
        Scanner scanner = new Scanner(System.in);
        int[] box = new int[10];
        int maxNumber = 0;
        for (int i = 0; i < box.length; i++) {
            System.out.println("Введите число");
            box[i] = scanner.nextInt();
            if (box[i] > maxNumber) {
                maxNumber = box[i];
            }
        }
        return maxNumber;

    }
}
