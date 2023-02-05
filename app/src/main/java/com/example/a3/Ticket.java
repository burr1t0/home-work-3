package com.example.a3;

public class Ticket {

    private  String departurePoint;
    private String arrivalPoint;
    private String departureData;
    private String arrivalData;
    private String  travelTime;
    private int distance;
    private float ticketPrice;
    private float adults;
    private float child;
    private float pensioners;

    public Ticket(){
    }

    public Ticket(String departurePoint, String arrivalPoint, String departureData, String travelTime, float ticketPrice, float adults, float child, float pensioners) {
        this.departurePoint = departurePoint;
        this.arrivalPoint = arrivalPoint;
        this.departureData = departureData;
        this.travelTime = travelTime;
        this.ticketPrice = ticketPrice;
        this.adults = adults;
        this.child = child;
        this.pensioners = pensioners;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public String getDepartureData() {
        return departureData;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public float getAdults() {
        return adults;
    }

    public float getChild() {
        return child;
    }

    public float getPensioners() {
        return pensioners;
    }


    @Override
    public String toString() {
        return "билет:  " + "место отправления- " + departurePoint +
                ", место прибытия- " + arrivalPoint +
                ", дата отправления- " + departureData +
                ", время пути- " + travelTime +
                ", стоимость билета- " + ticketPrice * (adults +
                child * 0.5 +  pensioners * 0.7) + " монет";
    }
}
