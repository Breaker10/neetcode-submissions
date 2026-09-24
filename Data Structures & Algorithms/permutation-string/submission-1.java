class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()< s1.length()) return false;

        int[] arr = new int[26];
        for (int ch : s1.toCharArray()) {
            arr[ch - 'a']++;
        }

        boolean check = true;

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            check = true;
            String s = s2.substring(i, i+s1.length());
            int[] chk = arr.clone();

            for (int c : s.toCharArray()) {
                chk[c - 'a']--;
            }

            for (int f : chk) {
                if (f != 0) check = false;
            }
            if(check) return true;
        }
        return check;
    }
}
