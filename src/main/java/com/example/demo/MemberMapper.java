package com.example.demo;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    void createMember(MemberDto memberDto);
    void createHoseok();
    List<MemberDto> getAllMember();
    MemberDto getMemberByName(String name);
    List<MemberDto> t();

    List<MemberDto> findMemberByNameAge(String name, int age);

    List<MemberDto> findHoseoks(List<Integer> integers);

    void insertMember(List<MemberDto> memberDtoList);
}
