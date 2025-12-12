package com.neha.myapplication_mp.Adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.neha.myapplication_mp.Model.CountryModel;
import com.neha.myapplication_mp.R;

import java.util.ArrayList;

public class CustomCountryAdapter extends RecyclerView.Adapter<ViewHolder> {
    Context context;
    ArrayList<CountryModel> countriesList;


    public CustomCountryAdapter(Context context, ArrayList<CountryModel>countries){
        this.context = context;
        this.countriesList = countries;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_country_card,parent, false );
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int index) {
      CountryModel countryModel = countriesList.get(index);
      holder.ivCustomCountry.setImageResource(countryModel.getCountryFlagIcon());
      holder.tvCustomCountry.setText(countryModel.getCountryName());
    }

    @Override
    public int getItemCount() {
        return countriesList.size();
    }
}
//hold view reference to avoid using findviewbyid repeatedly
 class ViewHolder extends RecyclerView.ViewHolder{

        ImageView ivCustomCountry;
        TextView tvCustomCountry;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        ivCustomCountry = itemView.findViewById(R.id.iv_custom_country_card);
        tvCustomCountry = itemView.findViewById(R.id.tv_custom_country_card);
    }
}


