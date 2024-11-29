package ru.mirea.work6.task11;

public class CelToFahr implements Convertible {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature * 9 / 5 + 32;
    }
}