import java.util.Scanner;

public class Main {
    public static void function1() {
        System.out.println("exit1");
    }
    public static String function2() {
        return "exit2";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int input = scanner.nextInt();

        int i = 1;
        int counter = 0;
        while (i*i < 50) {
            System.out.println(i*i);
            if (counter == 3) {
                function1();
                break;
            }
            counter++;
            i++;
        }
        String onlyFunction = function2();
        System.out.println(onlyFunction);

        //git config --global user.email "you@example.com"
        // git config --global user.name "Your Name"

    }
}ii