package com.parahat;

import java.util.ArrayList;

public class Timetable {

    private ArrayList<SchoolDay> schoolDays;

    public Timetable(ArrayList<SchoolDay> schoolDays) {
        this.schoolDays = schoolDays;
    }

    public ArrayList<SchoolDay> getSchoolDays(){
        return schoolDays;
    }

    public void setSchoolDays(ArrayList<SchoolDay> schoolDays) {
        this.schoolDays=schoolDays;
    }

}
