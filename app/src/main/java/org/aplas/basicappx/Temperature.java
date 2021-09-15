package org.aplas.basicappx;

public class Temperature {
    private double celcius;

    Temperature() {
        celcius = 0;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    public void setFahrenheit(double celcius) {
        this.celcius = (celcius - 32) / 9 * 5;
    }

    public void setKelvins(double celcius) {
        this.celcius = celcius - 273.15;
    }

    public double getCelcius() {
        return this.celcius;
    }

    public double getFahrenheit() {
        return this.celcius * 9 / 5 + 32;
    }

    public double getKelvins() {
        return this.celcius + 273.15;
    }

    public double convert(String oriUnit, String convUnit, double value) {
        switch (oriUnit) {
            case "°C":
                setCelcius(value);
            case "°F":
                setFahrenheit(value);
                break;
            case "K":
                setKelvins(value);
                break;
        }

        switch (convUnit) {
            case "°C":
                value = getCelcius();
                break;
            case "°F":
                value = getFahrenheit();
                break;
            case "K":
                value = getKelvins();
                break;
        }
        return value;
    }

}

