public class FeatureDataGenerator {

    // Misc. attributes
    private int xCoordinateOfCenter;
    private int yCoordinateOfCenter;
    private int[] featureCoordinates;
    private int topLeftXCoordinate;
    private int topLeftYCoordinate;
    private int bottomRightXCoordinate;
    private int bottomRightYCoordinate;

    // Various attributes to store calculator classes used to find necessary information
    private DistanceFromCenterCalculator distanceFromCenterCalculator;
    private QuadrantCalculator quadrantCalculator;
    private FeatureHeightPixelsCalculator featureHeightPixelsCalculator;
    private FeatureWidthPixelsCalculator featureWidthPixelsCalculator;

    // Attribute to store the class used to get input data from user
    private InputData inputData;


    // Constructor for the class
    public FeatureDataGenerator() {

        // Here we instantiate each attribute
        this.xCoordinateOfCenter = 0; // replace with actual center value
        this.yCoordinateOfCenter = 0; // replace with actual center value
        this.distanceFromCenterCalculator = new DistanceFromCenterCalculator();
        this.quadrantCalculator = new QuadrantCalculator();
        this.featureHeightPixelsCalculator = new FeatureHeightPixelsCalculator();
        this.featureWidthPixelsCalculator = new FeatureWidthPixelsCalculator();
        this.inputData = new InputData();

    }

    // Method that returns an integer Array of with a length of 6 contain the following in order:
    // distance from center, quadrant, x cord of top left, y cord of top left, height of target, width of target
    public int[] outputFeatureData() {

        // Gets necessary xy positions of top-left and bottom-right of desired feature
        this.featureCoordinates = this.inputData.getNewInputData();
        this.topLeftXCoordinate = this.featureCoordinates[0];
        this.topLeftYCoordinate = this.featureCoordinates[1];
        this.bottomRightXCoordinate = this.featureCoordinates[2];
        this.bottomRightYCoordinate = this.featureCoordinates[3];

        int[] featureData = new int[6];
        featureData[0] = distanceFromCenterCalculator.getDistanceFromCenter(this.xCoordinateOfCenter, this.yCoordinateOfCenter, this.topLeftXCoordinate, this.topLeftYCoordinate);
        featureData[1] = quadrantCalculator.getQuadrant(this.xCoordinateOfCenter, this.yCoordinateOfCenter, this.topLeftXCoordinate, this.topLeftYCoordinate);
        featureData[2] = topLeftXCoordinate;
        featureData[3] = topLeftYCoordinate;
        featureData[4] = featureHeightPixelsCalculator.getFeatureHeightInPixels(this.topLeftYCoordinate, this.bottomRightYCoordinate);
        featureData[5] = featureWidthPixelsCalculator.getFeatureWidthInPixels(this.topLeftXCoordinate, this.bottomRightXCoordinate);
        return featureData;
    }

}