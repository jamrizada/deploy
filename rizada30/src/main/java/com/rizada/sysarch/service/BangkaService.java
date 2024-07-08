package com.rizada.sysarch.service;

import java.util.List;

import com.rizada.sysarch.model.Bangka;
import com.rizada.sysarch.repository.BangkaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BangkaService {

    @Autowired
    private BangkaRepository bangkaRepository;

    public List<Bangka> getAllBangka() {
        return bangkaRepository.findAll();
    }

    public List<Bangka> searchBangkasByBangkaName(String bangkaName) {
        return bangkaRepository.findByBangkaNameContainingIgnoreCase(bangkaName);
    }

    public Bangka saveBangka(Bangka bangka) {
        return bangkaRepository.save(bangka);
    }
}
