package kz.iitu.office.reserved.room.api.service;

import kz.iitu.office.reserved.room.api.model.ReservedRooms;
import kz.iitu.office.reserved.room.api.repository.ReservedRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservedService {

    private final ReservedRoomRepository reservedRepository;

    @Autowired
    public ReservedService(ReservedRoomRepository reservedRepository) {
        this.reservedRepository = reservedRepository;
    }

    public List<ReservedRooms> getAllResRoom() {
        return reservedRepository.findAll();
    }

    public void addReserve(ReservedRooms reserve) {
        if (!getAllResRoom().contains(reserve)) {
            reservedRepository.saveAndFlush(reserve);
        }
    }

    public void removeReserve(ReservedRooms reserve) {
        reservedRepository.delete(reserve);
    }

    public ReservedRooms getReservesById(Long id) {
        return reservedRepository.findById(id).get();
    }

    public void updateReserve(Long id, ReservedRooms reserve) {
        ReservedRooms room = reservedRepository.findById(id).orElse(null);

        if (room != null) {
            room.setId(id);
            room.setEmployeeId(reserve.getEmployeeId());
            room.setRoomNumber(reserve.getRoomNumber());
            room.setDate(reserve.getDate());
            room.setToDate(reserve.getToDate());

            reservedRepository.saveAndFlush(room);
        }
    }

    public List<ReservedRooms> getReservesByRoom(String num) {
        return reservedRepository.findAllByRoomNumber(num);
    }

}
