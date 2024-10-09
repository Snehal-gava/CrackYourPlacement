class Solution {
    public int minAddToMakeValid(String s) {
        int opening=0, minAddReq=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                opening++;
            }else {
                if(opening>0){
                    opening--;
                }else{
                    minAddReq++;
                }
            }
        }
        return minAddReq+opening;
    }
}