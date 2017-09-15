public class SquareRoot {

    public static void main(String[] args) {
        double a = 0;
        double b = 10;
        double c = 0;
        double d = b * b - 4 * a * c;

        if (a == 0) {
            if (b == 0) {
                System.out.println("x1=");
                System.out.println("x2=");
            } else {

                System.out.println("x1=" + c / b);
                System.out.println("x2=" + c / b);
            }

        } else if (d < 0) {
            System.out.println("x1=");
            System.out.println("x2=");
        } else if (d == 0) {
            double res = -b / (2 * a);
            System.out.println("x1=" + res);
            System.out.println("x2=" + res);
        } else {
            double x1 = (-b - Math.sqrt(d)) / (2d * a);
            double x2 = (-b + Math.sqrt(d)) / (2d * a);

            System.out.println("x1=" + x2);
            System.out.println("x2=" + x1);
        }

    }
}

