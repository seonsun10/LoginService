package com.sw.loginservice.service;

import com.sw.loginservice.Entity.NaverEntity;
import com.sw.loginservice.Repository.InfoRepository;
import com.sw.loginservice.request.NaverEntityRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class NaverService {

    private final InfoRepository infoRepository;

    @Transactional
    public void insertNaverInfo(NaverEntityRequest naver) {

        try {
            NaverEntity entity = NaverEntity.builder()
                    .id(naver.getId())  // id는 String 타입으로 그대로 사용
                    .name(naver.getName())
                    .gender(naver.getGender())
                    .birthyear(naver.getBirthyear())
                    .build();


            infoRepository.save(entity);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
