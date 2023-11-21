package com.example.userprojectversionningmicro.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    private Long id;
    private String nom;
    private String prenom;
    private String login;
    private String mdp;
    @Column(unique = true)
    private String email;
}
