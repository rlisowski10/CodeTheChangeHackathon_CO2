package controller;

import model.Challenge;
import view.View;

public class ChallengeController {
    private View theView;
    private Challenge theModel;

    public ChallengeController(View theView, Challenge theModel) {
        this.theModel = theModel;
        this.theView = theView;
    }



}