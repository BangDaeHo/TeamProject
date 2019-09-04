
/**
 * 여기에 Rect 클래스 설명을 작성하십시오.
 * 
 * @author (2018315033 태영준, 2018315051 yamamoto yoshika, 2018315021 방대호) 
 * @version (2019.09.04)
 */
public class Rect implements Shape
{
    int width;
    int height;
    public Rect(int width, int height){
        this.width = width;
        this.height = height;
    }
    
    public void draw(){
        System.out.println(width + "x" + height + "크기의 사각형입니다.");
    }
    
    public double getArea(){
        return width * height;
    }
    
}
