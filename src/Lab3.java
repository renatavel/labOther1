public class Lab3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i++) {
            System.out.println("Factors of " + i + ":");
            for (int j = 2; j < i; j++) {
                {if (i % j == 0)
                System.out.print(j + " ");}
            }
            System.out.println();
        }
    }
}
