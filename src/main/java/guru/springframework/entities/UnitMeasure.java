package guru.springframework.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class UnitMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

}
