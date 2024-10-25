package ru.mirea.work6.task11;

public class CelToKel implements Convertable {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}