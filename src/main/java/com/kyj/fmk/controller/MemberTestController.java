package com.kyj.fmk.controller;

import com.kyj.fmk.mapper.TestMapper;
import com.kyj.fmk.sec.annotation.PublicEndpoint;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/recruit")
public class MemberTestController {

    private final TestMapper testMapper;
    @PublicEndpoint
    @GetMapping("/devtest")
    public ResponseEntity<Integer> test(){
        return ResponseEntity.ok(testMapper.test());
    }
}
