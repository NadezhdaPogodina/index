public class BmiService {
    public double calculate(double height, double weight) {
        double tall = height;
        double heavy = weight;
        double index = (heavy) / (tall * tall);
        return index;
    }
}
