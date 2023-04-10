package task2;

public class Monitor extends Device{
    protected int resolutionX, resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }
    @Override
    public String toString(){
        return String.format("Monitor: manufacturer=%s, price=%f, serialNumber=%s, X=%d, Y=%d", this.manufacturer, this.price, this.serialNumber, this.resolutionX, this.resolutionY);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Monitor mon = (Monitor) obj;
        if (resolutionX != mon.resolutionX
            || resolutionY != mon.resolutionY
            || !manufacturer.equals(mon.manufacturer)
            || price != mon.price
            || !serialNumber.equals(mon.serialNumber)) return false;
        return true;
    }
    @Override
    public int hashCode() {

        int result = 17;

        result = 31 * result + (manufacturer == null ? 0 : manufacturer.hashCode());
        result = 31 * result + Float.floatToIntBits(price);
        result = 31 * result + (serialNumber == null ? 0 : serialNumber.hashCode());
        result = 31 * result + resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }
}
