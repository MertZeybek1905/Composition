package composition;

public class Bilgisayar {
    private Anakart anakart;
    private Kasa kasa;
    private Monitör monitör;
    private Resolution resolution;
    public Bilgisayar(Anakart anakart,Kasa kasa,Monitör monitör,Resolution resolution){
        this.anakart=anakart;
        this.kasa=kasa;
        this.monitör=monitör;
        this.resolution=resolution;
    }
    
    /**
     * @return the monitor
     */
    public Monitör getMonitor() {
        return monitör;
    }

    /**
     * @param monitor the monitor to set
     */
    public void setMonitor(Monitör monitor) {
        this.monitör = monitor;
    }

    /**
     * @return the kasa
     */
    public Kasa getKasa() {
        return kasa;
    }

    /**
     * @param kasa the kasa to set
     */
    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }

    /**
     * @return the anakart
     */
    public Anakart getAnakart() {
        return anakart;
    }

    /**
     * @param anakart the anakart to set
     */
    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }
}
