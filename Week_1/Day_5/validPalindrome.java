package Week_1.Day_5;

class validPalindrome {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            char first = Character.toLowerCase(s.charAt(start));
            char last = Character.toLowerCase(s.charAt(end));

            if (first != last) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
