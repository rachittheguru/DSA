class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }     
        String doublled=s+s;

        return doublled.contains(goal);
    }
}