/*
 * 황지수
 * */

package com.app.milestone.controller.alarm;

import com.app.milestone.domain.AlarmDTO;
import com.app.milestone.entity.People;
import com.app.milestone.service.AlarmService;
import com.app.milestone.service.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/alarm/*")
public class AlarmRestController {
    private final AlarmService alarmService;

//    확인하지 않은 알람의 정보를 가져오는 컨트롤러
    @GetMapping("/noneCheckAlarm")
    public List<AlarmDTO> noneCheckAlarm(HttpServletRequest request) {
        Long userId = (Long)request.getSession().getAttribute("userId");
        return alarmService.showNoneCheckAlaram(userId);
    }
}
