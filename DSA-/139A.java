class Main{    public static void main(String[]args){
        int n = sc.nextInt();
        int [] days = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i =0;
        while(true){
            n-=days[i];
            if(n<=0){
                system.out.print(i+1);
                break;
            }
            i=(i+1)%7;
        }
        sc.close();
        
    }
}