/*
* This class extends Vehicle.java with Truck fields and methods.
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2022-10-30
*/

/**
 * Truck Class.
 */
public class Truck extends Vehicle {

    /**
     * Declare licensePlate field.
     */
    private String licensePlate = "";

    /**
     * Bike Constructor - allows main to implement values for variables.
     *
     * @param maxSpeed - max speed achievable.
     * @param color - color of the bike.
     */
    public Truck(int maxSpeed, String color) {
        super(maxSpeed, color);
    }

    /**
     * Status() method - prints all current values.
     */
    public void status() {
        System.out.println("");
        System.out.println("    -> Speed: " + super.getSpeed());
        System.out.println("    -> Max Speed: " + super.getMaxSpeed());
        System.out.println("    -> Color: " + super.getColor());
        System.out.println("    -> License Plate: " + this.licensePlate);
        System.out.println("");
    }

    /**
     * SetLicensePlate() method - changes the licensePlate value.
     *
     * @param licensePlateInput - input to replace licensePlate.
     */
    public void setLicensePlate(String licensePlateInput) {
        this.licensePlate = licensePlateInput;
    }

    /**
     * GetLicensePlate() method - returns the current licensePlate value.
     *
     * @return licensePlate
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * AirPressure() method - uses airProvided to reduce speed.
     *
     * @param airProvided - input that reduces speed.
     */
    public void airPressure(int airProvided) {
        super.setSpeed(super.getSpeed() - airProvided / 2);
        if (super.getSpeed() < 0) {
            super.setSpeed(0);
        }
    }
}
