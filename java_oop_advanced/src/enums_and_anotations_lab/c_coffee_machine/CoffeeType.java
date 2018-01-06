package enums_and_anotations_lab.c_coffee_machine;

public enum CoffeeType {
    ESPRESSO, LATTE, IRISH;


    @Override
    public String toString() {
        return this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }
}