import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {
        int bound=10,i=0;
        int number,min=101,max=1;
        Random rnd=new Random();
        while(i<bound)

        {
            number=rnd.nextInt(1,100);
            System.out.print(number + " ");

            if(number<min) min=number;
            if(number>max) max=number;

            i++;
        }
        System.out.println("\nThe max number: "+max);
        System.out.println("The min number: "+min);

    }
}
