import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter year");
    int year = sc.nextInt();
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("this year is leap year");
            } else {
                System.out.println("not a leap year");
            }
        } else {
            System.out.println("this is a leap year");
        }
    }
    else{
        System.out.println("not a leap year");
    }
    sc.close();
}