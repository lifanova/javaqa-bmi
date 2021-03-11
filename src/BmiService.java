public class BmiService {
    public double calculate(double mass, double height){
        if(mass <= 0) {
            System.out.println("Ошибка: масса тела должна быть > 0 !!!");
            return 0;
        }

        if (height <= 0) {
            System.out.println("Ошибка: рост должен быть > 0 !!!");
            return 0;
        }

        double index = mass / (height * height);

        return index;
    }
}
