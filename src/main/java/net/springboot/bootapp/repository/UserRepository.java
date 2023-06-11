package net.springboot.bootapp.repository;

import net.springboot.bootapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
