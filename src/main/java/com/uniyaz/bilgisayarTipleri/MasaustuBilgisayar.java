package com.uniyaz.bilgisayarTipleri;

import com.uniyaz.Bilgisayar;

/**
 * Created by Onur KIRKLAROGLU on 04-Dec-19.
 */
public class MasaustuBilgisayar extends Bilgisayar {
    private String kasaBoyutu;
    private Boolean renkliKasa;
    private Boolean pciGirisi;
    private Boolean hdmiGirisi;

    public String getKasaBoyutu() {
        String buyukKasa = "Buyuk";
        String ortaKasa = "Orta";

        if(kasaBoyutu.equals(buyukKasa)){
            return buyukKasa;
        }else if(kasaBoyutu.equals(ortaKasa)){
            return ortaKasa;
        }else{
            return kasaBoyutu;
        }
    }

    public void setKasaBoyutu(String kasaBoyutu) {
        this.kasaBoyutu = kasaBoyutu;
    }

    public Boolean getRenkliKasa() {
        return renkliKasa;
    }

    public void setRenkliKasa(Boolean renkliKasa) {
        this.renkliKasa = renkliKasa;
    }

    public Boolean getPciGirisi() {
        return pciGirisi;
    }

    public void setPciGirisi(Boolean pciGirisi) {
        this.pciGirisi = pciGirisi;
    }

    public Boolean getHdmiGirisi() {
        return hdmiGirisi;
    }

    public void setHdmiGirisi(Boolean hdmiGirisi) {
        this.hdmiGirisi = hdmiGirisi;
    }
}
