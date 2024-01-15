package com.NadaAlshaibnai.androidrecycleview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.NadaAlshaibnai.androidrecycleview.Currency;
import com.NadaAlshaibnai.androidrecycleview.R;

import java.util.ArrayList;

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.CurrencyViewholder> {

ArrayList<Currency> currencyList;

public CurrencyAdapter(ArrayList<Currency> currencyList){
    this.currencyList = currencyList;
}


    @NonNull
    @Override
    public CurrencyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.currency_item,
                parent,
                false);
        return new CurrencyViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyViewholder holder, int position) {
        Currency currency = currencyList.get(position);
        holder.currencyNameTextView.setText(currency.getCurrencyName());
        holder.currencyCodeTextView.setText(currency.getCurrencyCode());
        holder.exchangeRateTextView.setText(String.valueOf(currency.getExchangeRate()));

    }


    @Override
    public int getItemCount() {
        return currencyList.size();
    }

    static class CurrencyViewholder extends RecyclerView.ViewHolder{
        TextView currencyNameTextView;
        TextView currencyCodeTextView;
        TextView exchangeRateTextView;

        public CurrencyViewholder(@NonNull View itemView) {
            super(itemView);
            currencyNameTextView = itemView.findViewById(R.id.currencyNameTextView);
            currencyCodeTextView = itemView.findViewById(R.id.currencyCodeTextView);
            exchangeRateTextView = itemView.findViewById(R.id.exchangeRateTextView);

        }

    }
}
