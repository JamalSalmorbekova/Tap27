package com.company;

public class Box27 <T>{
    private int shirina;
    private int dlina;

    public Box27() {    }

    public Box27(int shirina, int dlina) {
        this.shirina = shirina;
        this.dlina = dlina;
    }

    public int getShirina() {
        return shirina;
    }

    public void setShirina(int shirina) {
        this.shirina = shirina;
    }

    public int getDlina() {
        return dlina;
    }

    public void setDlina(int dlina) {
        this.dlina = dlina;
    }
    static  Box27<Box27>  returnBox27()  {
        Box27  box = new Box27(20,45);
        return (Box27) box; }

    @Override
    public String toString() {
        return "Box27{" +
                "ширина=" + shirina +
                ", длина=" + dlina +
                '}';
    }
}













