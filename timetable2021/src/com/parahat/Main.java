package com.parahat;


import java.util.ArrayList;

public class Main{

        public void main() {

                Audience audience = new Audience("Avenue 31", 30);
                Professor professor = new Professor("Gvl", "+999***1");
                String numberGroup = new String("4");
                String phoneNumber = new String("698547");

                Audience audience1 = new Audience("Avenue 31",25);
                Professor professor1 = new Professor("Al", "698574");
                String numberGroup1 = new String("1");
                String phoneNumber1 = new String("4578213");

                Audience audience2 = new Audience("Avenue 29", 30);
                Professor professor2 = new Professor("Ak", "+852465");
                String numberGroup2 = new String("3");
                String phoneNumber2 = new String("+79996524");

                Audience audience3 = new Audience("Avenue 29", 25);
                Professor professor3 = new Professor("Masha", "+9936363254");
                String numberGroup3 = new String("2");
                String phoneNumber3 = new String("985624");

                Group group = new Group(numberGroup, phoneNumber);
                ArrayList<Group> groups = new ArrayList<Group>();
                groups.add(group);
                Group group1 = new Group(numberGroup1, phoneNumber1);
                ArrayList<Group> groups1 = new ArrayList<Group>();
                groups1.add(group1);
                Group group2 = new Group(numberGroup2, phoneNumber2);
                ArrayList<Group> groups2 = new ArrayList<Group>();
                groups2.add(group2);
                Group group3 = new Group(numberGroup3, phoneNumber3);
                ArrayList<Group>groups3 = new ArrayList<Group>();
                groups3.add(group3);

                Session session = new Session(audience, professor, groups);
                Session sessionPractical = new Session(audience1, professor1, groups1);
                Session sessionLaboratory = new Session(audience2, professor2, groups2);
                Session sessionProgram = new Session(audience3, professor3, groups3);

                ArrayList<Session> sessions = new ArrayList<Session>();

                sessions.add(session);
                sessions.add(sessionPractical);
                sessions.add(sessionLaboratory);
                sessions.add(sessionProgram);

                SchoolDay schoolDay =new SchoolDay(sessions);
                ArrayList<SchoolDay>schoolDays =new ArrayList<>();
                schoolDays.add(schoolDay);

                Timetable timetable = new Timetable(schoolDays);

        }

}
