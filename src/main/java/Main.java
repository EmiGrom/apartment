import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ApartamentL apartamentL = new ApartamentL();
        apartamentL.setCena(300000);
        apartamentL.setMiasto("Kraków");
        apartamentL.setPowierzchnia(45);

        ApartamentL apartamentL2 = new ApartamentL();
        apartamentL2.setCena(800000);
        apartamentL2.setMiasto("Warszawa");
        apartamentL2.setPowierzchnia(80);
///
        ApartamentL apartamentL3 = new ApartamentL();
        apartamentL3.setCena(500000);
        apartamentL3.setMiasto("Gdańsk");
        apartamentL3.setPowierzchnia(68);

        List<ApartamentL> apartamentList = new ArrayList<ApartamentL>();
        apartamentList.add(apartamentL);
        apartamentList.add(apartamentL2);
        apartamentList.add(apartamentL3);

        for (ApartamentL one : apartamentList) {
            System.out.println(apartamentList);
        }

    }
}
