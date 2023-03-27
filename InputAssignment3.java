import java.util.Scanner;
public class InputAssignment3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks1=sc.nextInt();
        int marks2=sc.nextInt();
        int marks3=sc.nextInt();
        int total_marks=marks1+marks2+marks3;
        float percentage=((float)total_marks/300)*100;
        System.out.println("total marks:"+total_marks);
        System.out.println("percentage marks:"+percentage);



    }
}
