package ul.it.universalserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import ul.it.universalserver.entity.Aware;
import ul.it.universalserver.projection.CustomAware;

@CrossOrigin
@RepositoryRestResource(path = "aware", collectionResourceRel = "list", excerptProjection = CustomAware.class)
public interface AwareRepository extends JpaRepository<Aware, Integer> {

}
