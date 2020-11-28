package kz.iitu.office.reserved.room.api.service;

import kz.iitu.office.reserved.room.api.model.ReservedRooms;
import kz.iitu.office.reserved.room.api.repository.ReservedRoomRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumerService {

    private final ReservedRoomRepository reservedRepository;

    public KafkaConsumerService(ReservedRoomRepository reservedRepository) {
        this.reservedRepository = reservedRepository;
    }

    @KafkaListener(topics = "reserve-room-topic", groupId = "my-group")
    public void consume(ReservedRooms reservedRooms) throws IOException {
        if (!reservedRepository.findAll().contains(reservedRooms)) {
            reservedRepository.saveAndFlush(reservedRooms);
        }
    }
}
