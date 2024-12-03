public class Array{
    public static void main(String[] args) {
        //Creating the array containing students marks.
        int []marks = {24,48,69,89,94,77,67,98};
        //Displaying student's marks.
        for(int a=0;a<marks.length;a++){
            System.out.println("The marks of student "+(a+1)+" is: "+marks[a]);
        }
        System.out.println(" ");
        //Grading every student's marks.
        for(int i=0;i<marks.length;i++){
            //here we use ternary operators to determine student's grades.
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
        System.out.println("Maximum marks are: "+max);
        System.out.println("Minimum marks are: "+min);
        //Calculating the average score of the class.
        int sum = 0;
        for(int k=0;k<marks.length;k++){
            sum=sum+marks[k];
        }
        int avg = sum/marks.length;
        System.out.println("The average marks for the class is: "+avg);
    }
}
