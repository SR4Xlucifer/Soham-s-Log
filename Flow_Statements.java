import java.util.Scanner;
public class Flow_Statements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter Customer's ID: ");
            int id = sc.nextInt();
            if(id%10 ==0){
                System.out.println("The Customer's ID is Divisible by 10.");
                break;
            }
            else if(id%5 ==0){
                System.out.println("The Customer's ID is Divisible by 5.");
                continue;
            }
        }
        sc.close();
    }
}