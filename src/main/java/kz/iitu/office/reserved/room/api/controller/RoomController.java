package kz.iitu.office.reserved.room.api.controller;

import kz.iitu.office.reserved.room.api.model.ReservedRooms;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/reserves")
public class RoomController {

    @GetMapping("/")
    public List<ReservedRooms> getAll() {
        LocalDate nowDate = LocalDate.now();
        return Arrays.asList(
                new ReservedRooms(1L, 2001L, "101", nowDate, nowDate.plusDays(10L)),
                new ReservedRooms(1L, 2002L, "103", nowDate, nowDate.plusDays(15L))
        );
    }

    //TODO: Add other routes (reserve, cancel reserve, change info)
}
