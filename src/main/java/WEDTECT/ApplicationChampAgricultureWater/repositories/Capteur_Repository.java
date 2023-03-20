package WEDTECT.ApplicationChampAgricultureWater.repositories;

import WEDTECT.ApplicationChampAgricultureWater.entites.Capteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Capteur_Repository extends JpaRepository<Capteur,Long> {
 /*Capteur findByName(String name);*/
}
