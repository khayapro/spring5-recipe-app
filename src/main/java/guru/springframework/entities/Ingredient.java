package guru.springframework.entities;

import guru.springframework.enums.Difficulty;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    @ManyToOne
    private Recipe recipe;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitMeasure unitMeasure;

    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;
}
