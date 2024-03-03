package ma.enset.demo.repositories;

import ma.enset.demo.entities.Role;
import ma.enset.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,String> {
    Role findByName(String roleName);
}
