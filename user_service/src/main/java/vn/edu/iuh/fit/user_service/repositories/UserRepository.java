package vn.edu.iuh.fit.user_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.user_service.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
