package ConverterTmperature;

public class CelsiaConverter implements Converter {

    @Override
    public double convert(double temperature) {
        return (temperature - 32) * 5 / 9;
    }
}
