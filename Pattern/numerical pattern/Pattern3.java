void main(){
    
    int n=4;

    for(int row=1;row<=n;row++){
        for(int col=1;col<=n-row;col++){
            System.out.print("  ");
        }
        for(int col=1;col<=row;col++){
            System.out.print(col+" ");
        }
        int num = row-1;
        for(int col=2;col<=row;col++){
            System.out.print(num+" ");
            num--;
        }
        System.out.println();
    }
}