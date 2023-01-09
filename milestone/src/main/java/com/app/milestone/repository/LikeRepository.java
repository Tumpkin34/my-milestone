package com.app.milestone.repository;

import com.app.milestone.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LikeRepository extends JpaRepository<Like, Long>, LikeCustomRepository {
    /*========================정서림=====================*/
    public Long countByPeopleUserId(Long userId);
    /*========================황지수=====================*/
//    보육원이 받은 좋아요 개수를 구하는 쿼리메소드입니다.
    public Long countBySchoolUserId(Long userId);
//    내가 좋아요를 누른 좋아요를 가져오는 쿼리메소드입니다.
    public List<Like> findByPeopleUserId(Long userId);
//    좋아요 취소하는 쿼리메소드입니다.
    @Modifying(clearAutomatically = true)
    @Query("delete from Like l where l.people.userId = :sessionId and l.school.userId = :userId")
    public void deleteByPeopleIdAndSchoolId(Long sessionId,Long userId);
}
