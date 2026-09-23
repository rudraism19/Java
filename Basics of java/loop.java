void main(){
    // for loop
    // for(int i = 1; i <=10; i++){
    //     System.out.println(i);
    // }

    for(int p = 1; p <=4; p++){
        System.out.println("Rudra Bhullar");
    }

    for(int m = 100; m <=105; m++){
        System.out.println("marks of top 5 students are " + m);
    }

    for(int n = 1; n <=10; n += 2){
        System.out.println(n);
    }

    //nested loop

    for(int i = 1; i<=4; i++) {
        for(int j = 1; j<=4; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    for (int a = 1; a <= 3; a++){
        for (int b = 1; b <= 3; b++){
            System.out.println("a = " + a + ", b = " + b);
        }
    }
}