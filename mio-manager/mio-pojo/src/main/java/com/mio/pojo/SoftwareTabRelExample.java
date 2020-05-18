package com.mio.pojo;

import java.util.ArrayList;
import java.util.List;

public class SoftwareTabRelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SoftwareTabRelExample() {
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

        public Criteria andTabCodeIsNull() {
            addCriterion("tab_code is null");
            return (Criteria) this;
        }

        public Criteria andTabCodeIsNotNull() {
            addCriterion("tab_code is not null");
            return (Criteria) this;
        }

        public Criteria andTabCodeEqualTo(String value) {
            addCriterion("tab_code =", value, "tabCode");
            return (Criteria) this;
        }

        public Criteria andTabCodeNotEqualTo(String value) {
            addCriterion("tab_code <>", value, "tabCode");
            return (Criteria) this;
        }

        public Criteria andTabCodeGreaterThan(String value) {
            addCriterion("tab_code >", value, "tabCode");
            return (Criteria) this;
        }

        public Criteria andTabCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tab_code >=", value, "tabCode");
            return (Criteria) this;
        }

        public Criteria andTabCodeLessThan(String value) {
            addCriterion("tab_code <", value, "tabCode");
            return (Criteria) this;
        }

        public Criteria andTabCodeLessThanOrEqualTo(String value) {
            addCriterion("tab_code <=", value, "tabCode");
            return (Criteria) this;
        }

        public Criteria andTabCodeLike(String value) {
            addCriterion("tab_code like", value, "tabCode");
            return (Criteria) this;
        }

        public Criteria andTabCodeNotLike(String value) {
            addCriterion("tab_code not like", value, "tabCode");
            return (Criteria) this;
        }

        public Criteria andTabCodeIn(List<String> values) {
            addCriterion("tab_code in", values, "tabCode");
            return (Criteria) this;
        }

        public Criteria andTabCodeNotIn(List<String> values) {
            addCriterion("tab_code not in", values, "tabCode");
            return (Criteria) this;
        }

        public Criteria andTabCodeBetween(String value1, String value2) {
            addCriterion("tab_code between", value1, value2, "tabCode");
            return (Criteria) this;
        }

        public Criteria andTabCodeNotBetween(String value1, String value2) {
            addCriterion("tab_code not between", value1, value2, "tabCode");
            return (Criteria) this;
        }

        public Criteria andSoftwareIdIsNull() {
            addCriterion("software_id is null");
            return (Criteria) this;
        }

        public Criteria andSoftwareIdIsNotNull() {
            addCriterion("software_id is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwareIdEqualTo(Integer value) {
            addCriterion("software_id =", value, "softwareId");
            return (Criteria) this;
        }

        public Criteria andSoftwareIdNotEqualTo(Integer value) {
            addCriterion("software_id <>", value, "softwareId");
            return (Criteria) this;
        }

        public Criteria andSoftwareIdGreaterThan(Integer value) {
            addCriterion("software_id >", value, "softwareId");
            return (Criteria) this;
        }

        public Criteria andSoftwareIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("software_id >=", value, "softwareId");
            return (Criteria) this;
        }

        public Criteria andSoftwareIdLessThan(Integer value) {
            addCriterion("software_id <", value, "softwareId");
            return (Criteria) this;
        }

        public Criteria andSoftwareIdLessThanOrEqualTo(Integer value) {
            addCriterion("software_id <=", value, "softwareId");
            return (Criteria) this;
        }

        public Criteria andSoftwareIdIn(List<Integer> values) {
            addCriterion("software_id in", values, "softwareId");
            return (Criteria) this;
        }

        public Criteria andSoftwareIdNotIn(List<Integer> values) {
            addCriterion("software_id not in", values, "softwareId");
            return (Criteria) this;
        }

        public Criteria andSoftwareIdBetween(Integer value1, Integer value2) {
            addCriterion("software_id between", value1, value2, "softwareId");
            return (Criteria) this;
        }

        public Criteria andSoftwareIdNotBetween(Integer value1, Integer value2) {
            addCriterion("software_id not between", value1, value2, "softwareId");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNull() {
            addCriterion("orders is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNotNull() {
            addCriterion("orders is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersEqualTo(Integer value) {
            addCriterion("orders =", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotEqualTo(Integer value) {
            addCriterion("orders <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThan(Integer value) {
            addCriterion("orders >", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThan(Integer value) {
            addCriterion("orders <", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("orders <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersIn(List<Integer> values) {
            addCriterion("orders in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotIn(List<Integer> values) {
            addCriterion("orders not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersBetween(Integer value1, Integer value2) {
            addCriterion("orders between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("orders not between", value1, value2, "orders");
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