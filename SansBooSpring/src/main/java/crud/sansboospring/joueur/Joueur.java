package crud.sansboospring.joueur;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@Entity
public class Joueur {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
private Integer numero;
private String surnom;
private String poste;
private String phone;
private String Adresse;

}
