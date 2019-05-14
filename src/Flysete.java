/**
public class Flysete.
*
 */

public class Flysete {

    private String seteNummer; //hvilken sete nummeret er på
    private boolean erForan; //om sete er foran i flyet.

    public Flysete( String seteNummer, boolean erForan) {
        this.seteNummer = seteNummer;
        this.erForan = erForan;
    }




    public String getSeteNummer() {
        return seteNummer;
    }

    public void setSeteNummer(String seteNummer) {
        this.seteNummer = seteNummer;
    }

    public boolean isErForan() {
        return erForan;
    }

    public void setErForan(boolean erForan) {
        this.erForan = erForan;
    }
}
