package WEDTECT.ApplicationChampAgricultureWater.dto;


import WEDTECT.ApplicationChampAgricultureWater.entites.Capteur;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data

public class CapteurDto {
    private  Long id;
    private String nom;
    @NotNull(message = "Le numéro ne peut pas être nul")
    @Min(value = 1, message = "Le numéro doit être supérieur ou égal à 1")
    private Long numero;
    private String modeleCapteur;
    private String poidCapteur;
    @NotNull(message = "La date d'ajout ne peut pas être nulle")
    @PastOrPresent(message = "La date d'ajout doit être dans le passé ou le présent")
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date dateUtilisation;
    @NotNull(message = "La date d'ajout ne peut pas être nulle")
    @PastOrPresent(message = "La date d'ajout doit être dans le passé ou le présent")
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date dateFabrication;
    @NotNull(message = "La date d'ajout ne peut pas être nulle")
    @PastOrPresent(message = "La date d'ajout doit être dans le passé ou le présent")
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date dateExpiration;
    /*private ChampDto champDto;*/
  /*  public static CapteurDto fromEntity(Capteur capteur){
        if (capteur==null) {
            return null;
        }

        return CapteurDto .builder()
                .id(capteur.getId())
                .nom(capteur.getNom())
                .numero(capteur.getNumero())
                .modeleCapteur(capteur.getModeleCapteur())
                .poidCapteur(capteur.getPoidCapteur())
                .dateUtilisation(capteur.getDateUtilisation())
                .dateFabrication(capteur.getDateFabrication())
                .dateExpiration(capteur.getDateExpiration())
                .build();
    }
    public static Capteur toEntity(CapteurDto capteurDto){
        if (capteurDto==null) {
            return null;
        }

        Capteur capteur = new Capteur();
        capteur.setId(capteurDto.getId());
        capteur.setNom(capteurDto.getNom());
        capteur.setNumero(capteurDto.getNumero());
        capteur.setModeleCapteur(capteurDto.getModeleCapteur());
        capteur.setPoidCapteur(capteurDto.getPoidCapteur());
        capteur.setDateUtilisation(capteurDto.getDateUtilisation());
        capteur.setDateFabrication(capteurDto.getDateFabrication());
        capteur.setDateExpiration(capteurDto.getDateExpiration());
        return capteur;
    }*/

}
