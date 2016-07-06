/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectdependencyinjection;

/**
 *
 * @author faruqe
 */
public class Triangle{ // implements ApplicationContextAware, BeanNameAware {
    private Point pointA, pointB, pointC;
//    private ApplicationContext context = null;
//    
//    
//    private List<Point> points;
//
//    @Override
//    public void setApplicationContext(ApplicationContext ac) throws BeansException{
//        this.context = ac;
//    }
//    
//    public ApplicationContext getApplicationContext(){
//        return context;
//    }
//    
//    @Override
//    public void setBeanName(String string){
//        System.out.println(string);
//    }
//    public List<Point> getPoints() {
//        return points;
//    }
//
//    public void setPoints(List<Point> points) {
//        this.points = points;
//    }
    
    public void draw(){
//        for(Point point:points){
//            System.out.println("X:"+point.getX()+" Y:"+point.getY());
//            //System.out.println("Bean Context: "+getApplicationContext());
//        }
        System.out.println("Point A :");
        System.out.println("    X : " + getPointA().getX() + "   Y : " + getPointA().getY());
        
        System.out.println("Point B :");
        System.out.println("    X : " + getPointB().getX() + "   Y : " + getPointB().getY());
        
        System.out.println("Point C :");
        System.out.println("    X : " + getPointC().getX() + "   Y : " + getPointC().getY());
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
}
