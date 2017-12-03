package com.mercankrcby;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FlightData {

    public int status;
    public int BCPassengerCount;
    public int ECPassengerCount;
    public int currentWorkerCount;
    //TO DO:String olarak tuttum ama Time 'a donustur
    public String arrivalTime;
    public String departureTime;

    public FlightData()
    {}
    public FlightData(int BCPassengerCount, int ECPassengerCount, int currentWorkerCount, String arrivalTime, String departureTime) {
        this.BCPassengerCount = BCPassengerCount;
        this.ECPassengerCount = ECPassengerCount;
        this.currentWorkerCount = currentWorkerCount;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public int getBCPassengerCount() {
        return BCPassengerCount;
    }

    public void setBCPassengerCount(int BCPassengerCount) {
        this.BCPassengerCount = BCPassengerCount;
    }

    public int getECPassengerCount() {
        return ECPassengerCount;
    }

    public void setECPassengerCount(int ECPassengerCount) {
        this.ECPassengerCount = ECPassengerCount;
    }

    public int getCurrentWorkerCount() {
        return currentWorkerCount;
    }

    public void setCurrentWorkerCount(int currentWorkerCount) {
        this.currentWorkerCount = currentWorkerCount;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "FlightData{" +
                "BCPassengerCount=" + BCPassengerCount +
                ", ECPassengerCount=" + ECPassengerCount +
                ", currentWorkerCount=" + currentWorkerCount +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }
    public Date stringToTime(String timeValue)
    {
        //String myTime = "10:30:54";
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        Date date = null;
        try {
            date = sdf.parse(timeValue);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String formattedTime = sdf.format(date);
        //System.out.println(formattedTime);
        return date;
    }

    public class Status{
        int status;

        public Status(int status) {
            this.status = status;
        }
    }
}
