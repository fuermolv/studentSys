package fuermolv.book.entity;

import java.util.Date;

public class Class {
    private Integer cid;

    private String cname;

    private String cteacher;

    private String ccategory;

    private String cperiod;

    private String cremark;

    private String cstudentnumber;

    private String ccollege;

    private Date cbegintime;

    private Date cendtime;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCteacher() {
        return cteacher;
    }

    public void setCteacher(String cteacher) {
        this.cteacher = cteacher;
    }

    public String getCcategory() {
        return ccategory;
    }

    public void setCcategory(String ccategory) {
        this.ccategory = ccategory;
    }

    public String getCperiod() {
        return cperiod;
    }

    public void setCperiod(String cperiod) {
        this.cperiod = cperiod;
    }

    public String getCremark() {
        return cremark;
    }

    public void setCremark(String cremark) {
        this.cremark = cremark;
    }

    public String getCstudentnumber() {
        return cstudentnumber;
    }

    public void setCstudentnumber(String cstudentnumber) {
        this.cstudentnumber = cstudentnumber;
    }

    public String getCcollege() {
        return ccollege;
    }

    public void setCcollege(String ccollege) {
        this.ccollege = ccollege;
    }

    public Date getCbegintime() {
        return cbegintime;
    }

    public void setCbegintime(Date cbegintime) {
        this.cbegintime = cbegintime;
    }

    public Date getCendtime() {
        return cendtime;
    }

    public void setCendtime(Date cendtime) {
        this.cendtime = cendtime;
    }
}