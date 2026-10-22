void main(){
    int n=4;
    
    for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
            int a=col;
            int b=('A'-1);
            int ans=a+b;
            char finalans = (char)ans;
            System.out.print(finalans+" ");
        }
        System.out.println();
    }
}