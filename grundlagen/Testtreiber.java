public class Testtreiber {

    static boolean test_calculate_price() {
        boolean test_ok = true;

        double result1 = PriceCalculator.calculatePrice(100, 50, 20, 0, 0);
        System.out.println("test 1 result: " + result1);
        // Keine Extras/Kein Rabatt
        if (Math.abs(result1 - 170.0) > 0.001) {
            System.out.println("Test 1 fehlgeschlagen: " + result1);
            test_ok = false;
        }

        // 3 Extras (10% Rabatt)
        double result2 = PriceCalculator.calculatePrice(100, 0, 50, 3, 10);
        System.out.println("test 2 result: " + result2);
        if (Math.abs(result2 - 135) > 0.001) {
            System.out.println("Test 2 fehlgeschlagen: " + result2);
            test_ok = false;
        }

        // 5 Extras (15% Rabatt) 
        double result3 = PriceCalculator.calculatePrice(200, 0, 100, 5, 15);
        System.out.println("test 3 result: " + result3);
        if (Math.abs(result3 - 255.0) > 0.001) {
            System.out.println("Test 3 fehlgeschlagen: " + result3);
            test_ok = false;
        }

        return test_ok;
    }

    public static void main(String[] args) {
        boolean success = test_calculate_price();

        if (success) {
            System.out.println("Erfolgreich bestanden");
        } else {
            System.out.println("Tests sind fehlgeschlagen");
        }
    }
}
