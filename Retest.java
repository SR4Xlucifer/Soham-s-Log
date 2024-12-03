import java.util.Scanner;
public class Retest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Array to store CIA-1 marks.
        int numStudents = 5;
        int[] marks = new int[numStudents];     
        for(int a=0; a <numStudents;a++){
            System.out.println("Enter CIA-1 marks of student "+(a+1)+" : ");
            marks[a]=sc.nextInt();
        }
        //Array to store Retest marks.
        int []retest = new int[numStudents];
        for(int b=0;b<numStudents;b++){
            System.out.println("Enter Retest marks of student "+(b+1)+" : ");
            retest[b]=sc.nextInt();
        }
        //Printing the CIA-1 & Retest marks using formatted print.
        System.out.printf("%-8s %-8s %-8s%n","Student","CIA-1","Retest");
        for(int i=0;i <numStudents;i++){
            System.out.printf("%-8d %-8d %-8d%n",(i+1),marks[i],retest[i]);
        }
        sc.close();
    }
}
