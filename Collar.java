public class Collar {
    private String color;

    public Collar(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Collar(color=" + color + ")";
    }
}
