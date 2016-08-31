package in.kreatif.web.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.kreatif.web.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Serializable>
{

}
