package ul.it.universalserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import ul.it.universalserver.entity.Attachment;

import java.util.UUID;

@CrossOrigin(origins = "http://localhost:4000")
public interface AttachmentRepository extends JpaRepository<Attachment, UUID> {
}
