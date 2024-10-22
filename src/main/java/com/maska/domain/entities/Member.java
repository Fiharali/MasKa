package com.maska.domain.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "membres")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_adhesion", nullable = false, unique = true)
    private String numeroAdhesion;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String prenom;

    @Column(name = "piece_identification", nullable = false)
    private String pieceIdentification;

    @Column( nullable = false)
    private String nationalite;

    @Column(name = "date_adhesion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateAdhesion;

    @Column(name = "date_expiration", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateExpiration;
}
