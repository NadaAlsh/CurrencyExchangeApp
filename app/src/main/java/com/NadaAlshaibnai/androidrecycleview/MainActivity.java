package com.NadaAlshaibnai.androidrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.NadaAlshaibnai.androidrecycleview.Adapter.CurrencyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView currencyRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currencyRecyclerView = findViewById(R.id.currencyRecyclerView);
        currencyRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Currency> currencyList = new ArrayList<>();
        CurrencyAdapter currencyAdapter = new CurrencyAdapter(currencyList);
        currencyRecyclerView.setAdapter(currencyAdapter);

        currencyList.add(new Currency("KWD", "Kuwaiti Dinar", 1.000));
        currencyList.add(new Currency("USD", "US Dollar", 0.300));
    }
}