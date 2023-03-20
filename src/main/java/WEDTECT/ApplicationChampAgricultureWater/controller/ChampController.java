package WEDTECT.ApplicationChampAgricultureWater.controller;

import WEDTECT.ApplicationChampAgricultureWater.dto.ChampDto;
import WEDTECT.ApplicationChampAgricultureWater.serviceImpl.ChampServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Champs")
@CrossOrigin
public class ChampController {
    @Autowired
    private ChampServiceImpl champService;

    }
}
