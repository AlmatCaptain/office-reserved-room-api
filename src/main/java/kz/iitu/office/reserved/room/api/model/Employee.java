package kz.iitu.office.reserved.room.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@ToString(exclude = "roles")
@Setter
@Getter
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    @JsonIgnore
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<ReservedRooms> reservedRooms;
}
