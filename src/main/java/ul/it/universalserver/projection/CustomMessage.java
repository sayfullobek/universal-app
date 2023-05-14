package ul.it.universalserver.projection;

import org.springframework.data.rest.core.config.Projection;
import ul.it.universalserver.entity.Aware;
import ul.it.universalserver.entity.Message;

import java.util.Date;
import java.util.UUID;

@Projection(types = Message.class, name = "customMessage")
public interface CustomMessage {
    UUID getId();

    String getName();

    String getPhoneNumber();

    Date getDate();

    String getMessage();
}
