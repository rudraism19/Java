import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("how many questions are you practicing??");
    int dailypractice = sc.nextInt();
    if(dailypractice >= 10){
        System.out.println("good consistency");
    }
    else{
        System.out.println("dhaang se pad lawde");
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
        System.out.println("enter your age ");
        int age = sc.nextInt();
        System.out.println("Male or Female");
        String gender = sc.nextLine();
        

        if(age >=18){
            System.out.println("you are an adult");
            if(gender == "male" ){
                System.out.println("you are an male adult");
            }
            else{
                System.out.println("you are a female adult");
            }
        }
        else {
            System.out.println("jaa kr bund mara");
        }

    sc.close();    

}