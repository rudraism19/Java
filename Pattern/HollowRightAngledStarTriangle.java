// Pattern Name: Hollow Right-Angled Star Triangle with a Filled Base

void main() {
    int n = 5;

    for (int row = 1; row <= n; row++) {
        if (row == 1 || row == 2 || row == n) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
        } else {
            System.out.print("* ");
            for (int col = 1; col <= row - 2; col++) {
                System.out.print("  ");
            }
            System.out.print("* ");
        }
        System.out.println();
    }
}
