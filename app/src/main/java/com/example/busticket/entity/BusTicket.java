package com.example.busticket.entity;

public class BusTicket {//класс обычных билетов (без скидок) для взрослых
    private short quantityTicket; //поле количества билетов
    private float priceTicket;//поле цены билета без скидок

    public BusTicket(short quantityTicket, float priceTicket) //конструктор для создания объекта билет
    {
        this.quantityTicket = quantityTicket;
        this.priceTicket = priceTicket;
    }

    public short getQuantityTicket() {
        return quantityTicket;
    }

    public float getPriceTicket() {
        return priceTicket;
    }

    public float allPriceTicket() {//метод подсчета стоимости билетов
        return quantityTicket*priceTicket;
    }

}


