package Clock;

import java.awt.*;

public class mClock {
    public static void main(String[] args) {
        Time time=new Time();
        while(true){
            System.out.println(time.getTime());
            time.tick();
            Robot robot=null;
            try {
                robot=new Robot();
            } catch (AWTException e) {
                e.printStackTrace();
            }
            if (robot != null) {
                robot.delay(1000);
            }
        }
    }
}