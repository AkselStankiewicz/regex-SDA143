package Regex;

/*
    Predefiniowane klasy:
    \\d - jakakolwiek cyfra -> [0-9]
    \\D - jakikolwiek znak, który nie jest cyfrą
    \\w - znak używany w słowach (word) -> [a-zA-Z0-9_]
    \\W - jakikolwiek znak, który nie jest używany w słowach (zaprzeczenie \\w)
    \\s - tzw białe znaki (spacja, tabulator itp.) -> [ \t\n\r\f\x0B] - znaki niewidoczne w trakcie wydruku
*/
public class RegexExample {
    public static void main(String[] args) {
        //czterocyfrowa liczba
        String yearPattern = "\\d{4}";
        RegexTester tester = new RegexTester(yearPattern);
        tester.validate("1984");
        tester.validate("15166");
        tester.validate("2002");
        tester.validate("2023");
        tester.validate("141");
        System.out.println();
        RegexTester t = new RegexTester("\\d\\w\\d");
        t.validate("1_3");
        t.validate("3P0");
        t.validate("a0a");
        t.validate("0 0");
    }
}
