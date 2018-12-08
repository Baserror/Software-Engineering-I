package Airport.Baggage_Sorting_Unit.Vehicles;

import Airport.Airport.GateID;
import Airport.Baggage_Sorting_Unit.Loading.LoadingStrategy;
import Airport.Baggage_Sorting_Unit.Receipts.ContainerLifterReceipt;
import Airport.Base.Container;

import java.util.ArrayList;

public class ContainerLifter implements Airport.Baggage_Sorting_Unit.Vehicles.IContainerLifter {

    private String uuid;

    private String id;

    private String type;

    private int speedInMPH;

    private boolean isFlashingLightOn;

    private boolean isDown;

    private Container container;

    private ArrayList<String> containerIDList;

    private Airport.Airport.Gate gate;

    private Airplane.IAirplane connectedAirplane;

    private int numberOfContainerLoaded;

    @Override
    public void setContainer(Container c) {
        container = c;
    }

    /**
     * TODO: Wo wird airplane implementiert
     */
    @Override
    public void connectToAirplane() {
        connectedAirplane = gate.getAirplane();
    }

    @Override
    public void up() {
        isDown = false;
    }

    /**
     * TODO: was ruft man im cargo system auf
     */
    @Override
    public void transferContainerToCargoSystem(LoadingStrategy strategy) {
        if (!isDown) {
            down();
        }
        up();
        connectedAirplane.getCargoSystem.load(strategy.getStowage(), container, );
        down();
    }

    /**
     * TODO
     */
    @Override
    public void down() {
        isDown = true;
    }

    /**
     * TODO: same as connect
     */
    @Override
    public void disconnectFromAirplane() {

    }

    /**
     * TODO groundoperations?
     */
    @Override
    public void notifyGroundOperations(ContainerLifterReceipt containerLifterReceipt) {

    }

    /**
     * TODO: interaktion mit pool klären
     */
    @Override
    public void returnToAirportResourcePool() {

    }

    /**
     * TODO wie sieht die routine aus
     */
    @Override
    public void executeRequest(GateID gateID) {

    }

    @Override
    public void setFlashingLightOn() {
        isFlashingLightOn = true;
    }

    @Override
    public void move(int speedInMPH) {
        this.speedInMPH = speedInMPH;
    }

    @Override
    public void stop() {
        speedInMPH = 0;
    }

    /**
     * wie komme ich von gateID auf gate
     */
    @Override
    public void setGate(GateID gate) {
        this.gate = gate;
    }

    @Override
    public void setFlashingLightOff() {
        isFlashingLightOn = false;
    }
}
