/*
 * 황지수
 * */

package com.app.milestone.controller.index;

import com.app.milestone.domain.SessionManager;
import com.app.milestone.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main")
public class IndexController {
    private final SchoolService schoolService;
    private final MoneyService moneyService;
    private final TalentService talentService;
    private final ServiceService serviceService;

//    메인페이지 컨트롤러
    @GetMapping("")
    public void main(Model model) {
//        기부금 랭킹 정보를 가져온다.
        model.addAttribute("moneys", moneyService.donationMoneyRanking());
//        방문기부 횟수 랭킹 정보를 가져온다.
        model.addAttribute("services", serviceService.donationVisitRanking());
//        재능기부 횟수 랭킹 정보를 가져온다.
        model.addAttribute("talents", talentService.donationTalentRanking());
//        도움이 필요한 보육원정보를 가져온다.
        model.addAttribute("schools", schoolService.needHelpList());

    }
}
