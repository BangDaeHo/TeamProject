
/**
 * 여기에 Rect 클래스 설명을 작성하십시오.
 * 
 * @author (2018315021 태영준 ,2018315051 yamamoto yoshika , 2018315021 방대호) 
 * @version (2019.09.04)
 */
public class Rect implements Shape
{
    int x;
    int y;
    public Rect(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void draw(){
        System.out.println(x + "x" + y + "크기의 사각형입니다.");
    }
    
    public double getArea(){
        return x * y;
    }
    
}
