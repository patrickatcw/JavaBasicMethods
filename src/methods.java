public class methods {

    public static void main(String[] args) {        //main method

        //statements that form main methid
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

       calculateScore();        //calling the method inside main method
                                //as the code runs, this causes program to
                                //jump to method below, run it, then continue on from there
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

        }
    }

    public static void calculateScore() {           //new method

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);

        }

    }

}
