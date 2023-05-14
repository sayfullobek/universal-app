package ul.it.universalserver.entity;

import lombok.*;
import ul.it.universalserver.entity.template.AbsNameEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "courses")
public class Course extends AbsNameEntity {
    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private Integer expireMonth; //ushbu kurs necha oy davom etadi

    @Column(nullable = false)
    private String description;

    private UUID photoId;
}
