package HangJavaSecondTry;

public class HangJavaLevelsAndStats {

    static int countWins = 0;//initialize one time
    static int countLoses = 0;//initialize one time

    public static void main(String[] args) {

    }

    // When player wins
    public static void Win() {
        countWins++;
        System.out.println("Total games played: "+(countWins+countLoses)+" Total wins: "+ countWins+" and total loses: "+countLoses);

    }

    // When player lose
    public static void Lose() {
        countLoses++;
        System.out.println("Total games played: " + (countWins + countLoses) + " Total wins: " + countWins + " and total loses: " + countLoses);

    }




}

