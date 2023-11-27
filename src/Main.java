public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        double weightKilos = 98; // Вес в килограммах
        double heightMeters = 1.87; // Рост в метрах

        int index = bmiService.calculate(weightKilos, heightMeters);
        System.out.println(index);
    }
}
