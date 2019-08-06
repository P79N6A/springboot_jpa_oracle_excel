package com.vivolvle.excel_import.repository;

import com.vivolvle.excel_import.entity.TElectric;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author liangzheng.wei
 * @Description:
 * @date 2019/8/6 13:44
 * @Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */
@Component
public interface TElectricRepository extends JpaRepository<TElectric,Object> {
}
