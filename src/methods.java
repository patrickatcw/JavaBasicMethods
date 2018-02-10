public class methods {

    public static void main(String[] args) {        //main method

        //statements that form main methid
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

       calculateScore(true, 800, 5, 100);
                                //calling the method inside main method
                                //as the code runs, this causes program to
                                //jump to method below, run it, then continue on from there
                                //argument values are within quotes
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

        }
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {           //new method
        //parameters are within quotes, but need actual values above in calculateScore

        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);

        }

    }

}
