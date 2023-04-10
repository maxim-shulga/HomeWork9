package task2;

public class EthernetAdapter extends Device{
    protected int speed;
    protected String mac;
    EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac){
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EthernetAdapter eth = (EthernetAdapter) obj;
        if (speed != eth.speed
                || !mac.equals(eth.mac)
                || !manufacturer.equals(eth.manufacturer)
                || price != eth.price
                || !serialNumber.equals(eth.serialNumber)) return false;
        return true;
    }

    @Override
    public int hashCode() {

        int result = 17;

        result = 31 * result + (manufacturer == null ? 0 : manufacturer.hashCode());
        result = 31 * result + Float.floatToIntBits(price);
        result = 31 * result + (serialNumber == null ? 0 : serialNumber.hashCode());
        result = 31 * result + speed;
        result = 31 * result + (mac == null ? 0 : mac.hashCode());

        return result;
    }
}
