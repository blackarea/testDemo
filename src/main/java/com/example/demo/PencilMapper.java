package com.example.demo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PencilMapper {

    MemberDto getById(long id);
}
