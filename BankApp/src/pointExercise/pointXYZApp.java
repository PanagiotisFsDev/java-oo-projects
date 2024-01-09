package pointExercise;

public class pointXYZApp {
    public static void main(String[] args) {
        pointXYZ point1 = new pointXYZ(0, 1, 3);
        pointXYZ point2 = new pointXYZ(1,4,7);
        pointXYZ point3 = new pointXYZ(4, 12,33);

        System.out.println("Point 1: " + point1.convertToString());
        System.out.println("Point 2: " + point2.convertToString());
        System.out.println("Point 3: " + point3.convertToString());
    }
}
