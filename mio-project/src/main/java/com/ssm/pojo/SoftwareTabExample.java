package com.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class SoftwareTabExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SoftwareTabExample() {
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

        public Criteria andTabNameIsNull() {
            addCriterion("tab_name is null");
            return (Criteria) this;
        }

        public Criteria andTabNameIsNotNull() {
            addCriterion("tab_name is not null");
            return (Criteria) this;
        }

        public Criteria andTabNameEqualTo(String value) {
            addCriterion("tab_name =", value, "tabName");
            return (Criteria) this;
        }

        public Criteria andTabNameNotEqualTo(String value) {
            addCriterion("tab_name <>", value, "tabName");
            return (Criteria) this;
        }

        public Criteria andTabNameGreaterThan(String value) {
            addCriterion("tab_name >", value, "tabName");
            return (Criteria) this;
        }

        public Criteria andTabNameGreaterThanOrEqualTo(String value) {
            addCriterion("tab_name >=", value, "tabName");
            return (Criteria) this;
        }

        public Criteria andTabNameLessThan(String value) {
            addCriterion("tab_name <", value, "tabName");
            return (Criteria) this;
        }

        public Criteria andTabNameLessThanOrEqualTo(String value) {
            addCriterion("tab_name <=", value, "tabName");
            return (Criteria) this;
        }

        public Criteria andTabNameLike(String value) {
            addCriterion("tab_name like", value, "tabName");
            return (Criteria) this;
        }

        public Criteria andTabNameNotLike(String value) {
            addCriterion("tab_name not like", value, "tabName");
            return (Criteria) this;
        }

        public Criteria andTabNameIn(List<String> values) {
            addCriterion("tab_name in", values, "tabName");
            return (Criteria) this;
        }

        public Criteria andTabNameNotIn(List<String> values) {
            addCriterion("tab_name not in", values, "tabName");
            return (Criteria) this;
        }

        public Criteria andTabNameBetween(String value1, String value2) {
            addCriterion("tab_name between", value1, value2, "tabName");
            return (Criteria) this;
        }

        public Criteria andTabNameNotBetween(String value1, String value2) {
            addCriterion("tab_name not between", value1, value2, "tabName");
            return (Criteria) this;
        }

        public Criteria andTabOrderIsNull() {
            addCriterion("tab_order is null");
            return (Criteria) this;
        }

        public Criteria andTabOrderIsNotNull() {
            addCriterion("tab_order is not null");
            return (Criteria) this;
        }

        public Criteria andTabOrderEqualTo(Integer value) {
            addCriterion("tab_order =", value, "tabOrder");
            return (Criteria) this;
        }

        public Criteria andTabOrderNotEqualTo(Integer value) {
            addCriterion("tab_order <>", value, "tabOrder");
            return (Criteria) this;
        }

        public Criteria andTabOrderGreaterThan(Integer value) {
            addCriterion("tab_order >", value, "tabOrder");
            return (Criteria) this;
        }

        public Criteria andTabOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("tab_order >=", value, "tabOrder");
            return (Criteria) this;
        }

        public Criteria andTabOrderLessThan(Integer value) {
            addCriterion("tab_order <", value, "tabOrder");
            return (Criteria) this;
        }

        public Criteria andTabOrderLessThanOrEqualTo(Integer value) {
            addCriterion("tab_order <=", value, "tabOrder");
            return (Criteria) this;
        }

        public Criteria andTabOrderIn(List<Integer> values) {
            addCriterion("tab_order in", values, "tabOrder");
            return (Criteria) this;
        }

        public Criteria andTabOrderNotIn(List<Integer> values) {
            addCriterion("tab_order not in", values, "tabOrder");
            return (Criteria) this;
        }

        public Criteria andTabOrderBetween(Integer value1, Integer value2) {
            addCriterion("tab_order between", value1, value2, "tabOrder");
            return (Criteria) this;
        }

        public Criteria andTabOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("tab_order not between", value1, value2, "tabOrder");
            return (Criteria) this;
        }

        public Criteria andTabStatusIsNull() {
            addCriterion("tab_status is null");
            return (Criteria) this;
        }

        public Criteria andTabStatusIsNotNull() {
            addCriterion("tab_status is not null");
            return (Criteria) this;
        }

        public Criteria andTabStatusEqualTo(String value) {
            addCriterion("tab_status =", value, "tabStatus");
            return (Criteria) this;
        }

        public Criteria andTabStatusNotEqualTo(String value) {
            addCriterion("tab_status <>", value, "tabStatus");
            return (Criteria) this;
        }

        public Criteria andTabStatusGreaterThan(String value) {
            addCriterion("tab_status >", value, "tabStatus");
            return (Criteria) this;
        }

        public Criteria andTabStatusGreaterThanOrEqualTo(String value) {
            addCriterion("tab_status >=", value, "tabStatus");
            return (Criteria) this;
        }

        public Criteria andTabStatusLessThan(String value) {
            addCriterion("tab_status <", value, "tabStatus");
            return (Criteria) this;
        }

        public Criteria andTabStatusLessThanOrEqualTo(String value) {
            addCriterion("tab_status <=", value, "tabStatus");
            return (Criteria) this;
        }

        public Criteria andTabStatusLike(String value) {
            addCriterion("tab_status like", value, "tabStatus");
            return (Criteria) this;
        }

        public Criteria andTabStatusNotLike(String value) {
            addCriterion("tab_status not like", value, "tabStatus");
            return (Criteria) this;
        }

        public Criteria andTabStatusIn(List<String> values) {
            addCriterion("tab_status in", values, "tabStatus");
            return (Criteria) this;
        }

        public Criteria andTabStatusNotIn(List<String> values) {
            addCriterion("tab_status not in", values, "tabStatus");
            return (Criteria) this;
        }

        public Criteria andTabStatusBetween(String value1, String value2) {
            addCriterion("tab_status between", value1, value2, "tabStatus");
            return (Criteria) this;
        }

        public Criteria andTabStatusNotBetween(String value1, String value2) {
            addCriterion("tab_status not between", value1, value2, "tabStatus");
            return (Criteria) this;
        }

        public Criteria andTabDescIsNull() {
            addCriterion("tab_desc is null");
            return (Criteria) this;
        }

        public Criteria andTabDescIsNotNull() {
            addCriterion("tab_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTabDescEqualTo(String value) {
            addCriterion("tab_desc =", value, "tabDesc");
            return (Criteria) this;
        }

        public Criteria andTabDescNotEqualTo(String value) {
            addCriterion("tab_desc <>", value, "tabDesc");
            return (Criteria) this;
        }

        public Criteria andTabDescGreaterThan(String value) {
            addCriterion("tab_desc >", value, "tabDesc");
            return (Criteria) this;
        }

        public Criteria andTabDescGreaterThanOrEqualTo(String value) {
            addCriterion("tab_desc >=", value, "tabDesc");
            return (Criteria) this;
        }

        public Criteria andTabDescLessThan(String value) {
            addCriterion("tab_desc <", value, "tabDesc");
            return (Criteria) this;
        }

        public Criteria andTabDescLessThanOrEqualTo(String value) {
            addCriterion("tab_desc <=", value, "tabDesc");
            return (Criteria) this;
        }

        public Criteria andTabDescLike(String value) {
            addCriterion("tab_desc like", value, "tabDesc");
            return (Criteria) this;
        }

        public Criteria andTabDescNotLike(String value) {
            addCriterion("tab_desc not like", value, "tabDesc");
            return (Criteria) this;
        }

        public Criteria andTabDescIn(List<String> values) {
            addCriterion("tab_desc in", values, "tabDesc");
            return (Criteria) this;
        }

        public Criteria andTabDescNotIn(List<String> values) {
            addCriterion("tab_desc not in", values, "tabDesc");
            return (Criteria) this;
        }

        public Criteria andTabDescBetween(String value1, String value2) {
            addCriterion("tab_desc between", value1, value2, "tabDesc");
            return (Criteria) this;
        }

        public Criteria andTabDescNotBetween(String value1, String value2) {
            addCriterion("tab_desc not between", value1, value2, "tabDesc");
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