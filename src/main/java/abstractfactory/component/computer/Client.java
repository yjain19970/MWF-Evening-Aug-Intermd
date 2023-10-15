package abstractfactory.component.computer;

public class Client {
    public static void main (String[] args) {
        ComputerAbstractFactory factory = new PCFactory("16 RAM","1 TB","3.2 GHZ");
        Computer pc = ComputerFactory.getComputer(factory);

        ComputerAbstractFactory factory1 = new ServerFactory("12 RAM","2 TB","2.8 GHZ");
        Computer server = ComputerFactory.getComputer(factory1);

        System.out.println(server);
        System.out.println(pc);
    }
}
