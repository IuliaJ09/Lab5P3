package problema3;
enum Orintare{LUNGIME,LATIME,ORICARE}
 class Placa {
     private String descriere;
     private int lungime;
     private int latime;
     private Orintare orientare;
     private boolean[] canturi;
     private int nr_bucati;
     public Placa() {}
     public Placa(String descriere, int lungime, int latime, Orintare orientare,boolean[] canturi, int nr_bucati) {
      this.descriere = descriere;
      this.lungime = lungime;
      this.latime = latime;
      this.orientare = orientare;
      this.canturi = canturi;
      this.nr_bucati = nr_bucati;
     }
     public String getDescriere() {
      return descriere;
     }
     public int getLungime() {
      return lungime;
     }
     public int getLatime() {
      return latime;
     }
     public Orintare getOrientare() {
      return orientare;
     }
     public boolean[] getCanturi() {
      return canturi;
     }
     public int getNr_bucati() {
      return nr_bucati;
     }
     public void setDescriere(String descriere) {
      this.descriere = descriere;
     }
     public void setLungime(int lungime) {
      this.lungime = lungime;
     }
     public void setLatime(int latime) {
      this.latime = latime;
     }
     public void setOrientare(Orintare orintare) {
      this.orientare = orintare;
     }
     public void setCanturi(boolean[] canturi) {
      this.canturi = canturi;
     }
     public void setNr_bucati(int nr_bucati) {
      this.nr_bucati = nr_bucati;
     }
     @Override
     public String toString() {
         return ",Descriere:" +descriere+",lungime: "+lungime+",latime:"+latime +",orientare: "+orientare+
                 java.util.Arrays.toString(canturi) + ", bucăți: " + nr_bucati;
     }
}
