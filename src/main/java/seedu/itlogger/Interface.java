package seedu.itlogger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

public class Interface {
    private static String LOGO =  " ____        _\n"
                                + "|  _ \\ _   _| | _____ \n"
                                + "| | | | | | | |/ / _ \\\n"
                                + "| |_| | |_| |   <  __/\n"
                                + "|____/ \\__,_|_|\\_\\___|\n";

    private static String ASK_NAME = "What is your name?";
    private static String GREETING_MSG = "Hello ";
    private static String PROGRAM_OPENING = "What would you like to do?";
    private static String EMPTY_ERROR_MSG = "There are no items now";
    private static String KEYWORD_ISSUE = "Keyword does not exists";
    private static String UPDATECONTENT_MSG = "Please specify the updating content. "
            + "Enter \"update e/exit\" to exit updating status.";

    public static void printUpdateContent() {
        System.out.println(UPDATECONTENT_MSG);
    }

    public static void printLogo() {
        System.out.println(LOGO);
    }

    public static void askName() {
        System.out.println(ASK_NAME);
    }

    public static void greeter(String name) {
        System.out.println(GREETING_MSG + name);
    }

    public static void programOpening() {
        System.out.println(PROGRAM_OPENING);
    }

    public static void keyWordIssue() {
        System.out.println(KEYWORD_ISSUE);
    }

    public static void displayIssues(Vector toBeDisplayed) {
        Iterator iter = toBeDisplayed.iterator();
        while (iter.hasNext()) {
            Defect issue = (Defect) iter.next();
            System.out.println(issue + System.lineSeparator());
        }
    }

    public static void printFileToUser(String filePath) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(filePath));
        String nextLine = bf.readLine();
        while (nextLine != null) {
            System.out.println(nextLine);
            nextLine = bf.readLine();
        }
        bf.close();
    }

    public static void printErrorMessageToUser(Exception errorMessage) {
        System.out.println("ERROR: " + errorMessage);
    }

    public static void emptyErrorMsg() {
        System.out.println(EMPTY_ERROR_MSG);
    }
}
