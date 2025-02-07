package com.vaghani.springboot.services.impl;

import com.vaghani.springboot.entities.Wikimedia;
import com.vaghani.springboot.repositories.WikimediaRepository;
import com.vaghani.springboot.services.WikimediaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WikimediaServiceImpl implements WikimediaService {

    private final WikimediaRepository repository;

    @Override
    public Wikimedia saveEventMessage(String message) {
        Wikimedia toSave = Wikimedia.builder()
                .message(message)
                .build();
        return repository.save(toSave);
    }

}
