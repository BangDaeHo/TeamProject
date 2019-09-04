
/**
 * Write a description of interface Shape here.
 *
 * @author (2018315021 태영준 , 2018315051 yamamoto yoshika , 2018315021 방대호)
 * @version (2019.09.02)
 */
interface Shape{   
    final double PI = 3.14;        // 상수   
    void draw();        // 도형을 그리는 추상 메소드   
    double getArea();                // 도형의 면적을 리턴하는 추상 메소드   
    default public void redraw(){   // 디폴트 메소드      
        System.out.print("--- 다시 그립니다. ");      
        draw();   
    }
}