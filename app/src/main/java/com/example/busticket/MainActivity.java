package com.example.busticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.busticket.entity.BusTicket;
import com.example.busticket.entity.BusTicketDiscount;

public class MainActivity extends AppCompatActivity {
    private BusTicket busTicketAdult=new BusTicket((short) 9,70);//создание объекта взрослых билетов (9 билетов) по 70 монет
    private BusTicket busTicketPensioner=new BusTicketDiscount((short)5,70,(byte) 50);// создание объекта билетов для пенсионеров (5 билетов по 70 монет со скидкой 50%)
    private BusTicket busTicketChild=new BusTicketDiscount((short)11,70,(byte) 30);// создание объекта билетов для ltntq (11 билетов по 70 монет со скидкой 30%)
//поле для вывода данных на экран
//    private TextView busTicketAdultOut;
//    private TextView busTicketPensionerOut;
//    private TextView busTicketChildOut;
    private TextView busTicketAllOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        привязка поля к разметке окна вывода
        busTicketAllOut=findViewById(R.id.busTicketAllOut);
//        вывод информации на экран
        busTicketAllOut.setText(Float.toString(busTicketAdult.allPriceTicket()
                +busTicketPensioner.allPriceTicket()+busTicketChild.allPriceTicket()));
    }
}