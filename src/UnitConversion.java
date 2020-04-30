import java.util.Scanner;
//https://www.geeksforgeeks.org/scanner-class-in-java/
//resource: https://www.udemy.com/course/java-for-absolute-beginners/learn/lecture/9734854#content

public class UnitConversion {
    public static void main(String[] args)  {
        //this is creating "scanner object" that we need to use for this program; telling scanner to read from our systems input(standard input) through System.in inside the ()
        Scanner a = new Scanner(System.in);

        //Code must convert 1 inch to every 0.0254 meter (ex. 1000.0 inches => 25.4 meters)
        int num1 = a.nextInt();
        System.out.println(num1 * 0.0254 + " meters from inches inserted");
    }
}
