package baitap2;

import java.util.Date;

public class StopWatch {
    private long startTime, endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public  StopWatch(){

    }
    public long start(){
        this.startTime =System.currentTimeMillis();
        return this.startTime ;
    }

    public long stop(){
        this.endTime = System.currentTimeMillis();
        return  this.endTime;
    }

    public long getElapsedTime(){
            return endTime - startTime;
    }

    public long getElapsedTimeSecs(){
            return (endTime - startTime)/1000;
    }

}
