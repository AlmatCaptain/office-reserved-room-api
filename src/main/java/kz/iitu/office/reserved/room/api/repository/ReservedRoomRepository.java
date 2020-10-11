package kz.iitu.office.reserved.room.api.repository;

import kz.iitu.office.reserved.room.api.model.ReservedRooms;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservedRoomRepository extends JpaRepository<ReservedRooms, Long> {
    List<ReservedRooms> findAllByRoomNumber(String num);
}
