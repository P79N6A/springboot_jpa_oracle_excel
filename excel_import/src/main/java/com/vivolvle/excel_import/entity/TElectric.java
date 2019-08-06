package com.vivolvle.excel_import.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

/**
 * @author liangzheng.wei
 * @Description:
 * @date 2019/8/6 18:46
 * @Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */
@Entity
@Table(name = "t_electric", schema = "SYSTEM", catalog = "")
public class TElectric {
    private long id;
    private Time date;
    private long type;
    private String timeLine;
    private long qingtian;
    private long shuidian;
    private long hongfeng;
    private long guangzhao;
    private long goupitan;
    private long tongjing;
    private long hongjiadu;
    private long wujiangdu;
    private long dongfeng;
    private long suofengyin;
    private long silin;
    private long shatuo;
    private long puding;
    private long yinzidu;
    private long mamaya;
    private long shannipo;
    private long maojiahe;
    private long wanjiakouzi;
    private long pingzhai;
    private long dahua;
    private long geliqiao;
    private long xiangbiling;
    private long xiaoyantou;
    private long dayandong;
    private long xiangshui;
    private long dafang;
    private long tongzi;
    private long tangzhai;
    private long dalongGui;
    private long dalongXiang;
    private long bijiere;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date")
    public Time getDate() {
        return date;
    }

    public void setDate(Time date) {
        this.date = date;
    }

    @Basic
    @Column(name = "type")
    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    @Basic
    @Column(name = "time_line")
    public String getTimeLine() {
        return timeLine;
    }

    public void setTimeLine(String timeLine) {
        this.timeLine = timeLine;
    }

    @Basic
    @Column(name = "qingtian")
    public long getQingtian() {
        return qingtian;
    }

    public void setQingtian(long qingtian) {
        this.qingtian = qingtian;
    }

    @Basic
    @Column(name = "shuidian")
    public long getShuidian() {
        return shuidian;
    }

    public void setShuidian(long shuidian) {
        this.shuidian = shuidian;
    }

    @Basic
    @Column(name = "hongfeng")
    public long getHongfeng() {
        return hongfeng;
    }

    public void setHongfeng(long hongfeng) {
        this.hongfeng = hongfeng;
    }

    @Basic
    @Column(name = "guangzhao")
    public long getGuangzhao() {
        return guangzhao;
    }

    public void setGuangzhao(long guangzhao) {
        this.guangzhao = guangzhao;
    }

    @Basic
    @Column(name = "goupitan")
    public long getGoupitan() {
        return goupitan;
    }

    public void setGoupitan(long goupitan) {
        this.goupitan = goupitan;
    }

    @Basic
    @Column(name = "tongjing")
    public long getTongjing() {
        return tongjing;
    }

    public void setTongjing(long tongjing) {
        this.tongjing = tongjing;
    }

    @Basic
    @Column(name = "hongjiadu")
    public long getHongjiadu() {
        return hongjiadu;
    }

    public void setHongjiadu(long hongjiadu) {
        this.hongjiadu = hongjiadu;
    }

    @Basic
    @Column(name = "wujiangdu")
    public long getWujiangdu() {
        return wujiangdu;
    }

    public void setWujiangdu(long wujiangdu) {
        this.wujiangdu = wujiangdu;
    }

    @Basic
    @Column(name = "dongfeng")
    public long getDongfeng() {
        return dongfeng;
    }

    public void setDongfeng(long dongfeng) {
        this.dongfeng = dongfeng;
    }

    @Basic
    @Column(name = "suofengyin")
    public long getSuofengyin() {
        return suofengyin;
    }

    public void setSuofengyin(long suofengyin) {
        this.suofengyin = suofengyin;
    }

    @Basic
    @Column(name = "silin")
    public long getSilin() {
        return silin;
    }

    public void setSilin(long silin) {
        this.silin = silin;
    }

    @Basic
    @Column(name = "shatuo")
    public long getShatuo() {
        return shatuo;
    }

    public void setShatuo(long shatuo) {
        this.shatuo = shatuo;
    }

    @Basic
    @Column(name = "puding")
    public long getPuding() {
        return puding;
    }

    public void setPuding(long puding) {
        this.puding = puding;
    }

    @Basic
    @Column(name = "yinzidu")
    public long getYinzidu() {
        return yinzidu;
    }

    public void setYinzidu(long yinzidu) {
        this.yinzidu = yinzidu;
    }

    @Basic
    @Column(name = "mamaya")
    public long getMamaya() {
        return mamaya;
    }

    public void setMamaya(long mamaya) {
        this.mamaya = mamaya;
    }

    @Basic
    @Column(name = "shannipo")
    public long getShannipo() {
        return shannipo;
    }

    public void setShannipo(long shannipo) {
        this.shannipo = shannipo;
    }

    @Basic
    @Column(name = "maojiahe")
    public long getMaojiahe() {
        return maojiahe;
    }

    public void setMaojiahe(long maojiahe) {
        this.maojiahe = maojiahe;
    }

