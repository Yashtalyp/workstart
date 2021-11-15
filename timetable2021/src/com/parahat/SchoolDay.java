package com.parahat;

import java.util.ArrayList;

public class SchoolDay {

    private ArrayList<Session> sessions;

    public SchoolDay(ArrayList<Session> sessions){
        this.sessions=sessions;
    }

    public ArrayList<Session> getSessions(){
        return sessions;
    }

    public void setSessions(ArrayList<Session> sessions){
        this.sessions=sessions;
    }

}
