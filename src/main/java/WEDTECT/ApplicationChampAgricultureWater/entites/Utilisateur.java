package WEDTECT.ApplicationChampAgricultureWater.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String email;
    //@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    @Column(name = "nom", nullable = false)
    private String nom;
    @Column(name = "prenom", nullable = false)
    private  String prenom;
    @Column(name = "age", nullable = false)
    private Integer age ;
    @Column(name = "numeroCin", nullable = false)
    private String  numCin;
    @Column(name = "telephone", nullable = false)
    private String numTel;
    @Column(name = "adress", nullable = false)
    private String adress;
    @OneToMany(mappedBy = "utilisateur")
    @JsonIgnore
    private List<Champ> champ;
}
