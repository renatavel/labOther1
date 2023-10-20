import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
          System.out.print("Please enter number1: ");
          float number1=scn.nextFloat();
          System.out.print("Please enter number2: ");
          float number2=scn.nextFloat();
          double sum=number1+number2;
        System.out.printf("The sum of the two numbers is %.2f",sum);
        System.out.println();
        double difference=number1-number2;
        System.out.printf("The difference of the two numbers is %.2f ",difference);
        System.out.println();
        double product= number1*number2;
        System.out.printf("The product of the two numbers is %.2f",product);
        System.out.println();
        double qoutient=number1/number2;
        System.out.printf("The quotient of the two numbers is %.2f", qoutient);

    }
}
