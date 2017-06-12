package fuermolv.book.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cName is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cName is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cName =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cName <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cName >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cName >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cName <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cName <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cName like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cName not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cName in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cName not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cName between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cName not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCteacherIsNull() {
            addCriterion("cTeacher is null");
            return (Criteria) this;
        }

        public Criteria andCteacherIsNotNull() {
            addCriterion("cTeacher is not null");
            return (Criteria) this;
        }

        public Criteria andCteacherEqualTo(String value) {
            addCriterion("cTeacher =", value, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherNotEqualTo(String value) {
            addCriterion("cTeacher <>", value, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherGreaterThan(String value) {
            addCriterion("cTeacher >", value, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherGreaterThanOrEqualTo(String value) {
            addCriterion("cTeacher >=", value, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherLessThan(String value) {
            addCriterion("cTeacher <", value, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherLessThanOrEqualTo(String value) {
            addCriterion("cTeacher <=", value, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherLike(String value) {
            addCriterion("cTeacher like", value, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherNotLike(String value) {
            addCriterion("cTeacher not like", value, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherIn(List<String> values) {
            addCriterion("cTeacher in", values, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherNotIn(List<String> values) {
            addCriterion("cTeacher not in", values, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherBetween(String value1, String value2) {
            addCriterion("cTeacher between", value1, value2, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCteacherNotBetween(String value1, String value2) {
            addCriterion("cTeacher not between", value1, value2, "cteacher");
            return (Criteria) this;
        }

        public Criteria andCcategoryIsNull() {
            addCriterion("cCategory is null");
            return (Criteria) this;
        }

        public Criteria andCcategoryIsNotNull() {
            addCriterion("cCategory is not null");
            return (Criteria) this;
        }

        public Criteria andCcategoryEqualTo(String value) {
            addCriterion("cCategory =", value, "ccategory");
            return (Criteria) this;
        }

        public Criteria andCcategoryNotEqualTo(String value) {
            addCriterion("cCategory <>", value, "ccategory");
            return (Criteria) this;
        }

        public Criteria andCcategoryGreaterThan(String value) {
            addCriterion("cCategory >", value, "ccategory");
            return (Criteria) this;
        }

        public Criteria andCcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("cCategory >=", value, "ccategory");
            return (Criteria) this;
        }

        public Criteria andCcategoryLessThan(String value) {
            addCriterion("cCategory <", value, "ccategory");
            return (Criteria) this;
        }

        public Criteria andCcategoryLessThanOrEqualTo(String value) {
            addCriterion("cCategory <=", value, "ccategory");
            return (Criteria) this;
        }

        public Criteria andCcategoryLike(String value) {
            addCriterion("cCategory like", value, "ccategory");
            return (Criteria) this;
        }

        public Criteria andCcategoryNotLike(String value) {
            addCriterion("cCategory not like", value, "ccategory");
            return (Criteria) this;
        }

        public Criteria andCcategoryIn(List<String> values) {
            addCriterion("cCategory in", values, "ccategory");
            return (Criteria) this;
        }

        public Criteria andCcategoryNotIn(List<String> values) {
            addCriterion("cCategory not in", values, "ccategory");
            return (Criteria) this;
        }

        public Criteria andCcategoryBetween(String value1, String value2) {
            addCriterion("cCategory between", value1, value2, "ccategory");
            return (Criteria) this;
        }

        public Criteria andCcategoryNotBetween(String value1, String value2) {
            addCriterion("cCategory not between", value1, value2, "ccategory");
            return (Criteria) this;
        }

        public Criteria andCperiodIsNull() {
            addCriterion("cPeriod is null");
            return (Criteria) this;
        }

        public Criteria andCperiodIsNotNull() {
            addCriterion("cPeriod is not null");
            return (Criteria) this;
        }

        public Criteria andCperiodEqualTo(String value) {
            addCriterion("cPeriod =", value, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodNotEqualTo(String value) {
            addCriterion("cPeriod <>", value, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodGreaterThan(String value) {
            addCriterion("cPeriod >", value, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodGreaterThanOrEqualTo(String value) {
            addCriterion("cPeriod >=", value, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodLessThan(String value) {
            addCriterion("cPeriod <", value, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodLessThanOrEqualTo(String value) {
            addCriterion("cPeriod <=", value, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodLike(String value) {
            addCriterion("cPeriod like", value, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodNotLike(String value) {
            addCriterion("cPeriod not like", value, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodIn(List<String> values) {
            addCriterion("cPeriod in", values, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodNotIn(List<String> values) {
            addCriterion("cPeriod not in", values, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodBetween(String value1, String value2) {
            addCriterion("cPeriod between", value1, value2, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCperiodNotBetween(String value1, String value2) {
            addCriterion("cPeriod not between", value1, value2, "cperiod");
            return (Criteria) this;
        }

        public Criteria andCremarkIsNull() {
            addCriterion("cRemark is null");
            return (Criteria) this;
        }

        public Criteria andCremarkIsNotNull() {
            addCriterion("cRemark is not null");
            return (Criteria) this;
        }

        public Criteria andCremarkEqualTo(String value) {
            addCriterion("cRemark =", value, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkNotEqualTo(String value) {
            addCriterion("cRemark <>", value, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkGreaterThan(String value) {
            addCriterion("cRemark >", value, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkGreaterThanOrEqualTo(String value) {
            addCriterion("cRemark >=", value, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkLessThan(String value) {
            addCriterion("cRemark <", value, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkLessThanOrEqualTo(String value) {
            addCriterion("cRemark <=", value, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkLike(String value) {
            addCriterion("cRemark like", value, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkNotLike(String value) {
            addCriterion("cRemark not like", value, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkIn(List<String> values) {
            addCriterion("cRemark in", values, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkNotIn(List<String> values) {
            addCriterion("cRemark not in", values, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkBetween(String value1, String value2) {
            addCriterion("cRemark between", value1, value2, "cremark");
            return (Criteria) this;
        }

        public Criteria andCremarkNotBetween(String value1, String value2) {
            addCriterion("cRemark not between", value1, value2, "cremark");
            return (Criteria) this;
        }

        public Criteria andCstudentnumberIsNull() {
            addCriterion("cStudentNumber is null");
            return (Criteria) this;
        }

        public Criteria andCstudentnumberIsNotNull() {
            addCriterion("cStudentNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCstudentnumberEqualTo(String value) {
            addCriterion("cStudentNumber =", value, "cstudentnumber");
            return (Criteria) this;
        }

        public Criteria andCstudentnumberNotEqualTo(String value) {
            addCriterion("cStudentNumber <>", value, "cstudentnumber");
            return (Criteria) this;
        }

        public Criteria andCstudentnumberGreaterThan(String value) {
            addCriterion("cStudentNumber >", value, "cstudentnumber");
            return (Criteria) this;
        }

        public Criteria andCstudentnumberGreaterThanOrEqualTo(String value) {
            addCriterion("cStudentNumber >=", value, "cstudentnumber");
            return (Criteria) this;
        }

        public Criteria andCstudentnumberLessThan(String value) {
            addCriterion("cStudentNumber <", value, "cstudentnumber");
            return (Criteria) this;
        }

        public Criteria andCstudentnumberLessThanOrEqualTo(String value) {
            addCriterion("cStudentNumber <=", value, "cstudentnumber");
            return (Criteria) this;
        }

        public Criteria andCstudentnumberLike(String value) {
            addCriterion("cStudentNumber like", value, "cstudentnumber");
            return (Criteria) this;
        }

        public Criteria andCstudentnumberNotLike(String value) {
            addCriterion("cStudentNumber not like", value, "cstudentnumber");
            return (Criteria) this;
        }

        public Criteria andCstudentnumberIn(List<String> values) {
            addCriterion("cStudentNumber in", values, "cstudentnumber");
            return (Criteria) this;
        }

        public Criteria andCstudentnumberNotIn(List<String> values) {
            addCriterion("cStudentNumber not in", values, "cstudentnumber");
            return (Criteria) this;
        }

        public Criteria andCstudentnumberBetween(String value1, String value2) {
            addCriterion("cStudentNumber between", value1, value2, "cstudentnumber");
            return (Criteria) this;
        }

        public Criteria andCstudentnumberNotBetween(String value1, String value2) {
            addCriterion("cStudentNumber not between", value1, value2, "cstudentnumber");
            return (Criteria) this;
        }

        public Criteria andCcollegeIsNull() {
            addCriterion("cCollege is null");
            return (Criteria) this;
        }

        public Criteria andCcollegeIsNotNull() {
            addCriterion("cCollege is not null");
            return (Criteria) this;
        }

        public Criteria andCcollegeEqualTo(String value) {
            addCriterion("cCollege =", value, "ccollege");
            return (Criteria) this;
        }

        public Criteria andCcollegeNotEqualTo(String value) {
            addCriterion("cCollege <>", value, "ccollege");
            return (Criteria) this;
        }

        public Criteria andCcollegeGreaterThan(String value) {
            addCriterion("cCollege >", value, "ccollege");
            return (Criteria) this;
        }

        public Criteria andCcollegeGreaterThanOrEqualTo(String value) {
            addCriterion("cCollege >=", value, "ccollege");
            return (Criteria) this;
        }

        public Criteria andCcollegeLessThan(String value) {
            addCriterion("cCollege <", value, "ccollege");
            return (Criteria) this;
        }

        public Criteria andCcollegeLessThanOrEqualTo(String value) {
            addCriterion("cCollege <=", value, "ccollege");
            return (Criteria) this;
        }

        public Criteria andCcollegeLike(String value) {
            addCriterion("cCollege like", value, "ccollege");
            return (Criteria) this;
        }

        public Criteria andCcollegeNotLike(String value) {
            addCriterion("cCollege not like", value, "ccollege");
            return (Criteria) this;
        }

        public Criteria andCcollegeIn(List<String> values) {
            addCriterion("cCollege in", values, "ccollege");
            return (Criteria) this;
        }

        public Criteria andCcollegeNotIn(List<String> values) {
            addCriterion("cCollege not in", values, "ccollege");
            return (Criteria) this;
        }

        public Criteria andCcollegeBetween(String value1, String value2) {
            addCriterion("cCollege between", value1, value2, "ccollege");
            return (Criteria) this;
        }

        public Criteria andCcollegeNotBetween(String value1, String value2) {
            addCriterion("cCollege not between", value1, value2, "ccollege");
            return (Criteria) this;
        }

        public Criteria andCbegintimeIsNull() {
            addCriterion("cBeginTime is null");
            return (Criteria) this;
        }

        public Criteria andCbegintimeIsNotNull() {
            addCriterion("cBeginTime is not null");
            return (Criteria) this;
        }

        public Criteria andCbegintimeEqualTo(Date value) {
            addCriterionForJDBCDate("cBeginTime =", value, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("cBeginTime <>", value, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeGreaterThan(Date value) {
            addCriterionForJDBCDate("cBeginTime >", value, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cBeginTime >=", value, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeLessThan(Date value) {
            addCriterionForJDBCDate("cBeginTime <", value, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cBeginTime <=", value, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeIn(List<Date> values) {
            addCriterionForJDBCDate("cBeginTime in", values, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("cBeginTime not in", values, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cBeginTime between", value1, value2, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCbegintimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cBeginTime not between", value1, value2, "cbegintime");
            return (Criteria) this;
        }

        public Criteria andCendtimeIsNull() {
            addCriterion("cEndTime is null");
            return (Criteria) this;
        }

        public Criteria andCendtimeIsNotNull() {
            addCriterion("cEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andCendtimeEqualTo(Date value) {
            addCriterionForJDBCDate("cEndTime =", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("cEndTime <>", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("cEndTime >", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cEndTime >=", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeLessThan(Date value) {
            addCriterionForJDBCDate("cEndTime <", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cEndTime <=", value, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeIn(List<Date> values) {
            addCriterionForJDBCDate("cEndTime in", values, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("cEndTime not in", values, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cEndTime between", value1, value2, "cendtime");
            return (Criteria) this;
        }

        public Criteria andCendtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cEndTime not between", value1, value2, "cendtime");
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