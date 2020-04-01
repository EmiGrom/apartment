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

        Dom dom1 = new Dom();
        dom1.setLiczbaPokoi(4);
        dom1.setLiczbaOkien(8);
        dom1.setLiczbaMetrów(45);
        dom1.setLiczbaMieszkań(1);
        dom1.setCzyGaraż(false);
        dom1.setCzyOgródek(true);
        dom1.setCzyJestSiłownia(false);

        System.out.println("\n\n" + dom1);

        Dom dom2 = new Dom();
        dom2.setLiczbaPokoi(9);
        dom2.setLiczbaOkien(15);
        dom2.setLiczbaMetrów(110);
        dom2.setLiczbaMieszkań(1);
        dom2.setCzyGaraż(true);
        dom2.setCzyOgródek(true);
        dom2.setCzyJestSiłownia(false);

        System.out.println(dom2);

        Blok blok1 = new Blok();
        blok1.setLiczbaPokoi(5);
        blok1.setLiczbaOkien(7);
        blok1.setLiczbaMetrów(85000);
        blok1.setLiczbaMieszkań(12);
        blok1.setCzyGaraż(true);
        blok1.setCzyOgródek(false);
        blok1.setCzyJestSiłownia(false);

        System.out.println(blok1);

        Blok blok2 = new Blok();
        blok2.setLiczbaPokoi(2);
        blok2.setLiczbaOkien(4);
        blok2.setLiczbaMetrów(20000);
        blok2.setLiczbaMieszkań(17);
        blok2.setCzyGaraż(false);
        blok2.setCzyOgródek(false);
        blok2.setCzyJestSiłownia(true);

        System.out.println(blok2);

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