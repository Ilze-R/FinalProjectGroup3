import java.util.Locale;
import java.util.Scanner;

//test

public class Main {

    static int countWins = 0;//initialize one time
    static int countLoses = 0;//initialize one time
    static int difficulty = 2;//initialize one time 1 easy, 2 medium, 3 hard

    public static void main(String[] args) {

        System.out.println("Welcome to HangJava game!");
        chooseLevel();
        // JavaHang(); // guessing part
        // Win(); // method ready for use
        // Lose(); // method ready for use
        // TargetPictureWin();

    }

    //picture
    //player sees picture and world guess lines
    //player can add one letter or full world ->
    // if (full world is right) - win game
    //else if (one letter is correct) next guess option and picture dont change
    //else if (full world is wrong ) picture -1
    //else if (one letter is wrong") picture -1
    // displayed ->
    //if (one letter right) picture dint change but word wid added letter
    //else if ( full word right) win displayed
    // else if( one letter wrong) the same word displayed but picture -1
    //else if ( full world wrong) the same word displayed, but picture -1

    public static void Player (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your User name:");
        String name = scanner.nextLine();
    }
// Target pictures with balloons
    public static void TargetPictureFirst (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your User name:");
        String name = scanner.nextLine();
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println("                                     .-\"-.                           ");
        System.out.println("                                   /      \\                          ");
        System.out.println("                                   |#      |   .-\"-.                     ");
        System.out.println("                           .-\"-.    \\ ___ /  /      \\                ");
        System.out.println("                          /      \\    /^     |#      |                ");
        System.out.println("                         |       |    |       \\ ___ /               ");
        System.out.println("                          \\ ___ /     |   .-\"-. /^               ");
        System.out.println("                             ^\\  .-\"-.  /      \\                 ");
        System.out.println("                               /      \\ |       |                ");
        System.out.println("                               |#      | \\ ___ /                   ");
        System.out.println("                                \\ ___ /     /^                          ");
        System.out.println("                                   ^\\     /                             ");
        System.out.println("                                      \\ /                            ");
        System.out.println("                                    ///-\\\\\\                              ");
        System.out.println("                                    |^    ^|                           ");
        System.out.println("                                   |O      O|                           ");
        System.out.println("                                    |   ~  |                          ");
        System.out.println("                                     \\  o /                           ");
        System.out.println("                                       | |                             ");
        System.out.println("                                    ,-/   \\-,___                            ");
        System.out.println("                                   / /).:.('--._                          ");
        System.out.println("                                  (_) (_,_)                            ");
        System.out.println("                                      | Y |                            ");
        System.out.println("                                     /  |  \\                          ");
        System.out.println("                                                                      ");
        System.out.println("                                                                      ");
        System.out.println("                                                                      ");
        System.out.println("                                                                      ");
        System.out.println("                                                                      ");
        System.out.println("                  /\\  /\\  /\\                      /\\  /\\  /\\                       ");
        System.out.println("                 /  \\/  \\/  \\it's very sharp here/  \\/  \\/  \\                                           ");
    }
    public static void TargetPictureSecond (){
        System.out.println("                                     .-\"-.          .                 ");
        System.out.println("                                   /      \\    *\\    . /                ");
        System.out.println("                                   |#      |   .         *            ");
        System.out.println("                           .-\"-.    \\ ___ /      BOOM     >             ");
        System.out.println("                          /      \\    /^    *        *  .            ");
        System.out.println("                         |       |    |         .      \\      ");
        System.out.println("                          \\ ___ /     |   .-\"-. /^               ");
        System.out.println("                             ^\\  .-\"-.  /      \\                 ");
        System.out.println("                               /      \\ |       |                ");
        System.out.println("                               |#      | \\ ___ /                   ");
        System.out.println("                                \\ ___ /     /^                          ");
        System.out.println("                                   ^\\     /                             ");
        System.out.println("                                      \\ /                            ");
        System.out.println("                                    ///-\\\\\\                              ");
        System.out.println("                                    |^    ^|                           ");
        System.out.println("                                   |O      O|                           ");
        System.out.println("                                    |   ~  |                          ");
        System.out.println("                                     \\  o /                           ");
        System.out.println("                                       | |                             ");
        System.out.println("                                    ,-/   \\-,___                            ");
        System.out.println("                                   / /).:.('--._                          ");
        System.out.println("                                  (_) (_,_)                            ");
        System.out.println("                                      | Y |                            ");
        System.out.println("                                     /  |  \\                          ");
        System.out.println("                                                                      ");
        System.out.println("                                                                      ");
        System.out.println("                                                                      ");
        System.out.println("                                                                      ");
        System.out.println("                  /\\  /\\  /\\                      /\\  /\\  /\\                       ");
        System.out.println("                 /  \\/  \\/  \\it's very sharp here/  \\/  \\/  \\                                           ");
    }
    public static void TargetPictureThird (){
        System.out.println("                                              .              ");
        System.out.println("                                        *                  ");
        System.out.println("                                    . \\       .    *                ");
        System.out.println("                           .-\"-.        BOOM                  ");
        System.out.println("                          /      \\  /          \\                   ");
        System.out.println("                         |       |    |    *  .                  ");
        System.out.println("                          \\ ___ /     |   .-\"-.                ");
        System.out.println("                             ^\\  .-\"-.  /      \\                 ");
        System.out.println("                               /      \\ |       |                ");
        System.out.println("                               |#      | \\ ___ /                   ");
        System.out.println("                                \\ ___ /     /^                          ");
        System.out.println("                                   ^\\     /                             ");
        System.out.println("                                      \\ /                            ");
        System.out.println("                                    ///-\\\\\\                              ");
        System.out.println("                                    |^    ^|                           ");
        System.out.println("                                   |O      O|                           ");
        System.out.println("                                    |   ~  |                          ");
        System.out.println("                                     \\  o /                           ");
        System.out.println("                                       | |                             ");
        System.out.println("                                    ,-/   \\-,___                            ");
        System.out.println("                                   / /).:.('--._                          ");
        System.out.println("                                  (_) (_,_)                            ");
        System.out.println("                                      | Y |                            ");
        System.out.println("                                     /  |  \\                          ");
        System.out.println("                                                                      ");
        System.out.println("                                                                      ");
        System.out.println("                                                                      ");
        System.out.println("                  /\\  /\\  /\\                      /\\  /\\  /\\                       ");
        System.out.println("                 /  \\/  \\/  \\it's very sharp here/  \\/  \\/  \\                                           ");
    }
    public static void TargetPictureForth (){
        System.out.println("                          .                                ");
        System.out.println("                               *   .                             ");
        System.out.println("                          *           /              ");
        System.out.println("                             \\         *                         ");
        System.out.println("                         .      BOOM    .                        ");
        System.out.println("                             /           .-\"-.                ");
        System.out.println("                                 .-\"-.  /      \\                 ");
        System.out.println("                               /      \\ |       |                ");
        System.out.println("                               |#      | \\ ___ /                   ");
        System.out.println("                                \\ ___ /     /^                          ");
        System.out.println("                                   ^\\     /                             ");
        System.out.println("                                      \\ /                            ");
        System.out.println("                                    ///-\\\\\\                              ");
        System.out.println("                                    |^    ^|                           ");
        System.out.println("                                   |O      O|                           ");
        System.out.println("                                    |   ~  |                          ");
        System.out.println("                                     \\  ^ /                           ");
        System.out.println("                                       | |                             ");
        System.out.println("                                    ,-/   \\-,___                            ");
        System.out.println("                                   / /).:.('--._                          ");
        System.out.println("                                  (_) (_,_)                            ");
        System.out.println("                                      | Y |                            ");
        System.out.println("                                     /  |  \\                          ");
        System.out.println("                                                                      ");
        System.out.println("                                                                      ");
        System.out.println("                  /\\  /\\  /\\                      /\\  /\\  /\\                       ");
        System.out.println("                 /  \\/  \\/  \\it's very sharp here/  \\/  \\/  \\                                           ");
    }
    public static void TargetPictureFifth (){
        System.out.println("                                              ^     /       ");
        System.out.println("                                 .-\"-.  \\       *   .      ");
        System.out.println("                               /      \\  .   BOOM          ");
        System.out.println("                               |#      |                .    ");
        System.out.println("                                \\ ___ /  /    .   *                    ");
        System.out.println("                                   ^\\      .                           ");
        System.out.println("                                      \\                             ");
        System.out.println("                                    ///-\\\\\\                              ");
        System.out.println("                                    |^    ^|                           ");
        System.out.println("                                   |O      O|                           ");
        System.out.println("                                    |   ~  |                          ");
        System.out.println("                                     \\  ^ /                           ");
        System.out.println("                                       | |                             ");
        System.out.println("                                    ,-/   \\-,___                            ");
        System.out.println("                                   / /).:.('--._                          ");
        System.out.println("                                  (_) (_,_)                            ");
        System.out.println("                                      | Y |                            ");
        System.out.println("                                     /  |  \\                          ");
        System.out.println("                                                                      ");
        System.out.println("                  /\\  /\\  /\\                      /\\  /\\  /\\                       ");
        System.out.println("                 /  \\/  \\/  \\it's very sharp here/  \\/  \\/  \\                                           ");
    }
    public static void TargetPictureSixth (){
        System.out.println("                       .                 ");
        System.out.println("                             ^                  ");
        System.out.println("                       \\         /                       ");
        System.out.println("                           BOOM                                    ");
        System.out.println("                       *    .     \\                             ");
        System.out.println("                                ///-\\\\\\                              ");
        System.out.println("                                |^    ^|                           ");
        System.out.println("                               |O      O|                           ");
        System.out.println("                                |   ~  |                          ");
        System.out.println("                                 \\ <> /                           ");
        System.out.println("                                   | |                             ");
        System.out.println("                  cut cut cut cut /   \\ cut cut cut cut              ");
        System.out.println("                   /\\  /\\  /\\     ).:.('   /\\  /\\  /\\              ");
        System.out.println("                  /  \\/  \\/  \\    (_,_)   /  \\/  \\/  \\               ");
    }
    public static void TargetPictureWin (){
        System.out.println("                                   .''.                                                     ");
        System.out.println("         .''.             *''*    :_\\/_:     .                                                                       ");
        System.out.println("        :_\\/_:   .    .:.*_\\/_*   : /\\ :  .'.:.'.                                                                    ");
        System.out.println("    .''.: /\\ : _\\(/_  ':'* /\\ *  : '..'.  -=:o:=-                                                                      ");
        System.out.println("   :_\\/_:'.:::. /)\\*''*  .|.* '.\\'/.'_\\(/_'.':'.'                                                                      ");
        System.out.println("   : /\\ : :::::  '*_\\/_* | |  -= o =- /)\\    '  *                                                                      ");
        System.out.println("    '..'  ':::'   * /\\ * |'|  .'/.\\'.  '.                                                                      ");
        System.out.println("   *          *  *          :                                                                      ");
        System.out.println("                                                                      ");
        System.out.println("                           .         ///-\\\\\\                              ");
        System.out.println("       .* *.            .'.:.'.      |^    ^|                           ");
        System.out.println("       *. .*            -=:o:=-     |O      O|                           ");
        System.out.println("         *              '.':'.       |   ~  |                          ");
        System.out.println("          \\       `o`o     '          \\  U /                           ");
        System.out.println("           \\     o`o`o`o               | |                             ");
        System.out.println("            \\     `o`o`               /   \\                           ");
        System.out.println("             \\      |                 ).:.(                          ");
        System.out.println("              \\     |                 (_,_)                            ");
        System.out.println("               \\    |                 | Y |                            ");
        System.out.println("                \\   |                /  |  \\                          ");
        System.out.println(" ________________________________________________________________________     ");
        System.out.println("                                                                      ");
        System.out.println("                                                                      ");
    }

// JavaHang entering letter and checking if it belongs to word
    public static void JavaHang (){

        System.out.println("Guess the Java name:");
        //
        String rightAnswer = "right"; //"right" = random word from database

        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();
        if ( guess.equals(rightAnswer)) {
            TargetPictureWin();
            Win();
            // }else if (rightAnswer.indexOf(guess)equals(){
        }else if(rightAnswer.contains(""+guess)) {
            TargetPictureFirst(); //need to find way how to print if person added only one letter
            //for (int i=1; i>6; i++){
            //   TargetPictureThird();
        }else{
            TargetPictureSecond();
        }
    }

// When player starts a game
    public static void chooseLevel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose level: easy (1), medium (2), hard (3)");
        difficulty = scanner.nextInt();

        if (difficulty == 1 || difficulty == 2 || difficulty == 3) {
            System.out.println("level successfully chosen: "+difficulty);
        } else {
            chooseLevel();
        }
    }

// When player wins
public static void Win () {
    countWins++;
    countLoses=121;
    System.out.println("You win!");
    System.out.println("Total games played: "+(countWins+countLoses)+" Total wins: "+ countWins+" and total loses: "+countLoses);

    playAgainQuestion();
}

// When player lose
public static void Lose() {
    countLoses--;
    System.out.println("You lose!");
    System.out.println("Total games played: " + (countWins + countLoses) + " Total wins: " + countWins + " and total loses: " + countLoses);

    playAgainQuestion();
}

// When game ends ask player what he wants to do next
public static void playAgainQuestion() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("PLay again? (Y/N)");
    String playAgainQuestion = scanner.next();
    if (playAgainQuestion.equals("y") || playAgainQuestion.equals("Y") || playAgainQuestion.equals("n") || playAgainQuestion.equals("N")) {
        JavaHang();
    } else {
        playAgainQuestion();
    }
}

}
