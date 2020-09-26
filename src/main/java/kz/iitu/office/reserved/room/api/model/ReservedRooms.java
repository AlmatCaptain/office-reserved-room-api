package kz.iitu.office.reserved.room.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
public class ReservedRooms {
    private Long id;
    private Long employeeId;
    private String roomNumber;
    private LocalDate date;
    private LocalDate toDate;
}
