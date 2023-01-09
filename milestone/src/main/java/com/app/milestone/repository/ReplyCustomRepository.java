/*
* 황지수
* */

package com.app.milestone.repository;

import com.app.milestone.domain.ReplyDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ReplyCustomRepository {
//    보육원 아이디로 댓글들의 정보를 가져옵니다.
    public List<ReplyDTO> findBySchoolId(Pageable pageable, Long userId);
//    보육원에 달린 총 댓글 개수를 구합니다.
    public Long countBySchoolId(Long userId);
}
