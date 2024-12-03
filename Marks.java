import java.util.Scanner;
public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array to store students marks
        int numStudents = 5;
        int[] marks = new int[numStudents];     
        for(int b=0; b <numStudents;b++){
            System.out.println("Enter marks of student "+(b+1)+" : ");
            marks[b]=sc.nextInt();
        }
        //Grading every student's marks.
        for(int i=0;i<marks.length;i++){
            //Here we use ternary operators to determine student's grades.
            String grade = (marks[i] >= 90) ? "A+" :
            (marks[i] >= 80) ? "A" :
            (marks[i] >= 70) ? "B+" :
            (marks[i] >= 60) ? "B" :
            (marks[i] >= 50) ? "C+" :
            (marks[i] >= 40) ? "C" : "F";
            System.out.println("The grade of student "+(i+1)+" is: "+grade);
        }
        System.out.println(" ");
        //Finding the highest and lowest scores.
        int max = marks[0];
        int min = marks[0];
        for(int j=1;j<marks.length;j++){
            if(max<marks[j]){
                max=marks[j];
            }
            if(min>marks[j]){
                min=marks[j];
            }
        }
        System.out.println("Highest marks are: "+max);
        System.out.println("Lowest marks are: "+min);
        //Calculating the average score of the class.
        int sum = 0;
        for(int k=0;k<marks.length;k++){
            sum=sum+marks[k];
        }
        int avg = sum/marks.length;
        System.out.println("The average marks for the class is: "+avg);
    }
}
