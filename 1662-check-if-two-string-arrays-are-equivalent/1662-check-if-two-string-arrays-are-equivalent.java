class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1=wts(word1);
        String s2=wts(word2);
        if(s1.equals(s2)){
            return true;
        }


        return false;
    }

    static String wts(String[] word){
        String s="";
        for (int i = 0; i < word.length; i++) {
            s=s+word[i];
        }
        return s;
    }
}