package com.vivolvle.excel_import.bo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

/**
 * @author liangzheng.wei
 * @Description:
 * @date 2019/8/6 16:41
 * @Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */
@Data
public class ImportElectricBO extends BaseRowModel {
    //时间
    @ExcelProperty(index = 0)
    private String timeLine;
    //黔天线
    @ExcelProperty(index = 1)
    private String qingtian;
    //水电（直）
    @ExcelProperty(index = 2)
    private String shuidian;
    //红枫总厂
    @ExcelProperty(index = 3)
    private String hongfeng;
    //光照电厂
    @ExcelProperty(index = 4)
    private String guangzhao;
    //构皮滩电厂
    @ExcelProperty(index = 5)
    private String goupitan;
    //董箐电厂
    @ExcelProperty(index = 6)
    private String tongjing;
    //洪家渡电厂
    @ExcelProperty(index = 7)
    private String hongjiadu;
    //乌江渡电厂
    @ExcelProperty(index = 8)
    private String wujiangdu;
    //东风电厂
    @ExcelProperty(index = 9)
    private String dongfeng;
    //索风营电厂
    @ExcelProperty(index = 10)
    private String suofengyin;
    //思林电厂
    @ExcelProperty(index = 11)
    private String silin;
    //沙沱电厂
    @ExcelProperty(index = 12)
    private String shatuo;
    //普定电厂
    @ExcelProperty(index = 13)
    private String puding;
    //引子渡电厂
    @ExcelProperty(index = 14)
    private String yinzidu;
    //马马崖电厂
    @ExcelProperty(index = 15)
    private String mamaya;
    //善泥坡电厂
    @ExcelProperty(index = 16)
    private String shannipo;
    //毛家河电厂
    @ExcelProperty(index = 17)
    private String maojiahe;
    //万家口子电厂
    @ExcelProperty(index = 18)
    private String wanjiakouzi;
    //平寨电厂
    @ExcelProperty(index = 19)
    private String pingzhai;
    //大花水电厂
    @ExcelProperty(index = 20)
    private String dahua;
    //格里桥电厂
    @ExcelProperty(index = 21)
    private String geliqiao;
    //象鼻岭电厂
    @ExcelProperty(index = 22)
    private String xiangbiling;
    //小岩头电厂
    @ExcelProperty(index = 23)
    private String xiaoyantou;
    //大岩洞电厂
    @ExcelProperty(index = 24)
    private String dayandong;
    //响水电厂
    @ExcelProperty(index = 25)
    private String xiangshui;
    //大方电厂
    @ExcelProperty(index = 26)
    private String dafang;
    //桐梓电厂
    @ExcelProperty(index = 27)
    private String tongzi;
    //塘寨电厂
    @ExcelProperty(index = 28)
    private String tangzhai;
    //大龙电厂(贵)
    @ExcelProperty(index = 29)
    private String daStringGui;
    //大龙电厂(湘)
    @ExcelProperty(index = 30)
    private String daStringXiang;
    //毕节热电厂
    @ExcelProperty(index = 31)
    private String bijiere;

}
