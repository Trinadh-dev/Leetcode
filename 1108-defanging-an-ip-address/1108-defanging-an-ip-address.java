class Solution {
    public String defangIPaddr(String address) {
        String res ="";
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i)=='.'){
                res =res + "[";
                res = res + ".";
                res =res + "]";
            }
            else {
                char a=address.charAt(i);
                res = res + a;

            }
        }
        return res;
    }
}