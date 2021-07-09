package HangJavaSecondTry;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class HangJavaSecondTry {

    public static void main(String[] args) {

        String gameGuess;
        System.out.println();
        System.out.println("Welcome to HangJava!");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        char again;

        do {
            System.out.println("Please choose level of difficulty: Easy (1), Medium (2), Hard (3):");
            char level = scanner.next().charAt(0);
            scanner.nextLine();

            if (level == '1') {
                gameGuess = H2dbcHangJGenerateGuess.generateGuessLevel1();

            } else if (level == '2') {
                gameGuess = H2dbcHangJGenerateGuess.generateGuessLevel2();

            } else if (level == '3') {
                gameGuess = H2dbcHangJGenerateGuess.generateGuessLevel3();
            } else {
                System.out.println("Input was not valid. Starting game at medium level"); //need to fix
                gameGuess = H2dbcHangJGenerateGuess.generateGuessLevel2();
            }
            gameGuess = gameGuess.toUpperCase(Locale.ROOT);
            TargetPictureStart();
            System.out.println();
            //Number of underscores hints at the number of letters in the hidden word
            System.out.println("Guess the hidden word below:" + "\n" + gameGuess.replaceAll("[* .a-zA-Z]", "_ "));

            List<Character> playerGuess = new ArrayList<>();

            int life = 0;
            while (true) {
                TargetPictureDecrease(life);
                if (!playerGuess.isEmpty() ) {
                    System.out.println();
                    System.out.println("Entered letters: "+playerGuess);
                }

            if (life == 5) {
                TargetPictureLose(gameGuess);
                HangJavaLevelsAndStats.Lose();
                break;
            }
            if(!getGuess(scanner, gameGuess, playerGuess)){
                life++;
            }
            if(guessPrint(gameGuess, playerGuess)){
                TargetPictureWin();
                HangJavaLevelsAndStats.Win();
                break;
            }
        }
            System.out.println();
            System.out.println("Do you want to play again ? y/n");
            again = scanner.next().charAt(0);
            scanner.nextLine();
            // Ensures user only enters lower case letters  y and n
            if (Character.isUpperCase(again)){
                System.out.println("Please use only lower case y or n");
                again = scanner.next().charAt(0);
                scanner.nextLine();
            }


        } while (again== 'y');

        System.out.println();
        System.out.println("Goodbye, Thank you for playing HangJava!");
    }

    public static boolean getGuess (Scanner scanner, String gameGuess, List < Character > playerGuess){

            System.out.println();
            System.out.println("Please enter letter:");
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

        public static void TargetPictureLose (String gameGuess) {


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
            System.out.println();
            System.out.println("The hidden word was:"+ gameGuess);
            System.out.println();
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

