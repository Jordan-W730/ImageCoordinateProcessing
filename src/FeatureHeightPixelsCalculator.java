public class FeatureHeightPixelsCalculator {

    public int getFeatureHeightInPixels(int topLeftYCoordinate, int bottomRightYCoordinate) {
        int featureHeight = bottomRightYCoordinate - topLeftYCoordinate;
        return featureHeight;
    }

}
