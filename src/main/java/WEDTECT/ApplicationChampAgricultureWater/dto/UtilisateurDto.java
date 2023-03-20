package WEDTECT.ApplicationChampAgricultureWater.dto;

import WEDTECT.ApplicationChampAgricultureWater.entites.Champ;
import WEDTECT.ApplicationChampAgricultureWater.entites.Utilisateur;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor

@NoArgsConstructor
public class UtilisateurDto {
    private Long id;
    @Email(message = "l'email doit etre dans la format adéquate")
    private String email;
    //@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private String nom;

    private  String prenom;
    @Min(value = 20,message = "l'age doit etre sup a 20 ans")
    @Max(value = 62,message = "l'age doit etre inf a 62 ans")
    private Integer age ;
    @NotBlank(message = "Le numéro de CIN ne peut pas être vide")
    @Pattern(regexp = "[0-9]{8}", message = "Le numéro de CIN doit être une chaîne de 8 chiffres")
    private String  numCin;
    @NotBlank(message = "Le numéro de CIN ne peut pas être vide")
    @Pattern(regexp = "[0-9]{8}", message = "Le numéro de CIN doit être une chaîne de 8 chiffres")
    private String numTel;
    private String adress;
   /* @JsonIgnore
    private List<ChampDto> champDto;*/

  /*  public static UtilisateurDto fromEntity(Utilisateur utilisateur){
        if (utilisateur==null) {
            return null;
        }

        return UtilisateurDto.builder()

                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .prenom(utilisateur.getPrenom())
                .email(utilisateur.getEmail())
                .password(utilisateur.getPassword())
                .adress(utilisateur.getAdress())
                .numCin(utilisateur.getNumCin())
                .numTel(utilisateur.getNumTel())
                .age(utilisateur.getAge())
                .build();
    }
    public static Utilisateur toEntity(UtilisateurDto utilisateurDto){
        if (utilisateurDto==null) {
            return null;
        }

        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(utilisateurDto.getId());
        utilisateur.setNom(utilisateurDto.getNom());
        utilisateur.setPrenom(utilisateurDto.getPrenom());
        utilisateur.setEmail(utilisateurDto.getEmail());
        utilisateur.setPassword(utilisateurDto.getPassword());
        utilisateur.setAdress(utilisateurDto.getAdress());
        utilisateur.setNumCin(utilisateurDto.getNumCin());
        utilisateur.setNumTel(utilisateurDto.getNumTel());
        utilisateur.setAge(utilisateurDto.getAge());
        return utilisateur;
    }*/
}
