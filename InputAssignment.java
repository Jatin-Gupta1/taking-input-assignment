import java.sql.SQLOutput;
import java.util.Scanner;
public class InputAssignment {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String name=sc.next();

        int rollNumber=sc.nextInt();

        String field=sc.next();
        System.out.println("name:"+name);
        System.out.println("roll number:"+rollNumber);
        System.out.println("field of interset:"+field);

    }
}
