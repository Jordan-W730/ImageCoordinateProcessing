public class Main {
    public static void main(String[] args) {
        FeatureDataGenerator generator = new FeatureDataGenerator();
        int[] data = generator.outputFeatureData();
        System.out.println("Distance From Center: " + data[0]);
        System.out.println("Quadrant: " + data[1]);
        System.out.println("Top Left X Coordinate: " + data[2]);
        System.out.println("Top Left Y Coordinate: " + data[3]);
        System.out.println("Feature Height: " + data[4]);
        System.out.println("Feature Width: " + data[5]);
    }
}
