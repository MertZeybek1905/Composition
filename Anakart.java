package composition;

public class Anakart {
    private String model;
    private String uretici;
    private int yuva_sayisi;
    private String isletim_sistemi;
    public Anakart(String model,String üretici,int yuva,String isletim){
        this.model=model;
        this.uretici=üretici;
        this.yuva_sayisi=yuva;
        this.isletim_sistemi=isletim;
    }
  
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the uretici
     */
    public String getUretici() {
        return uretici;
    }

    /**
     * @param uretici the uretici to set
     */
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    /**
     * @return the yuva_sayisi
     */
    public int getYuva_sayisi() {
        return yuva_sayisi;
    }

    /**
     * @param yuva_sayisi the yuva_sayisi to set
     */
    public void setYuva_sayisi(int yuva_sayisi) {
        this.yuva_sayisi = yuva_sayisi;
    }

    /**
     * @return the isletim_sistemi
     */
    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }

    /**
     * @param isletim_sistemi the isletim_sistemi to set
     */
    public void  setIsletim_sistemi(String yeni_isletim){
        this.isletim_sistemi=yeni_isletim;
    }

}