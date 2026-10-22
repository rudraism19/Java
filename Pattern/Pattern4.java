void main(){

    int n = 6;

    for(int row=1;row<=n;row++){
        for(int col =1;col<=6;col++){
            if(row==1 || row ==n){
                System.out.print("* ");
                
            }
            else{
                if(col==1 || col ==n){
                    System.out.print("* ");
                }
                // if(col==n){
                //     System.out.print("* ");
                // }
                else{
                    System.out.print("  ");
                }
            }
        }
        System.out.println();
    }
}