package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
//        List<MemberDto> hoseoks = memberMapper.findHoseoks(List.of(27, 28, 29));
//        System.out.println(hoseoks);

//        List<MemberDto> memberDtoList = new ArrayList<>();
//        List<MemberDto> list = IntStream.range(0, 3).mapToObj(i -> new MemberDto(("hoseok" + i), 30 + i)).toList();
//        System.out.println(list);
//
//        memberMapper.insertMember(memberDtoList);

        List<MemberDto> hoseok = memberMapper.findMemberByNameAge("hoseok", 28);
        System.out.println(hoseok);

        /*List<MemberDto> allMemberDto = memberMapper.getAllMember();
        for (MemberDto memberDto : allMemberDto) {
            System.out.println("member = " + memberDto);
        }*/

    }

    @GetMapping("/p")
    public void pencil(){
        MemberDto byId = pencilMapper.getById(2);
        System.out.println(byId);
        pencilMapper.increasePriceById(2);
    }

}
