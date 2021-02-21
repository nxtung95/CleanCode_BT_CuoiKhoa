package course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import course.dto.CourseResponseDto;
import course.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
	@Query("SELECT new course.dto.CourseResponseDto(c.id, c.name, c.location, t.name, c.opened) "
			+ "FROM #{#entityName} c "
			+ "INNER JOIN c.teacher t "
			+ "WHERE c.name LIKE %?#{escape([0])}% escape ?#{escapeCharacter()}")
	List<CourseResponseDto> findAllByNameContaining(String name);
}
