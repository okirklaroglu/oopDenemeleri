package com.uniyaz;

import com.uniyaz.enums.EnumFirma;

/**
 * Created by Onur KIRKLAROGLU on 04-Dec-19.
 */
public class Bilgisayar {
    private int id;
    private String uretimYeri;
    private EnumFirma enumFirma;

    public EnumFirma getEnumFirma() {
        return enumFirma;
    }

    public void setEnumFirma(EnumFirma enumFirma) {
        this.enumFirma = enumFirma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUretimYeri() {
        String turkiyeKod = "+90";
        String amerikaKod = "+1";
        String cinkod = "+86";

       if(uretimYeri.equals("")){
           return "Türkiye";
       }else if(uretimYeri.equals(turkiyeKod)){
           return "Türkiye";
       }else if(uretimYeri.equals(amerikaKod)){
           return "ABD";
       }else if(uretimYeri.equals(cinkod)){
           return "Çin";
        } else{
           return uretimYeri;
       }
    }

    public void setUretimYeri(String uretimYeri) {
        this.uretimYeri = uretimYeri;
    }

}
