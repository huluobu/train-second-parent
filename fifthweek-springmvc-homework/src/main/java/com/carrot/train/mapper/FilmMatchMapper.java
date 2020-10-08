package com.carrot.train.mapper;

import com.carrot.train.entity.Film;
import com.carrot.train.entity.FilmMatch;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: carrot
 * @Date: 2020/10/5 10:57
 */
@Mapper
public interface FilmMatchMapper extends BaseMapper {
    List<FilmMatch> selectAllFilmMatch();
}
