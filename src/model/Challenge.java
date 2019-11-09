package model;

import java.util.ArrayList;

public class Challenge {

    ArrayList<Person> participants;
    int groupC02;
    int lengthOfChallenge;

    public Challenge(int numOfParticipants) {
        participants = new ArrayList<>();
    }

    public void addParticipant(String name) {
        Person newPerson = new Person(name);
        participants.add(newPerson);
    }

    public void addDailyData(String name, int km, String modeTransportation) {
        
    }

    @Override
    public String toString() {
        String challenge = "";

        for (Person partipant : participants) {
            challenge += partipant;
        }

        return challenge;
    }

    public static void main(String[] args) {
        Challenge challenge = new Challenge(2);
        challenge.addParticipant("Ryan");
        challenge.addParticipant("Mihai");

        System.out.println(challenge.toString());
    }
}