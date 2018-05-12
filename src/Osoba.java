public class Osoba {
    private int godina;
    private String ime,prezime;

    public Osoba(int godina, String ime, String prezime) {
        this.godina = godina;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
}
