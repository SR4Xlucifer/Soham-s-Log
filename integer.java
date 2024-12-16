import java.util.Scanner;
public class integer {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Write any integer whole number: ");
        int a = reader.nextInt();
        if ( a > 0 ) {
          System.out.println("The number is Positive.");
        }
        else if ( a == 0 ){
          System.out.println("The number is 0.");  
        }
        else if ( a < 0 ){
            System.out.println("The number is Negative.");
        }
        else{
            System.out.println("Number is not a whole integer.");
        }
        reader.close();
    }
}
