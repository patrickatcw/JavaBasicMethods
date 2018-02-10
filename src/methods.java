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

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {       //new method
        //parameters variables are defined within quotes, but need actual values above in calculateScore
        //void keyword means do not send any value back
        //but if you do want to return something;so change void to int, to return
        //value of int finalScore

        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;          //returns for int change in method from void

        }
            return -1;  //if gameOver is not true
                        //-1 is used to indicate an error, a invalid value or value not
                        //found

    }
}
