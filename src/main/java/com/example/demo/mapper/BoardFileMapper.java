package com.example.demo.mapper;

import com.example.demo.domain.BoardFileVO;

import java.util.List;

public interface BoardFileMapper {

    public void insert(BoardFileVO file);

    public void delete(Long fno);

    public List<BoardFileVO> findByBno(Long bno);

    public void deleteAll(Long bno);

    public List<BoardFileVO> getOldFiles();
}
