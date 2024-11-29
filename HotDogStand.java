class HotDogStand {
    private int standId;
    private int hotDogsSold;
    private static int totalHotDogsSold = 0;
    
    // constructor
    public HotDogStand(int standId, int hotDogsSold) {
        this.standId = standId;
        this.hotDogsSold = hotDogsSold;
        totalHotDogsSold += hotDogsSold; // adds everything together
    }
    
    // method to add hot dogs
    public void justSold() {
        hotDogsSold ++; // increments hot dogs per stand
        totalHotDogsSold ++; // increments all hot dogs
    }
    
    //method that returns number of hot Dogs sold
    public int getHotDogsSold() {
        return hotDogsSold;
    }
    
    //static method returning total hot dogs sold by all stands
    public static int getTotalHotDogs() {
        return totalHotDogsSold;
    }
}

class Main {
    public static void main(String[] args) {
        // Create 3 hot dog stands with initial values
        HotDogStand stand1 = new HotDogStand(1, 2);
        HotDogStand stand2 = new HotDogStand(2, 1);
        HotDogStand stand3 = new HotDogStand(3, 0);
        
        // print results
        System.out.println("Stand 1 sold: " + stand1.getHotDogsSold());
        System.out.println("Stand 2 sold: " + stand2.getHotDogsSold());
        System.out.println("Stand 3 sold: " + stand3.getHotDogsSold());
        System.out.println("Total hot dogs sold: " + HotDogStand.getTotalHotDogs());
        
        //add newly sold hotdogs
        stand1.justSold();
        stand2.justSold();
        stand3.justSold();
        
        // print results (again)
        System.out.println("Stand 1 sold: " + stand1.getHotDogsSold());
        System.out.println("Stand 2 sold: " + stand2.getHotDogsSold());
        System.out.println("Stand 3 sold: " + stand3.getHotDogsSold());
        System.out.println("Total hot dogs sold: " + HotDogStand.getTotalHotDogs());
        
    }
}
