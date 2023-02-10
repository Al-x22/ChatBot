package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        greet();
        askName();
        askAge();
        count();
        test();
        end();
    }
    static void greet() {
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2020");
    }

    static void askName() {
        System.out.println("Please, remind me your name.");
        String name = scanner.next();
        System.out.println("What a great name you have, " + name + '!');
    }
    static void askAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }
    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int num = scanner.nextInt();
        for (int i = 0;i <= num; i++) {
            System.out.println(i + "!");
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");

        System.out.println("What two symbols does the ternary operator use?");
        System.out.println("1. : ?");
        System.out.println("2. . >");
        System.out.println("3. ? ?");
        System.out.println("4. ! :");

        int answer = scanner.nextInt();

        while (answer != 1 ){
            System.out.println("Please, try again.");
            answer = scanner.nextInt();
        }
    }
    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
