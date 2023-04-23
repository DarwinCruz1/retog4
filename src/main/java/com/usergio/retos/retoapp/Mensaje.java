package com.usergio.retos.retoapp;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder // crear un objeto

public class Mensaje {
    private int httpCode;
    private String mensaje;
}


