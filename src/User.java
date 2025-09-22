import java.util.Scanner;
public class User {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        //for getting string as a user input.
        System.out.print("Enter your name: ");
        String name = x.nextLine();
        System.out.println(name);

        //for getting integer as a user input.
        System.out.print("Enter your age: ");
        int age = x.nextInt();
        System.out.println(age);

        //for getting double as a user input.
        System.out.print("Enter a float value: ");
        double y = x.nextDouble();
        System.out.println(y);

        //to display all in one time.
        System.out.println("Your name is "+ name + " and your age is "+ age + " your height is "+ y);

    }
}
