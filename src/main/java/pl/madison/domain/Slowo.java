package pl.madison.domain;

public class Slowo implements Comparable<Slowo>{
    String imie1;
    String imie2;
    String imie3;

    public String getImie1() {
        return imie1;
    }

    public void setImie1(String imie1) {
        this.imie1 = imie1;
    }

    public String getImie2() {
        return imie2;
    }

    public void setImie2(String imie2) {
        this.imie2 = imie2;
    }

    public String getImie3() {
        return imie3;
    }

    public void setImie3(String imie3) {
        this.imie3 = imie3;
    }

    @Override
    public int compareTo(Slowo o) {
        int porownanieImion = o.getImie1().compareTo(Slowo.this.getImie2());
        return porownanieImion;
    }
}
