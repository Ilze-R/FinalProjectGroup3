package HangJavaSecondTry;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class HangJavaSecondTry {

    public static void main(String[] args) {

        H2dbcHangJGenerateGuess compGuess = new H2dbcHangJGenerateGuess();

        String gameGuess;
        System.out.println("Welcome to HangJava!");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        char again = 'n';

        do {
            System.out.println("Please choose level of difficulty: easy (1),medium (2) or  hard (3):");
            char level = scanner.next().charAt(0);
            scanner.nextLine();

            if (level == '1') {
                gameGuess = compGuess.generateGuessLevel1();

                //int sid = scanner.nextInt();
                //scanner.nextLine();

                // System.out.println("Please enter student's name");
                //String name = scanner.nextLine();

            } else if (level == '2') {
                gameGuess = compGuess.generateGuessLevel2();

                //System.out.println("Please enter student's ID");
                //int sid = scanner.nextInt();
                //scanner.nextLine();

            } else if (level == '3') {
                gameGuess = compGuess.generateGuessLevel3();

            } else {
                System.out.println("Input was not valid. Starting game at medium level"); //need to fix
                gameGuess = compGuess.generateGuessLevel2();
            }
            gameGuess = gameGuess.toUpperCase(Locale.ROOT);
            TargetPictureStart();
            System.out.println("Hidden word:" + "\n" + gameGuess.replaceAll("[a-zA-Z]", "_"));
            // System.out.println("Guess the letter:"); // don't need

            List<Character> playerGuess = new ArrayList<>();

            int life = 0;
            while (true) {
                TargetPictureDecrease(life);

            if (life == 5) {
                TargetPictureLose();
                break;
            }
            guessPrint(gameGuess, playerGuess);
            if(!getGuess(scanner, gameGuess, playerGuess)){
                life++;
            }
            if(guessPrint(gameGuess, playerGuess)){
                TargetPictureWin();
                break;
            }
        }

            System.out.println("Do you want to play again ? y/n");
            again = scanner.next().charAt(0);
            scanner.nextLine();

        } while (again == 'y');
    }

    public static boolean getGuess (Scanner scanner, String gameGuess, List < Character > playerGuess){
            //Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter a letter:");
            String guess = scanner.nextLine().toUpperCase(Locale.ROOT);
            playerGuess.add(guess.charAt(0));

            return gameGuess.contains(guess);
    }

        public static boolean guessPrint (String gameGuess, List < Character > playerGuess){
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

        public static void TargetPictureStart () {
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
            System.out.println("                 _____                 \\ /                              ");
            System.out.println("                /\\___ \\                 \\                           ");
            System.out.println("                \\/__/\\ \\      __      __//__      __                        ");
            System.out.println("                     _\\ \\   /'__`\\   /\\ \\/\\ \\   /'__`\\                  ");
            System.out.println("                  /\\ \\_\\ \\ /\\ \\L\\.\\_ \\ \\ \\_/ | /\\ \\L\\.\\_            ");
            System.out.println("                  \\ \\____/ \\ \\__/.\\_\\ \\ \\___/  \\ \\__/.\\_\\           ");
            System.out.println("                   \\/___/   \\/__/\\/_/  \\/__/    \\/__/\\/_/              ");
            System.out.println("                                                                      ");
            System.out.println("                                                                      ");
            System.out.println("                                                                      ");
            System.out.println("                                                                      ");
            System.out.println("                                                                      ");
            System.out.println("                  /\\  /\\  /\\                      /\\  /\\  /\\                       ");
            System.out.println("                 /  \\/  \\/  \\  Keep Java high!!  /  \\/  \\/  \\                                           ");
        }

        public static void TargetPictureDecrease ( int decrease){
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
                System.out.println("                 _____                 \\ /                              ");
                System.out.println("                /\\___ \\                 \\                           ");
                System.out.println("                \\/__/\\ \\      __      __//__      __                        ");
                System.out.println("                     _\\ \\   /'__`\\   /\\ \\/\\ \\   /'__`\\                  ");
                System.out.println("                  /\\ \\_\\ \\ /\\ \\L\\.\\_ \\ \\ \\_/ | /\\ \\L\\.\\_            ");
                System.out.println("                  \\ \\____/ \\ \\__/.\\_\\ \\ \\___/  \\ \\__/.\\_\\           ");
                System.out.println("                   \\/___/   \\/__/\\/_/  \\/__/    \\/__/\\/_/              ");
                System.out.println("                                                                      ");
                System.out.println("                                                                      ");
                System.out.println("                                                                      ");
                System.out.println("                                                                      ");
                System.out.println("                  /\\  /\\  /\\                      /\\  /\\  /\\                       ");
                System.out.println("                 /  \\/  \\/  \\  Keep Java high!!  /  \\/  \\/  \\                                           ");
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
                System.out.println("                 _____                 \\ /                              ");
                System.out.println("                /\\___ \\                 \\                           ");
                System.out.println("                \\/__/\\ \\      __      __//__      __                        ");
                System.out.println("                     _\\ \\   /'__`\\   /\\ \\/\\ \\   /'__`\\                  ");
                System.out.println("                  /\\ \\_\\ \\ /\\ \\L\\.\\_ \\ \\ \\_/ | /\\ \\L\\.\\_             ");
                System.out.println("                  \\ \\____/ \\ \\__/.\\_\\ \\ \\___/  \\ \\__/.\\_\\               ");
                System.out.println("                   \\/___/   \\/__/\\/_/  \\/__/    \\/__/\\/_/                     ");
                System.out.println("                                                                                    ");
                System.out.println("                                                                                    ");
                System.out.println("                                                                                    ");
                System.out.println("                  /\\  /\\  /\\                      /\\  /\\  /\\                  ");
                System.out.println("                 /  \\/  \\/  \\  Keep Java high!!  /  \\/  \\/  \\                 ");
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
                System.out.println("                 _____                 \\ /                              ");
                System.out.println("                /\\___ \\                 \\                           ");
                System.out.println("                \\/__/\\ \\      __      __//__      __                             ");
                System.out.println("                     _\\ \\   /'__`\\   /\\ \\/\\ \\   /'__`\\                      ");
                System.out.println("                  /\\ \\_\\ \\ /\\ \\L\\.\\_ \\ \\ \\_/ | /\\ \\L\\.\\_             ");
                System.out.println("                  \\ \\____/ \\ \\__/.\\_\\ \\ \\___/  \\ \\__/.\\_\\               ");
                System.out.println("                   \\/___/   \\/__/\\/_/  \\/__/    \\/__/\\/_/                     ");
                System.out.println("                                                                                    ");
                System.out.println("                                                                                    ");
                System.out.println("                  /\\  /\\  /\\                      /\\  /\\  /\\                  ");
                System.out.println("                 /  \\/  \\/  \\  Keep Java high!!  /  \\/  \\/  \\                 ");
            }


            if (decrease == 4) {
                System.out.println("                                              ^     /       ");
                System.out.println("                                 .-\"-.  \\       *   .      ");
                System.out.println("                               /      \\  .   BOOM          ");
                System.out.println("                               |#      |                .    ");
                System.out.println("                                \\ ___ /  /    .   *                    ");
                System.out.println("                                   ^\\      .                           ");
                System.out.println("                 _____                 \\ /                              ");
                System.out.println("                /\\___ \\                 \\                           ");
                System.out.println("                \\/__/\\ \\      __      __//__      __                        ");
                System.out.println("                     _\\ \\   /'__`\\   /\\ \\/\\ \\   /'__`\\                  ");
                System.out.println("                  /\\ \\_\\ \\ /\\ \\L\\.\\_ \\ \\ \\_/ | /\\ \\L\\.\\_             ");
                System.out.println("                  \\ \\____/ \\ \\__/.\\_\\ \\ \\___/  \\ \\__/.\\_\\               ");
                System.out.println("                   \\/___/   \\/__/\\/_/  \\/__/    \\/__/\\/_/                     ");
                System.out.println("                                                                                    ");
                System.out.println("                  /\\  /\\  /\\                      /\\  /\\  /\\                  ");
                System.out.println("                 /  \\/  \\/  \\  Keep Java high!!  /  \\/  \\/  \\                 ");
            }
        }

        public static void TargetPictureLose () {
            System.out.println("                       .         .        ");
            System.out.println("                             ^         .         ");
            System.out.println("                       \\         /                       ");
            System.out.println("                           BOOM       .                             ");
            System.out.println("           /       .     *    .     *             /    .   /         ");
            System.out.println("       /      .    ._*._           .      \\ .            .    /                 ");
            System.out.println("     .           .\\._* \\      .     .      *    .  .   .      .                ");
            System.out.println("           .     */../. *    .  ..      .*/..   .   ..    .         /            ");
            System.out.println("     /    .    .     .   .* \\   /*_.`*   .\\ *< *   /'._*\\    .     .          ");
            System.out.println("        .     .     > *.\\ * < > * L\\.* . \\ *  \\./ * /* \\L*.*.               ");
            System.out.println("                    cut cut cut cut cut / \\ cut cut cut cut cut                ");
            System.out.println("                   /\\  /\\  /\\                      /\\  /\\  /\\              ");
            System.out.println("                  /  \\/  \\/  \\     YOU LOSE !!    /  \\/  \\/  \\             ");
            System.out.println("                                                                ");
        }

        public static void TargetPictureWin () {
            System.out.println("                                   .''.                                                 ");
            System.out.println("         .''.             *''*    :_\\/_:     .           .. \\ ..                      ");
            System.out.println("        :_\\/_:   .    .:.*_\\/_*   : /\\ :  .'.:.'. .**. / o'o'\\ ..                   ");
            System.out.println("    .''.: /\\ : _\\(/_  ':'* /\\ *  : '..'.  -=:o:=-*.*.* o'o'o'o'\\ ..                 ");
            System.out.println("   :_\\/_:'.:::. /)\\*''*  .|.* '.\\'/.'_\\(/_'.':'.'.**. / o'o'\\ ..                   ");
            System.out.println("   : /\\ : :::::  '*_\\/_* | |  -= o =- /)\\     '  * | *   /  ..                        ");
            System.out.println("    '..'  ':::'   * /\\ * |'|  .'/.\\'.  '.     \\    |    /                             ");
            System.out.println("   *          *  *          :                  \\   |   /                              ");
            System.out.println("                 _____                          \\  |  /                            ");
            System.out.println("                /\\___ \\                          \\ | /                             ");
            System.out.println("                \\/__/\\ \\      __      __  __      __                              ");
            System.out.println("                     _\\ \\   /'__`\\   /\\ \\/\\ \\   /'__`\\                       ");
            System.out.println("                  /\\ \\_\\ \\ /\\ \\L\\.\\_ \\ \\ \\_/ | /\\ \\L\\.\\_              ");
            System.out.println("                  \\ \\____/ \\ \\__/.\\_\\ \\ \\___/  \\ \\__/.\\_\\                ");
            System.out.println("                   \\/___/   \\/__/\\/_/  \\/__/    \\/__/\\/_/                      ");
            System.out.println(" ________________________________________________________________________            ");
            System.out.println("                      CONGRATULATIONS !! YOU WIN  !!                                  ");
            System.out.println("                                                                                 ");
        }




}

