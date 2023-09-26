package Regex;

public class RegexReplaceSplit {
    public static void main(String[] args) {
        // zastępowanie tekstu
        String text = "The quick brown fox jumps over the lazy dog";
        String replaced = text.replaceAll("\\w+", "***");
        System.out.println("Original: " + text);
        System.out.println("Replaced: " + replaced);
        // splitowanie
        String text2 = "Rozdzielaj po dowolnym\nbiałym\tznaku";
        String[] split = text2.split("\\s");
        System.out.println("Original: " + text2);
        for (String s : split
             ) {
            System.out.println("--> " + s);
        }
    }
}
