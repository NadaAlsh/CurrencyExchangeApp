package com.NadaAlshaibnai.androidrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.NadaAlshaibnai.androidrecycleview.Adapter.CurrencyAdapter;
import com.NadaAlshaibnai.androidrecycleview.data.Currency;
import com.NadaAlshaibnai.androidrecycleview.repository.CurrencyAppRepo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView currencyRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currencyRecyclerView = findViewById(R.id.currencyRecyclerView);
        currencyRecyclerView.setLayoutManager(new LinearLayoutManager(this));

       ArrayList<Currency> currencyList = CurrencyAppRepo.getInstance().generateDummyCurrencies(3);
        CurrencyAdapter currencyAdapter = new CurrencyAdapter(currencyList);
        currencyRecyclerView.setAdapter(currencyAdapter);

}}