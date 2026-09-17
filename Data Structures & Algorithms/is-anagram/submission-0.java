class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        return false;
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            char[] arr1 = t.toCharArray();
            Arrays.sort(arr1);
            String sorted1 = new String(arr1);
            if(sorted.equals(sorted1))
            return true;
 
            return false;

    }
}
