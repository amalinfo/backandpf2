package WEDTECT.ApplicationChampAgricultureWater.dto;

import WEDTECT.ApplicationChampAgricultureWater.entites.Champ;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

import static org.hibernate.boot.model.process.spi.MetadataBuildingProcess.build;


@Data

@AllArgsConstructor
@NoArgsConstructor
public class ChampDto {
    private Long id;
    private Long userId;
    private String nom;
    @NotNull(message = "Le numéro ne peut pas être nul")
    @Min(value = 1, message = "Le numéro doit être supérieur ou égal à 1")
    private  Long numero;
    private String adresse;
    @NotNull(message = "La date d'ajout ne peut pas être nulle")
    @PastOrPresent(message = "La date d'ajout doit être dans le passé ou le présent")
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date date_ajout;
  /*  private UtilisateurDto utilisateurDto;
    @JsonIgnore
    private List<CapteurDto> capteurDto;*/
  /*  public static ChampDto fromEntity(Champ champ){
        if (champ==null) {
            return null;
        }

        return ChampDto .builder()
                .id(champ.getId())
                .nom(champ.getNom())
                .numero(champ.getNumero())
                .adresse(champ.getAdresse())
                .date_ajout(champ.getDate_ajout())
                .build();
    }
    public static Champ toEntity(ChampDto champDto){
        if (champDto==null) {
            return null;
        }

        Champ champ = new Champ();
        champ.setId(champDto.getId());
        champ.setNom(champDto.getNom());
        champ.setNumero(champDto.getNumero());
        champ.setDate_ajout(champDto.getDate_ajout());
        champ.setDate_ajout(champDto.getDate_ajout());
             return champ;
    }*/
}
