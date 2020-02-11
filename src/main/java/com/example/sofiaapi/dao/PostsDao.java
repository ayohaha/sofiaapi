package com.example.sofiaapi.dao;

import com.example.sofiaapi.dto.PostsMainResponseDto;
import com.example.sofiaapi.dto.PostsSaveRequestDto;
import org.graalvm.compiler.graph.Node;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostsDao {
    private SqlSessionTemplate sqlSessionTemplate;

    public List<PostsMainResponseDto> findAllDesc(){
        return sqlSessionTemplate.selectList("Posts.findAllDest");
    }

    public int save(PostsSaveRequestDto dto){
        return sqlSessionTemplate.insert("Posts.save", dto);
    }

}
