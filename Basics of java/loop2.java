void main(){
    /**
     *  initialization;
     * 
     *  while(condition){
     *     code
     *      update;
     *  }
     */
    
    int a = 5;
    while (a<=10) {
        System.out.println(a);
        a++;
    }

    int i =1;
    while (i<=10) {
        System.out.println("Rudra");
        i++;
        
    }

//!Nested While loop

    int x =1;
    while(x <=10){
        int y = 1;
        while (y<=5) {
            System.out.println("for every x " + x + " there are multiple y " + y);
            y++;
        }
        x++;
    }

//* */ Do-While loop\
    int p =1;
    do {
        System.out.println(p);
        p++;
    }while(p<=5);


    int t =1;
    do{
        System.out.println(t);
        t++;
    }while (t<=0);
}