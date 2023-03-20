package WEDTECT.ApplicationChampAgricultureWater.controller;

import WEDTECT.ApplicationChampAgricultureWater.dto.UtilisateurDto;
import WEDTECT.ApplicationChampAgricultureWater.serviceImpl.UtilisateurServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Utilisateurs")
public class UtilisateurController {
    @Autowired
    private UtilisateurServiceImpl utilisateurService;

    }

