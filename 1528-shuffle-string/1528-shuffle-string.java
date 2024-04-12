class Solution {
    public String restoreString(String s, int[] indices) {
       char[] arr=new char[s.length()];
        // String str="";
        for (int i = 0; i < s.length(); i++) {
            arr[indices[i]] = (s.charAt(i));
            
        }
        // for (int i = 0; i < s.length(); i++) {
        //     str = str + arr[i];
        // }
        return new String(arr);
    }
}