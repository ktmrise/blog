package com.ktm.service.impl;

import com.ktm.entity.Category;
import com.ktm.mapper.CategoryMapper;
import com.ktm.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ktm
 * @since 2020-09-05
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
