package ar.edu.unlp.info.oo2.refactoring;

import java.time.LocalDate;

public class HotelStay extends Product {
    private double quote;
    private Hotel hotel;

    public HotelStay(double quote, TimePeriod timePeriod, Hotel hotel) {
        super(timePeriod);
        this.quote = quote;
        this.hotel = hotel;
    }

    public double priceFactor() {
        return this.quote / this.price();
    }

    public double price() {
        return this.getDuration() * this.hotel.discountedNightPrice();
    }

    public double getQuote() {
        return this.quote;
    }
}
