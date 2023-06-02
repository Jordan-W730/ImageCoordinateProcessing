public class FeatureWidthPixelsCalculator {

    public int getFeatureWidthInPixels(int topLeftXCoordinate, int bottomRightXCoordinate) {
        int featureWidth = bottomRightXCoordinate - topLeftXCoordinate;
        return featureWidth;
    }

}
