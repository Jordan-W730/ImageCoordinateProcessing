import static java.lang.Math.sqrt;

public class DistanceFromCenterCalculator {

    // finds difference from center pixel to top-left of feature
    public int getDistanceFromCenter(int xCoordinateOfCenter, int yCoordinateOfCenter, int topLeftXCoordinate, int topLeftYCoordinate) {
        int distanceFromCenter = 0;

        // find how far the given coordinate is from center
        int xDifference = xCoordinateOfCenter - topLeftXCoordinate;
        int yDifference = yCoordinateOfCenter - topLeftYCoordinate;

        // a^2 + b^2 = c^2
        // a == distance from center to x value top-left of feature
        // b == distance from center to y value of top-left of feature
        // we add a * a + b * b then get the square root and type cast it to an integer
        distanceFromCenter = (int) sqrt((xDifference * xDifference) + (yDifference * yDifference));
        return distanceFromCenter;
    }

}
