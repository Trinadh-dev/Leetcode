class Solution {
    public boolean halvesAreAlike(String s) {
        
        String s1="";
        String s2="";
        for (int i = 0; i < s.length()/2; i++) {
            s1=s1+s.charAt(i);
        }
        for (int i = (s.length()/2); i < s.length(); i++) {
            s2=s2+s.charAt(i);
        }
        int s3=vowelscount(s1);
        int s4=vowelscount(s2);
        if(s3==s4){
            return true;
        }
        return false;
    }
    static int vowelscount(String s){
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
                    s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
            {
                count++;
            }
        }
        return count;
    }    
}