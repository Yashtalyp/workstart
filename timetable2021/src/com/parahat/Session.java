package com.parahat;

import java.util.ArrayList;

public class Session {

    private Audience audience;
    private Professor professor;
    private ArrayList<Group> groups;

    public Session(Audience audience, Professor professor, ArrayList<Group> groups){
        this.audience=audience;
        this.professor=professor;
        this.groups=groups;
    }

    public Audience getAudience(){

        return audience;
    }

    public void setAudience(Audience audience){

        this.audience=audience;
    }

    public Professor getProfessor(){
        return professor;
    }

    public void setProfessor(Professor professor){
        this.professor=professor;
    }

    public ArrayList<Group> getGroups(){
        return groups;
    }

    public void setGroups(ArrayList<Group> groups){
        this.groups= groups;
    }

}
