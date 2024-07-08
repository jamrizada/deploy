package com.rizada.sysarch.controller;

import java.util.List;
import java.util.Optional;

import com.rizada.sysarch.model.Bangka;
import com.rizada.sysarch.service.BangkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bangka")
public class BangkaController {

    @Autowired
    private BangkaService bangkaService;

    @GetMapping
    public List<Bangka> getAllBangkas() {
        return bangkaService.getAllBangka();
    }

    @GetMapping("/search")
    public ResponseEntity<List<Bangka>> searchBangkas(@RequestParam String bangkaName) {
        List<Bangka> bangkas = bangkaService.searchBangkasByBangkaName(bangkaName);
        return ResponseEntity.ok(bangkas);
    }

    @PostMapping
    public ResponseEntity<Bangka> createBangka(@RequestBody Bangka bangka) {
        Bangka savedBangka = bangkaService.saveBangka(bangka);
        return ResponseEntity.ok(savedBangka);
    }
}
