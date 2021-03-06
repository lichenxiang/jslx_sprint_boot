package com.isprint.jslx.lccfd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseTimuFormulaQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public BaseTimuFormulaQuery() {
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

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSubjectidIsNull() {
            addCriterion("subjectid is null");
            return (Criteria) this;
        }

        public Criteria andSubjectidIsNotNull() {
            addCriterion("subjectid is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectidEqualTo(Integer value) {
            addCriterion("subjectid =", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotEqualTo(Integer value) {
            addCriterion("subjectid <>", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThan(Integer value) {
            addCriterion("subjectid >", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("subjectid >=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThan(Integer value) {
            addCriterion("subjectid <", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("subjectid <=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidIn(List<Integer> values) {
            addCriterion("subjectid in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotIn(List<Integer> values) {
            addCriterion("subjectid not in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("subjectid between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("subjectid not between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andAsciimathIsNull() {
            addCriterion("asciimath is null");
            return (Criteria) this;
        }

        public Criteria andAsciimathIsNotNull() {
            addCriterion("asciimath is not null");
            return (Criteria) this;
        }

        public Criteria andAsciimathEqualTo(String value) {
            addCriterion("asciimath =", value, "asciimath");
            return (Criteria) this;
        }

        public Criteria andAsciimathNotEqualTo(String value) {
            addCriterion("asciimath <>", value, "asciimath");
            return (Criteria) this;
        }

        public Criteria andAsciimathGreaterThan(String value) {
            addCriterion("asciimath >", value, "asciimath");
            return (Criteria) this;
        }

        public Criteria andAsciimathGreaterThanOrEqualTo(String value) {
            addCriterion("asciimath >=", value, "asciimath");
            return (Criteria) this;
        }

        public Criteria andAsciimathLessThan(String value) {
            addCriterion("asciimath <", value, "asciimath");
            return (Criteria) this;
        }

        public Criteria andAsciimathLessThanOrEqualTo(String value) {
            addCriterion("asciimath <=", value, "asciimath");
            return (Criteria) this;
        }

        public Criteria andAsciimathLike(String value) {
            addCriterion("asciimath like", value, "asciimath");
            return (Criteria) this;
        }

        public Criteria andAsciimathNotLike(String value) {
            addCriterion("asciimath not like", value, "asciimath");
            return (Criteria) this;
        }

        public Criteria andAsciimathIn(List<String> values) {
            addCriterion("asciimath in", values, "asciimath");
            return (Criteria) this;
        }

        public Criteria andAsciimathNotIn(List<String> values) {
            addCriterion("asciimath not in", values, "asciimath");
            return (Criteria) this;
        }

        public Criteria andAsciimathBetween(String value1, String value2) {
            addCriterion("asciimath between", value1, value2, "asciimath");
            return (Criteria) this;
        }

        public Criteria andAsciimathNotBetween(String value1, String value2) {
            addCriterion("asciimath not between", value1, value2, "asciimath");
            return (Criteria) this;
        }

        public Criteria andLatexIsNull() {
            addCriterion("latex is null");
            return (Criteria) this;
        }

        public Criteria andLatexIsNotNull() {
            addCriterion("latex is not null");
            return (Criteria) this;
        }

        public Criteria andLatexEqualTo(String value) {
            addCriterion("latex =", value, "latex");
            return (Criteria) this;
        }

        public Criteria andLatexNotEqualTo(String value) {
            addCriterion("latex <>", value, "latex");
            return (Criteria) this;
        }

        public Criteria andLatexGreaterThan(String value) {
            addCriterion("latex >", value, "latex");
            return (Criteria) this;
        }

        public Criteria andLatexGreaterThanOrEqualTo(String value) {
            addCriterion("latex >=", value, "latex");
            return (Criteria) this;
        }

        public Criteria andLatexLessThan(String value) {
            addCriterion("latex <", value, "latex");
            return (Criteria) this;
        }

        public Criteria andLatexLessThanOrEqualTo(String value) {
            addCriterion("latex <=", value, "latex");
            return (Criteria) this;
        }

        public Criteria andLatexLike(String value) {
            addCriterion("latex like", value, "latex");
            return (Criteria) this;
        }

        public Criteria andLatexNotLike(String value) {
            addCriterion("latex not like", value, "latex");
            return (Criteria) this;
        }

        public Criteria andLatexIn(List<String> values) {
            addCriterion("latex in", values, "latex");
            return (Criteria) this;
        }

        public Criteria andLatexNotIn(List<String> values) {
            addCriterion("latex not in", values, "latex");
            return (Criteria) this;
        }

        public Criteria andLatexBetween(String value1, String value2) {
            addCriterion("latex between", value1, value2, "latex");
            return (Criteria) this;
        }

        public Criteria andLatexNotBetween(String value1, String value2) {
            addCriterion("latex not between", value1, value2, "latex");
            return (Criteria) this;
        }

        public Criteria andIssuccessIsNull() {
            addCriterion("issuccess is null");
            return (Criteria) this;
        }

        public Criteria andIssuccessIsNotNull() {
            addCriterion("issuccess is not null");
            return (Criteria) this;
        }

        public Criteria andIssuccessEqualTo(Integer value) {
            addCriterion("issuccess =", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessNotEqualTo(Integer value) {
            addCriterion("issuccess <>", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessGreaterThan(Integer value) {
            addCriterion("issuccess >", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("issuccess >=", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessLessThan(Integer value) {
            addCriterion("issuccess <", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessLessThanOrEqualTo(Integer value) {
            addCriterion("issuccess <=", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessIn(List<Integer> values) {
            addCriterion("issuccess in", values, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessNotIn(List<Integer> values) {
            addCriterion("issuccess not in", values, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessBetween(Integer value1, Integer value2) {
            addCriterion("issuccess between", value1, value2, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("issuccess not between", value1, value2, "issuccess");
            return (Criteria) this;
        }

        public Criteria andErrinfoIsNull() {
            addCriterion("errinfo is null");
            return (Criteria) this;
        }

        public Criteria andErrinfoIsNotNull() {
            addCriterion("errinfo is not null");
            return (Criteria) this;
        }

        public Criteria andErrinfoEqualTo(String value) {
            addCriterion("errinfo =", value, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoNotEqualTo(String value) {
            addCriterion("errinfo <>", value, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoGreaterThan(String value) {
            addCriterion("errinfo >", value, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoGreaterThanOrEqualTo(String value) {
            addCriterion("errinfo >=", value, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoLessThan(String value) {
            addCriterion("errinfo <", value, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoLessThanOrEqualTo(String value) {
            addCriterion("errinfo <=", value, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoLike(String value) {
            addCriterion("errinfo like", value, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoNotLike(String value) {
            addCriterion("errinfo not like", value, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoIn(List<String> values) {
            addCriterion("errinfo in", values, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoNotIn(List<String> values) {
            addCriterion("errinfo not in", values, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoBetween(String value1, String value2) {
            addCriterion("errinfo between", value1, value2, "errinfo");
            return (Criteria) this;
        }

        public Criteria andErrinfoNotBetween(String value1, String value2) {
            addCriterion("errinfo not between", value1, value2, "errinfo");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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