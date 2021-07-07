package HangJavaSecondTry;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class HangJavaSecondTry {

    public static void main(String[] args) {

        H2dbcHangJGenerateGuess compGuess = new H2dbcHangJGenerateGuess();

        //compGuess.DatabasePart();
        String gameGuess;
        System.out.println("Welcome to HangJava!");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        char again ='n';



        do {
            System.out.println("Please choose level of difficulty: easy (1),medium (2) or  hard (3):");
            char level = scanner.next().charAt(0);
            scanner.nextLine();

            if(level == '1'){
                TargetPictureStart();
                gameGuess = compGuess.generateGuessLevel1();

                //int sid = scanner.nextInt();
                //scanner.nextLine();

                // System.out.println("Please enter student's name");
                //String name = scanner.nextLine();

                // addStudent(sid,name);
            } else if (level== '2'){
                TargetPictureStart();
                gameGuess = compGuess.generateGuessLevel2();

                //System.out.println("Please enter student's ID");
                //int sid = scanner.nextInt();
                //scanner.nextLine();

                //deleteStudent(sid);
            } else if (level== '3'){
                TargetPictureStart();
                gameGuess = compGuess.generateGuessLevel3();

            } else {
                System.out.println("Input was not valid. Starting game at medium level"); //need to fix
                gameGuess = compGuess.generateGuessLevel2();
            }

            System.out.println("Hidden word:"+ "\n"+gameGuess.replaceAll("[a-zA-Z]","_"));
            System.out.println("Guess the letter:");

            // HangJavaSecondTry zzz =new HangJavaSecondTry();
            guessingMethod(gameGuess);

            System.out.println("Do you want to play again ? y/n");
            again = scanner.next().charAt(0);
            scanner.nextLine();
        } while (again == 'y');


       // System.out.println(compGuess.generateGuessLevel1().replaceAll(".", "_"));
        //System.out.println(gameGuess);
        //String gameGuess = "SYSTEM";  //here comes random name from database

    }

    // LETTER GUESSING PART!!!!!
    public static void guessingMethod(String gameGuess) {
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine().toUpperCase(Locale.ROOT);

        List<Character> playerGuess = new ArrayList<>(); //array to store guessed letters

        int decrease = 0;
        if (!fullGuess(gameGuess, guess)) {
            if (decrease != 5) {
                if (!getGuess(guess, gameGuess, playerGuess)) {
                    decrease++;
                }
                guessPrint(gameGuess, playerGuess);
                TargetPictureDecrease(decrease);
            }
            TargetPictureLose();
        }

        //IM TRYING TO RUN THIS
    }




    public static boolean fullGuess (String gameGuess, String guess){
            if (guess.equals(gameGuess)) {
                System.out.println("Congratulations!!! You win!!!");
                TargetPictureWin();
            }
            return true;
        }

    public static boolean getGuess (String guess, String gameGuess, List < Character > playerGuess){
            //System.out.println("Please Enter a letter:");
            //String guess = scanner.nextLine().toUpperCase(Locale.ROOT);
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

        public static void TargetPictureLose () {
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

