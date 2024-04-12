class Solution {
    public String restoreString(String s, int[] indices) {
       String[] arr=new String[s.length()];
        String str="";
        for (int i = 0; i < s.length(); i++) {
            arr[indices[i]] = String.valueOf(s.charAt(i));
            
        }
        for (int i = 0; i < s.length(); i++) {
            str = str + arr[i];
        }
        return str;
    }
}