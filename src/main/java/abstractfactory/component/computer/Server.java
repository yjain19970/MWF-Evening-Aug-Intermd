package abstractfactory.component.computer;

public class Server implements Computer{
    String ram;
    String hdd;
    String cpu;

    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return null;
    }

    @Override
    public String getHDD() {
        return null;
    }

    @Override
    public String getCPU() {
        return null;
    }

    @Override
    public String toString() {
        return "PC{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
