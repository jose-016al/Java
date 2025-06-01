package com.josealmiron.logica;

import com.josealmiron.logica.Citizen;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2025-01-04T15:24:01")
@StaticMetamodel(Appointment.class)
public class Appointment_ { 

    public static volatile SingularAttribute<Appointment, LocalDateTime> assignedDate;
    public static volatile SingularAttribute<Appointment, Citizen> citizen;
    public static volatile SingularAttribute<Appointment, String> description;
    public static volatile SingularAttribute<Appointment, Long> id;
    public static volatile SingularAttribute<Appointment, String> status;

}