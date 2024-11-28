import java.util.Scanner;
public class SimpleCalc {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give first number: ");
        int a = reader.nextInt();
        System.out.println("Give second number: ");
        int b = reader.nextInt();
        System.out.println("Select the operation to perform: ");
        System.out.println("1 for Addition; 2 for Subtraction; 3 for Multiplication; 4 for Division; 5 for Modulus: ");
        int c = reader.nextInt();
        switch(c){
            case 1 -> System.out.println("The sum of given numbers is " + (a+b));
            case 2 -> System.out.println("The difference of given numbers is " + (a-b));
            case 3 -> System.out.println("The product of given numbers is " + (a*b));
            case 4 -> System.out.println("The quotient of the given numbers is " + (a/b));
            case 5 -> System.out.println("The remainder of the given numbers is " + (a%b));
            default -> System.out.println("Incorrect operation entered.");
        }
        reader.close();
    }
}
