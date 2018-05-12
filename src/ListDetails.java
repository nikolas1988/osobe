import java.util.ArrayList;
import java.util.List;

public class ListDetails {

    public static List<Osoba> getList() {
        List<Osoba> apartList = new ArrayList<Osoba>();
        apartList.add(new Osoba(12,"Marko","Markovic"));
        apartList.add(new Osoba(15,"Nikola","Trebjesanin"));
//        apartList.add(new Apartmani(R.drawable.stan_2,"Marko",35,"CITY KVART",4,35,32.5,30,27.5,25));
        return  apartList;
    }
}
