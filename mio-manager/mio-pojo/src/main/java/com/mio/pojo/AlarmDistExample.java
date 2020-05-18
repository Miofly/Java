package com.mio.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AlarmDistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlarmDistExample() {
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

        public Criteria andDistTypeIsNull() {
            addCriterion("DIST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDistTypeIsNotNull() {
            addCriterion("DIST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDistTypeEqualTo(String value) {
            addCriterion("DIST_TYPE =", value, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeNotEqualTo(String value) {
            addCriterion("DIST_TYPE <>", value, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeGreaterThan(String value) {
            addCriterion("DIST_TYPE >", value, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DIST_TYPE >=", value, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeLessThan(String value) {
            addCriterion("DIST_TYPE <", value, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeLessThanOrEqualTo(String value) {
            addCriterion("DIST_TYPE <=", value, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeLike(String value) {
            addCriterion("DIST_TYPE like", value, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeNotLike(String value) {
            addCriterion("DIST_TYPE not like", value, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeIn(List<String> values) {
            addCriterion("DIST_TYPE in", values, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeNotIn(List<String> values) {
            addCriterion("DIST_TYPE not in", values, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeBetween(String value1, String value2) {
            addCriterion("DIST_TYPE between", value1, value2, "distType");
            return (Criteria) this;
        }

        public Criteria andDistTypeNotBetween(String value1, String value2) {
            addCriterion("DIST_TYPE not between", value1, value2, "distType");
            return (Criteria) this;
        }

        public Criteria andDistNameIsNull() {
            addCriterion("DIST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDistNameIsNotNull() {
            addCriterion("DIST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDistNameEqualTo(String value) {
            addCriterion("DIST_NAME =", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameNotEqualTo(String value) {
            addCriterion("DIST_NAME <>", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameGreaterThan(String value) {
            addCriterion("DIST_NAME >", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameGreaterThanOrEqualTo(String value) {
            addCriterion("DIST_NAME >=", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameLessThan(String value) {
            addCriterion("DIST_NAME <", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameLessThanOrEqualTo(String value) {
            addCriterion("DIST_NAME <=", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameLike(String value) {
            addCriterion("DIST_NAME like", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameNotLike(String value) {
            addCriterion("DIST_NAME not like", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameIn(List<String> values) {
            addCriterion("DIST_NAME in", values, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameNotIn(List<String> values) {
            addCriterion("DIST_NAME not in", values, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameBetween(String value1, String value2) {
            addCriterion("DIST_NAME between", value1, value2, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameNotBetween(String value1, String value2) {
            addCriterion("DIST_NAME not between", value1, value2, "distName");
            return (Criteria) this;
        }

        public Criteria andDistSroceIsNull() {
            addCriterion("DIST_SROCE is null");
            return (Criteria) this;
        }

        public Criteria andDistSroceIsNotNull() {
            addCriterion("DIST_SROCE is not null");
            return (Criteria) this;
        }

        public Criteria andDistSroceEqualTo(BigDecimal value) {
            addCriterion("DIST_SROCE =", value, "distSroce");
            return (Criteria) this;
        }

        public Criteria andDistSroceNotEqualTo(BigDecimal value) {
            addCriterion("DIST_SROCE <>", value, "distSroce");
            return (Criteria) this;
        }

        public Criteria andDistSroceGreaterThan(BigDecimal value) {
            addCriterion("DIST_SROCE >", value, "distSroce");
            return (Criteria) this;
        }

        public Criteria andDistSroceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DIST_SROCE >=", value, "distSroce");
            return (Criteria) this;
        }

        public Criteria andDistSroceLessThan(BigDecimal value) {
            addCriterion("DIST_SROCE <", value, "distSroce");
            return (Criteria) this;
        }

        public Criteria andDistSroceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DIST_SROCE <=", value, "distSroce");
            return (Criteria) this;
        }

        public Criteria andDistSroceIn(List<BigDecimal> values) {
            addCriterion("DIST_SROCE in", values, "distSroce");
            return (Criteria) this;
        }

        public Criteria andDistSroceNotIn(List<BigDecimal> values) {
            addCriterion("DIST_SROCE not in", values, "distSroce");
            return (Criteria) this;
        }

        public Criteria andDistSroceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIST_SROCE between", value1, value2, "distSroce");
            return (Criteria) this;
        }

        public Criteria andDistSroceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIST_SROCE not between", value1, value2, "distSroce");
            return (Criteria) this;
        }

        public Criteria andDistCountIsNull() {
            addCriterion("DIST_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andDistCountIsNotNull() {
            addCriterion("DIST_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDistCountEqualTo(Integer value) {
            addCriterion("DIST_COUNT =", value, "distCount");
            return (Criteria) this;
        }

        public Criteria andDistCountNotEqualTo(Integer value) {
            addCriterion("DIST_COUNT <>", value, "distCount");
            return (Criteria) this;
        }

        public Criteria andDistCountGreaterThan(Integer value) {
            addCriterion("DIST_COUNT >", value, "distCount");
            return (Criteria) this;
        }

        public Criteria andDistCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("DIST_COUNT >=", value, "distCount");
            return (Criteria) this;
        }

        public Criteria andDistCountLessThan(Integer value) {
            addCriterion("DIST_COUNT <", value, "distCount");
            return (Criteria) this;
        }

        public Criteria andDistCountLessThanOrEqualTo(Integer value) {
            addCriterion("DIST_COUNT <=", value, "distCount");
            return (Criteria) this;
        }

        public Criteria andDistCountIn(List<Integer> values) {
            addCriterion("DIST_COUNT in", values, "distCount");
            return (Criteria) this;
        }

        public Criteria andDistCountNotIn(List<Integer> values) {
            addCriterion("DIST_COUNT not in", values, "distCount");
            return (Criteria) this;
        }

        public Criteria andDistCountBetween(Integer value1, Integer value2) {
            addCriterion("DIST_COUNT between", value1, value2, "distCount");
            return (Criteria) this;
        }

        public Criteria andDistCountNotBetween(Integer value1, Integer value2) {
            addCriterion("DIST_COUNT not between", value1, value2, "distCount");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNull() {
            addCriterion("IN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNotNull() {
            addCriterion("IN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInTimeEqualTo(String value) {
            addCriterion("IN_TIME =", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotEqualTo(String value) {
            addCriterion("IN_TIME <>", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThan(String value) {
            addCriterion("IN_TIME >", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThanOrEqualTo(String value) {
            addCriterion("IN_TIME >=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThan(String value) {
            addCriterion("IN_TIME <", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThanOrEqualTo(String value) {
            addCriterion("IN_TIME <=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLike(String value) {
            addCriterion("IN_TIME like", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotLike(String value) {
            addCriterion("IN_TIME not like", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeIn(List<String> values) {
            addCriterion("IN_TIME in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotIn(List<String> values) {
            addCriterion("IN_TIME not in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeBetween(String value1, String value2) {
            addCriterion("IN_TIME between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotBetween(String value1, String value2) {
            addCriterion("IN_TIME not between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andInIdIsNull() {
            addCriterion("IN_ID is null");
            return (Criteria) this;
        }

        public Criteria andInIdIsNotNull() {
            addCriterion("IN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInIdEqualTo(String value) {
            addCriterion("IN_ID =", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdNotEqualTo(String value) {
            addCriterion("IN_ID <>", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdGreaterThan(String value) {
            addCriterion("IN_ID >", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdGreaterThanOrEqualTo(String value) {
            addCriterion("IN_ID >=", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdLessThan(String value) {
            addCriterion("IN_ID <", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdLessThanOrEqualTo(String value) {
            addCriterion("IN_ID <=", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdLike(String value) {
            addCriterion("IN_ID like", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdNotLike(String value) {
            addCriterion("IN_ID not like", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdIn(List<String> values) {
            addCriterion("IN_ID in", values, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdNotIn(List<String> values) {
            addCriterion("IN_ID not in", values, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdBetween(String value1, String value2) {
            addCriterion("IN_ID between", value1, value2, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdNotBetween(String value1, String value2) {
            addCriterion("IN_ID not between", value1, value2, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdSdIsNull() {
            addCriterion("IN_ID_SD is null");
            return (Criteria) this;
        }

        public Criteria andInIdSdIsNotNull() {
            addCriterion("IN_ID_SD is not null");
            return (Criteria) this;
        }

        public Criteria andInIdSdEqualTo(String value) {
            addCriterion("IN_ID_SD =", value, "inIdSd");
            return (Criteria) this;
        }

        public Criteria andInIdSdNotEqualTo(String value) {
            addCriterion("IN_ID_SD <>", value, "inIdSd");
            return (Criteria) this;
        }

        public Criteria andInIdSdGreaterThan(String value) {
            addCriterion("IN_ID_SD >", value, "inIdSd");
            return (Criteria) this;
        }

        public Criteria andInIdSdGreaterThanOrEqualTo(String value) {
            addCriterion("IN_ID_SD >=", value, "inIdSd");
            return (Criteria) this;
        }

        public Criteria andInIdSdLessThan(String value) {
            addCriterion("IN_ID_SD <", value, "inIdSd");
            return (Criteria) this;
        }

        public Criteria andInIdSdLessThanOrEqualTo(String value) {
            addCriterion("IN_ID_SD <=", value, "inIdSd");
            return (Criteria) this;
        }

        public Criteria andInIdSdLike(String value) {
            addCriterion("IN_ID_SD like", value, "inIdSd");
            return (Criteria) this;
        }

        public Criteria andInIdSdNotLike(String value) {
            addCriterion("IN_ID_SD not like", value, "inIdSd");
            return (Criteria) this;
        }

        public Criteria andInIdSdIn(List<String> values) {
            addCriterion("IN_ID_SD in", values, "inIdSd");
            return (Criteria) this;
        }

        public Criteria andInIdSdNotIn(List<String> values) {
            addCriterion("IN_ID_SD not in", values, "inIdSd");
            return (Criteria) this;
        }

        public Criteria andInIdSdBetween(String value1, String value2) {
            addCriterion("IN_ID_SD between", value1, value2, "inIdSd");
            return (Criteria) this;
        }

        public Criteria andInIdSdNotBetween(String value1, String value2) {
            addCriterion("IN_ID_SD not between", value1, value2, "inIdSd");
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