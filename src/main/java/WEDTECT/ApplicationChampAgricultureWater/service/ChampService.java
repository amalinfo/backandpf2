package WEDTECT.ApplicationChampAgricultureWater.service;

import WEDTECT.ApplicationChampAgricultureWater.dto.ChampDto;
import WEDTECT.ApplicationChampAgricultureWater.entites.Champ;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ChampService {
    ResponseEntity<?> save(ChampDto champDto);
    ResponseEntity<?> delete(Long id);
    ResponseEntity<?> findById(Long id);
    ResponseEntity<?>findAllChamp();
    ResponseEntity<?> modifier(Champ champ);
/*ChampDto save(ChampDto dto, Long id);
    void delete(Long id);
    ChampDto findById(Long id);
    List<ChampDto> findAllAdress();*/

}
