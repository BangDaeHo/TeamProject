
/**
 * Write a description of class Oval here.
 *
 * @author (2018315033 태영준, 2018315051 yamamoto yoshika, 2018315021 방대호)
 * @version (2019.09.04)
 */
public class Oval implements Shape 
{
    int LongRadius, ShortRadius;    
    public Oval(int ShortRadius , int LongRadius){
        this.ShortRadius = ShortRadius;
        this.LongRadius = LongRadius;
    }

    public void draw(){
        System.out.println(ShortRadius + "x" + LongRadius + "에 내접하는 타원입니다.");
    }

    public double getArea(){
        return ShortRadius * LongRadius * PI;
    }
} 
