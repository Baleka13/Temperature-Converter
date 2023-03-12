package ConverterTmperature;

import java.util.Scanner;

public class JvaClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Converter converter=null;

        switch (input){

            case "Kelvin":converter=new CalvinConverter();
                break;

            case "Celsia":converter=new CelsiaConverter();
                break;

            case "Farengeit":converter=new FarengeitClass();
                break;

        }

        if (converter==null){
            System.out.println("Такого Конвертера нет, до свидания");
            return;
        }
       while (true){
           int temperature = scanner.nextInt();
           double converted = converter.convert(temperature);
           System.out.println(converted);
       }
    }

}
