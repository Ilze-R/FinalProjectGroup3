package HangJavaSecondTry;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class HangJavaSecondTry {
    //int playerRightCount = 0;

    public static void main(String[] args) {

        H2dbcHangJGenerateGuess compGuess = new H2dbcHangJGenerateGuess();


        Scanner scanner = new Scanner(System.in);

       String gameGuess; //here comes random name from database
        gameGuess = H2dbcHangJGenerateGuess.generateGuessLevel1();
        System.out.println(H2dbcHangJGenerateGuess.generateGuessLevel1().replaceAll(".","_"));

        //System.out.println(gameGuess);


        //System.out.println(gameName);
        List<Character> playerGuess = new ArrayList<>(); //array to store guessed letters

        // guessPrint(gameGuess, playerGuess);


    private static void getGuess(Scanner scanner, String gameGuess, List<Character> playerGuess) {
            int decrease = 0;
            TargetPictureStart();
            //if (guess.contains(gameGuess)) {
            //  getGuess(scanner, gameGuess, playerGuess);
            while (decrease != 5) {
                if (!getGuess(scanner, gameGuess, playerGuess)) {
                    decrease++;
                }
                guessPrint(gameGuess, playerGuess);
                TargetPictureDecrease(decrease);
            }
            //TargetPictureLose();
        }

    }


    private static boolean guessPrint(String gameGuess, List<Character> playerGuess) {
        int playerRightCount = 0; //by comparing it with gameGuess.length we can end the loop when the player is guessed the full name

        for (int i = 0; i < gameGuess.length(); i++) {
            if (playerGuess.contains(gameGuess.charAt(i))) {
                System.out.print(gameGuess.charAt(i) + " "); //prints the guessed letter in " "
                playerRightCount++;
            } else {
                System.out.print("_ "); //prints "_" for every non guessed letter
            }
        }
        System.out.println();
        return (gameGuess.length() == playerRightCount);
    }

    public static void TargetPictureStart() {
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

    public static void TargetPictureDecrease(int decrease) {
        if (decrease == 1) {
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

        if (decrease == 2) {
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


        if (decrease == 3) {
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


        if (decrease == 4) {
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


        if (decrease == 5) {
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
    }
        public static void TargetPictureWin () {
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

    }




