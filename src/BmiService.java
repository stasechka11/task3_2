public class BmiService {
    // Метод расчета индекса массы тела по формуле: Масса тела (кг) / Рост (м2)
    public int calculate(double weightKilos, double heightMeters) {
        int index = (int) (weightKilos / Math.pow(heightMeters, 2));

        return index;
    }
}
