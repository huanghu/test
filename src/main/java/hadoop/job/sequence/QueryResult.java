package hadoop.job.sequence;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String Wid;
  public String get_Wid() {
    return Wid;
  }
  public void set_Wid(String Wid) {
    this.Wid = Wid;
  }
  public QueryResult with_Wid(String Wid) {
    this.Wid = Wid;
    return this;
  }
  private String wareid;
  public String get_wareid() {
    return wareid;
  }
  public void set_wareid(String wareid) {
    this.wareid = wareid;
  }
  public QueryResult with_wareid(String wareid) {
    this.wareid = wareid;
    return this;
  }
  private java.math.BigDecimal warejia;
  public java.math.BigDecimal get_warejia() {
    return warejia;
  }
  public void set_warejia(java.math.BigDecimal warejia) {
    this.warejia = warejia;
  }
  public QueryResult with_warejia(java.math.BigDecimal warejia) {
    this.warejia = warejia;
    return this;
  }
  private String daima;
  public String get_daima() {
    return daima;
  }
  public void set_daima(String daima) {
    this.daima = daima;
  }
  public QueryResult with_daima(String daima) {
    this.daima = daima;
    return this;
  }
  private String cpbm;
  public String get_cpbm() {
    return cpbm;
  }
  public void set_cpbm(String cpbm) {
    this.cpbm = cpbm;
  }
  public QueryResult with_cpbm(String cpbm) {
    this.cpbm = cpbm;
    return this;
  }
  private Integer dmbs;
  public Integer get_dmbs() {
    return dmbs;
  }
  public void set_dmbs(Integer dmbs) {
    this.dmbs = dmbs;
  }
  public QueryResult with_dmbs(Integer dmbs) {
    this.dmbs = dmbs;
    return this;
  }
  private Integer bilv;
  public Integer get_bilv() {
    return bilv;
  }
  public void set_bilv(Integer bilv) {
    this.bilv = bilv;
  }
  public QueryResult with_bilv(Integer bilv) {
    this.bilv = bilv;
    return this;
  }
  private Integer zpbl;
  public Integer get_zpbl() {
    return zpbl;
  }
  public void set_zpbl(Integer zpbl) {
    this.zpbl = zpbl;
  }
  public QueryResult with_zpbl(Integer zpbl) {
    this.zpbl = zpbl;
    return this;
  }
  private Integer WStatus;
  public Integer get_WStatus() {
    return WStatus;
  }
  public void set_WStatus(Integer WStatus) {
    this.WStatus = WStatus;
  }
  public QueryResult with_WStatus(Integer WStatus) {
    this.WStatus = WStatus;
    return this;
  }
  private Integer gzstatus;
  public Integer get_gzstatus() {
    return gzstatus;
  }
  public void set_gzstatus(Integer gzstatus) {
    this.gzstatus = gzstatus;
  }
  public QueryResult with_gzstatus(Integer gzstatus) {
    this.gzstatus = gzstatus;
    return this;
  }
  private String Wname;
  public String get_Wname() {
    return Wname;
  }
  public void set_Wname(String Wname) {
    this.Wname = Wname;
  }
  public QueryResult with_Wname(String Wname) {
    this.Wname = Wname;
    return this;
  }
  private Integer WPid;
  public Integer get_WPid() {
    return WPid;
  }
  public void set_WPid(Integer WPid) {
    this.WPid = WPid;
  }
  public QueryResult with_WPid(Integer WPid) {
    this.WPid = WPid;
    return this;
  }
  private Integer wpid2;
  public Integer get_wpid2() {
    return wpid2;
  }
  public void set_wpid2(Integer wpid2) {
    this.wpid2 = wpid2;
  }
  public QueryResult with_wpid2(Integer wpid2) {
    this.wpid2 = wpid2;
    return this;
  }
  private Integer wpidstate;
  public Integer get_wpidstate() {
    return wpidstate;
  }
  public void set_wpidstate(Integer wpidstate) {
    this.wpidstate = wpidstate;
  }
  public QueryResult with_wpidstate(Integer wpidstate) {
    this.wpidstate = wpidstate;
    return this;
  }
  private String Wdis;
  public String get_Wdis() {
    return Wdis;
  }
  public void set_Wdis(String Wdis) {
    this.Wdis = Wdis;
  }
  public QueryResult with_Wdis(String Wdis) {
    this.Wdis = Wdis;
    return this;
  }
  private String WReadMe;
  public String get_WReadMe() {
    return WReadMe;
  }
  public void set_WReadMe(String WReadMe) {
    this.WReadMe = WReadMe;
  }
  public QueryResult with_WReadMe(String WReadMe) {
    this.WReadMe = WReadMe;
    return this;
  }
  private Integer Wstart;
  public Integer get_Wstart() {
    return Wstart;
  }
  public void set_Wstart(Integer Wstart) {
    this.Wstart = Wstart;
  }
  public QueryResult with_Wstart(Integer Wstart) {
    this.Wstart = Wstart;
    return this;
  }
  private String Wpack;
  public String get_Wpack() {
    return Wpack;
  }
  public void set_Wpack(String Wpack) {
    this.Wpack = Wpack;
  }
  public QueryResult with_Wpack(String Wpack) {
    this.Wpack = Wpack;
    return this;
  }
  private String Wweight;
  public String get_Wweight() {
    return Wweight;
  }
  public void set_Wweight(String Wweight) {
    this.Wweight = Wweight;
  }
  public QueryResult with_Wweight(String Wweight) {
    this.Wweight = Wweight;
    return this;
  }
  private String Wpostage;
  public String get_Wpostage() {
    return Wpostage;
  }
  public void set_Wpostage(String Wpostage) {
    this.Wpostage = Wpostage;
  }
  public QueryResult with_Wpostage(String Wpostage) {
    this.Wpostage = Wpostage;
    return this;
  }
  private String Warea;
  public String get_Warea() {
    return Warea;
  }
  public void set_Warea(String Warea) {
    this.Warea = Warea;
  }
  public QueryResult with_Warea(String Warea) {
    this.Warea = Warea;
    return this;
  }
  private String Wfacturer;
  public String get_Wfacturer() {
    return Wfacturer;
  }
  public void set_Wfacturer(String Wfacturer) {
    this.Wfacturer = Wfacturer;
  }
  public QueryResult with_Wfacturer(String Wfacturer) {
    this.Wfacturer = Wfacturer;
    return this;
  }
  private java.math.BigDecimal WMaprice;
  public java.math.BigDecimal get_WMaprice() {
    return WMaprice;
  }
  public void set_WMaprice(java.math.BigDecimal WMaprice) {
    this.WMaprice = WMaprice;
  }
  public QueryResult with_WMaprice(java.math.BigDecimal WMaprice) {
    this.WMaprice = WMaprice;
    return this;
  }
  private java.math.BigDecimal WMeprice;
  public java.math.BigDecimal get_WMeprice() {
    return WMeprice;
  }
  public void set_WMeprice(java.math.BigDecimal WMeprice) {
    this.WMeprice = WMeprice;
  }
  public QueryResult with_WMeprice(java.math.BigDecimal WMeprice) {
    this.WMeprice = WMeprice;
    return this;
  }
  private Integer WlkNum;
  public Integer get_WlkNum() {
    return WlkNum;
  }
  public void set_WlkNum(Integer WlkNum) {
    this.WlkNum = WlkNum;
  }
  public QueryResult with_WlkNum(Integer WlkNum) {
    this.WlkNum = WlkNum;
    return this;
  }
  private Integer WbuNum;
  public Integer get_WbuNum() {
    return WbuNum;
  }
  public void set_WbuNum(Integer WbuNum) {
    this.WbuNum = WbuNum;
  }
  public QueryResult with_WbuNum(Integer WbuNum) {
    this.WbuNum = WbuNum;
    return this;
  }
  private String WSmimgName;
  public String get_WSmimgName() {
    return WSmimgName;
  }
  public void set_WSmimgName(String WSmimgName) {
    this.WSmimgName = WSmimgName;
  }
  public QueryResult with_WSmimgName(String WSmimgName) {
    this.WSmimgName = WSmimgName;
    return this;
  }
  private String WSmimgPath;
  public String get_WSmimgPath() {
    return WSmimgPath;
  }
  public void set_WSmimgPath(String WSmimgPath) {
    this.WSmimgPath = WSmimgPath;
  }
  public QueryResult with_WSmimgPath(String WSmimgPath) {
    this.WSmimgPath = WSmimgPath;
    return this;
  }
  private java.sql.Timestamp WinsDate;
  public java.sql.Timestamp get_WinsDate() {
    return WinsDate;
  }
  public void set_WinsDate(java.sql.Timestamp WinsDate) {
    this.WinsDate = WinsDate;
  }
  public QueryResult with_WinsDate(java.sql.Timestamp WinsDate) {
    this.WinsDate = WinsDate;
    return this;
  }
  private java.sql.Timestamp WUpDate;
  public java.sql.Timestamp get_WUpDate() {
    return WUpDate;
  }
  public void set_WUpDate(java.sql.Timestamp WUpDate) {
    this.WUpDate = WUpDate;
  }
  public QueryResult with_WUpDate(java.sql.Timestamp WUpDate) {
    this.WUpDate = WUpDate;
    return this;
  }
  private String WinsPerson;
  public String get_WinsPerson() {
    return WinsPerson;
  }
  public void set_WinsPerson(String WinsPerson) {
    this.WinsPerson = WinsPerson;
  }
  public QueryResult with_WinsPerson(String WinsPerson) {
    this.WinsPerson = WinsPerson;
    return this;
  }
  private String WupPerson;
  public String get_WupPerson() {
    return WupPerson;
  }
  public void set_WupPerson(String WupPerson) {
    this.WupPerson = WupPerson;
  }
  public QueryResult with_WupPerson(String WupPerson) {
    this.WupPerson = WupPerson;
    return this;
  }
  private Integer Wyn;
  public Integer get_Wyn() {
    return Wyn;
  }
  public void set_Wyn(Integer Wyn) {
    this.Wyn = Wyn;
  }
  public QueryResult with_Wyn(Integer Wyn) {
    this.Wyn = Wyn;
    return this;
  }
  private Integer Wst;
  public Integer get_Wst() {
    return Wst;
  }
  public void set_Wst(Integer Wst) {
    this.Wst = Wst;
  }
  public QueryResult with_Wst(Integer Wst) {
    this.Wst = Wst;
    return this;
  }
  private String Weval;
  public String get_Weval() {
    return Weval;
  }
  public void set_Weval(String Weval) {
    this.Weval = Weval;
  }
  public QueryResult with_Weval(String Weval) {
    this.Weval = Weval;
    return this;
  }
  private String Wserve;
  public String get_Wserve() {
    return Wserve;
  }
  public void set_Wserve(String Wserve) {
    this.Wserve = Wserve;
  }
  public QueryResult with_Wserve(String Wserve) {
    this.Wserve = Wserve;
    return this;
  }
  private Integer autoid;
  public Integer get_autoid() {
    return autoid;
  }
  public void set_autoid(Integer autoid) {
    this.autoid = autoid;
  }
  public QueryResult with_autoid(Integer autoid) {
    this.autoid = autoid;
    return this;
  }
  private String Wreprice;
  public String get_Wreprice() {
    return Wreprice;
  }
  public void set_Wreprice(String Wreprice) {
    this.Wreprice = Wreprice;
  }
  public QueryResult with_Wreprice(String Wreprice) {
    this.Wreprice = Wreprice;
    return this;
  }
  private String Wtshing;
  public String get_Wtshing() {
    return Wtshing;
  }
  public void set_Wtshing(String Wtshing) {
    this.Wtshing = Wtshing;
  }
  public QueryResult with_Wtshing(String Wtshing) {
    this.Wtshing = Wtshing;
    return this;
  }
  private String Wtshingrmark;
  public String get_Wtshingrmark() {
    return Wtshingrmark;
  }
  public void set_Wtshingrmark(String Wtshingrmark) {
    this.Wtshingrmark = Wtshingrmark;
  }
  public QueryResult with_Wtshingrmark(String Wtshingrmark) {
    this.Wtshingrmark = Wtshingrmark;
    return this;
  }
  private String zpsm;
  public String get_zpsm() {
    return zpsm;
  }
  public void set_zpsm(String zpsm) {
    this.zpsm = zpsm;
  }
  public QueryResult with_zpsm(String zpsm) {
    this.zpsm = zpsm;
    return this;
  }
  private String hcsm;
  public String get_hcsm() {
    return hcsm;
  }
  public void set_hcsm(String hcsm) {
    this.hcsm = hcsm;
  }
  public QueryResult with_hcsm(String hcsm) {
    this.hcsm = hcsm;
    return this;
  }
  private java.math.BigDecimal superprice;
  public java.math.BigDecimal get_superprice() {
    return superprice;
  }
  public void set_superprice(java.math.BigDecimal superprice) {
    this.superprice = superprice;
  }
  public QueryResult with_superprice(java.math.BigDecimal superprice) {
    this.superprice = superprice;
    return this;
  }
  private Integer wstate;
  public Integer get_wstate() {
    return wstate;
  }
  public void set_wstate(Integer wstate) {
    this.wstate = wstate;
  }
  public QueryResult with_wstate(Integer wstate) {
    this.wstate = wstate;
    return this;
  }
  private String superremark;
  public String get_superremark() {
    return superremark;
  }
  public void set_superremark(String superremark) {
    this.superremark = superremark;
  }
  public QueryResult with_superremark(String superremark) {
    this.superremark = superremark;
    return this;
  }
  private String shstore;
  public String get_shstore() {
    return shstore;
  }
  public void set_shstore(String shstore) {
    this.shstore = shstore;
  }
  public QueryResult with_shstore(String shstore) {
    this.shstore = shstore;
    return this;
  }
  private Integer jifen;
  public Integer get_jifen() {
    return jifen;
  }
  public void set_jifen(Integer jifen) {
    this.jifen = jifen;
  }
  public QueryResult with_jifen(Integer jifen) {
    this.jifen = jifen;
    return this;
  }
  private java.sql.Timestamp cut_price;
  public java.sql.Timestamp get_cut_price() {
    return cut_price;
  }
  public void set_cut_price(java.sql.Timestamp cut_price) {
    this.cut_price = cut_price;
  }
  public QueryResult with_cut_price(java.sql.Timestamp cut_price) {
    this.cut_price = cut_price;
    return this;
  }
  private Integer allnum;
  public Integer get_allnum() {
    return allnum;
  }
  public void set_allnum(Integer allnum) {
    this.allnum = allnum;
  }
  public QueryResult with_allnum(Integer allnum) {
    this.allnum = allnum;
    return this;
  }
  private java.sql.Timestamp adddate;
  public java.sql.Timestamp get_adddate() {
    return adddate;
  }
  public void set_adddate(java.sql.Timestamp adddate) {
    this.adddate = adddate;
  }
  public QueryResult with_adddate(java.sql.Timestamp adddate) {
    this.adddate = adddate;
    return this;
  }
  private String snid;
  public String get_snid() {
    return snid;
  }
  public void set_snid(String snid) {
    this.snid = snid;
  }
  public QueryResult with_snid(String snid) {
    this.snid = snid;
    return this;
  }
  private Integer grade;
  public Integer get_grade() {
    return grade;
  }
  public void set_grade(Integer grade) {
    this.grade = grade;
  }
  public QueryResult with_grade(Integer grade) {
    this.grade = grade;
    return this;
  }
  private String beique;
  public String get_beique() {
    return beique;
  }
  public void set_beique(String beique) {
    this.beique = beique;
  }
  public QueryResult with_beique(String beique) {
    this.beique = beique;
    return this;
  }
  private String gzque;
  public String get_gzque() {
    return gzque;
  }
  public void set_gzque(String gzque) {
    this.gzque = gzque;
  }
  public QueryResult with_gzque(String gzque) {
    this.gzque = gzque;
    return this;
  }
  private String shhque;
  public String get_shhque() {
    return shhque;
  }
  public void set_shhque(String shhque) {
    this.shhque = shhque;
  }
  public QueryResult with_shhque(String shhque) {
    this.shhque = shhque;
    return this;
  }
  private Integer caigou;
  public Integer get_caigou() {
    return caigou;
  }
  public void set_caigou(Integer caigou) {
    this.caigou = caigou;
  }
  public QueryResult with_caigou(Integer caigou) {
    this.caigou = caigou;
    return this;
  }
  private Integer ccity;
  public Integer get_ccity() {
    return ccity;
  }
  public void set_ccity(Integer ccity) {
    this.ccity = ccity;
  }
  public QueryResult with_ccity(Integer ccity) {
    this.ccity = ccity;
    return this;
  }
  private Integer cnumb;
  public Integer get_cnumb() {
    return cnumb;
  }
  public void set_cnumb(Integer cnumb) {
    this.cnumb = cnumb;
  }
  public QueryResult with_cnumb(Integer cnumb) {
    this.cnumb = cnumb;
    return this;
  }
  private String shangjia;
  public String get_shangjia() {
    return shangjia;
  }
  public void set_shangjia(String shangjia) {
    this.shangjia = shangjia;
  }
  public QueryResult with_shangjia(String shangjia) {
    this.shangjia = shangjia;
    return this;
  }
  private Integer showid;
  public Integer get_showid() {
    return showid;
  }
  public void set_showid(Integer showid) {
    this.showid = showid;
  }
  public QueryResult with_showid(Integer showid) {
    this.showid = showid;
    return this;
  }
  private String swkc;
  public String get_swkc() {
    return swkc;
  }
  public void set_swkc(String swkc) {
    this.swkc = swkc;
  }
  public QueryResult with_swkc(String swkc) {
    this.swkc = swkc;
    return this;
  }
  private String swrc;
  public String get_swrc() {
    return swrc;
  }
  public void set_swrc(String swrc) {
    this.swrc = swrc;
  }
  public QueryResult with_swrc(String swrc) {
    this.swrc = swrc;
    return this;
  }
  private String rcts;
  public String get_rcts() {
    return rcts;
  }
  public void set_rcts(String rcts) {
    this.rcts = rcts;
  }
  public QueryResult with_rcts(String rcts) {
    this.rcts = rcts;
    return this;
  }
  private String kcts;
  public String get_kcts() {
    return kcts;
  }
  public void set_kcts(String kcts) {
    this.kcts = kcts;
  }
  public QueryResult with_kcts(String kcts) {
    this.kcts = kcts;
    return this;
  }
  private Integer ps;
  public Integer get_ps() {
    return ps;
  }
  public void set_ps(Integer ps) {
    this.ps = ps;
  }
  public QueryResult with_ps(Integer ps) {
    this.ps = ps;
    return this;
  }
  private Integer dhkc;
  public Integer get_dhkc() {
    return dhkc;
  }
  public void set_dhkc(Integer dhkc) {
    this.dhkc = dhkc;
  }
  public QueryResult with_dhkc(Integer dhkc) {
    this.dhkc = dhkc;
    return this;
  }
  private Integer zgskc;
  public Integer get_zgskc() {
    return zgskc;
  }
  public void set_zgskc(Integer zgskc) {
    this.zgskc = zgskc;
  }
  public QueryResult with_zgskc(Integer zgskc) {
    this.zgskc = zgskc;
    return this;
  }
  private Integer shkc;
  public Integer get_shkc() {
    return shkc;
  }
  public void set_shkc(Integer shkc) {
    this.shkc = shkc;
  }
  public QueryResult with_shkc(Integer shkc) {
    this.shkc = shkc;
    return this;
  }
  private Integer shph;
  public Integer get_shph() {
    return shph;
  }
  public void set_shph(Integer shph) {
    this.shph = shph;
  }
  public QueryResult with_shph(Integer shph) {
    this.shph = shph;
    return this;
  }
  private Integer bjph;
  public Integer get_bjph() {
    return bjph;
  }
  public void set_bjph(Integer bjph) {
    this.bjph = bjph;
  }
  public QueryResult with_bjph(Integer bjph) {
    this.bjph = bjph;
    return this;
  }
  private Integer gzph;
  public Integer get_gzph() {
    return gzph;
  }
  public void set_gzph(Integer gzph) {
    this.gzph = gzph;
  }
  public QueryResult with_gzph(Integer gzph) {
    this.gzph = gzph;
    return this;
  }
  private Integer shx;
  public Integer get_shx() {
    return shx;
  }
  public void set_shx(Integer shx) {
    this.shx = shx;
  }
  public QueryResult with_shx(Integer shx) {
    this.shx = shx;
    return this;
  }
  private java.math.BigDecimal fprice;
  public java.math.BigDecimal get_fprice() {
    return fprice;
  }
  public void set_fprice(java.math.BigDecimal fprice) {
    this.fprice = fprice;
  }
  public QueryResult with_fprice(java.math.BigDecimal fprice) {
    this.fprice = fprice;
    return this;
  }
  private Integer shangg;
  public Integer get_shangg() {
    return shangg;
  }
  public void set_shangg(Integer shangg) {
    this.shangg = shangg;
  }
  public QueryResult with_shangg(Integer shangg) {
    this.shangg = shangg;
    return this;
  }
  private String rcts15;
  public String get_rcts15() {
    return rcts15;
  }
  public void set_rcts15(String rcts15) {
    this.rcts15 = rcts15;
  }
  public QueryResult with_rcts15(String rcts15) {
    this.rcts15 = rcts15;
    return this;
  }
  private String swrc15;
  public String get_swrc15() {
    return swrc15;
  }
  public void set_swrc15(String swrc15) {
    this.swrc15 = swrc15;
  }
  public QueryResult with_swrc15(String swrc15) {
    this.swrc15 = swrc15;
    return this;
  }
  private String proser;
  public String get_proser() {
    return proser;
  }
  public void set_proser(String proser) {
    this.proser = proser;
  }
  public QueryResult with_proser(String proser) {
    this.proser = proser;
    return this;
  }
  private String balimit;
  public String get_balimit() {
    return balimit;
  }
  public void set_balimit(String balimit) {
    this.balimit = balimit;
  }
  public QueryResult with_balimit(String balimit) {
    this.balimit = balimit;
    return this;
  }
  private Integer bjzd;
  public Integer get_bjzd() {
    return bjzd;
  }
  public void set_bjzd(Integer bjzd) {
    this.bjzd = bjzd;
  }
  public QueryResult with_bjzd(Integer bjzd) {
    this.bjzd = bjzd;
    return this;
  }
  private Integer gzzd;
  public Integer get_gzzd() {
    return gzzd;
  }
  public void set_gzzd(Integer gzzd) {
    this.gzzd = gzzd;
  }
  public QueryResult with_gzzd(Integer gzzd) {
    this.gzzd = gzzd;
    return this;
  }
  private Integer cdbk;
  public Integer get_cdbk() {
    return cdbk;
  }
  public void set_cdbk(Integer cdbk) {
    this.cdbk = cdbk;
  }
  public QueryResult with_cdbk(Integer cdbk) {
    this.cdbk = cdbk;
    return this;
  }
  private Integer cdzd;
  public Integer get_cdzd() {
    return cdzd;
  }
  public void set_cdzd(Integer cdzd) {
    this.cdzd = cdzd;
  }
  public QueryResult with_cdzd(Integer cdzd) {
    this.cdzd = cdzd;
    return this;
  }
  private String shef;
  public String get_shef() {
    return shef;
  }
  public void set_shef(String shef) {
    this.shef = shef;
  }
  public QueryResult with_shef(String shef) {
    this.shef = shef;
    return this;
  }
  private String cgcity;
  public String get_cgcity() {
    return cgcity;
  }
  public void set_cgcity(String cgcity) {
    this.cgcity = cgcity;
  }
  public QueryResult with_cgcity(String cgcity) {
    this.cgcity = cgcity;
    return this;
  }
  private Integer maxpurchqty;
  public Integer get_maxpurchqty() {
    return maxpurchqty;
  }
  public void set_maxpurchqty(Integer maxpurchqty) {
    this.maxpurchqty = maxpurchqty;
  }
  public QueryResult with_maxpurchqty(Integer maxpurchqty) {
    this.maxpurchqty = maxpurchqty;
    return this;
  }
  private Integer bjcg;
  public Integer get_bjcg() {
    return bjcg;
  }
  public void set_bjcg(Integer bjcg) {
    this.bjcg = bjcg;
  }
  public QueryResult with_bjcg(Integer bjcg) {
    this.bjcg = bjcg;
    return this;
  }
  private Integer shcg;
  public Integer get_shcg() {
    return shcg;
  }
  public void set_shcg(Integer shcg) {
    this.shcg = shcg;
  }
  public QueryResult with_shcg(Integer shcg) {
    this.shcg = shcg;
    return this;
  }
  private Integer gzcg;
  public Integer get_gzcg() {
    return gzcg;
  }
  public void set_gzcg(Integer gzcg) {
    this.gzcg = gzcg;
  }
  public QueryResult with_gzcg(Integer gzcg) {
    this.gzcg = gzcg;
    return this;
  }
  private String gzsnid;
  public String get_gzsnid() {
    return gzsnid;
  }
  public void set_gzsnid(String gzsnid) {
    this.gzsnid = gzsnid;
  }
  public QueryResult with_gzsnid(String gzsnid) {
    this.gzsnid = gzsnid;
    return this;
  }
  private String shsnid;
  public String get_shsnid() {
    return shsnid;
  }
  public void set_shsnid(String shsnid) {
    this.shsnid = shsnid;
  }
  public QueryResult with_shsnid(String shsnid) {
    this.shsnid = shsnid;
    return this;
  }
  private String cdsnid;
  public String get_cdsnid() {
    return cdsnid;
  }
  public void set_cdsnid(String cdsnid) {
    this.cdsnid = cdsnid;
  }
  public QueryResult with_cdsnid(String cdsnid) {
    this.cdsnid = cdsnid;
    return this;
  }
  private String imageurl;
  public String get_imageurl() {
    return imageurl;
  }
  public void set_imageurl(String imageurl) {
    this.imageurl = imageurl;
  }
  public QueryResult with_imageurl(String imageurl) {
    this.imageurl = imageurl;
    return this;
  }
  private String sku_id;
  public String get_sku_id() {
    return sku_id;
  }
  public void set_sku_id(String sku_id) {
    this.sku_id = sku_id;
  }
  public QueryResult with_sku_id(String sku_id) {
    this.sku_id = sku_id;
    return this;
  }
  private Integer sale;
  public Integer get_sale() {
    return sale;
  }
  public void set_sale(Integer sale) {
    this.sale = sale;
  }
  public QueryResult with_sale(Integer sale) {
    this.sale = sale;
    return this;
  }
  private String waretitle;
  public String get_waretitle() {
    return waretitle;
  }
  public void set_waretitle(String waretitle) {
    this.waretitle = waretitle;
  }
  public QueryResult with_waretitle(String waretitle) {
    this.waretitle = waretitle;
    return this;
  }
  private Integer bjstock;
  public Integer get_bjstock() {
    return bjstock;
  }
  public void set_bjstock(Integer bjstock) {
    this.bjstock = bjstock;
  }
  public QueryResult with_bjstock(Integer bjstock) {
    this.bjstock = bjstock;
    return this;
  }
  private Integer shstock;
  public Integer get_shstock() {
    return shstock;
  }
  public void set_shstock(Integer shstock) {
    this.shstock = shstock;
  }
  public QueryResult with_shstock(Integer shstock) {
    this.shstock = shstock;
    return this;
  }
  private Integer gzstock;
  public Integer get_gzstock() {
    return gzstock;
  }
  public void set_gzstock(Integer gzstock) {
    this.gzstock = gzstock;
  }
  public QueryResult with_gzstock(Integer gzstock) {
    this.gzstock = gzstock;
    return this;
  }
  private Integer bjdays;
  public Integer get_bjdays() {
    return bjdays;
  }
  public void set_bjdays(Integer bjdays) {
    this.bjdays = bjdays;
  }
  public QueryResult with_bjdays(Integer bjdays) {
    this.bjdays = bjdays;
    return this;
  }
  private Integer gzdays;
  public Integer get_gzdays() {
    return gzdays;
  }
  public void set_gzdays(Integer gzdays) {
    this.gzdays = gzdays;
  }
  public QueryResult with_gzdays(Integer gzdays) {
    this.gzdays = gzdays;
    return this;
  }
  private Integer shdays;
  public Integer get_shdays() {
    return shdays;
  }
  public void set_shdays(Integer shdays) {
    this.shdays = shdays;
  }
  public QueryResult with_shdays(Integer shdays) {
    this.shdays = shdays;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.Wid == null ? that.Wid == null : this.Wid.equals(that.Wid));
    equal = equal && (this.wareid == null ? that.wareid == null : this.wareid.equals(that.wareid));
    equal = equal && (this.warejia == null ? that.warejia == null : this.warejia.equals(that.warejia));
    equal = equal && (this.daima == null ? that.daima == null : this.daima.equals(that.daima));
    equal = equal && (this.cpbm == null ? that.cpbm == null : this.cpbm.equals(that.cpbm));
    equal = equal && (this.dmbs == null ? that.dmbs == null : this.dmbs.equals(that.dmbs));
    equal = equal && (this.bilv == null ? that.bilv == null : this.bilv.equals(that.bilv));
    equal = equal && (this.zpbl == null ? that.zpbl == null : this.zpbl.equals(that.zpbl));
    equal = equal && (this.WStatus == null ? that.WStatus == null : this.WStatus.equals(that.WStatus));
    equal = equal && (this.gzstatus == null ? that.gzstatus == null : this.gzstatus.equals(that.gzstatus));
    equal = equal && (this.Wname == null ? that.Wname == null : this.Wname.equals(that.Wname));
    equal = equal && (this.WPid == null ? that.WPid == null : this.WPid.equals(that.WPid));
    equal = equal && (this.wpid2 == null ? that.wpid2 == null : this.wpid2.equals(that.wpid2));
    equal = equal && (this.wpidstate == null ? that.wpidstate == null : this.wpidstate.equals(that.wpidstate));
    equal = equal && (this.Wdis == null ? that.Wdis == null : this.Wdis.equals(that.Wdis));
    equal = equal && (this.WReadMe == null ? that.WReadMe == null : this.WReadMe.equals(that.WReadMe));
    equal = equal && (this.Wstart == null ? that.Wstart == null : this.Wstart.equals(that.Wstart));
    equal = equal && (this.Wpack == null ? that.Wpack == null : this.Wpack.equals(that.Wpack));
    equal = equal && (this.Wweight == null ? that.Wweight == null : this.Wweight.equals(that.Wweight));
    equal = equal && (this.Wpostage == null ? that.Wpostage == null : this.Wpostage.equals(that.Wpostage));
    equal = equal && (this.Warea == null ? that.Warea == null : this.Warea.equals(that.Warea));
    equal = equal && (this.Wfacturer == null ? that.Wfacturer == null : this.Wfacturer.equals(that.Wfacturer));
    equal = equal && (this.WMaprice == null ? that.WMaprice == null : this.WMaprice.equals(that.WMaprice));
    equal = equal && (this.WMeprice == null ? that.WMeprice == null : this.WMeprice.equals(that.WMeprice));
    equal = equal && (this.WlkNum == null ? that.WlkNum == null : this.WlkNum.equals(that.WlkNum));
    equal = equal && (this.WbuNum == null ? that.WbuNum == null : this.WbuNum.equals(that.WbuNum));
    equal = equal && (this.WSmimgName == null ? that.WSmimgName == null : this.WSmimgName.equals(that.WSmimgName));
    equal = equal && (this.WSmimgPath == null ? that.WSmimgPath == null : this.WSmimgPath.equals(that.WSmimgPath));
    equal = equal && (this.WinsDate == null ? that.WinsDate == null : this.WinsDate.equals(that.WinsDate));
    equal = equal && (this.WUpDate == null ? that.WUpDate == null : this.WUpDate.equals(that.WUpDate));
    equal = equal && (this.WinsPerson == null ? that.WinsPerson == null : this.WinsPerson.equals(that.WinsPerson));
    equal = equal && (this.WupPerson == null ? that.WupPerson == null : this.WupPerson.equals(that.WupPerson));
    equal = equal && (this.Wyn == null ? that.Wyn == null : this.Wyn.equals(that.Wyn));
    equal = equal && (this.Wst == null ? that.Wst == null : this.Wst.equals(that.Wst));
    equal = equal && (this.Weval == null ? that.Weval == null : this.Weval.equals(that.Weval));
    equal = equal && (this.Wserve == null ? that.Wserve == null : this.Wserve.equals(that.Wserve));
    equal = equal && (this.autoid == null ? that.autoid == null : this.autoid.equals(that.autoid));
    equal = equal && (this.Wreprice == null ? that.Wreprice == null : this.Wreprice.equals(that.Wreprice));
    equal = equal && (this.Wtshing == null ? that.Wtshing == null : this.Wtshing.equals(that.Wtshing));
    equal = equal && (this.Wtshingrmark == null ? that.Wtshingrmark == null : this.Wtshingrmark.equals(that.Wtshingrmark));
    equal = equal && (this.zpsm == null ? that.zpsm == null : this.zpsm.equals(that.zpsm));
    equal = equal && (this.hcsm == null ? that.hcsm == null : this.hcsm.equals(that.hcsm));
    equal = equal && (this.superprice == null ? that.superprice == null : this.superprice.equals(that.superprice));
    equal = equal && (this.wstate == null ? that.wstate == null : this.wstate.equals(that.wstate));
    equal = equal && (this.superremark == null ? that.superremark == null : this.superremark.equals(that.superremark));
    equal = equal && (this.shstore == null ? that.shstore == null : this.shstore.equals(that.shstore));
    equal = equal && (this.jifen == null ? that.jifen == null : this.jifen.equals(that.jifen));
    equal = equal && (this.cut_price == null ? that.cut_price == null : this.cut_price.equals(that.cut_price));
    equal = equal && (this.allnum == null ? that.allnum == null : this.allnum.equals(that.allnum));
    equal = equal && (this.adddate == null ? that.adddate == null : this.adddate.equals(that.adddate));
    equal = equal && (this.snid == null ? that.snid == null : this.snid.equals(that.snid));
    equal = equal && (this.grade == null ? that.grade == null : this.grade.equals(that.grade));
    equal = equal && (this.beique == null ? that.beique == null : this.beique.equals(that.beique));
    equal = equal && (this.gzque == null ? that.gzque == null : this.gzque.equals(that.gzque));
    equal = equal && (this.shhque == null ? that.shhque == null : this.shhque.equals(that.shhque));
    equal = equal && (this.caigou == null ? that.caigou == null : this.caigou.equals(that.caigou));
    equal = equal && (this.ccity == null ? that.ccity == null : this.ccity.equals(that.ccity));
    equal = equal && (this.cnumb == null ? that.cnumb == null : this.cnumb.equals(that.cnumb));
    equal = equal && (this.shangjia == null ? that.shangjia == null : this.shangjia.equals(that.shangjia));
    equal = equal && (this.showid == null ? that.showid == null : this.showid.equals(that.showid));
    equal = equal && (this.swkc == null ? that.swkc == null : this.swkc.equals(that.swkc));
    equal = equal && (this.swrc == null ? that.swrc == null : this.swrc.equals(that.swrc));
    equal = equal && (this.rcts == null ? that.rcts == null : this.rcts.equals(that.rcts));
    equal = equal && (this.kcts == null ? that.kcts == null : this.kcts.equals(that.kcts));
    equal = equal && (this.ps == null ? that.ps == null : this.ps.equals(that.ps));
    equal = equal && (this.dhkc == null ? that.dhkc == null : this.dhkc.equals(that.dhkc));
    equal = equal && (this.zgskc == null ? that.zgskc == null : this.zgskc.equals(that.zgskc));
    equal = equal && (this.shkc == null ? that.shkc == null : this.shkc.equals(that.shkc));
    equal = equal && (this.shph == null ? that.shph == null : this.shph.equals(that.shph));
    equal = equal && (this.bjph == null ? that.bjph == null : this.bjph.equals(that.bjph));
    equal = equal && (this.gzph == null ? that.gzph == null : this.gzph.equals(that.gzph));
    equal = equal && (this.shx == null ? that.shx == null : this.shx.equals(that.shx));
    equal = equal && (this.fprice == null ? that.fprice == null : this.fprice.equals(that.fprice));
    equal = equal && (this.shangg == null ? that.shangg == null : this.shangg.equals(that.shangg));
    equal = equal && (this.rcts15 == null ? that.rcts15 == null : this.rcts15.equals(that.rcts15));
    equal = equal && (this.swrc15 == null ? that.swrc15 == null : this.swrc15.equals(that.swrc15));
    equal = equal && (this.proser == null ? that.proser == null : this.proser.equals(that.proser));
    equal = equal && (this.balimit == null ? that.balimit == null : this.balimit.equals(that.balimit));
    equal = equal && (this.bjzd == null ? that.bjzd == null : this.bjzd.equals(that.bjzd));
    equal = equal && (this.gzzd == null ? that.gzzd == null : this.gzzd.equals(that.gzzd));
    equal = equal && (this.cdbk == null ? that.cdbk == null : this.cdbk.equals(that.cdbk));
    equal = equal && (this.cdzd == null ? that.cdzd == null : this.cdzd.equals(that.cdzd));
    equal = equal && (this.shef == null ? that.shef == null : this.shef.equals(that.shef));
    equal = equal && (this.cgcity == null ? that.cgcity == null : this.cgcity.equals(that.cgcity));
    equal = equal && (this.maxpurchqty == null ? that.maxpurchqty == null : this.maxpurchqty.equals(that.maxpurchqty));
    equal = equal && (this.bjcg == null ? that.bjcg == null : this.bjcg.equals(that.bjcg));
    equal = equal && (this.shcg == null ? that.shcg == null : this.shcg.equals(that.shcg));
    equal = equal && (this.gzcg == null ? that.gzcg == null : this.gzcg.equals(that.gzcg));
    equal = equal && (this.gzsnid == null ? that.gzsnid == null : this.gzsnid.equals(that.gzsnid));
    equal = equal && (this.shsnid == null ? that.shsnid == null : this.shsnid.equals(that.shsnid));
    equal = equal && (this.cdsnid == null ? that.cdsnid == null : this.cdsnid.equals(that.cdsnid));
    equal = equal && (this.imageurl == null ? that.imageurl == null : this.imageurl.equals(that.imageurl));
    equal = equal && (this.sku_id == null ? that.sku_id == null : this.sku_id.equals(that.sku_id));
    equal = equal && (this.sale == null ? that.sale == null : this.sale.equals(that.sale));
    equal = equal && (this.waretitle == null ? that.waretitle == null : this.waretitle.equals(that.waretitle));
    equal = equal && (this.bjstock == null ? that.bjstock == null : this.bjstock.equals(that.bjstock));
    equal = equal && (this.shstock == null ? that.shstock == null : this.shstock.equals(that.shstock));
    equal = equal && (this.gzstock == null ? that.gzstock == null : this.gzstock.equals(that.gzstock));
    equal = equal && (this.bjdays == null ? that.bjdays == null : this.bjdays.equals(that.bjdays));
    equal = equal && (this.gzdays == null ? that.gzdays == null : this.gzdays.equals(that.gzdays));
    equal = equal && (this.shdays == null ? that.shdays == null : this.shdays.equals(that.shdays));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Wid = JdbcWritableBridge.readString(1, __dbResults);
    this.wareid = JdbcWritableBridge.readString(2, __dbResults);
    this.warejia = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.daima = JdbcWritableBridge.readString(4, __dbResults);
    this.cpbm = JdbcWritableBridge.readString(5, __dbResults);
    this.dmbs = JdbcWritableBridge.readInteger(6, __dbResults);
    this.bilv = JdbcWritableBridge.readInteger(7, __dbResults);
    this.zpbl = JdbcWritableBridge.readInteger(8, __dbResults);
    this.WStatus = JdbcWritableBridge.readInteger(9, __dbResults);
    this.gzstatus = JdbcWritableBridge.readInteger(10, __dbResults);
    this.Wname = JdbcWritableBridge.readString(11, __dbResults);
    this.WPid = JdbcWritableBridge.readInteger(12, __dbResults);
    this.wpid2 = JdbcWritableBridge.readInteger(13, __dbResults);
    this.wpidstate = JdbcWritableBridge.readInteger(14, __dbResults);
    this.Wdis = JdbcWritableBridge.readString(15, __dbResults);
    this.WReadMe = JdbcWritableBridge.readString(16, __dbResults);
    this.Wstart = JdbcWritableBridge.readInteger(17, __dbResults);
    this.Wpack = JdbcWritableBridge.readString(18, __dbResults);
    this.Wweight = JdbcWritableBridge.readString(19, __dbResults);
    this.Wpostage = JdbcWritableBridge.readString(20, __dbResults);
    this.Warea = JdbcWritableBridge.readString(21, __dbResults);
    this.Wfacturer = JdbcWritableBridge.readString(22, __dbResults);
    this.WMaprice = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.WMeprice = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.WlkNum = JdbcWritableBridge.readInteger(25, __dbResults);
    this.WbuNum = JdbcWritableBridge.readInteger(26, __dbResults);
    this.WSmimgName = JdbcWritableBridge.readString(27, __dbResults);
    this.WSmimgPath = JdbcWritableBridge.readString(28, __dbResults);
    this.WinsDate = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.WUpDate = JdbcWritableBridge.readTimestamp(30, __dbResults);
    this.WinsPerson = JdbcWritableBridge.readString(31, __dbResults);
    this.WupPerson = JdbcWritableBridge.readString(32, __dbResults);
    this.Wyn = JdbcWritableBridge.readInteger(33, __dbResults);
    this.Wst = JdbcWritableBridge.readInteger(34, __dbResults);
    this.Weval = JdbcWritableBridge.readString(35, __dbResults);
    this.Wserve = JdbcWritableBridge.readString(36, __dbResults);
    this.autoid = JdbcWritableBridge.readInteger(37, __dbResults);
    this.Wreprice = JdbcWritableBridge.readString(38, __dbResults);
    this.Wtshing = JdbcWritableBridge.readString(39, __dbResults);
    this.Wtshingrmark = JdbcWritableBridge.readString(40, __dbResults);
    this.zpsm = JdbcWritableBridge.readString(41, __dbResults);
    this.hcsm = JdbcWritableBridge.readString(42, __dbResults);
    this.superprice = JdbcWritableBridge.readBigDecimal(43, __dbResults);
    this.wstate = JdbcWritableBridge.readInteger(44, __dbResults);
    this.superremark = JdbcWritableBridge.readString(45, __dbResults);
    this.shstore = JdbcWritableBridge.readString(46, __dbResults);
    this.jifen = JdbcWritableBridge.readInteger(47, __dbResults);
    this.cut_price = JdbcWritableBridge.readTimestamp(48, __dbResults);
    this.allnum = JdbcWritableBridge.readInteger(49, __dbResults);
    this.adddate = JdbcWritableBridge.readTimestamp(50, __dbResults);
    this.snid = JdbcWritableBridge.readString(51, __dbResults);
    this.grade = JdbcWritableBridge.readInteger(52, __dbResults);
    this.beique = JdbcWritableBridge.readString(53, __dbResults);
    this.gzque = JdbcWritableBridge.readString(54, __dbResults);
    this.shhque = JdbcWritableBridge.readString(55, __dbResults);
    this.caigou = JdbcWritableBridge.readInteger(56, __dbResults);
    this.ccity = JdbcWritableBridge.readInteger(57, __dbResults);
    this.cnumb = JdbcWritableBridge.readInteger(58, __dbResults);
    this.shangjia = JdbcWritableBridge.readString(59, __dbResults);
    this.showid = JdbcWritableBridge.readInteger(60, __dbResults);
    this.swkc = JdbcWritableBridge.readString(61, __dbResults);
    this.swrc = JdbcWritableBridge.readString(62, __dbResults);
    this.rcts = JdbcWritableBridge.readString(63, __dbResults);
    this.kcts = JdbcWritableBridge.readString(64, __dbResults);
    this.ps = JdbcWritableBridge.readInteger(65, __dbResults);
    this.dhkc = JdbcWritableBridge.readInteger(66, __dbResults);
    this.zgskc = JdbcWritableBridge.readInteger(67, __dbResults);
    this.shkc = JdbcWritableBridge.readInteger(68, __dbResults);
    this.shph = JdbcWritableBridge.readInteger(69, __dbResults);
    this.bjph = JdbcWritableBridge.readInteger(70, __dbResults);
    this.gzph = JdbcWritableBridge.readInteger(71, __dbResults);
    this.shx = JdbcWritableBridge.readInteger(72, __dbResults);
    this.fprice = JdbcWritableBridge.readBigDecimal(73, __dbResults);
    this.shangg = JdbcWritableBridge.readInteger(74, __dbResults);
    this.rcts15 = JdbcWritableBridge.readString(75, __dbResults);
    this.swrc15 = JdbcWritableBridge.readString(76, __dbResults);
    this.proser = JdbcWritableBridge.readString(77, __dbResults);
    this.balimit = JdbcWritableBridge.readString(78, __dbResults);
    this.bjzd = JdbcWritableBridge.readInteger(79, __dbResults);
    this.gzzd = JdbcWritableBridge.readInteger(80, __dbResults);
    this.cdbk = JdbcWritableBridge.readInteger(81, __dbResults);
    this.cdzd = JdbcWritableBridge.readInteger(82, __dbResults);
    this.shef = JdbcWritableBridge.readString(83, __dbResults);
    this.cgcity = JdbcWritableBridge.readString(84, __dbResults);
    this.maxpurchqty = JdbcWritableBridge.readInteger(85, __dbResults);
    this.bjcg = JdbcWritableBridge.readInteger(86, __dbResults);
    this.shcg = JdbcWritableBridge.readInteger(87, __dbResults);
    this.gzcg = JdbcWritableBridge.readInteger(88, __dbResults);
    this.gzsnid = JdbcWritableBridge.readString(89, __dbResults);
    this.shsnid = JdbcWritableBridge.readString(90, __dbResults);
    this.cdsnid = JdbcWritableBridge.readString(91, __dbResults);
    this.imageurl = JdbcWritableBridge.readString(92, __dbResults);
    this.sku_id = JdbcWritableBridge.readString(93, __dbResults);
    this.sale = JdbcWritableBridge.readInteger(94, __dbResults);
    this.waretitle = JdbcWritableBridge.readString(95, __dbResults);
    this.bjstock = JdbcWritableBridge.readInteger(96, __dbResults);
    this.shstock = JdbcWritableBridge.readInteger(97, __dbResults);
    this.gzstock = JdbcWritableBridge.readInteger(98, __dbResults);
    this.bjdays = JdbcWritableBridge.readInteger(99, __dbResults);
    this.gzdays = JdbcWritableBridge.readInteger(100, __dbResults);
    this.shdays = JdbcWritableBridge.readInteger(101, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(Wid, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(wareid, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(warejia, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(daima, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cpbm, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(dmbs, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(bilv, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(zpbl, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(WStatus, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(gzstatus, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Wname, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(WPid, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(wpid2, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(wpidstate, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Wdis, 15 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(WReadMe, 16 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(Wstart, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Wpack, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Wweight, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Wpostage, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Warea, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Wfacturer, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WMaprice, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(WMeprice, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(WlkNum, 25 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(WbuNum, 26 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(WSmimgName, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(WSmimgPath, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WinsDate, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(WUpDate, 30 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(WinsPerson, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(WupPerson, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Wyn, 33 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Wst, 34 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Weval, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Wserve, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(autoid, 37 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Wreprice, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Wtshing, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Wtshingrmark, 40 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(zpsm, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hcsm, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(superprice, 43 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(wstate, 44 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(superremark, 45 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(shstore, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(jifen, 47 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(cut_price, 48 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(allnum, 49 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(adddate, 50 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(snid, 51 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(grade, 52 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(beique, 53 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(gzque, 54 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(shhque, 55 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(caigou, 56 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ccity, 57 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(cnumb, 58 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(shangjia, 59 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(showid, 60 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(swkc, 61 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(swrc, 62 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(rcts, 63 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(kcts, 64 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeInteger(ps, 65 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(dhkc, 66 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(zgskc, 67 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(shkc, 68 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(shph, 69 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(bjph, 70 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(gzph, 71 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(shx, 72 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fprice, 73 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(shangg, 74 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(rcts15, 75 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(swrc15, 76 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(proser, 77 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(balimit, 78 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(bjzd, 79 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(gzzd, 80 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(cdbk, 81 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(cdzd, 82 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(shef, 83 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cgcity, 84 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(maxpurchqty, 85 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(bjcg, 86 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(shcg, 87 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(gzcg, 88 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(gzsnid, 89 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(shsnid, 90 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cdsnid, 91 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(imageurl, 92 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sku_id, 93 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(sale, 94 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(waretitle, 95 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(bjstock, 96 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(shstock, 97 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(gzstock, 98 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(bjdays, 99 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(gzdays, 100 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(shdays, 101 + __off, 4, __dbStmt);
    return 101;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Wid = null;
    } else {
    this.Wid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.wareid = null;
    } else {
    this.wareid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.warejia = null;
    } else {
    this.warejia = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.daima = null;
    } else {
    this.daima = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cpbm = null;
    } else {
    this.cpbm = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.dmbs = null;
    } else {
    this.dmbs = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.bilv = null;
    } else {
    this.bilv = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.zpbl = null;
    } else {
    this.zpbl = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.WStatus = null;
    } else {
    this.WStatus = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.gzstatus = null;
    } else {
    this.gzstatus = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Wname = null;
    } else {
    this.Wname = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WPid = null;
    } else {
    this.WPid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.wpid2 = null;
    } else {
    this.wpid2 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.wpidstate = null;
    } else {
    this.wpidstate = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Wdis = null;
    } else {
    this.Wdis = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WReadMe = null;
    } else {
    this.WReadMe = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Wstart = null;
    } else {
    this.Wstart = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Wpack = null;
    } else {
    this.Wpack = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Wweight = null;
    } else {
    this.Wweight = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Wpostage = null;
    } else {
    this.Wpostage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Warea = null;
    } else {
    this.Warea = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Wfacturer = null;
    } else {
    this.Wfacturer = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WMaprice = null;
    } else {
    this.WMaprice = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WMeprice = null;
    } else {
    this.WMeprice = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WlkNum = null;
    } else {
    this.WlkNum = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.WbuNum = null;
    } else {
    this.WbuNum = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.WSmimgName = null;
    } else {
    this.WSmimgName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WSmimgPath = null;
    } else {
    this.WSmimgPath = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WinsDate = null;
    } else {
    this.WinsDate = new Timestamp(__dataIn.readLong());
    this.WinsDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.WUpDate = null;
    } else {
    this.WUpDate = new Timestamp(__dataIn.readLong());
    this.WUpDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.WinsPerson = null;
    } else {
    this.WinsPerson = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.WupPerson = null;
    } else {
    this.WupPerson = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Wyn = null;
    } else {
    this.Wyn = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Wst = null;
    } else {
    this.Wst = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Weval = null;
    } else {
    this.Weval = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Wserve = null;
    } else {
    this.Wserve = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.autoid = null;
    } else {
    this.autoid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Wreprice = null;
    } else {
    this.Wreprice = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Wtshing = null;
    } else {
    this.Wtshing = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Wtshingrmark = null;
    } else {
    this.Wtshingrmark = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.zpsm = null;
    } else {
    this.zpsm = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hcsm = null;
    } else {
    this.hcsm = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.superprice = null;
    } else {
    this.superprice = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.wstate = null;
    } else {
    this.wstate = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.superremark = null;
    } else {
    this.superremark = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.shstore = null;
    } else {
    this.shstore = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.jifen = null;
    } else {
    this.jifen = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cut_price = null;
    } else {
    this.cut_price = new Timestamp(__dataIn.readLong());
    this.cut_price.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.allnum = null;
    } else {
    this.allnum = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.adddate = null;
    } else {
    this.adddate = new Timestamp(__dataIn.readLong());
    this.adddate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.snid = null;
    } else {
    this.snid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.grade = null;
    } else {
    this.grade = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.beique = null;
    } else {
    this.beique = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.gzque = null;
    } else {
    this.gzque = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.shhque = null;
    } else {
    this.shhque = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.caigou = null;
    } else {
    this.caigou = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ccity = null;
    } else {
    this.ccity = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cnumb = null;
    } else {
    this.cnumb = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.shangjia = null;
    } else {
    this.shangjia = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.showid = null;
    } else {
    this.showid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.swkc = null;
    } else {
    this.swkc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.swrc = null;
    } else {
    this.swrc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.rcts = null;
    } else {
    this.rcts = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.kcts = null;
    } else {
    this.kcts = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ps = null;
    } else {
    this.ps = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.dhkc = null;
    } else {
    this.dhkc = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.zgskc = null;
    } else {
    this.zgskc = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.shkc = null;
    } else {
    this.shkc = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.shph = null;
    } else {
    this.shph = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.bjph = null;
    } else {
    this.bjph = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.gzph = null;
    } else {
    this.gzph = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.shx = null;
    } else {
    this.shx = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fprice = null;
    } else {
    this.fprice = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.shangg = null;
    } else {
    this.shangg = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.rcts15 = null;
    } else {
    this.rcts15 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.swrc15 = null;
    } else {
    this.swrc15 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.proser = null;
    } else {
    this.proser = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.balimit = null;
    } else {
    this.balimit = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.bjzd = null;
    } else {
    this.bjzd = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.gzzd = null;
    } else {
    this.gzzd = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cdbk = null;
    } else {
    this.cdbk = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cdzd = null;
    } else {
    this.cdzd = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.shef = null;
    } else {
    this.shef = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cgcity = null;
    } else {
    this.cgcity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.maxpurchqty = null;
    } else {
    this.maxpurchqty = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.bjcg = null;
    } else {
    this.bjcg = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.shcg = null;
    } else {
    this.shcg = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.gzcg = null;
    } else {
    this.gzcg = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.gzsnid = null;
    } else {
    this.gzsnid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.shsnid = null;
    } else {
    this.shsnid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cdsnid = null;
    } else {
    this.cdsnid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.imageurl = null;
    } else {
    this.imageurl = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sku_id = null;
    } else {
    this.sku_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sale = null;
    } else {
    this.sale = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.waretitle = null;
    } else {
    this.waretitle = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.bjstock = null;
    } else {
    this.bjstock = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.shstock = null;
    } else {
    this.shstock = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.gzstock = null;
    } else {
    this.gzstock = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.bjdays = null;
    } else {
    this.bjdays = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.gzdays = null;
    } else {
    this.gzdays = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.shdays = null;
    } else {
    this.shdays = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.Wid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Wid);
    }
    if (null == this.wareid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, wareid);
    }
    if (null == this.warejia) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.warejia, __dataOut);
    }
    if (null == this.daima) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, daima);
    }
    if (null == this.cpbm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cpbm);
    }
    if (null == this.dmbs) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.dmbs);
    }
    if (null == this.bilv) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.bilv);
    }
    if (null == this.zpbl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.zpbl);
    }
    if (null == this.WStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.WStatus);
    }
    if (null == this.gzstatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.gzstatus);
    }
    if (null == this.Wname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Wname);
    }
    if (null == this.WPid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.WPid);
    }
    if (null == this.wpid2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.wpid2);
    }
    if (null == this.wpidstate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.wpidstate);
    }
    if (null == this.Wdis) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Wdis);
    }
    if (null == this.WReadMe) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WReadMe);
    }
    if (null == this.Wstart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Wstart);
    }
    if (null == this.Wpack) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Wpack);
    }
    if (null == this.Wweight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Wweight);
    }
    if (null == this.Wpostage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Wpostage);
    }
    if (null == this.Warea) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Warea);
    }
    if (null == this.Wfacturer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Wfacturer);
    }
    if (null == this.WMaprice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WMaprice, __dataOut);
    }
    if (null == this.WMeprice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.WMeprice, __dataOut);
    }
    if (null == this.WlkNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.WlkNum);
    }
    if (null == this.WbuNum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.WbuNum);
    }
    if (null == this.WSmimgName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WSmimgName);
    }
    if (null == this.WSmimgPath) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WSmimgPath);
    }
    if (null == this.WinsDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WinsDate.getTime());
    __dataOut.writeInt(this.WinsDate.getNanos());
    }
    if (null == this.WUpDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.WUpDate.getTime());
    __dataOut.writeInt(this.WUpDate.getNanos());
    }
    if (null == this.WinsPerson) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WinsPerson);
    }
    if (null == this.WupPerson) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, WupPerson);
    }
    if (null == this.Wyn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Wyn);
    }
    if (null == this.Wst) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Wst);
    }
    if (null == this.Weval) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Weval);
    }
    if (null == this.Wserve) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Wserve);
    }
    if (null == this.autoid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.autoid);
    }
    if (null == this.Wreprice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Wreprice);
    }
    if (null == this.Wtshing) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Wtshing);
    }
    if (null == this.Wtshingrmark) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Wtshingrmark);
    }
    if (null == this.zpsm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, zpsm);
    }
    if (null == this.hcsm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hcsm);
    }
    if (null == this.superprice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.superprice, __dataOut);
    }
    if (null == this.wstate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.wstate);
    }
    if (null == this.superremark) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, superremark);
    }
    if (null == this.shstore) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, shstore);
    }
    if (null == this.jifen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.jifen);
    }
    if (null == this.cut_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.cut_price.getTime());
    __dataOut.writeInt(this.cut_price.getNanos());
    }
    if (null == this.allnum) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.allnum);
    }
    if (null == this.adddate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.adddate.getTime());
    __dataOut.writeInt(this.adddate.getNanos());
    }
    if (null == this.snid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, snid);
    }
    if (null == this.grade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.grade);
    }
    if (null == this.beique) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, beique);
    }
    if (null == this.gzque) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, gzque);
    }
    if (null == this.shhque) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, shhque);
    }
    if (null == this.caigou) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.caigou);
    }
    if (null == this.ccity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ccity);
    }
    if (null == this.cnumb) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cnumb);
    }
    if (null == this.shangjia) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, shangjia);
    }
    if (null == this.showid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.showid);
    }
    if (null == this.swkc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, swkc);
    }
    if (null == this.swrc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, swrc);
    }
    if (null == this.rcts) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, rcts);
    }
    if (null == this.kcts) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, kcts);
    }
    if (null == this.ps) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ps);
    }
    if (null == this.dhkc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.dhkc);
    }
    if (null == this.zgskc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.zgskc);
    }
    if (null == this.shkc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.shkc);
    }
    if (null == this.shph) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.shph);
    }
    if (null == this.bjph) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.bjph);
    }
    if (null == this.gzph) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.gzph);
    }
    if (null == this.shx) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.shx);
    }
    if (null == this.fprice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.fprice, __dataOut);
    }
    if (null == this.shangg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.shangg);
    }
    if (null == this.rcts15) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, rcts15);
    }
    if (null == this.swrc15) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, swrc15);
    }
    if (null == this.proser) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, proser);
    }
    if (null == this.balimit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, balimit);
    }
    if (null == this.bjzd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.bjzd);
    }
    if (null == this.gzzd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.gzzd);
    }
    if (null == this.cdbk) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cdbk);
    }
    if (null == this.cdzd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cdzd);
    }
    if (null == this.shef) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, shef);
    }
    if (null == this.cgcity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cgcity);
    }
    if (null == this.maxpurchqty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.maxpurchqty);
    }
    if (null == this.bjcg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.bjcg);
    }
    if (null == this.shcg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.shcg);
    }
    if (null == this.gzcg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.gzcg);
    }
    if (null == this.gzsnid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, gzsnid);
    }
    if (null == this.shsnid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, shsnid);
    }
    if (null == this.cdsnid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cdsnid);
    }
    if (null == this.imageurl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, imageurl);
    }
    if (null == this.sku_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sku_id);
    }
    if (null == this.sale) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.sale);
    }
    if (null == this.waretitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, waretitle);
    }
    if (null == this.bjstock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.bjstock);
    }
    if (null == this.shstock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.shstock);
    }
    if (null == this.gzstock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.gzstock);
    }
    if (null == this.bjdays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.bjdays);
    }
    if (null == this.gzdays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.gzdays);
    }
    if (null == this.shdays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.shdays);
    }
  }
  private final DelimiterSet __outputDelimiters = new DelimiterSet((char) 116, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(Wid==null?"null":Wid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wareid==null?"null":wareid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(warejia==null?"null":"" + warejia, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(daima==null?"null":daima, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cpbm==null?"null":cpbm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dmbs==null?"null":"" + dmbs, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bilv==null?"null":"" + bilv, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zpbl==null?"null":"" + zpbl, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WStatus==null?"null":"" + WStatus, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gzstatus==null?"null":"" + gzstatus, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Wname==null?"null":Wname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WPid==null?"null":"" + WPid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wpid2==null?"null":"" + wpid2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wpidstate==null?"null":"" + wpidstate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Wdis==null?"null":Wdis, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WReadMe==null?"null":WReadMe, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Wstart==null?"null":"" + Wstart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Wpack==null?"null":Wpack, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Wweight==null?"null":Wweight, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Wpostage==null?"null":Wpostage, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Warea==null?"null":Warea, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Wfacturer==null?"null":Wfacturer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WMaprice==null?"null":"" + WMaprice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WMeprice==null?"null":"" + WMeprice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WlkNum==null?"null":"" + WlkNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WbuNum==null?"null":"" + WbuNum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WSmimgName==null?"null":WSmimgName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WSmimgPath==null?"null":WSmimgPath, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WinsDate==null?"null":"" + WinsDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WUpDate==null?"null":"" + WUpDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WinsPerson==null?"null":WinsPerson, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WupPerson==null?"null":WupPerson, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Wyn==null?"null":"" + Wyn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Wst==null?"null":"" + Wst, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Weval==null?"null":Weval, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Wserve==null?"null":Wserve, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(autoid==null?"null":"" + autoid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Wreprice==null?"null":Wreprice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Wtshing==null?"null":Wtshing, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Wtshingrmark==null?"null":Wtshingrmark, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zpsm==null?"null":zpsm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hcsm==null?"null":hcsm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(superprice==null?"null":"" + superprice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wstate==null?"null":"" + wstate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(superremark==null?"null":superremark, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shstore==null?"null":shstore, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(jifen==null?"null":"" + jifen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cut_price==null?"null":"" + cut_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(allnum==null?"null":"" + allnum, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(adddate==null?"null":"" + adddate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(snid==null?"null":snid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(grade==null?"null":"" + grade, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(beique==null?"null":beique, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gzque==null?"null":gzque, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shhque==null?"null":shhque, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(caigou==null?"null":"" + caigou, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ccity==null?"null":"" + ccity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cnumb==null?"null":"" + cnumb, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shangjia==null?"null":shangjia, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(showid==null?"null":"" + showid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(swkc==null?"null":swkc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(swrc==null?"null":swrc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rcts==null?"null":rcts, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(kcts==null?"null":kcts, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ps==null?"null":"" + ps, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dhkc==null?"null":"" + dhkc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zgskc==null?"null":"" + zgskc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shkc==null?"null":"" + shkc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shph==null?"null":"" + shph, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bjph==null?"null":"" + bjph, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gzph==null?"null":"" + gzph, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shx==null?"null":"" + shx, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fprice==null?"null":"" + fprice, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shangg==null?"null":"" + shangg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rcts15==null?"null":rcts15, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(swrc15==null?"null":swrc15, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(proser==null?"null":proser, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(balimit==null?"null":balimit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bjzd==null?"null":"" + bjzd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gzzd==null?"null":"" + gzzd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cdbk==null?"null":"" + cdbk, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cdzd==null?"null":"" + cdzd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shef==null?"null":shef, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cgcity==null?"null":cgcity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(maxpurchqty==null?"null":"" + maxpurchqty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bjcg==null?"null":"" + bjcg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shcg==null?"null":"" + shcg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gzcg==null?"null":"" + gzcg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gzsnid==null?"null":gzsnid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shsnid==null?"null":shsnid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cdsnid==null?"null":cdsnid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(imageurl==null?"null":imageurl, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sku_id==null?"null":sku_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sale==null?"null":"" + sale, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(waretitle==null?"null":waretitle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bjstock==null?"null":"" + bjstock, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shstock==null?"null":"" + shstock, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gzstock==null?"null":"" + gzstock, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bjdays==null?"null":"" + bjdays, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gzdays==null?"null":"" + gzdays, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(shdays==null?"null":"" + shdays, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  private final DelimiterSet __inputDelimiters = new DelimiterSet((char) 116, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str;
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Wid = null; } else {
      this.Wid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.wareid = null; } else {
      this.wareid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.warejia = null; } else {
      this.warejia = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.daima = null; } else {
      this.daima = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cpbm = null; } else {
      this.cpbm = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dmbs = null; } else {
      this.dmbs = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bilv = null; } else {
      this.bilv = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.zpbl = null; } else {
      this.zpbl = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WStatus = null; } else {
      this.WStatus = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.gzstatus = null; } else {
      this.gzstatus = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Wname = null; } else {
      this.Wname = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WPid = null; } else {
      this.WPid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.wpid2 = null; } else {
      this.wpid2 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.wpidstate = null; } else {
      this.wpidstate = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Wdis = null; } else {
      this.Wdis = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WReadMe = null; } else {
      this.WReadMe = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Wstart = null; } else {
      this.Wstart = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Wpack = null; } else {
      this.Wpack = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Wweight = null; } else {
      this.Wweight = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Wpostage = null; } else {
      this.Wpostage = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Warea = null; } else {
      this.Warea = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Wfacturer = null; } else {
      this.Wfacturer = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WMaprice = null; } else {
      this.WMaprice = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WMeprice = null; } else {
      this.WMeprice = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WlkNum = null; } else {
      this.WlkNum = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WbuNum = null; } else {
      this.WbuNum = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WSmimgName = null; } else {
      this.WSmimgName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WSmimgPath = null; } else {
      this.WSmimgPath = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WinsDate = null; } else {
      this.WinsDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WUpDate = null; } else {
      this.WUpDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WinsPerson = null; } else {
      this.WinsPerson = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.WupPerson = null; } else {
      this.WupPerson = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Wyn = null; } else {
      this.Wyn = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Wst = null; } else {
      this.Wst = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Weval = null; } else {
      this.Weval = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Wserve = null; } else {
      this.Wserve = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.autoid = null; } else {
      this.autoid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Wreprice = null; } else {
      this.Wreprice = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Wtshing = null; } else {
      this.Wtshing = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Wtshingrmark = null; } else {
      this.Wtshingrmark = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.zpsm = null; } else {
      this.zpsm = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hcsm = null; } else {
      this.hcsm = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.superprice = null; } else {
      this.superprice = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.wstate = null; } else {
      this.wstate = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.superremark = null; } else {
      this.superremark = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.shstore = null; } else {
      this.shstore = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.jifen = null; } else {
      this.jifen = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cut_price = null; } else {
      this.cut_price = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.allnum = null; } else {
      this.allnum = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.adddate = null; } else {
      this.adddate = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.snid = null; } else {
      this.snid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.grade = null; } else {
      this.grade = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.beique = null; } else {
      this.beique = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.gzque = null; } else {
      this.gzque = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.shhque = null; } else {
      this.shhque = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.caigou = null; } else {
      this.caigou = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ccity = null; } else {
      this.ccity = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cnumb = null; } else {
      this.cnumb = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.shangjia = null; } else {
      this.shangjia = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.showid = null; } else {
      this.showid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.swkc = null; } else {
      this.swkc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.swrc = null; } else {
      this.swrc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.rcts = null; } else {
      this.rcts = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.kcts = null; } else {
      this.kcts = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ps = null; } else {
      this.ps = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dhkc = null; } else {
      this.dhkc = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.zgskc = null; } else {
      this.zgskc = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.shkc = null; } else {
      this.shkc = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.shph = null; } else {
      this.shph = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bjph = null; } else {
      this.bjph = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.gzph = null; } else {
      this.gzph = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.shx = null; } else {
      this.shx = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fprice = null; } else {
      this.fprice = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.shangg = null; } else {
      this.shangg = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.rcts15 = null; } else {
      this.rcts15 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.swrc15 = null; } else {
      this.swrc15 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.proser = null; } else {
      this.proser = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.balimit = null; } else {
      this.balimit = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bjzd = null; } else {
      this.bjzd = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.gzzd = null; } else {
      this.gzzd = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cdbk = null; } else {
      this.cdbk = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cdzd = null; } else {
      this.cdzd = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.shef = null; } else {
      this.shef = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cgcity = null; } else {
      this.cgcity = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.maxpurchqty = null; } else {
      this.maxpurchqty = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bjcg = null; } else {
      this.bjcg = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.shcg = null; } else {
      this.shcg = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.gzcg = null; } else {
      this.gzcg = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.gzsnid = null; } else {
      this.gzsnid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.shsnid = null; } else {
      this.shsnid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cdsnid = null; } else {
      this.cdsnid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.imageurl = null; } else {
      this.imageurl = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sku_id = null; } else {
      this.sku_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sale = null; } else {
      this.sale = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.waretitle = null; } else {
      this.waretitle = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bjstock = null; } else {
      this.bjstock = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.shstock = null; } else {
      this.shstock = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.gzstock = null; } else {
      this.gzstock = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bjdays = null; } else {
      this.bjdays = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.gzdays = null; } else {
      this.gzdays = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.shdays = null; } else {
      this.shdays = Integer.valueOf(__cur_str);
    }

  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    o.WinsDate = (o.WinsDate != null) ? (java.sql.Timestamp) o.WinsDate.clone() : null;
    o.WUpDate = (o.WUpDate != null) ? (java.sql.Timestamp) o.WUpDate.clone() : null;
    o.cut_price = (o.cut_price != null) ? (java.sql.Timestamp) o.cut_price.clone() : null;
    o.adddate = (o.adddate != null) ? (java.sql.Timestamp) o.adddate.clone() : null;
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("Wid", this.Wid);
    __sqoop$field_map.put("wareid", this.wareid);
    __sqoop$field_map.put("warejia", this.warejia);
    __sqoop$field_map.put("daima", this.daima);
    __sqoop$field_map.put("cpbm", this.cpbm);
    __sqoop$field_map.put("dmbs", this.dmbs);
    __sqoop$field_map.put("bilv", this.bilv);
    __sqoop$field_map.put("zpbl", this.zpbl);
    __sqoop$field_map.put("WStatus", this.WStatus);
    __sqoop$field_map.put("gzstatus", this.gzstatus);
    __sqoop$field_map.put("Wname", this.Wname);
    __sqoop$field_map.put("WPid", this.WPid);
    __sqoop$field_map.put("wpid2", this.wpid2);
    __sqoop$field_map.put("wpidstate", this.wpidstate);
    __sqoop$field_map.put("Wdis", this.Wdis);
    __sqoop$field_map.put("WReadMe", this.WReadMe);
    __sqoop$field_map.put("Wstart", this.Wstart);
    __sqoop$field_map.put("Wpack", this.Wpack);
    __sqoop$field_map.put("Wweight", this.Wweight);
    __sqoop$field_map.put("Wpostage", this.Wpostage);
    __sqoop$field_map.put("Warea", this.Warea);
    __sqoop$field_map.put("Wfacturer", this.Wfacturer);
    __sqoop$field_map.put("WMaprice", this.WMaprice);
    __sqoop$field_map.put("WMeprice", this.WMeprice);
    __sqoop$field_map.put("WlkNum", this.WlkNum);
    __sqoop$field_map.put("WbuNum", this.WbuNum);
    __sqoop$field_map.put("WSmimgName", this.WSmimgName);
    __sqoop$field_map.put("WSmimgPath", this.WSmimgPath);
    __sqoop$field_map.put("WinsDate", this.WinsDate);
    __sqoop$field_map.put("WUpDate", this.WUpDate);
    __sqoop$field_map.put("WinsPerson", this.WinsPerson);
    __sqoop$field_map.put("WupPerson", this.WupPerson);
    __sqoop$field_map.put("Wyn", this.Wyn);
    __sqoop$field_map.put("Wst", this.Wst);
    __sqoop$field_map.put("Weval", this.Weval);
    __sqoop$field_map.put("Wserve", this.Wserve);
    __sqoop$field_map.put("autoid", this.autoid);
    __sqoop$field_map.put("Wreprice", this.Wreprice);
    __sqoop$field_map.put("Wtshing", this.Wtshing);
    __sqoop$field_map.put("Wtshingrmark", this.Wtshingrmark);
    __sqoop$field_map.put("zpsm", this.zpsm);
    __sqoop$field_map.put("hcsm", this.hcsm);
    __sqoop$field_map.put("superprice", this.superprice);
    __sqoop$field_map.put("wstate", this.wstate);
    __sqoop$field_map.put("superremark", this.superremark);
    __sqoop$field_map.put("shstore", this.shstore);
    __sqoop$field_map.put("jifen", this.jifen);
    __sqoop$field_map.put("cut_price", this.cut_price);
    __sqoop$field_map.put("allnum", this.allnum);
    __sqoop$field_map.put("adddate", this.adddate);
    __sqoop$field_map.put("snid", this.snid);
    __sqoop$field_map.put("grade", this.grade);
    __sqoop$field_map.put("beique", this.beique);
    __sqoop$field_map.put("gzque", this.gzque);
    __sqoop$field_map.put("shhque", this.shhque);
    __sqoop$field_map.put("caigou", this.caigou);
    __sqoop$field_map.put("ccity", this.ccity);
    __sqoop$field_map.put("cnumb", this.cnumb);
    __sqoop$field_map.put("shangjia", this.shangjia);
    __sqoop$field_map.put("showid", this.showid);
    __sqoop$field_map.put("swkc", this.swkc);
    __sqoop$field_map.put("swrc", this.swrc);
    __sqoop$field_map.put("rcts", this.rcts);
    __sqoop$field_map.put("kcts", this.kcts);
    __sqoop$field_map.put("ps", this.ps);
    __sqoop$field_map.put("dhkc", this.dhkc);
    __sqoop$field_map.put("zgskc", this.zgskc);
    __sqoop$field_map.put("shkc", this.shkc);
    __sqoop$field_map.put("shph", this.shph);
    __sqoop$field_map.put("bjph", this.bjph);
    __sqoop$field_map.put("gzph", this.gzph);
    __sqoop$field_map.put("shx", this.shx);
    __sqoop$field_map.put("fprice", this.fprice);
    __sqoop$field_map.put("shangg", this.shangg);
    __sqoop$field_map.put("rcts15", this.rcts15);
    __sqoop$field_map.put("swrc15", this.swrc15);
    __sqoop$field_map.put("proser", this.proser);
    __sqoop$field_map.put("balimit", this.balimit);
    __sqoop$field_map.put("bjzd", this.bjzd);
    __sqoop$field_map.put("gzzd", this.gzzd);
    __sqoop$field_map.put("cdbk", this.cdbk);
    __sqoop$field_map.put("cdzd", this.cdzd);
    __sqoop$field_map.put("shef", this.shef);
    __sqoop$field_map.put("cgcity", this.cgcity);
    __sqoop$field_map.put("maxpurchqty", this.maxpurchqty);
    __sqoop$field_map.put("bjcg", this.bjcg);
    __sqoop$field_map.put("shcg", this.shcg);
    __sqoop$field_map.put("gzcg", this.gzcg);
    __sqoop$field_map.put("gzsnid", this.gzsnid);
    __sqoop$field_map.put("shsnid", this.shsnid);
    __sqoop$field_map.put("cdsnid", this.cdsnid);
    __sqoop$field_map.put("imageurl", this.imageurl);
    __sqoop$field_map.put("sku_id", this.sku_id);
    __sqoop$field_map.put("sale", this.sale);
    __sqoop$field_map.put("waretitle", this.waretitle);
    __sqoop$field_map.put("bjstock", this.bjstock);
    __sqoop$field_map.put("shstock", this.shstock);
    __sqoop$field_map.put("gzstock", this.gzstock);
    __sqoop$field_map.put("bjdays", this.bjdays);
    __sqoop$field_map.put("gzdays", this.gzdays);
    __sqoop$field_map.put("shdays", this.shdays);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("Wid".equals(__fieldName)) {
      this.Wid = (String) __fieldVal;
    }
    else    if ("wareid".equals(__fieldName)) {
      this.wareid = (String) __fieldVal;
    }
    else    if ("warejia".equals(__fieldName)) {
      this.warejia = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("daima".equals(__fieldName)) {
      this.daima = (String) __fieldVal;
    }
    else    if ("cpbm".equals(__fieldName)) {
      this.cpbm = (String) __fieldVal;
    }
    else    if ("dmbs".equals(__fieldName)) {
      this.dmbs = (Integer) __fieldVal;
    }
    else    if ("bilv".equals(__fieldName)) {
      this.bilv = (Integer) __fieldVal;
    }
    else    if ("zpbl".equals(__fieldName)) {
      this.zpbl = (Integer) __fieldVal;
    }
    else    if ("WStatus".equals(__fieldName)) {
      this.WStatus = (Integer) __fieldVal;
    }
    else    if ("gzstatus".equals(__fieldName)) {
      this.gzstatus = (Integer) __fieldVal;
    }
    else    if ("Wname".equals(__fieldName)) {
      this.Wname = (String) __fieldVal;
    }
    else    if ("WPid".equals(__fieldName)) {
      this.WPid = (Integer) __fieldVal;
    }
    else    if ("wpid2".equals(__fieldName)) {
      this.wpid2 = (Integer) __fieldVal;
    }
    else    if ("wpidstate".equals(__fieldName)) {
      this.wpidstate = (Integer) __fieldVal;
    }
    else    if ("Wdis".equals(__fieldName)) {
      this.Wdis = (String) __fieldVal;
    }
    else    if ("WReadMe".equals(__fieldName)) {
      this.WReadMe = (String) __fieldVal;
    }
    else    if ("Wstart".equals(__fieldName)) {
      this.Wstart = (Integer) __fieldVal;
    }
    else    if ("Wpack".equals(__fieldName)) {
      this.Wpack = (String) __fieldVal;
    }
    else    if ("Wweight".equals(__fieldName)) {
      this.Wweight = (String) __fieldVal;
    }
    else    if ("Wpostage".equals(__fieldName)) {
      this.Wpostage = (String) __fieldVal;
    }
    else    if ("Warea".equals(__fieldName)) {
      this.Warea = (String) __fieldVal;
    }
    else    if ("Wfacturer".equals(__fieldName)) {
      this.Wfacturer = (String) __fieldVal;
    }
    else    if ("WMaprice".equals(__fieldName)) {
      this.WMaprice = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WMeprice".equals(__fieldName)) {
      this.WMeprice = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("WlkNum".equals(__fieldName)) {
      this.WlkNum = (Integer) __fieldVal;
    }
    else    if ("WbuNum".equals(__fieldName)) {
      this.WbuNum = (Integer) __fieldVal;
    }
    else    if ("WSmimgName".equals(__fieldName)) {
      this.WSmimgName = (String) __fieldVal;
    }
    else    if ("WSmimgPath".equals(__fieldName)) {
      this.WSmimgPath = (String) __fieldVal;
    }
    else    if ("WinsDate".equals(__fieldName)) {
      this.WinsDate = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("WUpDate".equals(__fieldName)) {
      this.WUpDate = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("WinsPerson".equals(__fieldName)) {
      this.WinsPerson = (String) __fieldVal;
    }
    else    if ("WupPerson".equals(__fieldName)) {
      this.WupPerson = (String) __fieldVal;
    }
    else    if ("Wyn".equals(__fieldName)) {
      this.Wyn = (Integer) __fieldVal;
    }
    else    if ("Wst".equals(__fieldName)) {
      this.Wst = (Integer) __fieldVal;
    }
    else    if ("Weval".equals(__fieldName)) {
      this.Weval = (String) __fieldVal;
    }
    else    if ("Wserve".equals(__fieldName)) {
      this.Wserve = (String) __fieldVal;
    }
    else    if ("autoid".equals(__fieldName)) {
      this.autoid = (Integer) __fieldVal;
    }
    else    if ("Wreprice".equals(__fieldName)) {
      this.Wreprice = (String) __fieldVal;
    }
    else    if ("Wtshing".equals(__fieldName)) {
      this.Wtshing = (String) __fieldVal;
    }
    else    if ("Wtshingrmark".equals(__fieldName)) {
      this.Wtshingrmark = (String) __fieldVal;
    }
    else    if ("zpsm".equals(__fieldName)) {
      this.zpsm = (String) __fieldVal;
    }
    else    if ("hcsm".equals(__fieldName)) {
      this.hcsm = (String) __fieldVal;
    }
    else    if ("superprice".equals(__fieldName)) {
      this.superprice = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("wstate".equals(__fieldName)) {
      this.wstate = (Integer) __fieldVal;
    }
    else    if ("superremark".equals(__fieldName)) {
      this.superremark = (String) __fieldVal;
    }
    else    if ("shstore".equals(__fieldName)) {
      this.shstore = (String) __fieldVal;
    }
    else    if ("jifen".equals(__fieldName)) {
      this.jifen = (Integer) __fieldVal;
    }
    else    if ("cut_price".equals(__fieldName)) {
      this.cut_price = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("allnum".equals(__fieldName)) {
      this.allnum = (Integer) __fieldVal;
    }
    else    if ("adddate".equals(__fieldName)) {
      this.adddate = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("snid".equals(__fieldName)) {
      this.snid = (String) __fieldVal;
    }
    else    if ("grade".equals(__fieldName)) {
      this.grade = (Integer) __fieldVal;
    }
    else    if ("beique".equals(__fieldName)) {
      this.beique = (String) __fieldVal;
    }
    else    if ("gzque".equals(__fieldName)) {
      this.gzque = (String) __fieldVal;
    }
    else    if ("shhque".equals(__fieldName)) {
      this.shhque = (String) __fieldVal;
    }
    else    if ("caigou".equals(__fieldName)) {
      this.caigou = (Integer) __fieldVal;
    }
    else    if ("ccity".equals(__fieldName)) {
      this.ccity = (Integer) __fieldVal;
    }
    else    if ("cnumb".equals(__fieldName)) {
      this.cnumb = (Integer) __fieldVal;
    }
    else    if ("shangjia".equals(__fieldName)) {
      this.shangjia = (String) __fieldVal;
    }
    else    if ("showid".equals(__fieldName)) {
      this.showid = (Integer) __fieldVal;
    }
    else    if ("swkc".equals(__fieldName)) {
      this.swkc = (String) __fieldVal;
    }
    else    if ("swrc".equals(__fieldName)) {
      this.swrc = (String) __fieldVal;
    }
    else    if ("rcts".equals(__fieldName)) {
      this.rcts = (String) __fieldVal;
    }
    else    if ("kcts".equals(__fieldName)) {
      this.kcts = (String) __fieldVal;
    }
    else    if ("ps".equals(__fieldName)) {
      this.ps = (Integer) __fieldVal;
    }
    else    if ("dhkc".equals(__fieldName)) {
      this.dhkc = (Integer) __fieldVal;
    }
    else    if ("zgskc".equals(__fieldName)) {
      this.zgskc = (Integer) __fieldVal;
    }
    else    if ("shkc".equals(__fieldName)) {
      this.shkc = (Integer) __fieldVal;
    }
    else    if ("shph".equals(__fieldName)) {
      this.shph = (Integer) __fieldVal;
    }
    else    if ("bjph".equals(__fieldName)) {
      this.bjph = (Integer) __fieldVal;
    }
    else    if ("gzph".equals(__fieldName)) {
      this.gzph = (Integer) __fieldVal;
    }
    else    if ("shx".equals(__fieldName)) {
      this.shx = (Integer) __fieldVal;
    }
    else    if ("fprice".equals(__fieldName)) {
      this.fprice = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("shangg".equals(__fieldName)) {
      this.shangg = (Integer) __fieldVal;
    }
    else    if ("rcts15".equals(__fieldName)) {
      this.rcts15 = (String) __fieldVal;
    }
    else    if ("swrc15".equals(__fieldName)) {
      this.swrc15 = (String) __fieldVal;
    }
    else    if ("proser".equals(__fieldName)) {
      this.proser = (String) __fieldVal;
    }
    else    if ("balimit".equals(__fieldName)) {
      this.balimit = (String) __fieldVal;
    }
    else    if ("bjzd".equals(__fieldName)) {
      this.bjzd = (Integer) __fieldVal;
    }
    else    if ("gzzd".equals(__fieldName)) {
      this.gzzd = (Integer) __fieldVal;
    }
    else    if ("cdbk".equals(__fieldName)) {
      this.cdbk = (Integer) __fieldVal;
    }
    else    if ("cdzd".equals(__fieldName)) {
      this.cdzd = (Integer) __fieldVal;
    }
    else    if ("shef".equals(__fieldName)) {
      this.shef = (String) __fieldVal;
    }
    else    if ("cgcity".equals(__fieldName)) {
      this.cgcity = (String) __fieldVal;
    }
    else    if ("maxpurchqty".equals(__fieldName)) {
      this.maxpurchqty = (Integer) __fieldVal;
    }
    else    if ("bjcg".equals(__fieldName)) {
      this.bjcg = (Integer) __fieldVal;
    }
    else    if ("shcg".equals(__fieldName)) {
      this.shcg = (Integer) __fieldVal;
    }
    else    if ("gzcg".equals(__fieldName)) {
      this.gzcg = (Integer) __fieldVal;
    }
    else    if ("gzsnid".equals(__fieldName)) {
      this.gzsnid = (String) __fieldVal;
    }
    else    if ("shsnid".equals(__fieldName)) {
      this.shsnid = (String) __fieldVal;
    }
    else    if ("cdsnid".equals(__fieldName)) {
      this.cdsnid = (String) __fieldVal;
    }
    else    if ("imageurl".equals(__fieldName)) {
      this.imageurl = (String) __fieldVal;
    }
    else    if ("sku_id".equals(__fieldName)) {
      this.sku_id = (String) __fieldVal;
    }
    else    if ("sale".equals(__fieldName)) {
      this.sale = (Integer) __fieldVal;
    }
    else    if ("waretitle".equals(__fieldName)) {
      this.waretitle = (String) __fieldVal;
    }
    else    if ("bjstock".equals(__fieldName)) {
      this.bjstock = (Integer) __fieldVal;
    }
    else    if ("shstock".equals(__fieldName)) {
      this.shstock = (Integer) __fieldVal;
    }
    else    if ("gzstock".equals(__fieldName)) {
      this.gzstock = (Integer) __fieldVal;
    }
    else    if ("bjdays".equals(__fieldName)) {
      this.bjdays = (Integer) __fieldVal;
    }
    else    if ("gzdays".equals(__fieldName)) {
      this.gzdays = (Integer) __fieldVal;
    }
    else    if ("shdays".equals(__fieldName)) {
      this.shdays = (Integer) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}
