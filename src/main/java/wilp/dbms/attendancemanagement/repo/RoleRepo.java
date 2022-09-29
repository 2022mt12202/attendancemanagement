package wilp.dbms.attendancemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import wilp.dbms.attendancemanagement.model.Role;

@RepositoryRestResource(collectionResourceRel = "role", path = "role")
public interface RoleRepo extends JpaRepository<Role, Integer> {

}