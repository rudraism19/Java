// Pattern Name: Hollow Square Star Pattern

void main() {
    int n = 6;

    for (int row = 1; row <= n; row++) {
        for (int col = 1; col <= n; col++) {
            if (row == 1 || row == n || col == 1 || col == n) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
