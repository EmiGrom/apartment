import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Apartment {

    private String city;
    private double area;
    private double price;

    public void getFullPrice() {
        price = 0.95 * price;
        System.out.println(price);
    }
}