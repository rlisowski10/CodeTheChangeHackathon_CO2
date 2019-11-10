package controller;


import model.*;
import view.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChallengeController {
    private Challenge theModel;
    private userJoinChallenge newUserForm;
    private userDashboard dashboard;

    public ChallengeController(Challenge theModel) {
        this.theModel = theModel;
        this.theModel.addParticipant("Ryan", "ABC");
        this.theModel.addParticipant("Mihai", "ABC");

        this.theModel.addDailyData("Ryan", 1, 10, "car");
        this.theModel.addDailyData("Mihai", 1, 5, "car");

        this.theModel.addDailyData("Ryan", 2, 20, "bus");
        this.theModel.addDailyData("Mihai", 2, 1, "train");

        this.theModel.addDailyData("Ryan", 3, 50, "car");
        this.theModel.addDailyData("Mihai", 3, 1, "train");
        this.dashboard = new userDashboard();
        join();



    }

    public void join() {

        userJoinChallenge newUser = new userJoinChallenge();
        this.newUserForm = newUser;
        newUserForm.okButtonAddListener(new newUserListener());
        newUserForm.setVisible(true);
        populateDashboard();


    }



    public void populateDashboard(){
        //System.out.println(theModel.leaderboard());
        dashboard.setLeaderboard(theModel.leaderboard());
        dashboard.setMyChallenge(theModel.myChallengeSummary("Ryan"));


    }

    class newUserListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
//            theModel.addParticipant(newUserForm.getUserName(), "ABC");
            newUserForm.dispose();
            dashboard.setVisible(true);


        }
    }


}