package com.neha.myapplication_mp.Model;

public class CountryModel {

    private String countryName;
    private int countryFlagIcon;

    public CountryModel(String name, int icon){
        this.countryName =name;
        this.countryFlagIcon=icon;
    }

    public String getCountryName(){
        return this.countryName;
    }
    public int getCountryFlagIcon(){
        return this.countryFlagIcon;
    }

}

