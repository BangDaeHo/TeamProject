
/**
 * Write a description of class main here.
 *
 * @author (2018315033 태영준, 2018315051 yamamoto yoshika, 2018315021 방대호)
 * @version (2019.09.04)
 */
public class MyApp
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
