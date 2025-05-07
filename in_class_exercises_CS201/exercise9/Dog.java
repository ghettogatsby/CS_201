package exercise9;

public class Dog extends Pet {
    //data fields 
    private String breed;
    private Boolean boosterShot;

    //methods
    public Dog()//default constructor 
    {
        super();
        breed= "None";
        boosterShot= false;
    }

    public Dog(String initialName, int initialAge, double initialWeight, String initialBreed, Boolean initialBoosterShot)
    {
        super(initialName, initialAge, initialWeight);
        breed= initialBreed;
        boosterShot= initialBoosterShot;
    }

    //mutators 
    public void setBreed (String newBreed)
    {
        this.breed= newBreed;
    }

    public void setBoosterShot(Boolean newBoosterShot)
    {
        this.boosterShot= newBoosterShot;
    }

    //accessor
    public String getBreed()
    {
        return breed;
    }

    public Boolean getBoosterShot()
    {
        return boosterShot; 
    }

    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Breed: "+breed);
        System.out.println("Received booster shot: " + boosterShot);

    }
}
