package tech.wetech.weshop.service;

import tech.wetech.weshop.po.UserLevel;

import java.util.List;

/**
 * @author cjbi
 */
public interface UserLevelService {

    /**
     * 查询所有
     * @return
     */
    List<UserLevel> queryAll();

}
