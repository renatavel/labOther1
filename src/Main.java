// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Main {
    public static void main(String[] args) {
        double initialValue=9.99, VAT=0.23;

        double grossValue=initialValue+(initialValue*VAT);
        System.out.println("The gross value of the product- "+grossValue);
        double pcsOfTheProduct=grossValue*10000;
        System.out.println("The increased pcs of the product- "+pcsOfTheProduct);
        double valueWithoutVAT=pcsOfTheProduct-(pcsOfTheProduct*VAT);
        System.out.println("The value without VAT- "+valueWithoutVAT);

        System.out.println("The BIGDECIMAL values:");

        BigDecimal initialValueBD=new BigDecimal(9.99);
        BigDecimal VatBD=new BigDecimal(0.23);

        BigDecimal grossValueBD=initialValueBD.add(initialValueBD.multiply(VatBD));
        grossValueBD=grossValueBD.setScale(2,RoundingMode.HALF_EVEN);
        System.out.println("The gross value(BD)- "+grossValueBD);
        BigDecimal pcsOfTheProductBD=grossValueBD.multiply(new BigDecimal(10000));
        pcsOfTheProductBD=pcsOfTheProductBD.setScale(2,RoundingMode.HALF_EVEN);
        System.out.println("The increased pcs of the product(BD)- "+pcsOfTheProductBD);
        BigDecimal excludingVAT = pcsOfTheProductBD.subtract(pcsOfTheProductBD.multiply(new BigDecimal(0.23)));
        excludingVAT=excludingVAT.setScale(2,RoundingMode.HALF_EVEN);
        System.out.println("The value without VAT- "+excludingVAT);


    }
}