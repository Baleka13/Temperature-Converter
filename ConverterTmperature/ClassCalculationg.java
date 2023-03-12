package ConverterTmperature;

public class ClassCalculationg {
    double temperature;


    public double toCelsia(double temperature) {
        this.temperature = temperature;
        temperature = (temperature - 32) * 5 / 9;
        System.out.println(temperature + " toCelsia");
        return temperature;
    }

    public static double toKelvin(double temperature) {
        // this.temperature=temperature;
        temperature = (temperature + 459.67) * 5 / 9;
        System.out.println(temperature + " toKelvin");
        return temperature;
    }

    public double toFahrenheit(double temperature) {
        this.temperature = temperature;
        temperature = temperature * 9 / 5 + 32;
        System.out.println(temperature + " toFahrenheit");
        return temperature;
    }


}

