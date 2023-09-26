package Regex;

public class Regex003 {
    public static void main(String[] args) {
        RegexTester nameTester = new RegexTester("[A-Z][a-z]+");
        //wywala się przy kolejności von, van itd.
        RegexTester surnameTester = new RegexTester("(van )?(von )?(der )?(de )?([A-Z][a-z]*([\\s-']?))*[a-zA-Z] *");
        nameTester.validate("Andrzej");
        nameTester.validate("Beata");
        nameTester.validate("Pankracy");
        nameTester.validate("Boguslawa");
        nameTester.validate("SabrinA");

        System.out.println();
        surnameTester.validate("Kowalski");
        surnameTester.validate("von der Leyen");
        surnameTester.validate("von der Leyen Aasd");
        surnameTester.validate("von der Leyen-Kowalska");
        surnameTester.validate("Bachleda-Curus");
        surnameTester.validate("de Silva");
        surnameTester.validate("De Silva");
        surnameTester.validate("123123123");
        surnameTester.validate("12312-3123");
        surnameTester.validate("de 12312-3123");
        surnameTester.validate("!@$%@!$");
        surnameTester.validate("Kowalska-");
        surnameTester.validate("-Kowalska");
        surnameTester.validate("Ko--walska");
        surnameTester.validate("Ko-Walska-Szczepan");
        surnameTester.validate("Ko-alska-Szczepan");
        surnameTester.validate("owalska");
        surnameTester.validate("O'Hara");
        surnameTester.validate("O''Hara");
        surnameTester.validate("O Hara");
        surnameTester.validate("O Hara       ");
    }
}
