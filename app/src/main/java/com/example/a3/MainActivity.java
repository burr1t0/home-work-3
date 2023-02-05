package com.example.a3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Ticket busTicket = new Ticket("Алтайск", "Артыбаш", "7:00 1 июня", "4 часа 30 минут", 70,9,11,5);

private TextView busTicketOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        busTicketOut = findViewById(R.id.busTicketOut);

        busTicketOut.setText(busTicket.toString());
    }
}