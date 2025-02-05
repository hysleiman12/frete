package br.com.devh12.frete.services;

public class Order {

    private int codigo;
    private double basic;
    private double discount;

    public Order(int codigo, double basic, double discount) {
        this.codigo = codigo;
        this.basic = basic;
        this.discount = discount;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
