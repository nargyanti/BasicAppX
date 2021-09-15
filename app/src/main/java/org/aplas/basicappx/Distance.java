package org.aplas.basicappx;

public class Distance {
    private double meter;

    Distance() {
        meter = 0;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public void setInch(double meter) {
        this.meter = meter / 39.3701;
    }

    public void setMile(double meter) {
        this.meter = meter / 0.000621371;
    }

    public void setFoot(double meter) {
        this.meter = meter / 3.28084;
    }

    public double getMeter() {
        return this.meter;
    }

    public double getInch() {
        return this.meter * 39.3701;
    }

    public double getMile() {
        return meter * 0.000621371;
    }

    public double getFoot() {
        return meter * 3.28084;
    }

    public double convert(String oriUnit, String convUnit, double value) {
        switch (oriUnit) {
            case "Mtr":
                switch (convUnit) {
                    case "Mtr":
                        value = getMeter();
                        break;
                    case "Inc":
                        value = getInch();
                        break;
                    case "Mil":
                        value = getMile();
                        break;
                    case "Ft":
                        value = getFoot();
                        break;
                }
                break;
            case "Inc":
                switch (convUnit) {
                    case "Mtr":
                        value = getMeter();
                        break;
                    case "Inc":
                        value = getInch();
                        break;
                    case "Mil":
                        value = getMile();
                        break;
                    case "Ft":
                        value = getFoot();
                        break;
                }
                break;
            case "Mil":
                switch (convUnit) {
                    case "Mtr":
                        value = getMeter();
                        break;
                    case "Inc":
                        value = getInch();
                        break;
                    case "Mil":
                        value = getMile();
                        break;
                    case "Ft":
                        value = getFoot();
                        break;
                }
                break;
            case "Ft":
                switch (convUnit) {
                    case "Mtr":
                        value = getMeter();
                        break;
                    case "Inc":
                        value = getInch();
                        break;
                    case "Mil":
                        value = getMile();
                        break;
                    case "Ft":
                        value = getFoot();
                        break;
                }
                break;
        }
        return value;
    }
}
