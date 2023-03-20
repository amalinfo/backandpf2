package WEDTECT.ApplicationChampAgricultureWater.serviceImpl;

import WEDTECT.ApplicationChampAgricultureWater.dto.ChampDto;
import WEDTECT.ApplicationChampAgricultureWater.entites.Champ;
import WEDTECT.ApplicationChampAgricultureWater.repositories.Champ_Repository;
import WEDTECT.ApplicationChampAgricultureWater.repositories.User_Repository;
import WEDTECT.ApplicationChampAgricultureWater.service.ChampService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor //injection de dependence
public class ChampServiceImpl implements ChampService {
    private  final Champ_Repository champRepository;
    private final User_Repository userRepository;

    @Override
    public ResponseEntity<?> save(ChampDto champDto) {
        Champ champ=new Champ(null,champDto.getNom(),champDto.getNumero(),champDto.getAdresse(),
                champDto.getDate_ajout(),userRepository.findById(champDto.getUserId()).get(),null );
        return ResponseEntity.ok(champRepository.save(champ));
    }


    @Override
    public ResponseEntity<?> delete(Long id) {
       champRepository.deleteById(id);
        return ResponseEntity.ok("delete");

    }

    @Override
    public ResponseEntity<?> findById(Long id) {
        Optional<Champ>champ=champRepository.findById(id);
        if (champ.isPresent()){
            return ResponseEntity.ok(champ.get());
        }
        return ResponseEntity.ok("capteur Not Found");
    }

    @Override
    public ResponseEntity<?> findAllChamp() {
        return null;
    }

    @Override
    public ResponseEntity<?> modifier(Champ champ) {
        return null;
    }


    /*@Override
    public ChampDto save(ChampDto dto, Long id) {
      Utilisateur utilisateurdto = userRepository.findById(id).get();

        Champ champ= ChampDto.toEntity(dto);
        champ.setUtilisateur(utilisateurdto);
      Champ champ1=champRepository.save(champ);
        return ChampDto.fromEntity(champ1);
    }

    @Override
    public void delete(Long id) {
        Optional<Champ> adress = champRepository.findById(id);

        if (adress.isPresent()) {
            champRepository.deleteById(id);

        }
    }

    @Override
    public ChampDto findById(Long id) {
        Champ champ = champRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No Champ was found with the provided ID"));
        return ChampDto.fromEntity(champ);
    }
    @Override
    public List<ChampDto> findAllAdress() {
        List<Champ>champs=champRepository.findAll();
        List<ChampDto> champDtos= champs.stream().map(champ->ChampDto.fromEntity(champ)).collect(Collectors.toList());
        return champDtos;
    }*/
}
