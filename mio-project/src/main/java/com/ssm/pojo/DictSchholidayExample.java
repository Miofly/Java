package com.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class DictSchholidayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictSchholidayExample() {
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

        public Criteria andHolidayDateIsNull() {
            addCriterion("HOLIDAY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andHolidayDateIsNotNull() {
            addCriterion("HOLIDAY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andHolidayDateEqualTo(String value) {
            addCriterion("HOLIDAY_DATE =", value, "holidayDate");
            return (Criteria) this;
        }

        public Criteria andHolidayDateNotEqualTo(String value) {
            addCriterion("HOLIDAY_DATE <>", value, "holidayDate");
            return (Criteria) this;
        }

        public Criteria andHolidayDateGreaterThan(String value) {
            addCriterion("HOLIDAY_DATE >", value, "holidayDate");
            return (Criteria) this;
        }

        public Criteria andHolidayDateGreaterThanOrEqualTo(String value) {
            addCriterion("HOLIDAY_DATE >=", value, "holidayDate");
            return (Criteria) this;
        }

        public Criteria andHolidayDateLessThan(String value) {
            addCriterion("HOLIDAY_DATE <", value, "holidayDate");
            return (Criteria) this;
        }

        public Criteria andHolidayDateLessThanOrEqualTo(String value) {
            addCriterion("HOLIDAY_DATE <=", value, "holidayDate");
            return (Criteria) this;
        }

        public Criteria andHolidayDateLike(String value) {
            addCriterion("HOLIDAY_DATE like", value, "holidayDate");
            return (Criteria) this;
        }

        public Criteria andHolidayDateNotLike(String value) {
            addCriterion("HOLIDAY_DATE not like", value, "holidayDate");
            return (Criteria) this;
        }

        public Criteria andHolidayDateIn(List<String> values) {
            addCriterion("HOLIDAY_DATE in", values, "holidayDate");
            return (Criteria) this;
        }

        public Criteria andHolidayDateNotIn(List<String> values) {
            addCriterion("HOLIDAY_DATE not in", values, "holidayDate");
            return (Criteria) this;
        }

        public Criteria andHolidayDateBetween(String value1, String value2) {
            addCriterion("HOLIDAY_DATE between", value1, value2, "holidayDate");
            return (Criteria) this;
        }

        public Criteria andHolidayDateNotBetween(String value1, String value2) {
            addCriterion("HOLIDAY_DATE not between", value1, value2, "holidayDate");
            return (Criteria) this;
        }

        public Criteria andHolidayNameIsNull() {
            addCriterion("HOLIDAY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHolidayNameIsNotNull() {
            addCriterion("HOLIDAY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHolidayNameEqualTo(String value) {
            addCriterion("HOLIDAY_NAME =", value, "holidayName");
            return (Criteria) this;
        }

        public Criteria andHolidayNameNotEqualTo(String value) {
            addCriterion("HOLIDAY_NAME <>", value, "holidayName");
            return (Criteria) this;
        }

        public Criteria andHolidayNameGreaterThan(String value) {
            addCriterion("HOLIDAY_NAME >", value, "holidayName");
            return (Criteria) this;
        }

        public Criteria andHolidayNameGreaterThanOrEqualTo(String value) {
            addCriterion("HOLIDAY_NAME >=", value, "holidayName");
            return (Criteria) this;
        }

        public Criteria andHolidayNameLessThan(String value) {
            addCriterion("HOLIDAY_NAME <", value, "holidayName");
            return (Criteria) this;
        }

        public Criteria andHolidayNameLessThanOrEqualTo(String value) {
            addCriterion("HOLIDAY_NAME <=", value, "holidayName");
            return (Criteria) this;
        }

        public Criteria andHolidayNameLike(String value) {
            addCriterion("HOLIDAY_NAME like", value, "holidayName");
            return (Criteria) this;
        }

        public Criteria andHolidayNameNotLike(String value) {
            addCriterion("HOLIDAY_NAME not like", value, "holidayName");
            return (Criteria) this;
        }

        public Criteria andHolidayNameIn(List<String> values) {
            addCriterion("HOLIDAY_NAME in", values, "holidayName");
            return (Criteria) this;
        }

        public Criteria andHolidayNameNotIn(List<String> values) {
            addCriterion("HOLIDAY_NAME not in", values, "holidayName");
            return (Criteria) this;
        }

        public Criteria andHolidayNameBetween(String value1, String value2) {
            addCriterion("HOLIDAY_NAME between", value1, value2, "holidayName");
            return (Criteria) this;
        }

        public Criteria andHolidayNameNotBetween(String value1, String value2) {
            addCriterion("HOLIDAY_NAME not between", value1, value2, "holidayName");
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