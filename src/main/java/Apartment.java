import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Apartment {

    private String miasto;
    private double powierzchnia;
    private double cenazametr;
    private double fullPrice;
}