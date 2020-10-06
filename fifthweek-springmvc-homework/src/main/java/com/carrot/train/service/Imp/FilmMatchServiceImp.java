package com.carrot.train.service.Imp;

import com.carrot.train.mapper.FilmMatchMapper;
import com.carrot.train.service.FilmMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: carrot
 * @Date: 2020/10/6 11:20
 */
@Service
public class FilmMatchServiceImp implements FilmMatchService {
    @Autowired
    private FilmMatchMapper filmMatchMapper;

    @Override
    public void update(Object object) {
        filmMatchMapper.update(object);
    }

    @Override
    public void insert(Object object) {
        filmMatchMapper.insert(object);
    }

    @Override
    public Object findByPrimaryKey(Object primaryKey) {
        return filmMatchMapper.findByPrimaryKey(primaryKey);
    }
}
