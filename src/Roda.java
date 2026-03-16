public class Roda {

    private int aro, parafusos;

    public Roda(int aro, int parafusos) {
        this.aro = aro;
        this.parafusos = parafusos;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public int getParafusos() {
        return parafusos;
    }

    public void setParafusos(int parafusos) {
        this.parafusos = parafusos;
    }

    public String toString() {
        return "aro=" + aro +
                ", parafusos=" + parafusos +
                '}';
    }

}