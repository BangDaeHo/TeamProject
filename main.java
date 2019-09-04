
/**
 * Write a description of class main here.
 *
 * @author (2018315021 태영준 ,2018315051 yamamoto yoshika , 2018315021 방대호)
 * @version (2019.09.04)
 */
public class main
{
    public static void main(String[] args){    
        Shape[] list = new Shape[3];      
        list[0] = new Circle(10);    
        list[1] = new Oval(20, 30);    
        list[2] = new Rect(10, 40);
        for(int i = 0; i < list.length; i++)          
            list[i].redraw();    
        for(int i = 0; i < list.length; i++)         
            System.out.println("면적은 " + list[i].getArea()); 
    }
}
/**
 * Write a description of class MyApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyApp
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MyApp
     */
    public MyApp()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
