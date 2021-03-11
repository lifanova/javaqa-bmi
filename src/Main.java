public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int bmi = service.calculate();
        System.out.printf("Индекс массы тела: %d", bmi);
    }
}
