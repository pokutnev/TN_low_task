class PalindromCheck {

    public boolean isPalindrom(String word) {

        int i = 0;

        while (i < word.length() / 2) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
            i++;
        }

        return true;

    }

}