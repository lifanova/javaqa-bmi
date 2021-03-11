public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double mass = 55;
        double height = 1.7;

        double bmi = service.calculate(mass, height);

        if(bmi > 0) {
            System.out.printf("Индекс массы тела: %.2f кг/м^2", bmi);
        }
    }
}
