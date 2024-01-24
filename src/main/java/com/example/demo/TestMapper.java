package com.example.demo;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {

    List<MemberDto> getAllMember();
    MemberDto getMemberByName(String name);
    List<MemberDto> t();
}
