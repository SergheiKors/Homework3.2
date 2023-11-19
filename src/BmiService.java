public class BmiService {
    public int calculate(double heightInMeters, int weightInKg) {
        double index = weightInKg / (heightInMeters * heightInMeters);
        return (int) index;
    }
}
