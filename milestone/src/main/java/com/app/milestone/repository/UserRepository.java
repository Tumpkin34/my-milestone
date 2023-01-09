package com.app.milestone.repository;

import com.app.milestone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface UserRepository extends JpaRepository<User, Long>, UserCustomRepository {
    /*===============황지수=================*/
//    마이페이지 정보수정에 필요한 이메일 중복검사
    Optional<User> findByUserEmail(String userEmail);

}
