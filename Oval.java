
/**
 * Write a description of class Oval here.
 *
 * @author (2018315021 태영준 , 2018315051 yamamoto yoshika , 2018315021 방대호)
 * @version (2019.09.04)
 */
public class Oval implements Shape 
{
    int x, y;    
    public Oval(int x , int y){
        this.x = x;
        this.y = y;
    }

    public void draw(){
        System.out.println(x + "x" + y + "에 내접하는 타원입니다.");
    }

    public double getArea(){
        return x * y * PI;
    }
}
