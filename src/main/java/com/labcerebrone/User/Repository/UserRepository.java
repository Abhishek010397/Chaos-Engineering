package com.labcerebrone.User.Repository;

import com.labcerebrone.User.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByUserId(Long userId);
}
