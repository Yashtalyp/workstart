package com.parahat;


import java.util.ArrayList;

public class Main{

        public void main() {

                Audience audience = new Audience("Avenue 31", 30);
                Professor professor = new Professor("Gvl", "24541");
                String numberGroup = new String("4");
                String phoneNumber = new String("698547");
                Group group = new Group(numberGroup, phoneNumber);
                ArrayList<Group> groups = new ArrayList<Group>();
                groups.add(group);
                Session session = new Session(audience, professor, groups);
                ArrayList<Session> sessions = new ArrayList<Session>();
                sessions.add(session);
                SchoolDay schoolDay =new SchoolDay(sessions);
                ArrayList<SchoolDay>schoolDays =new ArrayList<>();
                schoolDays.add(schoolDay);
                Timetable timetable = new Timetable(schoolDays);

        }
}
