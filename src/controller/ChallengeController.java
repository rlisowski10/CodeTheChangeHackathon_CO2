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
        join();
    }

    public void join() {

        userJoinChallenge newUser = new userJoinChallenge();
        this.newUserForm = newUser;
        newUserForm.okButtonAddListener(new newUserListener());
        newUserForm.setVisible(true);

    }

    class newUserListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            theModel.addParticipant(newUserForm.getUserName(), "ABC");
            newUserForm.dispose();

        }
    }


}