package composition;

public class Kasa {

    private String model;
    private String malzeme;
    private String üretici;
    public Kasa(String model,String malzeme,String üretici){
        this.model=model;
        this.malzeme=malzeme;
        this.üretici=üretici;
    }
    

    /**
     * @return the model
     */
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
        return üretici;
    }

    /**
     * @param uretici the uretici to set
     */
    public void setUretici(String uretici) {
        this.üretici = uretici;
    }

    /**
     * @return the malzeme
     */
    public String getMalzeme() {
        return malzeme;
    }

    /**
     * @param malzeme the malzeme to set
     */
    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }
    
    public void BilgisayıAc(){
        System.out.println(("bilgisayar açılıyor"));
    }
    
    
}
