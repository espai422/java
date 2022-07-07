package basics.strings;

public class escapeSequences {
    public static void main(String[] args) {

        // To insert " in a String we need to escape it with \
        String doubleQuotes = "Hello This is a \"double quotes\" test";

        // Insert a back slash in a text such as a windows path
        String windowsPath = "C:\\windows\\Users\\espai422";

        // Insert a new line
        String newLine = " This\n is a multi\n line String";

        // Tabulation
        String tab = "This is a\t tab";

        System.out.println(doubleQuotes);
        System.out.println(windowsPath);
        System.out.println(newLine);
        System.out.println(tab);
    }
}
