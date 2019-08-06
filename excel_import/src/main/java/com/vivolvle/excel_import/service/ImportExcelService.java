package com.vivolvle.excel_import.service;

import com.alibaba.fastjson.JSONObject;
import com.vivolvle.excel_import.bo.ElectricBO;
import com.vivolvle.excel_import.entity.TElectric;
import com.vivolvle.excel_import.repository.TElectricRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liangzheng.wei
 * @Description:
 * @date 2019/8/6 13:45
 * @Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */
@Service
public class ImportExcelService {
    @Autowired
    private TElectricRepository tElectricRepository;

    public void insert(List<Object> objects) {
        //ImportElectricBO firstLine = (ImportElectricBO) objects.get(0);
        String s = JSONObject.toJSONString(objects.get(0));
        ElectricBO electricBO = JSONObject.parseObject(s, ElectricBO.class);
        TElectric tElectric = new TElectric();
        BeanUtils.copyProperties(electricBO,tElectric);
        tElectric.setType(2);
        tElectric.setDate();
        tElectric.setTimeLine(null);
        tElectricRepository.save(tElectric);
    }
}
