package web.model;

public class Car {
    private String model;
    private String colour;
    private String series;

    public Car() {
    }

    public Car(String model, String colour, String series) {
        this.model = model;
        this.colour = colour;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "web.model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", regNumber=" + series +
                '}';
    }
}
