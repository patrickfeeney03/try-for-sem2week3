package ie.atu.week3;

public class Dog extends Animal{
    private String vaccination;
    private String shedding;
    private String neutered;

    public Dog() {
    }

    public String getVaccination() {
        return vaccination;
    }

    public void setVaccination(String vaccination) {
        this.vaccination = vaccination;
    }

    public String getShedding() {
        return shedding;
    }

    public void setShedding(String shedding) {
        this.shedding = shedding;
    }

    public String getNeutered() {
        return neutered;
    }

    public void setNeutered(String neutered) {
        this.neutered = neutered;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHas vaccination: " + vaccination + "\nShedding: "
                + shedding + "\nNutered: " + neutered;
    }
}
