package com.parahat;

public class Professor {

    private String name;
    private String telephone;

    public Professor(String name, String telephone){
        this.name=name;
        this.telephone=telephone;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getTelephone(){
        return telephone;
    }

    public void setTelephone(String telephone){
        this.telephone=telephone;
    }

}
