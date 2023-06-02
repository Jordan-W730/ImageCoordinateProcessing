// have user provide top-left and bottom-right pixel locations

import java.util.Scanner;

public class InputData {

    public int[] getNewInputData() {
        int[] inputData = new int[4];

        Scanner scanner = new Scanner(System.in);

        // ask the user for a number 4 times, re-prompting them if an invalid number is given
        // input in this order: top-left x, top-left y, bottom-right x, bottom-right y
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter a whole number: ");
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                inputData[i] = number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid whole number.");
                i--; // Decrement i to repeat the loop for the same index
            }
        }

        System.out.println(inputData[0] + " " + inputData[1] + " " + inputData[2] + " " + inputData[3]);
        return inputData;
    }

}

