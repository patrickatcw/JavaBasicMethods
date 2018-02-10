public class methods {

    public static void main(String[] args) {        //main method

        //hardcoding the values, maybe better fro visual and organizing
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore (gameOver, score, levelCompleted, bonus);

        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore (gameOver, score, levelCompleted, bonus);


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
