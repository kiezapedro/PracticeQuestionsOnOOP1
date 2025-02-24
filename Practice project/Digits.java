import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num) {
        digitList = new ArrayList<Integer>();

        // If the number is 0, add 0 to the list
        if (num == 0) {
            digitList.add(new Integer(0));
        }

        // Extract digits of the number and add them to the list
        while (num > 0) {
            digitList.add(0, new Integer(num % 10));
            num /= 10;
        }
    }

    // Method to print the digits in the list
    public void printDigits() {
        for (Integer digit : digitList) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Digits digits = new Digits(12345);
        digits.printDigits();
    }
}