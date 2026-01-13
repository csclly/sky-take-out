package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.mapper.DishMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public interface DishService {

    /**
     * 新增菜品
     * @param dishDTO
     */
    @Transactional
    void saveWithFlavor(DishDTO dishDTO);
}
