package fr.epita.titanic.tests;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fr.epita.titanic.datamodel.Passenger;
import fr.epita.titanic.services.PassengerCSVReader;

public class TestPassengerExtraction {

    public static void main(String[] args) {
        PassengerCSVReader reader = new PassengerCSVReader();
        List<Passenger> passengers = reader.read(new File("/home/isaac/IdeaProjects/2021-t3-java-uml-ais/titanic-training/test.csv"));
        Double totalAge = 0.0;
        Double standarDesviationAge = 0.0;
        int totalMen = 0;
        int totalWomen = 0;
        int totalUnknowSex = 0;

        for(Passenger passenger : passengers){
            boolean ageExist = passenger.getAge() != null;
            if (ageExist) {
                totalAge += passenger.getAge();
            }

            boolean sexExist = passenger.getSex() != null;

            if (sexExist) {
                if ((boolean) passenger.getSex().equals("male")) {
                    totalMen += 1;
                }else if ((boolean) passenger.getSex().equals("female")){
                    totalWomen += 1;
                } else {
                    totalUnknowSex +=1;
                }
            }

        }

        int sizePassengers = passengers.size();
        double averageAge = totalAge / sizePassengers;

        for(Passenger passenger : passengers) {
            boolean ageExist = passenger.getAge() != null;
            if (ageExist) {
                standarDesviationAge += Math.pow(passenger.getAge()-averageAge,2);
            }
        }
        standarDesviationAge /= passengers.size();
        standarDesviationAge = Math.sqrt(standarDesviationAge);

        int totalSex = totalMen + totalWomen;
        double porcentageMen = totalMen*100.0 / sizePassengers;
        double porcentageWomen = totalWomen*100.0 / sizePassengers;

        System.out.println("Average Age: " + averageAge);
        System.out.format("Standar Desviation Age: %.2f %n", standarDesviationAge);
        System.out.println("Total Men: " + totalMen);
        System.out.format("Porcentage Men: %.2f",porcentageMen);
        System.out.println("%");
        System.out.println("Total Women: " + totalWomen);
        System.out.format("Porcentage Men: %.2f",porcentageWomen);
        System.out.println("%");
        System.out.println("Total unknow sex: " + totalUnknowSex);

    }
}
