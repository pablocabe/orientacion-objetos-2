package ar.edu.unlp.info.oo2.refactoring;

import java.time.LocalDate;

public class Product {
    
    private TimePeriod timePeriod;

    public Product(TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }

    public LocalDate startDate() {
        return this.timePeriod.start();
    }

    public LocalDate endDate() {
        return this.timePeriod.end();
    }

    public double getDuration() { 
        return this.timePeriod.duration();
    }

}