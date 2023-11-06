public class Main {

    /** 1. Write a method called numberOfVowels that returns the number of vowels in a string.
     Consider a, e, i, o, u as vowels. **/
    public static int numberOfVowels(String str) {
        int num = 0;
        for (int i = 0; i<str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                num++;
            }
        }
        return num;
    }

    /** 2. Write a method called notDivisibleBy235 that finds the number of natural numbers not exceeding N
     and not divisible by any of the numbers [2, 3, 5].
     Example
     Let's take the number 5 as an example:
     1 - doesn't divide integer by 2, 3, and 5
     2 - divides integer by 2
     3 - divides integer by 3
     4 - divides integer by 2
     5 - divides integer by 5
     Answer: 1 (only one number doesn't divide integer by any of 2, 3, 5) **/
    public static int notDivisibleBy235(int i) {
        int num = 0;
        for (int a = 0; a<i; a++) {
            if (a%2 != 0 && a%3 !=0 && a%5!= 0) {
                num++;
            }
        }
        return num;
    }


    /** 3. Write a method called camelCaseMe so that it converts dash/underscore delimited words into camel casing.
     * The first word within the output should be capitalized only if the original word was capitalized
     * (known as Upper Camel Case, also often referred to as Pascal case).
     * The next words should always be capitalized.
     Examples
     "the-stealth-warrior" gets converted to "theStealthWarrior"
     "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
     "The_Stealth-Warrior" gets converted to "TheStealthWarrior" **/
    public static String camelCaseMe (String str) {
        StringBuilder rs = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            if (i != str.length()-1 && str.charAt(i) == '_' || str.charAt(i) == '-') {
                String v = str.substring(i+1, i+2);
                rs.append(v.toUpperCase());
                i++;
            }
            else if (str.charAt(i) == '_' || str.charAt(i) == '-') {
                i++;
            }
            else {
                rs.append(str.charAt(i));
            }
        }
        return rs.toString();
    }


}