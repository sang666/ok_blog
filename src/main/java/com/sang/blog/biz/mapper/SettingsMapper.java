package com.sang.blog.biz.mapper;

import com.sang.blog.biz.entity.Settings;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author sang666
 * @since 2020-07-03
 */
public interface SettingsMapper extends BaseMapper<Settings> {
    Settings findOneByKey(String key);

}
