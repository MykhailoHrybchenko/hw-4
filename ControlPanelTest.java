 class ControlPanel {

    private Altimeter altimeter = new Altimeter();
    private AirGauge airGauge = new AirGauge();

    public void control() {
        System.out.println(altimeter);
        System.out.println(airGauge);
    }

    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();
        controlPanel.control();
    }
}

 class Radar {

    public void scan() {
        System.out.println("Scan done!");
    }
}
class AirGauge {

    @Override
    public String toString() {
        return "Measure air pressure";
    }
}
class ControlPanelTest {
    public static void main(String[] args) {
        new ControlPanel().control();
    }
}