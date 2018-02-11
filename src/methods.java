public class methods {

    public static void main(String[] args) {        //main method

        //hardcoding the values, maybe better for visual and organizing
        boolean gameOver = true;            //variables
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore (gameOver, score, levelCompleted, bonus);  //calling the method

        gameOver = true;                    //variables
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore (gameOver, score, levelCompleted, bonus);    //calling the method

        }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {    //new method
        //parameters variables are defined within quotes, actual values are listed variables above
        //void keyword means do not send any value back
        //but if you do want to return something;so change void to int, to return
        //value of int finalScore

        if (gameOver) {                                     //method logic if statement

            int finalScore = score + (levelCompleted * bonus);  //incorporating new variable for finalScore
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;          //returns for int change in method from void

        }
            return -1;  //if gameOver is not true
                        //-1 is used to indicate an error, a invalid value or value not
                        //found

    }
}
