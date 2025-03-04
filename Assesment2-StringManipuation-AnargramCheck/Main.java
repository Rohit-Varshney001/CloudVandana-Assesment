class Main {
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] freq = new int[26]; // 26 letters in the alphabet

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[][] testCases = {
            {"listen", "silent"},
            {"hello", "olleh"},
            {"hello", "world"}
        };

        int testCaseNumber = 1;
        for (String[] pair : testCases) {
            System.out.println("Running Test Case " + testCaseNumber + ": " + pair[0] + " vs " + pair[1]);
            System.out.println("Result: " + areAnagrams(pair[0], pair[1]));
            System.out.println("------------------------");
            testCaseNumber++;
        }
    }
}