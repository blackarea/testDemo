package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    MemberMapper memberMapper;
    @Autowired
    PencilMapper pencilMapper;

    @GetMapping("/")
    public void test(){
//        memberMapper.createMember(new MemberDto("hoseok", 27));
//        memberMapper.createHoseok();
//        List<MemberDto> hoseok = memberMapper.findMemberByNameAge("hoseok", 28);
//        List<MemberDto> hoseoks = memberMapper.findHoseoks(List.of(27, 28, 29));
//        System.out.println(hoseoks);

        List<MemberDto> memberDtoList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            memberDtoList.add(new MemberDto("hoseok"+i, 30+i));
        }
        System.out.println(memberDtoList);

        memberMapper.insertMember(memberDtoList);


        List<MemberDto> allMemberDto = memberMapper.getAllMember();
        for (MemberDto memberDto : allMemberDto) {
            System.out.println("member = " + memberDto);
        }

    }

    @GetMapping("/p")
    public void pencil(){
        MemberDto byId = pencilMapper.getById(2);
        System.out.println(byId);
        pencilMapper.increasePriceById(2);
    }

}
