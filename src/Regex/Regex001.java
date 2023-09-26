package Regex;

public class Regex001 {
    public static void main(String[] args) {
        RegexTester tester = new RegexTester("(\\+48)?5[0-9]{8}");
        tester.validate("+48515123456"); //true
        tester.validate("+48715123456"); //false
        tester.validate("515332123");
        tester.validate("515336293");
        tester.validate("415336293");
        tester.validate("615332123");
        tester.validate("715332123");
        tester.validate("712123");
        tester.validate("51123");
    }
}
