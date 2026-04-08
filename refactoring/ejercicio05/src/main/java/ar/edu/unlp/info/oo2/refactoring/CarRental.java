package ar.edu.unlp.info.oo2.refactoring;

public class CarRental extends Product {
    private double cost;
    private Company company;

    public CarRental(double cost, TimePeriod timePeriod, Company company) {
        super(timePeriod);
        this.cost = cost;
        this.company = company;
    }

    public double price() {
        return this.company.promotionalPrice();
    }

    public double getCost() {
        return this.cost;
    }
}
