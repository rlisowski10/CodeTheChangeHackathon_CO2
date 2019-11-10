package controller;


import model.*;
import view.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChallengeController {
    private Challenge theModel;
    private userJoinChallenge newUserForm;

    public ChallengeController(Challenge theModel) {
        this.theModel = theModel;
        join();
    }

    public void join() {

        userJoinChallenge newUser = new userJoinChallenge();
        newUser.setVisible(true);
//        newUserForm.okButtonAddListener(new newUserListener());


    }

    class newUserListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            theModel.addParticipant(newUserForm.getName(), "ABC");
            newUserForm.dispose();
        }
    }


}