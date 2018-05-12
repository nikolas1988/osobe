import java.util.LinkedList;
import java.util.List;

public class Ucitaj {

    List<Osoba> litaOsoba;


    public void display(){
        litaOsoba = new LinkedList<Osoba>();
        litaOsoba = ListDetails.getList();

    }

    public List<Osoba> getLitaOsoba() {
        return litaOsoba;
    }

    public void setLitaOsoba(List<Osoba> litaOsoba) {
        this.litaOsoba = litaOsoba;
    }
}
