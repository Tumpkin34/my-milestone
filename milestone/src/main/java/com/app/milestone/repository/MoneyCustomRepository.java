package com.app.milestone.repository;

import com.app.milestone.domain.MoneyDTO;
import com.app.milestone.domain.SchoolDTO;
import com.app.milestone.entity.Money;
import com.querydsl.core.Tuple;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MoneyCustomRepository {
    /*======================황지수======================*/
//    하나의 보육원에 대한 기부금 랭킹을 가져옵니다.
    public List<Tuple> moneyRankingByOne(Long userId);
//    전체 기부금 랭킹을 가져옵니다.
    public List<Tuple> sortByMoneyCash();
//    하나의 보육원에 대한 최근 기부금내역을 가져옵니다.
    public List<MoneyDTO> findByCreateDateByUserId(Long userId);


    public List<MoneyDTO> findMoneySearch (Pageable pageable, String keyword);
    public List<MoneyDTO> findMoneySearchAsc (Pageable pageable, String keyword);
    public List<MoneyDTO> findMoneySearchAmount (Pageable pageable, String keyword);
    public List<MoneyDTO> findMoneySearchAmountAsc (Pageable pageable, String keyword);
    public Long countByCreatedDate(Pageable pageable, String keyword);
}
