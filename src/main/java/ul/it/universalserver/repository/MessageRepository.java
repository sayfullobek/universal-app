package ul.it.universalserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import ul.it.universalserver.entity.Aware;
import ul.it.universalserver.entity.Message;
import ul.it.universalserver.projection.CustomMessage;

import java.util.UUID;

@CrossOrigin
@RepositoryRestResource(path = "message", collectionResourceRel = "list", excerptProjection = CustomMessage.class)
public interface MessageRepository extends JpaRepository<Message, UUID> {

}
