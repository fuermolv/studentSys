package fuermolv.book.entity;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sName is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sName is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sName =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sName <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sName >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sName >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sName <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sName <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sName like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sName not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sName in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sName not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sName between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sName not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andScollegeIsNull() {
            addCriterion("sCollege is null");
            return (Criteria) this;
        }

        public Criteria andScollegeIsNotNull() {
            addCriterion("sCollege is not null");
            return (Criteria) this;
        }

        public Criteria andScollegeEqualTo(String value) {
            addCriterion("sCollege =", value, "scollege");
            return (Criteria) this;
        }

        public Criteria andScollegeNotEqualTo(String value) {
            addCriterion("sCollege <>", value, "scollege");
            return (Criteria) this;
        }

        public Criteria andScollegeGreaterThan(String value) {
            addCriterion("sCollege >", value, "scollege");
            return (Criteria) this;
        }

        public Criteria andScollegeGreaterThanOrEqualTo(String value) {
            addCriterion("sCollege >=", value, "scollege");
            return (Criteria) this;
        }

        public Criteria andScollegeLessThan(String value) {
            addCriterion("sCollege <", value, "scollege");
            return (Criteria) this;
        }

        public Criteria andScollegeLessThanOrEqualTo(String value) {
            addCriterion("sCollege <=", value, "scollege");
            return (Criteria) this;
        }

        public Criteria andScollegeLike(String value) {
            addCriterion("sCollege like", value, "scollege");
            return (Criteria) this;
        }

        public Criteria andScollegeNotLike(String value) {
            addCriterion("sCollege not like", value, "scollege");
            return (Criteria) this;
        }

        public Criteria andScollegeIn(List<String> values) {
            addCriterion("sCollege in", values, "scollege");
            return (Criteria) this;
        }

        public Criteria andScollegeNotIn(List<String> values) {
            addCriterion("sCollege not in", values, "scollege");
            return (Criteria) this;
        }

        public Criteria andScollegeBetween(String value1, String value2) {
            addCriterion("sCollege between", value1, value2, "scollege");
            return (Criteria) this;
        }

        public Criteria andScollegeNotBetween(String value1, String value2) {
            addCriterion("sCollege not between", value1, value2, "scollege");
            return (Criteria) this;
        }

        public Criteria andSmajorIsNull() {
            addCriterion("sMajor is null");
            return (Criteria) this;
        }

        public Criteria andSmajorIsNotNull() {
            addCriterion("sMajor is not null");
            return (Criteria) this;
        }

        public Criteria andSmajorEqualTo(String value) {
            addCriterion("sMajor =", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotEqualTo(String value) {
            addCriterion("sMajor <>", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorGreaterThan(String value) {
            addCriterion("sMajor >", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorGreaterThanOrEqualTo(String value) {
            addCriterion("sMajor >=", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorLessThan(String value) {
            addCriterion("sMajor <", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorLessThanOrEqualTo(String value) {
            addCriterion("sMajor <=", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorLike(String value) {
            addCriterion("sMajor like", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotLike(String value) {
            addCriterion("sMajor not like", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorIn(List<String> values) {
            addCriterion("sMajor in", values, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotIn(List<String> values) {
            addCriterion("sMajor not in", values, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorBetween(String value1, String value2) {
            addCriterion("sMajor between", value1, value2, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotBetween(String value1, String value2) {
            addCriterion("sMajor not between", value1, value2, "smajor");
            return (Criteria) this;
        }

        public Criteria andSclassIsNull() {
            addCriterion("sClass is null");
            return (Criteria) this;
        }

        public Criteria andSclassIsNotNull() {
            addCriterion("sClass is not null");
            return (Criteria) this;
        }

        public Criteria andSclassEqualTo(String value) {
            addCriterion("sClass =", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotEqualTo(String value) {
            addCriterion("sClass <>", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassGreaterThan(String value) {
            addCriterion("sClass >", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassGreaterThanOrEqualTo(String value) {
            addCriterion("sClass >=", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLessThan(String value) {
            addCriterion("sClass <", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLessThanOrEqualTo(String value) {
            addCriterion("sClass <=", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLike(String value) {
            addCriterion("sClass like", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotLike(String value) {
            addCriterion("sClass not like", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassIn(List<String> values) {
            addCriterion("sClass in", values, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotIn(List<String> values) {
            addCriterion("sClass not in", values, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassBetween(String value1, String value2) {
            addCriterion("sClass between", value1, value2, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotBetween(String value1, String value2) {
            addCriterion("sClass not between", value1, value2, "sclass");
            return (Criteria) this;
        }

        public Criteria andSsexIsNull() {
            addCriterion("sSex is null");
            return (Criteria) this;
        }

        public Criteria andSsexIsNotNull() {
            addCriterion("sSex is not null");
            return (Criteria) this;
        }

        public Criteria andSsexEqualTo(String value) {
            addCriterion("sSex =", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotEqualTo(String value) {
            addCriterion("sSex <>", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThan(String value) {
            addCriterion("sSex >", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThanOrEqualTo(String value) {
            addCriterion("sSex >=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThan(String value) {
            addCriterion("sSex <", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThanOrEqualTo(String value) {
            addCriterion("sSex <=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLike(String value) {
            addCriterion("sSex like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotLike(String value) {
            addCriterion("sSex not like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexIn(List<String> values) {
            addCriterion("sSex in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotIn(List<String> values) {
            addCriterion("sSex not in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexBetween(String value1, String value2) {
            addCriterion("sSex between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotBetween(String value1, String value2) {
            addCriterion("sSex not between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSageIsNull() {
            addCriterion("sAge is null");
            return (Criteria) this;
        }

        public Criteria andSageIsNotNull() {
            addCriterion("sAge is not null");
            return (Criteria) this;
        }

        public Criteria andSageEqualTo(String value) {
            addCriterion("sAge =", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageNotEqualTo(String value) {
            addCriterion("sAge <>", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageGreaterThan(String value) {
            addCriterion("sAge >", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageGreaterThanOrEqualTo(String value) {
            addCriterion("sAge >=", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageLessThan(String value) {
            addCriterion("sAge <", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageLessThanOrEqualTo(String value) {
            addCriterion("sAge <=", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageLike(String value) {
            addCriterion("sAge like", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageNotLike(String value) {
            addCriterion("sAge not like", value, "sage");
            return (Criteria) this;
        }

        public Criteria andSageIn(List<String> values) {
            addCriterion("sAge in", values, "sage");
            return (Criteria) this;
        }

        public Criteria andSageNotIn(List<String> values) {
            addCriterion("sAge not in", values, "sage");
            return (Criteria) this;
        }

        public Criteria andSageBetween(String value1, String value2) {
            addCriterion("sAge between", value1, value2, "sage");
            return (Criteria) this;
        }

        public Criteria andSageNotBetween(String value1, String value2) {
            addCriterion("sAge not between", value1, value2, "sage");
            return (Criteria) this;
        }

        public Criteria andSzoneIsNull() {
            addCriterion("sZone is null");
            return (Criteria) this;
        }

        public Criteria andSzoneIsNotNull() {
            addCriterion("sZone is not null");
            return (Criteria) this;
        }

        public Criteria andSzoneEqualTo(String value) {
            addCriterion("sZone =", value, "szone");
            return (Criteria) this;
        }

        public Criteria andSzoneNotEqualTo(String value) {
            addCriterion("sZone <>", value, "szone");
            return (Criteria) this;
        }

        public Criteria andSzoneGreaterThan(String value) {
            addCriterion("sZone >", value, "szone");
            return (Criteria) this;
        }

        public Criteria andSzoneGreaterThanOrEqualTo(String value) {
            addCriterion("sZone >=", value, "szone");
            return (Criteria) this;
        }

        public Criteria andSzoneLessThan(String value) {
            addCriterion("sZone <", value, "szone");
            return (Criteria) this;
        }

        public Criteria andSzoneLessThanOrEqualTo(String value) {
            addCriterion("sZone <=", value, "szone");
            return (Criteria) this;
        }

        public Criteria andSzoneLike(String value) {
            addCriterion("sZone like", value, "szone");
            return (Criteria) this;
        }

        public Criteria andSzoneNotLike(String value) {
            addCriterion("sZone not like", value, "szone");
            return (Criteria) this;
        }

        public Criteria andSzoneIn(List<String> values) {
            addCriterion("sZone in", values, "szone");
            return (Criteria) this;
        }

        public Criteria andSzoneNotIn(List<String> values) {
            addCriterion("sZone not in", values, "szone");
            return (Criteria) this;
        }

        public Criteria andSzoneBetween(String value1, String value2) {
            addCriterion("sZone between", value1, value2, "szone");
            return (Criteria) this;
        }

        public Criteria andSzoneNotBetween(String value1, String value2) {
            addCriterion("sZone not between", value1, value2, "szone");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNull() {
            addCriterion("sAddress is null");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNotNull() {
            addCriterion("sAddress is not null");
            return (Criteria) this;
        }

        public Criteria andSaddressEqualTo(String value) {
            addCriterion("sAddress =", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotEqualTo(String value) {
            addCriterion("sAddress <>", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThan(String value) {
            addCriterion("sAddress >", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThanOrEqualTo(String value) {
            addCriterion("sAddress >=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThan(String value) {
            addCriterion("sAddress <", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThanOrEqualTo(String value) {
            addCriterion("sAddress <=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLike(String value) {
            addCriterion("sAddress like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotLike(String value) {
            addCriterion("sAddress not like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressIn(List<String> values) {
            addCriterion("sAddress in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotIn(List<String> values) {
            addCriterion("sAddress not in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressBetween(String value1, String value2) {
            addCriterion("sAddress between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotBetween(String value1, String value2) {
            addCriterion("sAddress not between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andSrecordIsNull() {
            addCriterion("sRecord is null");
            return (Criteria) this;
        }

        public Criteria andSrecordIsNotNull() {
            addCriterion("sRecord is not null");
            return (Criteria) this;
        }

        public Criteria andSrecordEqualTo(String value) {
            addCriterion("sRecord =", value, "srecord");
            return (Criteria) this;
        }

        public Criteria andSrecordNotEqualTo(String value) {
            addCriterion("sRecord <>", value, "srecord");
            return (Criteria) this;
        }

        public Criteria andSrecordGreaterThan(String value) {
            addCriterion("sRecord >", value, "srecord");
            return (Criteria) this;
        }

        public Criteria andSrecordGreaterThanOrEqualTo(String value) {
            addCriterion("sRecord >=", value, "srecord");
            return (Criteria) this;
        }

        public Criteria andSrecordLessThan(String value) {
            addCriterion("sRecord <", value, "srecord");
            return (Criteria) this;
        }

        public Criteria andSrecordLessThanOrEqualTo(String value) {
            addCriterion("sRecord <=", value, "srecord");
            return (Criteria) this;
        }

        public Criteria andSrecordLike(String value) {
            addCriterion("sRecord like", value, "srecord");
            return (Criteria) this;
        }

        public Criteria andSrecordNotLike(String value) {
            addCriterion("sRecord not like", value, "srecord");
            return (Criteria) this;
        }

        public Criteria andSrecordIn(List<String> values) {
            addCriterion("sRecord in", values, "srecord");
            return (Criteria) this;
        }

        public Criteria andSrecordNotIn(List<String> values) {
            addCriterion("sRecord not in", values, "srecord");
            return (Criteria) this;
        }

        public Criteria andSrecordBetween(String value1, String value2) {
            addCriterion("sRecord between", value1, value2, "srecord");
            return (Criteria) this;
        }

        public Criteria andSrecordNotBetween(String value1, String value2) {
            addCriterion("sRecord not between", value1, value2, "srecord");
            return (Criteria) this;
        }

        public Criteria andSpicIsNull() {
            addCriterion("sPic is null");
            return (Criteria) this;
        }

        public Criteria andSpicIsNotNull() {
            addCriterion("sPic is not null");
            return (Criteria) this;
        }

        public Criteria andSpicEqualTo(String value) {
            addCriterion("sPic =", value, "spic");
            return (Criteria) this;
        }

        public Criteria andSpicNotEqualTo(String value) {
            addCriterion("sPic <>", value, "spic");
            return (Criteria) this;
        }

        public Criteria andSpicGreaterThan(String value) {
            addCriterion("sPic >", value, "spic");
            return (Criteria) this;
        }

        public Criteria andSpicGreaterThanOrEqualTo(String value) {
            addCriterion("sPic >=", value, "spic");
            return (Criteria) this;
        }

        public Criteria andSpicLessThan(String value) {
            addCriterion("sPic <", value, "spic");
            return (Criteria) this;
        }

        public Criteria andSpicLessThanOrEqualTo(String value) {
            addCriterion("sPic <=", value, "spic");
            return (Criteria) this;
        }

        public Criteria andSpicLike(String value) {
            addCriterion("sPic like", value, "spic");
            return (Criteria) this;
        }

        public Criteria andSpicNotLike(String value) {
            addCriterion("sPic not like", value, "spic");
            return (Criteria) this;
        }

        public Criteria andSpicIn(List<String> values) {
            addCriterion("sPic in", values, "spic");
            return (Criteria) this;
        }

        public Criteria andSpicNotIn(List<String> values) {
            addCriterion("sPic not in", values, "spic");
            return (Criteria) this;
        }

        public Criteria andSpicBetween(String value1, String value2) {
            addCriterion("sPic between", value1, value2, "spic");
            return (Criteria) this;
        }

        public Criteria andSpicNotBetween(String value1, String value2) {
            addCriterion("sPic not between", value1, value2, "spic");
            return (Criteria) this;
        }

        public Criteria andSidentificationIsNull() {
            addCriterion("sIdentification is null");
            return (Criteria) this;
        }

        public Criteria andSidentificationIsNotNull() {
            addCriterion("sIdentification is not null");
            return (Criteria) this;
        }

        public Criteria andSidentificationEqualTo(String value) {
            addCriterion("sIdentification =", value, "sidentification");
            return (Criteria) this;
        }

        public Criteria andSidentificationNotEqualTo(String value) {
            addCriterion("sIdentification <>", value, "sidentification");
            return (Criteria) this;
        }

        public Criteria andSidentificationGreaterThan(String value) {
            addCriterion("sIdentification >", value, "sidentification");
            return (Criteria) this;
        }

        public Criteria andSidentificationGreaterThanOrEqualTo(String value) {
            addCriterion("sIdentification >=", value, "sidentification");
            return (Criteria) this;
        }

        public Criteria andSidentificationLessThan(String value) {
            addCriterion("sIdentification <", value, "sidentification");
            return (Criteria) this;
        }

        public Criteria andSidentificationLessThanOrEqualTo(String value) {
            addCriterion("sIdentification <=", value, "sidentification");
            return (Criteria) this;
        }

        public Criteria andSidentificationLike(String value) {
            addCriterion("sIdentification like", value, "sidentification");
            return (Criteria) this;
        }

        public Criteria andSidentificationNotLike(String value) {
            addCriterion("sIdentification not like", value, "sidentification");
            return (Criteria) this;
        }

        public Criteria andSidentificationIn(List<String> values) {
            addCriterion("sIdentification in", values, "sidentification");
            return (Criteria) this;
        }

        public Criteria andSidentificationNotIn(List<String> values) {
            addCriterion("sIdentification not in", values, "sidentification");
            return (Criteria) this;
        }

        public Criteria andSidentificationBetween(String value1, String value2) {
            addCriterion("sIdentification between", value1, value2, "sidentification");
            return (Criteria) this;
        }

        public Criteria andSidentificationNotBetween(String value1, String value2) {
            addCriterion("sIdentification not between", value1, value2, "sidentification");
            return (Criteria) this;
        }

        public Criteria andSgradeIsNull() {
            addCriterion("sGrade is null");
            return (Criteria) this;
        }

        public Criteria andSgradeIsNotNull() {
            addCriterion("sGrade is not null");
            return (Criteria) this;
        }

        public Criteria andSgradeEqualTo(String value) {
            addCriterion("sGrade =", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotEqualTo(String value) {
            addCriterion("sGrade <>", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeGreaterThan(String value) {
            addCriterion("sGrade >", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeGreaterThanOrEqualTo(String value) {
            addCriterion("sGrade >=", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeLessThan(String value) {
            addCriterion("sGrade <", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeLessThanOrEqualTo(String value) {
            addCriterion("sGrade <=", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeLike(String value) {
            addCriterion("sGrade like", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotLike(String value) {
            addCriterion("sGrade not like", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeIn(List<String> values) {
            addCriterion("sGrade in", values, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotIn(List<String> values) {
            addCriterion("sGrade not in", values, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeBetween(String value1, String value2) {
            addCriterion("sGrade between", value1, value2, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotBetween(String value1, String value2) {
            addCriterion("sGrade not between", value1, value2, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSremarkIsNull() {
            addCriterion("sRemark is null");
            return (Criteria) this;
        }

        public Criteria andSremarkIsNotNull() {
            addCriterion("sRemark is not null");
            return (Criteria) this;
        }

        public Criteria andSremarkEqualTo(String value) {
            addCriterion("sRemark =", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkNotEqualTo(String value) {
            addCriterion("sRemark <>", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkGreaterThan(String value) {
            addCriterion("sRemark >", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkGreaterThanOrEqualTo(String value) {
            addCriterion("sRemark >=", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkLessThan(String value) {
            addCriterion("sRemark <", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkLessThanOrEqualTo(String value) {
            addCriterion("sRemark <=", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkLike(String value) {
            addCriterion("sRemark like", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkNotLike(String value) {
            addCriterion("sRemark not like", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkIn(List<String> values) {
            addCriterion("sRemark in", values, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkNotIn(List<String> values) {
            addCriterion("sRemark not in", values, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkBetween(String value1, String value2) {
            addCriterion("sRemark between", value1, value2, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkNotBetween(String value1, String value2) {
            addCriterion("sRemark not between", value1, value2, "sremark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}