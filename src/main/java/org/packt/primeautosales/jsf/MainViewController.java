package org.packt.primeautosales.jsf;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.event.ResizeEvent;

@Named(value = "mainViewController")
@RequestScoped
public class MainViewController {

    private String selectionType;
    private List<Car> automobiles = new ArrayList();

    public MainViewController() {
    }

    public void layoutResizeEvent(ResizeEvent event) {
        System.out.println("The layout has been sized: " + event.getComponent());
    }

    public String navigateToCar() {
        setSelectionType("CAR");
        return "automobile";
    }

    public String navigateToPickup() {
        setSelectionType("TRUCK");
        return "automobile";
    }

    public String navigateToSuv() {
        setSelectionType("SUV");
        return "automobile";
    }

    public String getSelectionType() {
        return selectionType;
    }

    public void setSelectionType(String selectionType) {
        this.selectionType = selectionType;
    }

    /**
     * @return the automobiles
     */
    public List<Car> getAutomobiles() {
        Car car1 = new Car();
        car1.setMake("Juneau");
        car1.setModel("Turbo");
        Car car2 = new Car();
        car2.setMake("Juneau");
        car2.setModel("Rocket");
        Car car3 = new Car();
        car3.setMake("Acme");
        car3.setModel("Jet");
        automobiles = new ArrayList();
        automobiles.add(car1);
        automobiles.add(car2);
        automobiles.add(car3);
        return automobiles;
    }

    /**
     * @param automobiles the automobiles to set
     */
    public void setAutomobiles(List<Car> automobiles) {
        this.automobiles = automobiles;
    }
}
