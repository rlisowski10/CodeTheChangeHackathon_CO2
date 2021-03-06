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
        //System.out.println(name);
        Person newPerson = new Person(name, challengeCode);
        participants.add(newPerson);
    }

    public String addDailyData(String name, int day, int km, String modeTransportation) {
        Person currentPerson = findParticipant(name);

        if (currentPerson != null) {
            currentPerson.addDay(day, km, modeTransportation);
            return ("Daily activity logged.");
        } else {
            ;
            return ("Error: Daily activity not logged.");
        }
    }

    private Person findParticipant(String name) {
        Person currentPerson = null;

        for (int i = 0; i < participants.size(); i++) {
            Person person = participants.get(i);
            String participantName = person.getName();

            if (participantName.equals(name)) {
                currentPerson = participants.get(i);
            }
        }

        return currentPerson;
    }

    public String myChallengeSummary(String name) {
        Person currentPerson = findParticipant(name);

        return currentPerson.toString();
    }

    public String leaderboard() {
        String leaderboard = "";

        for (Person partipant : participants) {
            leaderboard += partipant.getName() + ":\t";
            leaderboard += Integer.toString(partipant.getrunningTotalCO2()) + "g of CO2\n";
        }

        return leaderboard;
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

        //System.out.println(challenge.myChallengeSummary("Ryan"));
        //System.out.println(challenge.myChallengeSummary("Mihai"));
        //System.out.println(challenge.leaderboard());
        // System.out.println(challenge.toString());
    }
}