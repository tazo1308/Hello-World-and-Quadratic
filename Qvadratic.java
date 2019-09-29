public class Qvadratic {
    public static void main(String[] args) {
        double a = 5, b = 25, c = 13;
        double x1, x2;
        double det = b * b - 4 * a * c;
        if (det > 0){
            x1 = (-b + Math.sqrt(det) / 2 * a);
            System.out.println("x1 = "+ x1);
            x2 = (-b - Math.sqrt(det) / 2 * a);
            System.out.println("x2 = "+ x2);
        }
    }
}
