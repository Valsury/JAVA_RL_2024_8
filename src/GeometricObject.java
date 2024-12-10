public class GeometricObject {
    private String color = "white"; // default color
    private boolean isFilled = false; // default isFilled


    public GeometricObject() {
    }


    public GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public boolean isFilled() {
        return isFilled;
    }


    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }
}