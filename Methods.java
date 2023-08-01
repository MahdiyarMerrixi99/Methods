public class Methods {
    public static void main(String[] args) {
        // charAt
        String myStr1 = "Hello";
        char result = myStr1.charAt(4);
        System.out.println(result);
        // concat
        String firstName = "Mahdiyar ";
        String lastName = "Merrixi";
        System.out.println(firstName.concat(lastName));
        // compareToIgnoreCase
        String myStr2 = "HELLO7";
        String myStr3 = "hello";
        System.out.println(myStr2.compareToIgnoreCase(myStr3));
        // contains
        String myStr4 = "Hello";
        System.out.println(myStr4.contains("Hel"));
        System.out.println(myStr4.contains("e"));
        System.out.println(myStr4.contains("Hi"));
        // contentEquals
        String myStr5 = "Hello";
        System.out.println(myStr5.contentEquals("Hello"));
        System.out.println(myStr5.contentEquals("e"));
        System.out.println(myStr5.contentEquals("Hi"));
        // trim
        String myStr6 = " Hello World! ";
        System.out.println(myStr6);
        System.out.println(myStr6.trim());
        // toUpperCas.toLowerCase
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        // replace
        String myStr7 = "Hello";
        System.out.println(myStr7.replace('l', 'p'));
        // equals
        String str1 = "Hello";
        String Str2 = "Hello";
        String Str3 = "Another String";
        System.out.println(str1.equals(Str2));
        System.out.println(str1.equals(Str3));
    }
}