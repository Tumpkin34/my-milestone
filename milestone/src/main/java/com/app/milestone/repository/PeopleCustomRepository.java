package com.app.milestone.repository;

import com.app.milestone.domain.PeopleDTO;
import com.app.milestone.domain.Search;
import com.querydsl.core.Tuple;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PeopleCustomRepository {
    /*=====================황지수=======================*/
    // 개인 한 명정보 조회
    public PeopleDTO findInfoById(Long userId);

    /*=====================정서림======================*/
    public Long countByCreatedDate (Pageable pageable, String keyword);
    public List<PeopleDTO> findPeopleSearch(Pageable pageable,String keyword);
    public List<PeopleDTO> findPeopleSearchAsc(Pageable pageable,String keyword);
}
