package sofftekback.controllers;

import sofftekback.models.User;
import sofftekback.models.Incident;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class UserController {

    public void createIncident(){
        LocalDateTime craeted = LocalDateTime.now();
        Incident incident = new Incident(1, 1, "", "", "", craeted ,"");
        System.out.println(incident.toString());
    }
}
