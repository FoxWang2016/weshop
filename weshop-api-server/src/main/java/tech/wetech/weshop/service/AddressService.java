package tech.wetech.weshop.service;

import com.github.pagehelper.PageInfo;
import tech.wetech.weshop.po.Address;
import tech.wetech.weshop.query.AddressPageQuery;

/**
 * @author cjbi
 */
public interface AddressService {

    /**
     * 分页查询地址
     *
     * @param addressPageQuery
     * @return
     */
    PageInfo<Address> queryAddressPageInfo(AddressPageQuery addressPageQuery);
}
