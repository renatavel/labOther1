import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a: ");
        float aValue = scn.nextFloat();
        if(aValue==0)
        {
            System.out.println("Cannot enter this value");
        }
        else{System.out.print("Please enter b: ");}

        float bValue = scn.nextFloat();
        System.out.print("Please enter c: ");
        float cValue = scn.nextFloat();
        double delta = Math.pow(bValue,2) - (4 * aValue * cValue);
        int y = 0;
        if (delta <y){
            y=0;
        }
        else if(delta==y){
            y=1;
        }
        else {
            y=2;
        }

            switch (y) {
                case 0:
                    System.out.println("There are no roots");
                    break;

                case 1:
                    double x = -bValue / (2 * aValue);
                    System.out.println("Your output " + x);
                    break;
                case 2:
                    double x1 = (-bValue + Math.sqrt(delta)) / (2 * aValue);
                    double x2 = (-bValue - Math.sqrt(delta)) / (2 * aValue);
                    System.out.println("Your x1:"+(float)x1);
                    System.out.println("Your x2:"+(float)x2);
                    break;

            }
        }
}
