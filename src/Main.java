import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
TargetPictureWin();
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


    public static void JavaHang (){

        System.out.println("Guess the Java name:");
 //     System.out.println(Name from Database);  //find way how to print it with lines like _ _ _ _
        String rightAnswer = "right";
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();
        if ( guess != rightAnswer){
          //  System.out.println(TargetPictureSecond()); need to find way how to print if person added only one letter
        }else if (guess == rightAnswer){
         //   System.out.println(TargetPictureWin());
        }
    }


}
