package com.app.milestone.repository;

import com.app.milestone.domain.AlarmDTO;
import com.app.milestone.entity.Alarm;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AlarmCustomRepository {
    /*=========================황지수===================*/
//   모든 알람 정보를 가져옵니다.
    public List<AlarmDTO> findAlarmByType(Long userId, Pageable pageable, String type);
//    읽지 않은 알람 정보를 가져옵니다.
    public List<AlarmDTO> findNoneCheckAlarmByType(Long userId, String type);

    /*===================박해준======================*/
    public List<AlarmDTO> findAlarmByType1(Long userId, Pageable pageable, String type);
    public List<AlarmDTO> findAlarmByType2(Long userId, Pageable pageable, String type);
    public Long countAlarm(Pageable pageable, Long userId);
}
