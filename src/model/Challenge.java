package model;

import java.util.ArrayList;

public class Challenge {

    ArrayList<Person> participants;
    int groupC02;
    int lengthOfChallenge;
    String challengeCode;

    public Challenge(int numOfParticipants) {
        participants = new ArrayList<>();
    }

    public void addParticipant(String name, String challengeCode) {
        Person newPerson = new Person(name, challengeCode);
        participants.add(newPerson);
    }

    public String addDailyData(String name, int day, int km, String modeTransportation) {
        Person currentPerson = null;
        
        for (int i = 0; i < participants.size(); i++) {
            Person person = participants.get(i);
            String participantName = person.getName();

            if (participantName.equals(name)) {
                currentPerson = participants.get(i);
            }
        }

        if (currentPerson != null) {
            currentPerson.addDay(day, km, modeTransportation);
            return("Daily activity logged.");
        } else {;
            return("Error: Daily activity not logged.");
        }
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
        challenge.addParticipant("Ryan", "ABC");
        challenge.addParticipant("Mihai", "ABC");

        challenge.addDailyData("Ryan", 1, 10, "car");
        challenge.addDailyData("Mihai", 1, 5, "car");

        challenge.addDailyData("Ryan", 2, 20, "bus");
        challenge.addDailyData("Mihai", 2, 1, "train");

        challenge.addDailyData("Ryan", 3, 50, "car");
        challenge.addDailyData("Mihai", 3, 1, "train");

        System.out.println(challenge.toString());
    }
}