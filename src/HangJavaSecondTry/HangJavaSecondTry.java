package HangJavaSecondTry;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class HangJavaSecondTry {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String gameGuess = "SYSTEM";  //here comes random name from database
        String guess = scanner.nextLine().toUpperCase(Locale.ROOT);

        List<Character> playerGuess = new ArrayList<>(); //array to store guessed letters


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
        TargetPictureLose();
    }


    private static boolean getGuess(Scanner scanner, String gameGuess, List<Character> playerGuess) {
        System.out.println("Please Enter a letter:");
        String guess = scanner.nextLine().toUpperCase(Locale.ROOT);

            playerGuess.add(guess.charAt(0));

        return gameGuess.contains(guess);
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
    }

        public static void TargetPictureLose() {
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
            System.out.println("                                                                ");
            System.out.println("YOU LOSE!!!");
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




