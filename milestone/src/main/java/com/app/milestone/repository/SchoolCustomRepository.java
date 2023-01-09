package com.app.milestone.repository;

import com.app.milestone.domain.SchoolDTO;
import com.app.milestone.domain.Search;
import com.app.milestone.entity.School;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SchoolCustomRepository {
    /*=================================황지수========================*/
    //    도움받은 횟수가 적은 보육원순으로 정렬했습니다.
    public List<SchoolDTO> findAllByDonationCount();
    //    최근 가입순으로 보육원을 정렬했습니다.
    public List<SchoolDTO> findAllByCreatedDate(Pageable pageable, Search search);
    //    보육원등록을 한 총 보육원 개수입니다.
    public Long countByCreatedDate(Search search);
    //    보육원 하나의 정보를 가져옵니다.
    public SchoolDTO findByUserId(Long userId);

    //    ===============관리자 정서림==================
    public List<School> findByCreatedDate(Pageable pageable);
    public List<SchoolDTO> findSchoolSearch(Pageable pageable, String keyword);
    public List<SchoolDTO> findSchoolSearchAsc(Pageable pageable, String keyword);
    public Long countByCreatedDate2(Pageable pageable, String keyword);
    public List<SchoolDTO> findByBudgetAndSearchAsc(Pageable pageable, String keyword);
    public List<SchoolDTO> findByBudgetAndSearch(Pageable pageable, String keyword);
    public Long countByCreatedDate3(Pageable pageable, String keyword);

}
