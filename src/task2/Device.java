package task2;

public class Device {
    protected String manufacturer;
    protected float price;
    protected String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString(){
        return String.format("Device: manufacturer=%s, price=%f, serialNumber = %s", this.manufacturer, this.price, this.serialNumber);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Device dev = (Device) obj;
        if (!manufacturer.equals(dev.manufacturer)
                || price != dev.price
                || !serialNumber.equals(dev.serialNumber)) return false;
        return true;
    }
    @Override
    public int hashCode() {

        int result = 17;

        result = 31 * result + (manufacturer == null ? 0 : manufacturer.hashCode());
        result = 31 * result + Float.floatToIntBits(price);
        result = 31 * result + (serialNumber == null ? 0 : serialNumber.hashCode());

        return result;
    }
}
