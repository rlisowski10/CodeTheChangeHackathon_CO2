import controller.ChallengeController;
import model.*;
import view.*;

public class Main {

    public static void main(String[] args) {

        userJoinChallenge viewUserJoinChallenge = new userJoinChallenge();
        //ChallengeController controller = new ChallengeController();

        viewUserJoinChallenge.setVisible(true);
    }
}
