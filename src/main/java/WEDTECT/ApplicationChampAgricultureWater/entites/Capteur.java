package WEDTECT.ApplicationChampAgricultureWater.entites;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Capteur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @Column(name = "nom", nullable = false)
    private String nom;
    @Column(name = "numero", nullable = false)
    private Long numero;
    @Column(name = "modeleCapteur", nullable = false)
    private String modeleCapteur;
    @Column(name = "poidCapteur", nullable = false)
    private String poidCapteur;
    @Column(name = "dateUtilisation", nullable = false)
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date dateUtilisation;
    @Column(name = "dateFabrication", nullable = false)
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date dateFabrication;
    @Column(name = "dateExpiration", nullable = false)
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date dateExpiration;
    @ManyToOne
    private Champ champ;
}
