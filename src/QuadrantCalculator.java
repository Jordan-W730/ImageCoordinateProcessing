public class QuadrantCalculator {

    public int getQuadrant(int xCoordinateOfCenter, int yCoordinateOfCenter, int topLeftXCoordinate, int topLeftYCoordinate) {
        int quadrant = 0;

        // Quadrant layout where c == center:

        //  2  |  1
        // --- c ---
        //  3  |  4

        // check if its to the left or right of center
        if(topLeftXCoordinate > xCoordinateOfCenter) {
            // check if its above or below the center
            if(topLeftYCoordinate < yCoordinateOfCenter) {
                quadrant = 1;
            } else {
                quadrant = 4;
            }
        } else {
            // check if its above or below the center
            if(topLeftYCoordinate < yCoordinateOfCenter) {
                quadrant = 2;
            } else {
                quadrant = 3;
            }
        }

        return quadrant;

    }

}
