package exercise9;

public class exercise9 
{
    public static void main(String[] args)
    {
      Pet p1= new Pet();
      p1.writeOutput();
      Pet p2= new Pet("Teddy",2,12.5);
      p2.writeOutput();
      Dog d1= new Dog();
      d1.writeOutput();
      Dog d2= new Dog("Koda", 2, 56.7, "Golden Retriever", true);
      d2.writeOutput();
      Pet p3= new Dog();
      p3.writeOutput();

    }
}
