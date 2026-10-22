void main(){
    int n=4;

    for(int row=1;row<=n;row++){
        for(int col=1;col<=n-row;col++){
            System.out.print("  ");
        }
        for(int col=1;col<=row;col++){
            int a=col;
            int b=('A'-1);
            int ans=a+b;
            char finalans=(char)ans;
            System.out.print(finalans+" ");
        }
        // char ans1=(char)(row+'A'-1);
        int a=row-1;
        int b=('A'-1);
        int ans=a+b;
        char ans1=(char)ans;
        for(int col=1;col<=row-1;col++){
            System.out.print(ans1+" ");
            ans1--;
        } 
        System.out.println();
    }
}