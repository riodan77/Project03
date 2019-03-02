

public class Location implements Comparable<Location>{
    
    int houseNumber;
    String streetNumber;
    String streetName;
    // represent how many blocks to the truck
    // the priority for the queue
    int blocks; 

    public Location(int houseNumber, String streetName, String streetNumber, int blocks) {
        this.houseNumber = houseNumber;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.blocks = blocks;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getBlocks() {
        return blocks;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    @Override
    public String toString() {
        return houseNumber + " " + streetName + " " + streetNumber ;
    }

    
    @Override
    public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof Location)) {
      return false;
    }
    Location cc = (Location)o;
    return (cc.houseNumber == houseNumber && 
            cc.streetName.equals(streetName )&& 
            cc.streetNumber.equals(streetNumber));
  }
    
    
    @Override
    public int compareTo(Location o) {
        if(this.blocks < o.blocks)
            return -1;
        
        if(this.blocks > o.blocks)
            return 1;
            
        return 0;
    }
    
    
}
