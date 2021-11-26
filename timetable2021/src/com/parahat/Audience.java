package com.parahat;

public class Audience {

    private String address;
    private int capacityPeople;

    public Audience(String address, int capacityPeople){
        this.address=address;
        this.capacityPeople=capacityPeople;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public int getCapacityPeople(){
        return capacityPeople;
    }

    public void setCapacityPeople(int capacityPeople) {
        this.capacityPeople = capacityPeople;
    }

}
