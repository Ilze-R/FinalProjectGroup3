
package HangJavaSecondTry;

import java.sql.*;

public class H2dbcHangJGenerateGuess {

    static String generateGuessLevel1() {

        // JDBC driver name and database URL
        final String JDBC_DRIVER = "org.h2.Driver";
        final String DB_URL = "jdbc:h2:~/test";

        //  Database credentials
         final String USER = "sa";
         final String PASS = "";

        Connection conn = null;
        Statement stmt = null;
        String wordLevel1 = null;

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
                // Retrieve randomly generated  word by column name
                wordLevel1 = rs.getString("wordLevel1");
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
        // returns the randomly generated word
        return wordLevel1;

    }

    static String generateGuessLevel2() {

        // JDBC driver name and database URL
        final String JDBC_DRIVER = "org.h2.Driver";
        final String DB_URL = "jdbc:h2:~/test";

        //  Database credentials
        final String USER = "sa";
        final String PASS = "";


        Connection conn = null;
        Statement stmt = null;
        String wordLevel2 = null;

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
                wordLevel2 = rs.getString("wordLevel2");
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
        // returns the randomly generated word
        return wordLevel2;

    }

    static String generateGuessLevel3() {

        // JDBC driver name and database URL
        final String JDBC_DRIVER = "org.h2.Driver";
        final String DB_URL = "jdbc:h2:~/test";

        //  Database credentials
        final String USER = "sa";
        final String PASS = "";


        Connection conn = null;
        Statement stmt = null;
        String wordLevel3 = null;

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
                // Retrieve word to be generated by column name
                wordLevel3= rs.getString("wordLevel3");
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
        // returns the randomly generated word
        return wordLevel3;

    }


}

