import java.util.Scanner;
public class Example14 {
    public static void main(String[] argv) {
        int x, y, z;

        Scanner inputValue;
        System.out.println("Enter the first number");
        inputValue = new Scanner(System.in);
        x = inputValue.nextInt();

        System.out.println("Enter the second number");
        y = inputValue.nextInt();

        System.out.println("Enter the third number");
        z = inputValue.nextInt();

            if (x <= y && y <= z) {
                System.out.println(x + "," + y + "," + z);
            } else if (x <= z && z <= y) {
                System.out.println(x + "," + z + "," + y);
            } else if (y <= x && x <= z) {
                System.out.println(y + "," + x + "," + z );
            } else if (y <= z && z <= x) {
                System.out.println(y + "," + z + "," + x);
            } else if (z <= x && x <= y) {
                System.out.println(z + "," + x + "," + y);
            } else {
                System.out.println(z + "," + y + "," + x);
            }


        }
    }