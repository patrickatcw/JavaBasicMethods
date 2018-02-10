public class methods {

    public static void main(String[] args) {        //main method

        calculateScore(true, 800, 5, 100);
                                //calling the method inside main method
                                //as the code runs, this causes program to
                                //jump to method below, run it, then continue on from there
                                //argument values are within quotes

        calculateScore(true, 1000, 8, 200);
                                //calling method twice with different argument values
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {       //new method
        //parameters variables are defined within quotes, but need actual values above in calculateScore

        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);

        }

    }

}
