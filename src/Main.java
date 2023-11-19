public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.87;
        int weightInKg = 98;
        int index = service.calculate(heightInMeters, weightInKg); // должно получиться 28
        System.out.println(index);
    }
}