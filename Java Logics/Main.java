import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    String Name = sc.nextLine();
    System.out.println("Enter your Roll no.");
    int roll = sc.nextInt();
    System.out.println("Here are the detials of student \n Name-" + Name + "\n Roll no.-" + roll);
    sc.close();
}