class Solution {
    public int calculate(String s) {
        Stack<Integer>ss =new Stack<>();
        int r=0;
        int n=0;
        int sign=1;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            }
            else if(c=='+'){
                r+=sign*n;
                n=0;
                sign=1;

            }
            else if(c=='-'){
                r+=sign*n;
                n=0;
                sign=-1;

            }
            else if(c=='('){
                ss.push(r);
                ss.push(sign);
                r=0;
                sign=1;


            }
            else if (c ==')'){
                r+=sign*n;
                n=0;
                r*=ss.pop();
                r+=ss.pop();
            }

        }
        if(n!=0){
            r+=sign*n;
        }
        return r;
    }
}