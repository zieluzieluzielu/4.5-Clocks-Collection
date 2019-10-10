package com.kodilla.clockscollection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
import java.time.*;

@SpringBootApplication
public class ClocksCollectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClocksCollectionApplication.class, args);

        //nested class Clock
        class Clock {
            Integer clockNumber;
            Integer hour;
            Integer minute;
            Integer second;
            LocalTime time;
            LocalDateTime time2;

            //clock constructor:
            public Clock(int clockNumber, int hour, int minute, int second) {
                this.clockNumber=clockNumber;
                this.hour=hour;
                this.minute=minute;
                this.second=second;
                this.time = LocalTime.of(hour,minute,second);
            }

            public LocalTime addMinute() {
                return time.plusMinutes(1);
            }

            public String toString() {
                return "Clock #"+clockNumber+" time is: "+time;
            }
        }

        Clock clock1 = new Clock(1,22,30,45);
        Clock clock2 = new Clock(2,20,10,15);
        Clock clock3 = new Clock(3,13,49,20);
        Clock clock4 = new Clock(4,11,18,01);
        Clock clock5 = new Clock(5,23,59,59);

        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(clock3);
        System.out.println(clock4);
        System.out.println(clock5);

        LinkedList<Clock> clockList = new LinkedList<Clock>();
        clockList.add(clock1);
        clockList.add(clock2);
        clockList.add(clock3);
        clockList.add(clock4);
        clockList.add(clock5);

        System.out.println("\nChanging the time: adding +1 minute for each clock:\n");

        //Adding 1 minute to each of the clock:
        for(int n = 0; n < clockList.size(); n++) {
            System.out.println("Clock #"+(n+1)+": "+clockList.get(n).addMinute());

        }

    }
}
