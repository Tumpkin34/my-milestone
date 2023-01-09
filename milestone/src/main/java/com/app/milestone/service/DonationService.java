package com.app.milestone.service;


import com.app.milestone.aspect.Alarm;
import com.app.milestone.repository.DonationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DonationService {
    private final DonationRepository donationRepository;

    public void findDonation(Long donationId) {
        donationRepository.findById(donationId);
    }

    /*=========================황지수=======================*/
//    다양한 형태의 기부정보를 받을 메소드 AOP에서 파라미터 값을 가져오기 위해 사용되었기 때문에 이외의 기능은 없다.
    @Alarm
    public void alarm(Object object) {
        log.info("========================");
        log.info("=========서비스쪽===========" + object);
        log.info("========================");
    }
}
