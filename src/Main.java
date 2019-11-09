import model.*;

public class Main {

    public static void main(String[] args) {
        
        Day Day1 = new Day(100, "car");


        userJoinChallenge viewUserJoinChallenge = new userJoinChallenge();
        userDashboard viewuserDashboard = new userDashboard();
//        CalculatorModel theModel = new CalculatorModel();
//        CalculatorController theController = new CalculatorController(theView,theModel);
        //viewUserJoinChallenge.setVisible(true);
        viewuserDashboard.setVisible(true);
    }
}
