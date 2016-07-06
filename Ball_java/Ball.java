package ItsFunny;

/**
 * Created by mbg on 05/07/16.
 */
import java.lang.Math;
import java.util.ArrayList;

public class Ball {
    private double x;
    private double y;
    private double speed;
    private double angleOfSpeed;
    public static double initTime;// initial time
    static ArrayList<Ball> ballList=new ArrayList<Ball>();  // implementing array list

    public Ball(double x, double y, double speed, double angleOfSpeed) {
        this.x=x;
        this.y=y;
        this.speed=speed;
        this.angleOfSpeed=angleOfSpeed;
        ballList.add(this);     // add to the array list
    }

    /*  *   updateTime method should be static
        *   because we need to show all the ball's new position at a time
         *   to make new balls it makes object again and again
         *   mean while new updateTime is also be generated each time
         *  it is not necessary. we need update time once
         *  so we need static key word
    */

    public static void updateTime(double time) {
        initTime=time;
        for (Ball b : ballList){
            b.getNewPosition(time);
        }
    }

    public static void showAll() {
        for(Ball p:ballList){
            System.out.println("newX = " + p.x+ " newY = "+p.y);
        }
    }

        /*
        *   Since updateTime method is static
        *   it can not be input non static attributes
        *   therefore getNewPosition method is introduced to do the relevant calculations
        * */
    public void getNewPosition(double time){
        x=(time*speed*Math.cos(Math.toRadians(angleOfSpeed))+x);
        y=(time*speed*Math.sin(Math.toRadians(angleOfSpeed))+y);
    }

    public boolean willCollide(Ball ball) {
            if (this.x==ball.x&&this.y==ball.y){
                return true;
            }
        return false;
    }

    public static void main(String args[]){
        Ball b31 = new Ball(0.0, 1.0, 5.0, 0.0);
        Ball.updateTime(10.0);
        Ball b32 = new Ball(75.0, 1.0, 2.5, 0.0);
        Ball.updateTime(10.0);
        if(b31.willCollide(b31))
            System.out.println("B31 and B32 will collide");
    }
}