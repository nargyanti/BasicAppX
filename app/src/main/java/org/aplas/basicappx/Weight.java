package org.aplas.basicappx;

public class Weight {
    private double gram;

    Weight() {
        gram = 0;
    }

    public void setGram(double gram) {
        this.gram = gram;
    }

    public void setOunce(double gram) {
        this.gram = gram * 28.3495231;
    }

    public void setPound(double gram) {
        this.gram = gram * 453.59237;
    }

    public double getGram() {
        return this.gram;
    }

    public double getOunce() {
        return this.gram / 28.3495231;
    }

    public double getPound() {
        return this.gram / 453.59237;
    }

    public double convert(String oriUnit, String convUnit, double value) {
        switch (oriUnit) {
            case "Grm":
                switch (convUnit) {
                    case "Grm":
                        value = getGram();
                        break;
                    case "Onc":
                        value = getOunce();
                        break;
                    case "Pnd":
                        value = getPound();
                        break;
                }
                break;
            case "Onc":
                switch (convUnit) {
                    case "Grm":
                        value = getGram();
                        break;
                    case "Onc":
                        value = getOunce();
                        break;
                    case "Pnd":
                        value = getPound();
                        break;
                }
                break;
            case "Pnd":
                switch (convUnit) {
                    case "Grm":
                        value = getGram();
                        break;
                    case "Onc":
                        value = getOunce();
                        break;
                    case "Pnd":
                        value = getPound();
                        break;
                }
                break;
        }
        return value;
    }
}