    @Basic
    @Column(name = "wanjiakouzi")
    public long getWanjiakouzi() {
        return wanjiakouzi;
    }

    public void setWanjiakouzi(long wanjiakouzi) {
        this.wanjiakouzi = wanjiakouzi;
    }

    @Basic
    @Column(name = "pingzhai")
    public long getPingzhai() {
        return pingzhai;
    }

    public void setPingzhai(long pingzhai) {
        this.pingzhai = pingzhai;
    }

    @Basic
    @Column(name = "dahua")
    public long getDahua() {
        return dahua;
    }

    public void setDahua(long dahua) {
        this.dahua = dahua;
    }

    @Basic
    @Column(name = "geliqiao")
    public long getGeliqiao() {
        return geliqiao;
    }

    public void setGeliqiao(long geliqiao) {
        this.geliqiao = geliqiao;
    }

    @Basic
    @Column(name = "xiangbiling")
    public long getXiangbiling() {
        return xiangbiling;
    }

    public void setXiangbiling(long xiangbiling) {
        this.xiangbiling = xiangbiling;
    }

    @Basic
    @Column(name = "xiaoyantou")
    public long getXiaoyantou() {
        return xiaoyantou;
    }

    public void setXiaoyantou(long xiaoyantou) {
        this.xiaoyantou = xiaoyantou;
    }

    @Basic
    @Column(name = "dayandong")
    public long getDayandong() {
        return dayandong;
    }

    public void setDayandong(long dayandong) {
        this.dayandong = dayandong;
    }

    @Basic
    @Column(name = "xiangshui")
    public long getXiangshui() {
        return xiangshui;
    }

    public void setXiangshui(long xiangshui) {
        this.xiangshui = xiangshui;
    }

    @Basic
    @Column(name = "dafang")
    public long getDafang() {
        return dafang;
    }

    public void setDafang(long dafang) {
        this.dafang = dafang;
    }

    @Basic
    @Column(name = "tongzi")
    public long getTongzi() {
        return tongzi;
    }

    public void setTongzi(long tongzi) {
        this.tongzi = tongzi;
    }

    @Basic
    @Column(name = "tangzhai")
    public long getTangzhai() {
        return tangzhai;
    }

    public void setTangzhai(long tangzhai) {
        this.tangzhai = tangzhai;
    }

    @Basic
    @Column(name = "dalong_gui")
    public long getDalongGui() {
        return dalongGui;
    }

    public void setDalongGui(long dalongGui) {
        this.dalongGui = dalongGui;
    }

    @Basic
    @Column(name = "dalong_xiang")
    public long getDalongXiang() {
        return dalongXiang;
    }

    public void setDalongXiang(long dalongXiang) {
        this.dalongXiang = dalongXiang;
    }

    @Basic
    @Column(name = "bijiere")
    public long getBijiere() {
        return bijiere;
    }

    public void setBijiere(long bijiere) {
        this.bijiere = bijiere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TElectric tElectric = (TElectric) o;
        return id == tElectric.id &&
                type == tElectric.type &&
                qingtian == tElectric.qingtian &&
                shuidian == tElectric.shuidian &&
                hongfeng == tElectric.hongfeng &&
                guangzhao == tElectric.guangzhao &&
                goupitan == tElectric.goupitan &&
                tongjing == tElectric.tongjing &&
                hongjiadu == tElectric.hongjiadu &&
                wujiangdu == tElectric.wujiangdu &&
                dongfeng == tElectric.dongfeng &&
                suofengyin == tElectric.suofengyin &&
                silin == tElectric.silin &&
                shatuo == tElectric.shatuo &&
                puding == tElectric.puding &&
                yinzidu == tElectric.yinzidu &&
                mamaya == tElectric.mamaya &&
                shannipo == tElectric.shannipo &&
                maojiahe == tElectric.maojiahe &&
                wanjiakouzi == tElectric.wanjiakouzi &&
                pingzhai == tElectric.pingzhai &&
                dahua == tElectric.dahua &&
                geliqiao == tElectric.geliqiao &&
                xiangbiling == tElectric.xiangbiling &&
                xiaoyantou == tElectric.xiaoyantou &&
                dayandong == tElectric.dayandong &&
                xiangshui == tElectric.xiangshui &&
                dafang == tElectric.dafang &&
                tongzi == tElectric.tongzi &&
                tangzhai == tElectric.tangzhai &&
                dalongGui == tElectric.dalongGui &&
                dalongXiang == tElectric.dalongXiang &&
                bijiere == tElectric.bijiere &&
                Objects.equals(date, tElectric.date) &&
                Objects.equals(timeLine, tElectric.timeLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, type, timeLine, qingtian, shuidian, hongfeng, guangzhao, goupitan, tongjing, hongjiadu, wujiangdu, dongfeng, suofengyin, silin, shatuo, puding, yinzidu, mamaya, shannipo, maojiahe, wanjiakouzi, pingzhai, dahua, geliqiao, xiangbiling, xiaoyantou, dayandong, xiangshui, dafang, tongzi, tangzhai, dalongGui, dalongXiang, bijiere);
    }
}
