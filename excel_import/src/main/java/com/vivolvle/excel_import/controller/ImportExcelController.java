package com.vivolvle.excel_import.controller;

import com.vivolvle.excel_import.bo.ImportElectricBO;
import com.vivolvle.excel_import.excel.ExcelUtil;
import com.vivolvle.excel_import.service.ImportExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author liangzheng.wei
 * @Description:
 * @date 2019/8/6 13:45
 * @Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */
@RestController
public class ImportExcelController {
    @Autowired
    private ImportExcelService importExcelService;

    @PostMapping("/read")
    public void read(MultipartFile excel, int sheetNo,
                       @RequestParam(defaultValue = "6") int headLineNum) {
        List<Object> objects = ExcelUtil.readExcel(excel, new ImportElectricBO(), sheetNo, headLineNum);
        importExcelService.insert(objects);
    }

}
