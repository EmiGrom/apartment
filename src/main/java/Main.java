import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment("Warszawa", 26, 5000);
        Apartment apartment2 = new Apartment("Poznań", 260, 40000);
        Apartment apartment3 = new Apartment("Kraków", 310, 8000);

        List<Apartment> apartmentList = new ArrayList<>();
        apartmentList.addAll(Arrays.asList(apartment1, apartment2, apartment3));
        System.out.print(apartmentList);

        System.out.println("List of apartments: " + apartmentList);

        System.out.println("Price of apartment 1: " + apartment1.getPrice());
        System.out.println("Price after discount: ");
        apartment1.getFullPrice();

        System.out.println("Price of apartment 2: " + apartment2.getPrice());
        System.out.println("Price after discount: ");
        apartment2.getFullPrice();

        System.out.println("Price of apartment 3: " + apartment3.getPrice());
        System.out.println("Price after discount: ");
        apartment3.getFullPrice();

        double sum = 0;
        for (Apartment one : apartmentList) {
            sum += one.getPrice();
        }

        System.out.format("Average cost of an apartments: %.2f", sum / apartmentList.size());
        System.out.println("\n");
    }
}


//Zadanie Mieszkania
//Stwórz klasę Apartment , która będzie zawierała informacje o mieście, w którym
//się znajduje, powierzchni w metrach kwadratowych, oraz cenie za metr
//mieszkania. Ponadto, klasa ma zawierać metodę double getFullPrice() , która
//zwraca cenę za mieszkanie przemnożoną przez 0.95 (zniżka dla młodych).

//Następnie w metodzie main stwórz tablicę lub kolekcję mieszkań i wypisz dla
//każdego z nich miasto, w którym się znajduje, oraz cenę po zniżce.

//Wyznacz średnią cenę mieszkań. Wszystkie wartości liczbowe w tym zadaniu
//wypisz, zaokrąglając do dwóch miejsc po przecinku (wyszukaj w internecie jeżeli
//nie wiesz jak wypisać liczbę zaokrągloną). Przykładowy output:
//1. Apartment in Warsaw costs 771875.00.
//2. Apartment in Cracow costs 779000.00.
//3. Apartment in Gdansk costs 855000.00.
//Mean price is 801958.31
//Użyj Lomboka. Projekt należy wrzucić na GitHuba