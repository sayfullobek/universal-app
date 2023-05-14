package ul.it.universalserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import ul.it.universalserver.entity.Aware;
import ul.it.universalserver.entity.Course;
import ul.it.universalserver.projection.CustomAware;
import ul.it.universalserver.projection.CustomCourse;

@CrossOrigin
@RepositoryRestResource(path = "course", collectionResourceRel = "list", excerptProjection = CustomCourse.class)
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
