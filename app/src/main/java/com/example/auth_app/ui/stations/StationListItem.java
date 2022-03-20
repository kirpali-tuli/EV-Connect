package com.example.auth_app.ui.stations;

public class StationListItem {
    public int station_num;
    public String station_name;
    public double lati;
    public double longi;
    public double price;
    public String strt_time;
    public String stop_time;
    public double ratings;
    public String address;
    public double distance;
    public String status;

    public StationListItem(int station_num, String station_name, double lati, double longi, double price, String strt_time, String stop_time, double ratings, String address, double distance, String status) {
        this.station_num = station_num;
        this.station_name = station_name;
        this.lati = lati;
        this.longi = longi;
        this.price = price;
        this.strt_time = strt_time;
        this.stop_time = stop_time;
        this.ratings = ratings;
        this.address = address;
        this.distance = distance;
        this.status = status;
    }

    public int getStation_num() {
        return station_num;
    }

    public void setStation_num(int station_num) {
        this.station_num = station_num;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public double getLati() {
        return lati;
    }

    public void setLati(double lati) {
        this.lati = lati;
    }

    public double getLongi() {
        return longi;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStrt_time() {
        return strt_time;
    }

    public void setStrt_time(String strt_time) {
        this.strt_time = strt_time;
    }

    public String getStop_time() {
        return stop_time;
    }

    public void setStop_time(String stop_time) {
        this.stop_time = stop_time;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

