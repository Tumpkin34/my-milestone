/*
* 황지수
* */

package com.app.milestone.repository;

import com.app.milestone.domain.QReplyDTO;
import com.app.milestone.domain.ReplyDTO;
import com.app.milestone.entity.QReply;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.app.milestone.entity.QReply.*;

@Repository
@RequiredArgsConstructor
public class ReplyCustomRepositoryImpl implements ReplyCustomRepository {
    private final JPAQueryFactory jpaQueryFactory;

    //    보육원 아이디로 댓글들의 정보를 가져옵니다.
    @Override
    public List<ReplyDTO> findBySchoolId(Pageable pageable, Long userId) {
        return jpaQueryFactory.select(new QReplyDTO(
                reply.replyId,
                reply.replyContent,
                reply.createdDate,
                reply.school.userId,
                reply.user.userId
        )).from(reply)
                .where(reply.school.userId.eq(userId))
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .orderBy(reply.createdDate.desc())
                .fetch();
    }

    //    보육원에 달린 총 댓글 개수를 구합니다.
    @Override
    public Long countBySchoolId(Long userId) {
        return jpaQueryFactory.select(reply.count(
        )).from(reply)
                .where(reply.school.userId.eq(userId))
                .fetchOne();
    }
}
