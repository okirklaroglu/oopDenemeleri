package com.uniyaz;

import com.uniyaz.bilgisayarTipleri.LaptopBilgisayar;
import com.uniyaz.bilgisayarTipleri.MasaustuBilgisayar;
import com.uniyaz.enums.EnumFirma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Bilgisayar bilgisayar = new Bilgisayar();
        bilgisayar.setId(1);
        bilgisayar.setUretimYeri("+1"); //Boş olursa TR, +1 USA, +86 Çin, +90 TR
        bilgisayar.setEnumFirma(EnumFirma.APPLE);

        System.out.println(bilgisayar.getId());
        System.out.println(bilgisayar.getUretimYeri());
        System.out.println(bilgisayar.getEnumFirma());


        LaptopBilgisayar laptopBilgisayar = new LaptopBilgisayar();
        laptopBilgisayar.setDokunmatikEkran(false);
        laptopBilgisayar.setTamDonebilenEkran(false);
        laptopBilgisayar.setCikartilirbatarya(true);
        laptopBilgisayar.setCikartilirbatarya(false);
        laptopBilgisayar.setEkranBoyutu(15.3);

        System.out.println(laptopBilgisayar.getCikartilirbatarya());
        System.out.println(laptopBilgisayar.getEkranBoyutu());


        MasaustuBilgisayar masaustuBilgisayar = new MasaustuBilgisayar();
        masaustuBilgisayar.setHdmiGirisi(true);
        masaustuBilgisayar.setKasaBoyutu("Büyük");
        masaustuBilgisayar.setUretimYeri("TR");
        masaustuBilgisayar.setPciGirisi(true);

        System.out.println(masaustuBilgisayar.getUretimYeri());
        System.out.println(masaustuBilgisayar.getKasaBoyutu());
        System.out.println(masaustuBilgisayar.getUretimYeri());
    }
}
