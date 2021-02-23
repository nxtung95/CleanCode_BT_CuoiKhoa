package course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import course.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    boolean existsEmailByEmail(String name);
}
