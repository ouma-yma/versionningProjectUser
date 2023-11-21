package com.example.userprojectversionningmicro.Repository;

import com.example.userprojectversionningmicro.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
