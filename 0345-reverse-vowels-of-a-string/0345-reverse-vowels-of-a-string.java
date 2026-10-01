class Solution {
    public String reverseVowels(String s) {
        char[] characterArray = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !isVowel(characterArray[left])) {
                left++;
            }

            while (left < right && !isVowel(characterArray[right])) {
                right--;
            }

            if (left < right) {
                char temp = characterArray[left];
                characterArray[left] = characterArray[right];
                characterArray[right] = temp;

                left++;
                right--;
            }
        }

        return new String(characterArray);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}