package abstractfactory.component.computer;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
