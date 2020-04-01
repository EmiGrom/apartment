import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString(callSuper = true)
public class Dom extends Budynek {

    //@Override
    //public String toString() {
    //return "Dom{" +
    //"liczba pokoi wynosi= " + liczbaPokoi +
    //", liczba okien wynosi= " + liczbaOkien +
    //", liczba metrów wynosi= " + liczbaMetrów +
    //", liczba mieszkań wynosi= " + liczbaMieszkań +
    // ", czy ma garaż= " + czyGaraż +
    //", czy ma ogródek= " + czyOgródek +
    //", czyJestSiłownia= " + czyJestSiłownia +
    //'}';
}