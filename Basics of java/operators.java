void main(){
    // Arithmetic operators

    int value1 = 10;
    int value2 = 18;
    int add = value1 + value2;
    int sub = value1 - value2;
    int product = value1 * value2;
    int divide1 = value1 / value2;
    float divide2 = (float) value1 / value2;
    int reminder = value1 % value2;
    System.out.println(divide1);
    System.out.println(divide2);
    System.out.println(add);
    System.out.println(sub);
    System.out.println(reminder);
    System.out.println(product);


    // Relational operators
    // a == b equal operator
    // a != b not equal 
    // a>b greater than
    // a<b less than
    // a>=b greater than equal
    // a<=b less than equal 
    // output of all relational operators are true and false
    System.out.println(value1 == value2);
    System.out.println(value1 != value2);
    System.out.println(value1 > value2);
    System.out.println(value1 < value2);
    System.out.println(value1 >= value2);
    System.out.println(value1 <= value2);


    // Logical Operators
    // use for decision kaing block i.e true or false
    boolean completeDSA = true;
    boolean completeCore = false;

    System.out.println(completeDSA && completeCore);
    System.out.println(completeDSA || completeCore);
    System.out.println(!completeDSA);
    System.out.println(!completeCore);


    // Assignment Operators
    int a = 100;
    a +=5;//100+5
    System.out.println(a);
    a -=20; //105 - 20
    System.out.println(a);
    a *=5; //85*5
    System.out.println(a);
    a /=5; //425/5
    System.out.println(a);
    a %=5;//85%5
    System.out.println(a);


    //Unary Operators
    int m = 5;
    int n = -m;
    System.out.println(n);
    
    int total = 100;
    int prefix = ++total;
    int postfix = total++;

    System.out.println(prefix);
    System.out.println(postfix);
    System.out.println(total);    

}