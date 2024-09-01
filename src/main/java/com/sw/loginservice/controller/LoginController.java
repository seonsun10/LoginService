package com.sw.loginservice.controller;

import com.sw.loginservice.Entity.NaverEntity;
import com.sw.loginservice.request.NaverEntityRequest;
import com.sw.loginservice.service.NaverService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

import static org.eclipse.jdt.internal.compiler.lookup.InferenceContext18.getParameter;

@RequiredArgsConstructor
@Controller
public class LoginController {

    private final NaverService naverService;

    @RequestMapping("/main")
    public String home(){
        return "index";
    }

    @GetMapping("/callback-naver")
    public String loginNaver(){
        return "main";
    }

    @PostMapping("/naver-info")
    public void naverInfo(@RequestBody NaverEntityRequest naver, HttpServletRequest request) {
        try {
            // 서비스 호출 및 결과 메시지 생성
            naverService.insertNaverInfo(naver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
