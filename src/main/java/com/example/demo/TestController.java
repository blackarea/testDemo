package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestMapper testMapper;
    @Autowired
    PencilMapper pencilMapper;

    @GetMapping("/")
    public void test(){
        List<MemberDto> allMemberDto = testMapper.getAllMember();
        for (MemberDto memberDto : allMemberDto) {
            System.out.println("member = " + memberDto);
        }

        MemberDto johnDoe = testMapper.getMemberByName(null);
        System.out.println(johnDoe);

        List<MemberDto> t = testMapper.t();
        System.out.println(t);
    }

    @GetMapping("/p")
    public void pencil(){
        MemberDto byId = pencilMapper.getById(2);
        System.out.println(byId);
    }
    /*

    <resultMap id="test" type="com.example.demo.MemberDto">
    </resultMap>
     */


}
