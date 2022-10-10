public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.56;
        double weight = 46.5;
        double index = service.calculate(height, weight);
        System.out.println(index);

    }

}
