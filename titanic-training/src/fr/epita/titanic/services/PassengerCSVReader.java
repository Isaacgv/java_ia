package fr.epita.titanic.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import fr.epita.titanic.datamodel.Passenger;

public class PassengerCSVReader {


     public List<Passenger> read(File file){
          List<Passenger> passengers = new ArrayList<>();
          try {
               List<String> lines = Files.readAllLines(file.toPath());
               lines.remove(0);
               for (String line: lines){
                    line = line.replaceAll(",",";");
                    line =   line.replaceAll("; ", ", ");
                    String[] split = line.split(";");

                    Passenger instance = new Passenger();
                    instance.setPassengerId(split[0].isEmpty() ? null : Integer.parseInt(split[0]));
                    instance.setpClass(split[1].isEmpty() ? null : Integer.parseInt(split[1]));
                    instance.setName(split[2]);
                    instance.setSex(split[3]);
                    instance.setAge(split[4].isEmpty() ? null : Double.parseDouble(split[4]));
                    instance.setSibSp(split[5].isEmpty() ? null : Integer.parseInt(split[5]));
                    instance.setParch(split[6].isEmpty() ? null : Integer.parseInt(split[6]));
                    instance.setTicket(split[7]);
                    instance.setFare(split[8].isEmpty() ? null : Double.parseDouble(split[8]));
                    instance.setCabin(split[9]);
                    instance.setEmbarked(split[10]);
                    passengers.add(instance);
               }
          } catch (IOException e) {
               e.printStackTrace();
          }


          return passengers;
     }
}
