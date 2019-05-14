public class Fly {
    private Rad[] rader;
    private int seterPerRad = 6;

    public Fly(int antallRader, int seterPerRad) {
        rader = new Rad[antallRader];
        for (int i = 0; i < rader.length; i++) {
            rader[i] = new Rad(i, seterPerRad);
        }
    }

    public Fly(int antallRader) {
        this.rader = new Rad[antallRader];
        for (int i = 0; i < rader.length; i++) {
            rader[i] = new Rad(i, seterPerRad);
        }
    }

    public void setSete() {
        for (int i = 0; i < rader.length; i++) {
            rader[i].setSeteNummer(rader.length);

            //for (Flysete f : rader[i]) {
              //  if (erForan(i, rader.length)) {
                //    f.setErForan(true);
               // }
               // else{
                //    f.setErForan(false);
               // }
           // }
        }
    }
        public boolean erForan ( int nummer, int antallRader){
            if (nummer < (antallRader / 2)) {
                return true;
            } else {
                return false;
            }
        }
    }

