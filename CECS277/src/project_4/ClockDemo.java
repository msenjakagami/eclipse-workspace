package project_4;

/**
* ClockDemo Tests the Clock and WorldClock Classes.
*/
public class ClockDemo
{
 public static void main(String[] args)
 {
//test Clock alone
 System.out.println("Testing Clock class");
 Clock clock = new Clock();
 System.out.println("Hours: " + clock.getHours());
 System.out.println("Minutes: " + clock.getMinutes());
 System.out.println("Time: " + clock.getTime());
 //test WorldClock
 System.out.println("");
 System.out.println("Testing WorldClock class");
 int offset = 3;
 System.out.println("Offset: " + offset);
 WorldClock wclock = new WorldClock(offset);
 System.out.println("Hours: " + wclock.getHours());
 System.out.println("Minutes: " + wclock.getMinutes());
 System.out.println("Time: " + wclock.getTime());
 //test AlarmClock
 int h = Integer.parseInt(clock.getHours());
 int m = Integer.parseInt(clock.getMinutes());

 clock.setAlarm(h, m - 1); 
 System.out.println("Time:" + clock.getTime());
 //test to see if the Alarm is cleared.
 System.out.println("Time: " + clock.getTime());
 }

}
