void main() {
    System.out.println("Rudra");
    //method call
    print2table();
    printsum(4, 6);
    printmultiplication(5, 10);
    System.out.println("ho gya function call");
    int sum=showsum(5, 5);
    System.out.println(sum);
    int ans1=sum(2, 3);
    int ans2=sum(2, 3, 4);
    System.out.println(ans1 + ans2);
    int num =5;
    System.out.println("inside the main "+num);
    solve(num);
    System.out.println("inside the main "+num);
}

//method declaration
void print2table() {
    for (int i = 1; i <= 10; i++) {
        System.out.println(2 * i);
    }
}

void printsum(int x,int y){
    System.out.println("Sum "+(x+y));
}

void printmultiplication(int a,int b){
    System.out.println("multiplication "+a*b);
}

int showsum(int p, int q){
    int sum=p+q;
    return sum;
}

int sum(int m,int n){
    int ans=m+n;
    return ans;
}

int sum(int m, int n, int o){
    int ans=m+n+o;
    return ans;
}
//Call by value
void solve(int num){
    System.out.println("inside the solve "+num);
    num=num+10;
    System.out.println("inside the solve "+num);
}

void printfactors(){
    for(int i =1;i<=10;i++){
        System.out.println(2*i);
    }
}