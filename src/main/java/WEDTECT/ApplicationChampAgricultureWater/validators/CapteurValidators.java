package WEDTECT.ApplicationChampAgricultureWater.validators;

import WEDTECT.ApplicationChampAgricultureWater.dto.CapteurDto;
import WEDTECT.ApplicationChampAgricultureWater.dto.ChampDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CapteurValidators {
    public static List<String> validate(CapteurDto capteurDto) {
        List<String> errors = new ArrayList<>();
        if (capteurDto==null){
            errors.add("Veuillez remplir le nom de le capteur");
            errors.add("Veuillez remplir le modele de capteur ");
            errors.add("Veuillez remplir le poids de capteur ");
        }
        if (!StringUtils.hasLength(capteurDto.getNom())){
            errors.add("Veuillez remplir le nom de le capteur");
        }
        if (!StringUtils.hasLength(capteurDto.getModeleCapteur())){
            errors.add("Veuillez remplir le modele de capteur ");
        }
        if (!StringUtils.hasLength(capteurDto.getPoidCapteur())){
            errors.add("Veuillez remplir le poids de capteur ");
        }

        return errors;
    }
}