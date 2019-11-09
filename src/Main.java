import controller.ChallengeController;
import model.*;
import view.*;

public class Main {

    public static void main(String[] args) {

        ChallengeController theController = new ChallengeController();
        
        Day Day1 = new Day(1, 100, "car");

        System.out.println(Day1);

        userJoinChallenge viewUserJoinChallenge = new userJoinChallenge();

        viewUserJoinChallenge.setVisible(true);


    }
}
