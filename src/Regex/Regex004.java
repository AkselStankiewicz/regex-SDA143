package Regex;

public class Regex004 {
    public static void main(String[] args) {
        RegexTester tester = new RegexTester(".*\\d{4}-\\d{2}-\\d{2}.*");
        tester.validate("Dzisiaj jest 2023-09-26.");
    }
}
