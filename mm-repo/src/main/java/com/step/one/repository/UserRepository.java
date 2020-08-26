package com.step.one.repository;

import com.step.one.entity.User;
import java.util.List;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends JpaRepository<User,String> {

    public List<User> findAll() {
        return null;
    }
}
