package kz.iitu.office.reserved.room.api.controller;

import kz.iitu.office.reserved.room.api.model.ReservedRooms;
import kz.iitu.office.reserved.room.api.service.ReservedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/reserves")
public class ReserveController {

    private final ReservedService reservedService;

    @Autowired
    public ReserveController(ReservedService reservedService) {
        this.reservedService = reservedService;
    }

    @GetMapping
    public List<ReservedRooms> getAllResRoom() {
        return reservedService.getAllResRoom();
    }

    @PostMapping("/add")
    public void addReserve(@RequestBody ReservedRooms reserve) {
        System.out.println(reserve.getDate());
        reservedService.addReserve(reserve);
    }

    @DeleteMapping("/delete/{id}")
    public void removeReserve(@PathVariable Long id) {
        reservedService.removeReserve(reservedService.getReservesById(id));
    }

    @PutMapping("/update/{id}")
    public void updateMember(@PathVariable Long id, @RequestBody ReservedRooms reserve) {
        reserve.setId(id);
        reservedService.updateReserve(id, reserve);
    }

    @GetMapping("/{num}")
    public List<ReservedRooms> getReserveById(@PathVariable String num) {
        System.out.println("ReserveController.getReserveById" + reservedService.getReservesByRoom(num));
        return reservedService.getReservesByRoom(num);
    }

}
