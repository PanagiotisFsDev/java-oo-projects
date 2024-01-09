package pointExercise;

public class pointXYZ {
    private int x;
    private int y;
    private int z;

    //Constructor
    public pointXYZ() {
    }

    //Overloaded Constructor
    public pointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Method to convert the instance to String
    public String convertToString(){
        return "(" + x + ", " + y + ", " + z + ")";
    }

    // Getters and Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
