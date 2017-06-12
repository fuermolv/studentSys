package fuermolv.book.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradeExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
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

        public Criteria andGgradeIsNull() {
            addCriterion("gGrade is null");
            return (Criteria) this;
        }

        public Criteria andGgradeIsNotNull() {
            addCriterion("gGrade is not null");
            return (Criteria) this;
        }

        public Criteria andGgradeEqualTo(String value) {
            addCriterion("gGrade =", value, "ggrade");
            return (Criteria) this;
        }

        public Criteria andGgradeNotEqualTo(String value) {
            addCriterion("gGrade <>", value, "ggrade");
            return (Criteria) this;
        }

        public Criteria andGgradeGreaterThan(String value) {
            addCriterion("gGrade >", value, "ggrade");
            return (Criteria) this;
        }

        public Criteria andGgradeGreaterThanOrEqualTo(String value) {
            addCriterion("gGrade >=", value, "ggrade");
            return (Criteria) this;
        }

        public Criteria andGgradeLessThan(String value) {
            addCriterion("gGrade <", value, "ggrade");
            return (Criteria) this;
        }

        public Criteria andGgradeLessThanOrEqualTo(String value) {
            addCriterion("gGrade <=", value, "ggrade");
            return (Criteria) this;
        }

        public Criteria andGgradeLike(String value) {
            addCriterion("gGrade like", value, "ggrade");
            return (Criteria) this;
        }

        public Criteria andGgradeNotLike(String value) {
            addCriterion("gGrade not like", value, "ggrade");
            return (Criteria) this;
        }

        public Criteria andGgradeIn(List<String> values) {
            addCriterion("gGrade in", values, "ggrade");
            return (Criteria) this;
        }

        public Criteria andGgradeNotIn(List<String> values) {
            addCriterion("gGrade not in", values, "ggrade");
            return (Criteria) this;
        }

        public Criteria andGgradeBetween(String value1, String value2) {
            addCriterion("gGrade between", value1, value2, "ggrade");
            return (Criteria) this;
        }

        public Criteria andGgradeNotBetween(String value1, String value2) {
            addCriterion("gGrade not between", value1, value2, "ggrade");
            return (Criteria) this;
        }

        public Criteria andPgradeIsNull() {
            addCriterion("pGrade is null");
            return (Criteria) this;
        }

        public Criteria andPgradeIsNotNull() {
            addCriterion("pGrade is not null");
            return (Criteria) this;
        }

        public Criteria andPgradeEqualTo(String value) {
            addCriterion("pGrade =", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeNotEqualTo(String value) {
            addCriterion("pGrade <>", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeGreaterThan(String value) {
            addCriterion("pGrade >", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeGreaterThanOrEqualTo(String value) {
            addCriterion("pGrade >=", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeLessThan(String value) {
            addCriterion("pGrade <", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeLessThanOrEqualTo(String value) {
            addCriterion("pGrade <=", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeLike(String value) {
            addCriterion("pGrade like", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeNotLike(String value) {
            addCriterion("pGrade not like", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeIn(List<String> values) {
            addCriterion("pGrade in", values, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeNotIn(List<String> values) {
            addCriterion("pGrade not in", values, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeBetween(String value1, String value2) {
            addCriterion("pGrade between", value1, value2, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeNotBetween(String value1, String value2) {
            addCriterion("pGrade not between", value1, value2, "pgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeIsNull() {
            addCriterion("fGrade is null");
            return (Criteria) this;
        }

        public Criteria andFgradeIsNotNull() {
            addCriterion("fGrade is not null");
            return (Criteria) this;
        }

        public Criteria andFgradeEqualTo(String value) {
            addCriterion("fGrade =", value, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeNotEqualTo(String value) {
            addCriterion("fGrade <>", value, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeGreaterThan(String value) {
            addCriterion("fGrade >", value, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeGreaterThanOrEqualTo(String value) {
            addCriterion("fGrade >=", value, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeLessThan(String value) {
            addCriterion("fGrade <", value, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeLessThanOrEqualTo(String value) {
            addCriterion("fGrade <=", value, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeLike(String value) {
            addCriterion("fGrade like", value, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeNotLike(String value) {
            addCriterion("fGrade not like", value, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeIn(List<String> values) {
            addCriterion("fGrade in", values, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeNotIn(List<String> values) {
            addCriterion("fGrade not in", values, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeBetween(String value1, String value2) {
            addCriterion("fGrade between", value1, value2, "fgrade");
            return (Criteria) this;
        }

        public Criteria andFgradeNotBetween(String value1, String value2) {
            addCriterion("fGrade not between", value1, value2, "fgrade");
            return (Criteria) this;
        }

        public Criteria andGrateIsNull() {
            addCriterion("gRate is null");
            return (Criteria) this;
        }

        public Criteria andGrateIsNotNull() {
            addCriterion("gRate is not null");
            return (Criteria) this;
        }

        public Criteria andGrateEqualTo(String value) {
            addCriterion("gRate =", value, "grate");
            return (Criteria) this;
        }

        public Criteria andGrateNotEqualTo(String value) {
            addCriterion("gRate <>", value, "grate");
            return (Criteria) this;
        }

        public Criteria andGrateGreaterThan(String value) {
            addCriterion("gRate >", value, "grate");
            return (Criteria) this;
        }

        public Criteria andGrateGreaterThanOrEqualTo(String value) {
            addCriterion("gRate >=", value, "grate");
            return (Criteria) this;
        }

        public Criteria andGrateLessThan(String value) {
            addCriterion("gRate <", value, "grate");
            return (Criteria) this;
        }

        public Criteria andGrateLessThanOrEqualTo(String value) {
            addCriterion("gRate <=", value, "grate");
            return (Criteria) this;
        }

        public Criteria andGrateLike(String value) {
            addCriterion("gRate like", value, "grate");
            return (Criteria) this;
        }

        public Criteria andGrateNotLike(String value) {
            addCriterion("gRate not like", value, "grate");
            return (Criteria) this;
        }

        public Criteria andGrateIn(List<String> values) {
            addCriterion("gRate in", values, "grate");
            return (Criteria) this;
        }

        public Criteria andGrateNotIn(List<String> values) {
            addCriterion("gRate not in", values, "grate");
            return (Criteria) this;
        }

        public Criteria andGrateBetween(String value1, String value2) {
            addCriterion("gRate between", value1, value2, "grate");
            return (Criteria) this;
        }

        public Criteria andGrateNotBetween(String value1, String value2) {
            addCriterion("gRate not between", value1, value2, "grate");
            return (Criteria) this;
        }

        public Criteria andGtypeIsNull() {
            addCriterion("gType is null");
            return (Criteria) this;
        }

        public Criteria andGtypeIsNotNull() {
            addCriterion("gType is not null");
            return (Criteria) this;
        }

        public Criteria andGtypeEqualTo(String value) {
            addCriterion("gType =", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotEqualTo(String value) {
            addCriterion("gType <>", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeGreaterThan(String value) {
            addCriterion("gType >", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeGreaterThanOrEqualTo(String value) {
            addCriterion("gType >=", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeLessThan(String value) {
            addCriterion("gType <", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeLessThanOrEqualTo(String value) {
            addCriterion("gType <=", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeLike(String value) {
            addCriterion("gType like", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotLike(String value) {
            addCriterion("gType not like", value, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeIn(List<String> values) {
            addCriterion("gType in", values, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotIn(List<String> values) {
            addCriterion("gType not in", values, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeBetween(String value1, String value2) {
            addCriterion("gType between", value1, value2, "gtype");
            return (Criteria) this;
        }

        public Criteria andGtypeNotBetween(String value1, String value2) {
            addCriterion("gType not between", value1, value2, "gtype");
            return (Criteria) this;
        }

        public Criteria andGclassIsNull() {
            addCriterion("gClass is null");
            return (Criteria) this;
        }

        public Criteria andGclassIsNotNull() {
            addCriterion("gClass is not null");
            return (Criteria) this;
        }

        public Criteria andGclassEqualTo(String value) {
            addCriterion("gClass =", value, "gclass");
            return (Criteria) this;
        }

        public Criteria andGclassNotEqualTo(String value) {
            addCriterion("gClass <>", value, "gclass");
            return (Criteria) this;
        }

        public Criteria andGclassGreaterThan(String value) {
            addCriterion("gClass >", value, "gclass");
            return (Criteria) this;
        }

        public Criteria andGclassGreaterThanOrEqualTo(String value) {
            addCriterion("gClass >=", value, "gclass");
            return (Criteria) this;
        }

        public Criteria andGclassLessThan(String value) {
            addCriterion("gClass <", value, "gclass");
            return (Criteria) this;
        }

        public Criteria andGclassLessThanOrEqualTo(String value) {
            addCriterion("gClass <=", value, "gclass");
            return (Criteria) this;
        }

        public Criteria andGclassLike(String value) {
            addCriterion("gClass like", value, "gclass");
            return (Criteria) this;
        }

        public Criteria andGclassNotLike(String value) {
            addCriterion("gClass not like", value, "gclass");
            return (Criteria) this;
        }

        public Criteria andGclassIn(List<String> values) {
            addCriterion("gClass in", values, "gclass");
            return (Criteria) this;
        }

        public Criteria andGclassNotIn(List<String> values) {
            addCriterion("gClass not in", values, "gclass");
            return (Criteria) this;
        }

        public Criteria andGclassBetween(String value1, String value2) {
            addCriterion("gClass between", value1, value2, "gclass");
            return (Criteria) this;
        }

        public Criteria andGclassNotBetween(String value1, String value2) {
            addCriterion("gClass not between", value1, value2, "gclass");
            return (Criteria) this;
        }

        public Criteria andGteacherIsNull() {
            addCriterion("gTeacher is null");
            return (Criteria) this;
        }

        public Criteria andGteacherIsNotNull() {
            addCriterion("gTeacher is not null");
            return (Criteria) this;
        }

        public Criteria andGteacherEqualTo(String value) {
            addCriterion("gTeacher =", value, "gteacher");
            return (Criteria) this;
        }

        public Criteria andGteacherNotEqualTo(String value) {
            addCriterion("gTeacher <>", value, "gteacher");
            return (Criteria) this;
        }

        public Criteria andGteacherGreaterThan(String value) {
            addCriterion("gTeacher >", value, "gteacher");
            return (Criteria) this;
        }

        public Criteria andGteacherGreaterThanOrEqualTo(String value) {
            addCriterion("gTeacher >=", value, "gteacher");
            return (Criteria) this;
        }

        public Criteria andGteacherLessThan(String value) {
            addCriterion("gTeacher <", value, "gteacher");
            return (Criteria) this;
        }

        public Criteria andGteacherLessThanOrEqualTo(String value) {
            addCriterion("gTeacher <=", value, "gteacher");
            return (Criteria) this;
        }

        public Criteria andGteacherLike(String value) {
            addCriterion("gTeacher like", value, "gteacher");
            return (Criteria) this;
        }

        public Criteria andGteacherNotLike(String value) {
            addCriterion("gTeacher not like", value, "gteacher");
            return (Criteria) this;
        }

        public Criteria andGteacherIn(List<String> values) {
            addCriterion("gTeacher in", values, "gteacher");
            return (Criteria) this;
        }

        public Criteria andGteacherNotIn(List<String> values) {
            addCriterion("gTeacher not in", values, "gteacher");
            return (Criteria) this;
        }

        public Criteria andGteacherBetween(String value1, String value2) {
            addCriterion("gTeacher between", value1, value2, "gteacher");
            return (Criteria) this;
        }

        public Criteria andGteacherNotBetween(String value1, String value2) {
            addCriterion("gTeacher not between", value1, value2, "gteacher");
            return (Criteria) this;
        }

        public Criteria andGstudentnumIsNull() {
            addCriterion("gStudentNum is null");
            return (Criteria) this;
        }

        public Criteria andGstudentnumIsNotNull() {
            addCriterion("gStudentNum is not null");
            return (Criteria) this;
        }

        public Criteria andGstudentnumEqualTo(String value) {
            addCriterion("gStudentNum =", value, "gstudentnum");
            return (Criteria) this;
        }

        public Criteria andGstudentnumNotEqualTo(String value) {
            addCriterion("gStudentNum <>", value, "gstudentnum");
            return (Criteria) this;
        }

        public Criteria andGstudentnumGreaterThan(String value) {
            addCriterion("gStudentNum >", value, "gstudentnum");
            return (Criteria) this;
        }

        public Criteria andGstudentnumGreaterThanOrEqualTo(String value) {
            addCriterion("gStudentNum >=", value, "gstudentnum");
            return (Criteria) this;
        }

        public Criteria andGstudentnumLessThan(String value) {
            addCriterion("gStudentNum <", value, "gstudentnum");
            return (Criteria) this;
        }

        public Criteria andGstudentnumLessThanOrEqualTo(String value) {
            addCriterion("gStudentNum <=", value, "gstudentnum");
            return (Criteria) this;
        }

        public Criteria andGstudentnumLike(String value) {
            addCriterion("gStudentNum like", value, "gstudentnum");
            return (Criteria) this;
        }

        public Criteria andGstudentnumNotLike(String value) {
            addCriterion("gStudentNum not like", value, "gstudentnum");
            return (Criteria) this;
        }

        public Criteria andGstudentnumIn(List<String> values) {
            addCriterion("gStudentNum in", values, "gstudentnum");
            return (Criteria) this;
        }

        public Criteria andGstudentnumNotIn(List<String> values) {
            addCriterion("gStudentNum not in", values, "gstudentnum");
            return (Criteria) this;
        }

        public Criteria andGstudentnumBetween(String value1, String value2) {
            addCriterion("gStudentNum between", value1, value2, "gstudentnum");
            return (Criteria) this;
        }

        public Criteria andGstudentnumNotBetween(String value1, String value2) {
            addCriterion("gStudentNum not between", value1, value2, "gstudentnum");
            return (Criteria) this;
        }

        public Criteria andGremarkIsNull() {
            addCriterion("gRemark is null");
            return (Criteria) this;
        }

        public Criteria andGremarkIsNotNull() {
            addCriterion("gRemark is not null");
            return (Criteria) this;
        }

        public Criteria andGremarkEqualTo(String value) {
            addCriterion("gRemark =", value, "gremark");
            return (Criteria) this;
        }

        public Criteria andGremarkNotEqualTo(String value) {
            addCriterion("gRemark <>", value, "gremark");
            return (Criteria) this;
        }

        public Criteria andGremarkGreaterThan(String value) {
            addCriterion("gRemark >", value, "gremark");
            return (Criteria) this;
        }

        public Criteria andGremarkGreaterThanOrEqualTo(String value) {
            addCriterion("gRemark >=", value, "gremark");
            return (Criteria) this;
        }

        public Criteria andGremarkLessThan(String value) {
            addCriterion("gRemark <", value, "gremark");
            return (Criteria) this;
        }

        public Criteria andGremarkLessThanOrEqualTo(String value) {
            addCriterion("gRemark <=", value, "gremark");
            return (Criteria) this;
        }

        public Criteria andGremarkLike(String value) {
            addCriterion("gRemark like", value, "gremark");
            return (Criteria) this;
        }

        public Criteria andGremarkNotLike(String value) {
            addCriterion("gRemark not like", value, "gremark");
            return (Criteria) this;
        }

        public Criteria andGremarkIn(List<String> values) {
            addCriterion("gRemark in", values, "gremark");
            return (Criteria) this;
        }

        public Criteria andGremarkNotIn(List<String> values) {
            addCriterion("gRemark not in", values, "gremark");
            return (Criteria) this;
        }

        public Criteria andGremarkBetween(String value1, String value2) {
            addCriterion("gRemark between", value1, value2, "gremark");
            return (Criteria) this;
        }

        public Criteria andGremarkNotBetween(String value1, String value2) {
            addCriterion("gRemark not between", value1, value2, "gremark");
            return (Criteria) this;
        }

        public Criteria andGbegintimeIsNull() {
            addCriterion("gBeginTime is null");
            return (Criteria) this;
        }

        public Criteria andGbegintimeIsNotNull() {
            addCriterion("gBeginTime is not null");
            return (Criteria) this;
        }

        public Criteria andGbegintimeEqualTo(Date value) {
            addCriterion("gBeginTime =", value, "gbegintime");
            return (Criteria) this;
        }

        public Criteria andGbegintimeNotEqualTo(Date value) {
            addCriterion("gBeginTime <>", value, "gbegintime");
            return (Criteria) this;
        }

        public Criteria andGbegintimeGreaterThan(Date value) {
            addCriterion("gBeginTime >", value, "gbegintime");
            return (Criteria) this;
        }

        public Criteria andGbegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gBeginTime >=", value, "gbegintime");
            return (Criteria) this;
        }

        public Criteria andGbegintimeLessThan(Date value) {
            addCriterion("gBeginTime <", value, "gbegintime");
            return (Criteria) this;
        }

        public Criteria andGbegintimeLessThanOrEqualTo(Date value) {
            addCriterion("gBeginTime <=", value, "gbegintime");
            return (Criteria) this;
        }

        public Criteria andGbegintimeIn(List<Date> values) {
            addCriterion("gBeginTime in", values, "gbegintime");
            return (Criteria) this;
        }

        public Criteria andGbegintimeNotIn(List<Date> values) {
            addCriterion("gBeginTime not in", values, "gbegintime");
            return (Criteria) this;
        }

        public Criteria andGbegintimeBetween(Date value1, Date value2) {
            addCriterion("gBeginTime between", value1, value2, "gbegintime");
            return (Criteria) this;
        }

        public Criteria andGbegintimeNotBetween(Date value1, Date value2) {
            addCriterion("gBeginTime not between", value1, value2, "gbegintime");
            return (Criteria) this;
        }

        public Criteria andGendtimeIsNull() {
            addCriterion("gEndTime is null");
            return (Criteria) this;
        }

        public Criteria andGendtimeIsNotNull() {
            addCriterion("gEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andGendtimeEqualTo(Date value) {
            addCriterion("gEndTime =", value, "gendtime");
            return (Criteria) this;
        }

        public Criteria andGendtimeNotEqualTo(Date value) {
            addCriterion("gEndTime <>", value, "gendtime");
            return (Criteria) this;
        }

        public Criteria andGendtimeGreaterThan(Date value) {
            addCriterion("gEndTime >", value, "gendtime");
            return (Criteria) this;
        }

        public Criteria andGendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gEndTime >=", value, "gendtime");
            return (Criteria) this;
        }

        public Criteria andGendtimeLessThan(Date value) {
            addCriterion("gEndTime <", value, "gendtime");
            return (Criteria) this;
        }

        public Criteria andGendtimeLessThanOrEqualTo(Date value) {
            addCriterion("gEndTime <=", value, "gendtime");
            return (Criteria) this;
        }

        public Criteria andGendtimeIn(List<Date> values) {
            addCriterion("gEndTime in", values, "gendtime");
            return (Criteria) this;
        }

        public Criteria andGendtimeNotIn(List<Date> values) {
            addCriterion("gEndTime not in", values, "gendtime");
            return (Criteria) this;
        }

        public Criteria andGendtimeBetween(Date value1, Date value2) {
            addCriterion("gEndTime between", value1, value2, "gendtime");
            return (Criteria) this;
        }

        public Criteria andGendtimeNotBetween(Date value1, Date value2) {
            addCriterion("gEndTime not between", value1, value2, "gendtime");
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