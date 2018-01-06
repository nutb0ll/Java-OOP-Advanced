package enums_and_anotations_lab.a_weekdays;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;


    @Override
    public String toString() {
        String lower = super.name().substring(1).toLowerCase();
        return super.name().charAt(0) + lower;
    }

}
