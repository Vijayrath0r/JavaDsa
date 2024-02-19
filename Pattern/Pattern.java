public class Pattern {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= n / 2) {
                    if (j <= i) {
                        System.out.print("* ");
                    } else if (j >= n - i + 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if (j <= n - i + 1) {
                        System.out.print("* ");
                    } else if (j >= i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

            }
            System.out.println();
        }
    }
}
