package WEDTECT.ApplicationChampAgricultureWater.entites;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Champ {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nom", nullable = false)
    private String nom;
    @Column(name = "numero", nullable = false)
    private  Long numero;
    @Column(name = "adresse", nullable = false)
    private String adresse;
    @Column(name = "date_ajout", nullable = false)
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date date_ajout;
    @ManyToOne
    private Utilisateur utilisateur;
    @JsonIgnore
    @OneToMany(mappedBy = "champ")
    private List<Capteur> capteur;
}
