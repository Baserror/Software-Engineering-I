package Airplane.light;

public class TailNavigationLight implements ITailNavigationLight {
    private String manufacturer;
    private String type;
    private String id;
    private boolean isOn;

    public TailNavigationLight(String manufacturer, String type, String id, boolean isOn) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isOn = isOn;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }
}