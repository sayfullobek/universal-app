package ul.it.universalserver.entity;

import lombok.*;
import ul.it.universalserver.entity.template.AbsEntity;
import ul.it.universalserver.entity.template.AbsNameEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "messages")
public class Message extends AbsEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phoneNumber;

    private Date date;

    @Column(length = 3000)
    private String message;
}
