package ul.it.universalserver.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import ul.it.universalserver.entity.Aware;

@Projection(types = Aware.class, name = "customAware")
public interface CustomAware {
    Integer getId();

    String getName();

    String getLink();

    String getLogo();

    String getAbout();
}
