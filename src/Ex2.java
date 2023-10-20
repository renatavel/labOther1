import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Please enter height: ");
        float height=scn.nextFloat();
        System.out.print("Please enter weight: ");
        float weight=scn.nextFloat();
        double heightNew=height/100;
        double BMI=weight/Math.pow(heightNew,2);
        if (BMI<16.00)
        {
            System.out.println("You're suffering with starvation");
        }
        else if (BMI>16.00 && BMI<16.99)
        {
            System.out.println("You're suffering with emaciation");
        }
        else if (BMI>17.00 && BMI<18.49)
        {
            System.out.println("You're suffering with underweight");
        }
        else if (BMI>18.50 && BMI<22.99)
        {
            System.out.println("You're on the normal,low range");
        }
        else if (BMI>23.00 && BMI<24.99)
        {
            System.out.println("You're on the normal,high range");
        }
        else if (BMI>25.00 && BMI<27.49)
        {
            System.out.println("You're on the overweight,low range");
        }
        else if (BMI>27.50 && BMI<29.99)
        {
            System.out.println("You're on the overweight,high range");
        }
        else if (BMI>30.00 && BMI<34.99)
        {
            System.out.println("You've got the 1st degree obesity");
        }
        else if (BMI>35.00 && BMI<39.99)
        {
            System.out.println("You've got the 2nd degree obesity");
        }
        else
        {
            System.out.println("You've got the 3d degree obesity");
        }
    }
}
