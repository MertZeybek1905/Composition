package composition;

public class Main {
     public static void main(String[] args) {
        Anakart anakart= new Anakart("dell","dell", 4, "windows");
        Kasa kasa =new Kasa("Tulpar","Aliminyum","Monster");
        Resolution resolution= new Resolution(500,600);
        Monitör monitör= new Monitör("asus","demir","1040",resolution);
        Bilgisayar bilgisayar=new Bilgisayar(anakart, kasa, monitör, resolution);
        bilgisayar.getKasa().BilgisayıAc();
        bilgisayar.getAnakart().setIsletim_sistemi("ubuntu");
        bilgisayar.getAnakart().getIsletim_sistemi();

        
    }
}
