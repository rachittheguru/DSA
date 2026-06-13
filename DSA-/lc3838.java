class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder s= new StringBuilder();
        
        for(String word :words){
            long sum=0;
            for(char ch : word.toCharArray()){
                sum+=weights[ch-'a'];
            }
            int value=(int)(sum%26);
            char mapped =(char)('z'-value);

            s.append(mapped);
            
        }
        return s.toString();
    }
}