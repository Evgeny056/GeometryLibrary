package utils;

public class GeometryUtils {
    public static double convertToSquareMeters(double inSquareFeet) {
        return inSquareFeet * 0.092903;
    }

    public static int compareSquares(double area1, double area2) {
        return Double.compare(area1, area2);
    }
}
