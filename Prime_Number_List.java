import java.util.Scanner;

public class Prime_Number_List {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int range = userInput.nextInt();

        int counter = 0;

        for (int i = 2; i <= range; i++) {

            for (int j = 1; j <= range; j++) {

                if (i % j == 0) {

                    counter++;

                }

            }

            if (counter == 2) {

                System.out.print(i + " ");

            }

            counter = 0;

        }

        userInput.close();

    }

}
