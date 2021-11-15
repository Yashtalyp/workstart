package com.parahat;

import java.util.ArrayList;

public class Session {
    Audience audience;
    Professor professor;
    ArrayList<Group> groups;
    public Session(Audience audience, Professor professor, ArrayList<Group> groups){
        this.audience=audience;
        this.professor=professor;
        this.groups=groups;
    }

}
