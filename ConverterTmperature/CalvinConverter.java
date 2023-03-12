package ConverterTmperature;

public class CalvinConverter implements Converter {

    @Override
    public double convert(double temperature) {

        return (temperature + 459.67) * 5 / 9;

    }

    public void test(){

    }
}
