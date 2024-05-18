public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.70; // рост в метрах
        double weight = 62; // вес в киллограммах

        double bmi = service.calculate(weight, height);

        System.out.println("Индекс массы тела: " + bmi);
    }
}