package ConverterTmperature;

import java.util.Scanner;

public class Zapusk {
    public static void main(String[] args) {

        ClassCalculationg classCalculationg=new ClassCalculationg();
        System.out.println("Введите градусы");
        Scanner scanner= new Scanner(System.in);
        double temperature= scanner.nextDouble();
        classCalculationg.toCelsia(temperature);
        classCalculationg.toFahrenheit(temperature);
        classCalculationg.toKelvin(temperature);

    }


}

