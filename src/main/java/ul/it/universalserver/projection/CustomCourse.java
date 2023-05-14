package ul.it.universalserver.projection;

import org.springframework.data.rest.core.config.Projection;
import ul.it.universalserver.entity.Aware;
import ul.it.universalserver.entity.Course;

import java.util.UUID;

@Projection(types = Course.class, name = "customCourse")
public interface CustomCourse {
    Integer getId();

    String getName();

    double getPrice();

    Integer getExpireMonth();

    String getDescription();

    UUID getPhotoId();
}
