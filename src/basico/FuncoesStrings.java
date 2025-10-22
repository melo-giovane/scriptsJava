package basico;

public class FuncoesStrings {

    public static void main(String[] args){
        String s = "ABCe spdofk poeiwep JSFPDOJF lfsdkj";
        String s01 = s.toLowerCase();
        String s02 = s.toUpperCase();
        String s03 = s.trim();
        String s04 = s.substring(2);
        String s05 = s.substring(2, 9);
        String s06 = s.replace('a', 'x');
        String s07 = s.replace("ABC", "xy");


        System.out.println("Original: " + s);
        System.out.println("toLowerCase(): " + s01);
        System.out.println("toUpperCase(): " + s02);
        System.out.println("trim(): " + s03);
        System.out.println("substring(2): " + s04);
        System.out.println("substring(2, 9): " + s05);
        System.out.println("replace('a', 'x'): " + s06);
        System.out.println("replace(ABC, xy): " + s07);

    }




}
