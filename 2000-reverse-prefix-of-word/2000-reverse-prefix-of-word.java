class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder s =new StringBuilder();
        String res="";
        s.append(word.substring(0,word.indexOf(ch)+1));
        s.reverse();
        res=s+word.substring(word.indexOf(ch)+1,word.length());

        return res;
    }
}