public class Fecha {

    private int day;
    private int month;
    private int year;

    public Fecha(int day, int month, int year) throws FechaException {

        if (month < 1 || month > 12) {
            throw new FechaException("El mes debe estar entre 1 y 12.");
        }

        if (day < 1 || day > 31) {
            throw new FechaException("El día no es válido para el mes y año proporcionados.");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
