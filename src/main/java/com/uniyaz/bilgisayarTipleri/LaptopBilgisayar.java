package com.uniyaz.bilgisayarTipleri;

import com.uniyaz.Bilgisayar;

/**
 * Created by Onur KIRKLAROGLU on 04-Dec-19.
 */
public class LaptopBilgisayar extends Bilgisayar{
    private Boolean cikartilirbatarya;
    private Boolean dokunmatikEkran;
    private Boolean tamDonebilenEkran;
    private Boolean renkliKlavye;
    private Double ekranBoyutu;

    public Boolean getCikartilirbatarya() {
        return cikartilirbatarya;
    }

    public void setCikartilirbatarya(Boolean cikartilirbatarya) {
        this.cikartilirbatarya = cikartilirbatarya;
    }

    public Boolean getDokunmatikEkran() {
        return dokunmatikEkran;
    }

    public void setDokunmatikEkran(Boolean dokunmatikEkran) {
        this.dokunmatikEkran = dokunmatikEkran;
    }

    public Boolean getTamDonebilenEkran() {
        return tamDonebilenEkran;
    }

    public void setTamDonebilenEkran(Boolean tamDonebilenEkran) {
        this.tamDonebilenEkran = tamDonebilenEkran;
    }

    public Boolean getRenkliKlavye() {
        return renkliKlavye;
    }

    public void setRenkliKlavye(Boolean renkliKlavye) {
        this.renkliKlavye = renkliKlavye;
    }

    public Double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(Double ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }
}
