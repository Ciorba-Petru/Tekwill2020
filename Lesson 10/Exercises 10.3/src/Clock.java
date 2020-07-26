import java.text.*;

public class Clock {
int hours = 12;
int minutes = 0;

public void next() {
    this.hours = hours;
    this.minutes = minutes;
    if (minutes == 59){
        hours+=1;
        minutes = 0;
    } else {
        minutes+=1;

    }

    System.out.printf("time is %02d:%02d",hours, minutes);
}
}
