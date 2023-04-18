package com.example.busticket.entity;

public class BusTicketDiscount extends BusTicket {
    private byte discount; //поле скидки билета

    public BusTicketDiscount(short quantityTicket, float priceTicket, byte discount) {
        super(quantityTicket, priceTicket);
        this.discount = discount;
    }

    //переопределение метода
    public float allPriceTicket()
    {//расчет стоимости билетов со скидкой
        return getPriceTicket()*getQuantityTicket()*(100-discount)/100;
    };
}
