    public class ApartmentClass {
    private int aptNum;
    private int numRooms;
    private int numBaths;
    private double rentCost;


    public ApartmentClass(int aptNum, int numRooms, int numBaths, double rentCost) {
        this.aptNum = aptNum;
        this.numRooms = numRooms;
        this.numBaths = numBaths;
        this.rentCost = rentCost;
    }

    public int getNumRooms() {
        return numRooms;
    }
    public int getAptNum(){
        return aptNum;
    }
    public int getNumBaths(){
        return numBaths;
    }
    public double getRentCost(){
        return rentCost;
    }




    @Override
    public String toString() {
        return "Apartment #"+ aptNum +
                ", numRooms=" + numRooms +
                ", numBaths=" + numBaths +
                ", rentCost=" + rentCost;
    }
}
