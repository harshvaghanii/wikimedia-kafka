package com.vaghani.springboot;

import com.vaghani.springboot.services.WikimediaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaDatabaseConsumer {

    private final WikimediaService wikimediaService;

    @KafkaListener(topics = "${topicname}",
            groupId = "${groupname}")
    public void consume(String eventMessage) {
        log.info("Starting to save the message in DB at {}", LocalDateTime.now());
        log.info("Event data size is: {}", eventMessage.length());
        wikimediaService.saveEventMessage(eventMessage);
        log.info("Finished saving the message in DB at {}", LocalDateTime.now());
    }
}
