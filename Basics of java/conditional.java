import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("how many questions are you practicing??");
    int dailypractice = sc.nextInt();
    if(dailypractice >= 10){
        System.out.println("good consistency");
    }
    else{
        System.out.println("dhaang se pad");
    }
;

    // if-else Ladder
    System.out.println("enter your marks ");
    int marks = sc.nextInt();
    if(marks >= 90){
        System.out.println("excellent");
    }
    else if(marks >= 80){
        System.out.println("good");
    }
    else if(marks >= 50){
        System.out.println("average");
    }
    else{
        System.out.println("need improvement");
    }

    // Nested if-else 
    System.out.println("Enter your age");
    int age = sc.nextInt();
    if (age >= 18){
        System.out.println("M or F");
        String gender = sc.next();
        if(gender == "F"){
            System.out.println("you are a adult female");
        }
        else if(gender == "M"){
            System.out.println("you are an adult Male");
        }
    }
    else {
        System.out.println("yaha kuch nhi");
    }

    // ternary operators
    System.out.println("Enter no of question attempt ");
    int questions = sc.nextInt();
    String status = (questions >= 25) ? "Good" : "Dalle";
    System.out.println(status);
    
    // Switch Statement
    System.out.println("enter the value for day");
    int day = sc.nextInt();

    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thrusday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            break;
    }

    
    
    sc.close();    
}