package exercise7;

public class Fraction {
    //data fields - member variables
    private int top;
    private int bottom;

    //methods- member functions

    public Fraction (int top, int bottom)
    {
       this.top = top;
       this.bottom= bottom;

    }

    public void set_top(int top)
    {
       this.top = top;
    }

    public void set_bottom(int bottom)
    {
        this.bottom= bottom;
    }

    public void output()
    {
       System.out.println(top+ "/" +bottom);
    }

    public double calculate()
    {
        return (double)top/bottom * 100;

    }
}
