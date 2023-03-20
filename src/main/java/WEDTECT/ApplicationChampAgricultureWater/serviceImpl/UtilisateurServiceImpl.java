package WEDTECT.ApplicationChampAgricultureWater.serviceImpl;

import WEDTECT.ApplicationChampAgricultureWater.dto.UtilisateurDto;
import WEDTECT.ApplicationChampAgricultureWater.entites.Utilisateur;
import WEDTECT.ApplicationChampAgricultureWater.repositories.User_Repository;
import WEDTECT.ApplicationChampAgricultureWater.service.UtilisateurService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor //injection de dependence
public class UtilisateurServiceImpl implements UtilisateurService {
private final User_Repository userRepository;
   /* @Override
    public UtilisateurDto save(UtilisateurDto dto) {
     Utilisateur utilisateur= UtilisateurDto.toEntity(dto);

        Utilisateur utilisateur1 = userRepository.save(utilisateur);
        return UtilisateurDto.fromEntity(utilisateur1);
    }

    @Override
    public void delete(Long id) {
   Utilisateur utilisateur = userRepository.findById(id).orElseThrow(()->new EntityNotFoundException(id+" not found"));
   userRepository.deleteById(id);


    }

    @Override
    public UtilisateurDto findById(Long id) {
        return userRepository.findById(id).map(UtilisateurDto ::fromEntity)
                //map:
                .orElseThrow(() -> new EntityNotFoundException("No Utilisateur was found with the provided ID"));
    }

    @Override
    public List<UtilisateurDto> findAllUtilisateur() {
        return userRepository.findAll()
                .stream() // parcour la liste
                .map(UtilisateurDto :: fromEntity) // convertion liste
                .collect(Collectors.toList());
    }*/


}
