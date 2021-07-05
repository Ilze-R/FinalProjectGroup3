/*package RandomWordGenerator;

import java.sql.*;
import java.util.Scanner;

public class H2dbcHangJGenerateGuess {
    public static void main(String[] args) {

        System.out.println("Welcome to HangJava!");

        Scanner scanner = new Scanner(System.in);
        char again = 'n';

        do {
            System.out.println("Please choose level of difficulty: easy (1),medium (2) or  hard (3):  1/2/3");
            char choice = scanner.next().charAt(0);
            scanner.nextLine();

            if(choice == '1'){
                generateGuessLevel1();
                int sid = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Please enter student's name");
                String name = scanner.nextLine();

                addStudent(sid,name);
            } else if (option == 'd'){
                System.out.println("Please enter student's ID");
                int sid = scanner.nextInt();
                scanner.nextLine();

                deleteStudent(sid);
            } else if (option == 'v'){
                viewStudent();
            } else {
                System.out.println("Input was not valid.");
            }


            System.out.println("Do you want to play again something more? y/n");
            again = scanner.next().charAt(0);
            scanner.nextLine();
        } while (again == 'y');



        //generateGuessLevel1();




    }

    static void generateGuessLevel1() {

        // JDBC driver name and database URL
        final String JDBC_DRIVER = "org.h2.Driver";
        final String DB_URL = "jdbc:h2:~/test";

        //  Database credentials
         final String USER = "sa";
         final String PASS = "";


        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // STEP 2: Open a connection
            //System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // STEP 3: Execute a query
            //System.out.println("Connected database successfully...");
            stmt = conn.createStatement();

            // generates a random word according to level
            String sql2 = "SELECT * FROM HangmanLevel1 WHERE wordIDLevel1 >='1'order by RANDOM() LIMIT 1";

            //ResultSet rs = stmt.executeQuery(sql);
            ResultSet rs = stmt.executeQuery(sql2);

            // STEP 4: Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                String wordLevel1 = rs.getString("wordLevel1");
                //Display random word, remove after final testing
                System.out.print(wordLevel1);
                System.out.println();
                //Displays the random word in underscores
                System.out.println(wordLevel1.replaceAll(".", "_"));  // underscore with space,
            }

            // STEP 5: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception se) {
            // Handle errors for JDBC
            se.printStackTrace();
        }// Handle errors for Class.forName
        finally {
            // finally block used to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException ignored) {
            } // nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } // end finally try
        } // end try
        System.out.println();
        //System.out.println("Goodbye!");

    }

    static void generateGuessLevel2() {

        // JDBC driver name and database URL
        final String JDBC_DRIVER = "org.h2.Driver";
        final String DB_URL = "jdbc:h2:~/test";

        //  Database credentials
        final String USER = "sa";
        final String PASS = "";


        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // STEP 2: Open a connection
            //System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // STEP 3: Execute a query
            //System.out.println("Connected database successfully...");
            stmt = conn.createStatement();

            // generates a random word according to level
            String sql2 = "SELECT * FROM HangmanLevel2 WHERE wordIDLevel2 >='1'order by RANDOM() LIMIT 1";

            //ResultSet rs = stmt.executeQuery(sql);
            ResultSet rs = stmt.executeQuery(sql2);

            // STEP 4: Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                String wordLevel2 = rs.getString("wordLevel2");
                //Display random word, remove after final testing
                System.out.print(wordLevel2);
                System.out.println();
                //Displays the random word in underscores
                System.out.println(wordLevel2.replaceAll(".", "_"));  // underscore with space,
            }

            // STEP 5: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception se) {
            // Handle errors for JDBC
            se.printStackTrace();
        }// Handle errors for Class.forName
        finally {
            // finally block used to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException ignored) {
            } // nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } // end finally try
        } // end try
        System.out.println();
        //System.out.println("Goodbye!");

    }

    static void generateGuessLevel3() {

        // JDBC driver name and database URL
        final String JDBC_DRIVER = "org.h2.Driver";
        final String DB_URL = "jdbc:h2:~/test";

        //  Database credentials
        final String USER = "sa";
        final String PASS = "";


        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // STEP 2: Open a connection
            //System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // STEP 3: Execute a query
            //System.out.println("Connected database successfully...");
            stmt = conn.createStatement();

            // generates a random word according to level
            String sql2 = "SELECT * FROM HangmanLevel3 WHERE wordIDLevel3 >='1'order by RANDOM() LIMIT 1";

            //ResultSet rs = stmt.executeQuery(sql);
            ResultSet rs = stmt.executeQuery(sql2);

            // STEP 4: Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                String wordLevel3= rs.getString("wordLevel3");
                //Display random word, remove after final testing
                System.out.print(wordLevel3);
                System.out.println();
                //Displays the random word in underscores
                System.out.println(wordLevel3.replaceAll(".", "_"));  // underscore with space,
            }

            // STEP 5: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception se) {
            // Handle errors for JDBC
            se.printStackTrace();
        }// Handle errors for Class.forName
        finally {
            // finally block used to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException ignored) {
            } // nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } // end finally try
        } // end try
        System.out.println();
        //System.out.println("Goodbye!");

    }


}*/

