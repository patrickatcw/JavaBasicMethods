public class methods {

    public static void main(String[] args) {        //main method

        //statements that form main methid
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            //addition to code block, not represented in duplicated code
            //below, which is problem
            //result change will not be added below
            System.out.println("Your final score was " + finalScore);

        }

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
