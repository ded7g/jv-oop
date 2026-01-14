package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];
        machines[0] = new Buldozer();
        machines[1] = new Truck();
        machines[2] = new Excavator();

        for (Machine m : machines) {
            m.doWork();
            m.stopWork();
        }
    }
}
