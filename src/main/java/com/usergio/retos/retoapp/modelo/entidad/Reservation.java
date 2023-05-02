package com.usergio.retos.retoapp.modelo.entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
//clase entidad reservacion
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name="reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    //correccion atributo date
    private Date startDate;
    private Date devolutionDate;
    private String status = "created";
    @ManyToOne
    @JoinColumn(name ="carId") // foreing key
    @JsonIgnoreProperties("reservations")
    private Car car;
    @ManyToOne
    @JoinColumn(name ="clientId") // foreing key
    @JsonIgnoreProperties({"reservations","messages"})
    private Client client;
    @OneToOne(cascade={CascadeType.PERSIST},mappedBy = "reservation")
    @JsonIgnoreProperties("reservations")
    private Score score;
    }
