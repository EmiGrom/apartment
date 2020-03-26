import lombok.*;

import java.util.Date;

@Data
public class ApartamentL {
    public Object setFullPrice;
    private String miasto;
    private int powierzchnia;
    private double cena;
    @Getter @Setter
    @ToString.Exclude
    private Date date;
}
