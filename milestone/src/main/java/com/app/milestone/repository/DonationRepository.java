package com.app.milestone.repository;

import com.app.milestone.entity.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Component;

@Component
public interface DonationRepository extends JpaRepository<Donation, Long>, DonationCustomRepository {
//    ====================황지수==================
//    각각 기부한 횟수 총합, 기부 받은 횟수 총합을 구한다.
    public int countByPeopleUserId(Long userId);
    public int countBySchoolUserId(Long userId);
    
//    ====================김의엽==================
    //회원 탈퇴시 도네이션 삭제
    public void deleteByPeopleUserId(Long userId);
    public void deleteBySchoolUserId(Long userId);

}
