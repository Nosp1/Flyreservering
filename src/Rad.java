public class Rad {
    private int radNummer; //hvilken rad sete er på.
    private Flysete[] antallSeter;

    public Rad(int radNummer, int antallSeter) {
        this.radNummer = radNummer;
        this.antallSeter =  new Flysete[antallSeter];
    }

    public void setSeteNummer(int antallrader){
        for (int i = 0; i <antallSeter.length ; i++) {
           switch (i){
               case 0: antallSeter[i].setSeteNummer("A");
               break;
               case 1: antallSeter[i].setSeteNummer("B");
               break;
               case 2: antallSeter[i].setSeteNummer("C");
               break;
               case 3: antallSeter[i].setSeteNummer("D");
               break;
               case 4: antallSeter[i].setSeteNummer("E");
               break;
               case 5: antallSeter[i].setSeteNummer("F");
               break;

           }

           }
        }


}
