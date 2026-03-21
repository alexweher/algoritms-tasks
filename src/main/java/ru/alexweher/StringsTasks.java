package ru.alexweher;

public class StringsTasks {


    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }


    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }


    public static boolean contains(String s, String sub) {

        for (int i = 0; i <= s.length() - sub.length(); i++) {

            String part = s.substring(i, i + sub.length());

            if (part.equals(sub)) {
                return true;
            }
        }

        return false;
    }

    public static void printTokens(String s) {

        if (s == null || s.trim().isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] tokens = s.split("[ !,?._']+");

        System.out.println(tokens.length);

        for (String word : tokens) {
            System.out.println(word);
        }
    }
}
