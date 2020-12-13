package kz.iitu.office.reserved.room.api.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class ReservedRoomDTO {
    private Long id;
    private Long employeeId;
    private String login;
    private String roomNumber;
    private LocalDate date;
    private LocalDate toDate;
}
