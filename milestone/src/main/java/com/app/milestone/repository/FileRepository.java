/*
 * 황지수
 * */

package com.app.milestone.repository;

import com.app.milestone.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface FileRepository extends JpaRepository<File, Long>, FileCustomRepository {
//    프로필 정보를 지우는 쿼리메소드입니다.
    @Modifying(clearAutomatically = true)
    @Query("delete from File f where f.user.userId = :userId and f.fileType = 'profile'")
    public void deleteByUserId(@Param("userId") Long userId);

//    보육원 사진 정보를 지우는 쿼리메소드입니다.
    @Modifying(clearAutomatically = true)
    @Query("delete from File f where f.user.userId = :userId and f.fileType = 'schoolImg'")
    public void deleteSchoolImgByUserId(@Param("userId") Long userId);

}
