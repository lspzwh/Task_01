package Clock;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time {
    int hour;
    int minute;
    int second;
    public Time(){
        Calendar now =new GregorianCalendar();
        this.second=now.get(Calendar.SECOND);
        this.minute=now.get(Calendar.MINUTE);
        this.hour=now.get(Calendar.HOUR_OF_DAY);
    }
    public void tick(){
        if(second<59){
            second++;
        }else if(minute<59){
            minute++;
            second=0;
        }else if(hour<23){
            hour++;
            minute=0;
        }else{
            hour=0;
            minute=0;
            second=0;
        }
    }
    public String getTime(){
        String time=String.format("%02d:%02d:%02d",hour,minute,second);
        return time;
    }
}
