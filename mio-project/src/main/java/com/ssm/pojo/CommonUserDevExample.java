package com.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommonUserDevExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommonUserDevExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andDevidIsNull() {
            addCriterion("DEVID is null");
            return (Criteria) this;
        }

        public Criteria andDevidIsNotNull() {
            addCriterion("DEVID is not null");
            return (Criteria) this;
        }

        public Criteria andDevidEqualTo(String value) {
            addCriterion("DEVID =", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidNotEqualTo(String value) {
            addCriterion("DEVID <>", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidGreaterThan(String value) {
            addCriterion("DEVID >", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidGreaterThanOrEqualTo(String value) {
            addCriterion("DEVID >=", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidLessThan(String value) {
            addCriterion("DEVID <", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidLessThanOrEqualTo(String value) {
            addCriterion("DEVID <=", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidLike(String value) {
            addCriterion("DEVID like", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidNotLike(String value) {
            addCriterion("DEVID not like", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidIn(List<String> values) {
            addCriterion("DEVID in", values, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidNotIn(List<String> values) {
            addCriterion("DEVID not in", values, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidBetween(String value1, String value2) {
            addCriterion("DEVID between", value1, value2, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidNotBetween(String value1, String value2) {
            addCriterion("DEVID not between", value1, value2, "devid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBindingTimeIsNull() {
            addCriterion("binding_time is null");
            return (Criteria) this;
        }

        public Criteria andBindingTimeIsNotNull() {
            addCriterion("binding_time is not null");
            return (Criteria) this;
        }

        public Criteria andBindingTimeEqualTo(Date value) {
            addCriterion("binding_time =", value, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andBindingTimeNotEqualTo(Date value) {
            addCriterion("binding_time <>", value, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andBindingTimeGreaterThan(Date value) {
            addCriterion("binding_time >", value, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andBindingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("binding_time >=", value, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andBindingTimeLessThan(Date value) {
            addCriterion("binding_time <", value, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andBindingTimeLessThanOrEqualTo(Date value) {
            addCriterion("binding_time <=", value, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andBindingTimeIn(List<Date> values) {
            addCriterion("binding_time in", values, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andBindingTimeNotIn(List<Date> values) {
            addCriterion("binding_time not in", values, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andBindingTimeBetween(Date value1, Date value2) {
            addCriterion("binding_time between", value1, value2, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andBindingTimeNotBetween(Date value1, Date value2) {
            addCriterion("binding_time not between", value1, value2, "bindingTime");
            return (Criteria) this;
        }

        public Criteria andResField1IsNull() {
            addCriterion("RES_FIELD1 is null");
            return (Criteria) this;
        }

        public Criteria andResField1IsNotNull() {
            addCriterion("RES_FIELD1 is not null");
            return (Criteria) this;
        }

        public Criteria andResField1EqualTo(String value) {
            addCriterion("RES_FIELD1 =", value, "resField1");
            return (Criteria) this;
        }

        public Criteria andResField1NotEqualTo(String value) {
            addCriterion("RES_FIELD1 <>", value, "resField1");
            return (Criteria) this;
        }

        public Criteria andResField1GreaterThan(String value) {
            addCriterion("RES_FIELD1 >", value, "resField1");
            return (Criteria) this;
        }

        public Criteria andResField1GreaterThanOrEqualTo(String value) {
            addCriterion("RES_FIELD1 >=", value, "resField1");
            return (Criteria) this;
        }

        public Criteria andResField1LessThan(String value) {
            addCriterion("RES_FIELD1 <", value, "resField1");
            return (Criteria) this;
        }

        public Criteria andResField1LessThanOrEqualTo(String value) {
            addCriterion("RES_FIELD1 <=", value, "resField1");
            return (Criteria) this;
        }

        public Criteria andResField1Like(String value) {
            addCriterion("RES_FIELD1 like", value, "resField1");
            return (Criteria) this;
        }

        public Criteria andResField1NotLike(String value) {
            addCriterion("RES_FIELD1 not like", value, "resField1");
            return (Criteria) this;
        }

        public Criteria andResField1In(List<String> values) {
            addCriterion("RES_FIELD1 in", values, "resField1");
            return (Criteria) this;
        }

        public Criteria andResField1NotIn(List<String> values) {
            addCriterion("RES_FIELD1 not in", values, "resField1");
            return (Criteria) this;
        }

        public Criteria andResField1Between(String value1, String value2) {
            addCriterion("RES_FIELD1 between", value1, value2, "resField1");
            return (Criteria) this;
        }

        public Criteria andResField1NotBetween(String value1, String value2) {
            addCriterion("RES_FIELD1 not between", value1, value2, "resField1");
            return (Criteria) this;
        }

        public Criteria andResField2IsNull() {
            addCriterion("RES_FIELD2 is null");
            return (Criteria) this;
        }

        public Criteria andResField2IsNotNull() {
            addCriterion("RES_FIELD2 is not null");
            return (Criteria) this;
        }

        public Criteria andResField2EqualTo(String value) {
            addCriterion("RES_FIELD2 =", value, "resField2");
            return (Criteria) this;
        }

        public Criteria andResField2NotEqualTo(String value) {
            addCriterion("RES_FIELD2 <>", value, "resField2");
            return (Criteria) this;
        }

        public Criteria andResField2GreaterThan(String value) {
            addCriterion("RES_FIELD2 >", value, "resField2");
            return (Criteria) this;
        }

        public Criteria andResField2GreaterThanOrEqualTo(String value) {
            addCriterion("RES_FIELD2 >=", value, "resField2");
            return (Criteria) this;
        }

        public Criteria andResField2LessThan(String value) {
            addCriterion("RES_FIELD2 <", value, "resField2");
            return (Criteria) this;
        }

        public Criteria andResField2LessThanOrEqualTo(String value) {
            addCriterion("RES_FIELD2 <=", value, "resField2");
            return (Criteria) this;
        }

        public Criteria andResField2Like(String value) {
            addCriterion("RES_FIELD2 like", value, "resField2");
            return (Criteria) this;
        }

        public Criteria andResField2NotLike(String value) {
            addCriterion("RES_FIELD2 not like", value, "resField2");
            return (Criteria) this;
        }

        public Criteria andResField2In(List<String> values) {
            addCriterion("RES_FIELD2 in", values, "resField2");
            return (Criteria) this;
        }

        public Criteria andResField2NotIn(List<String> values) {
            addCriterion("RES_FIELD2 not in", values, "resField2");
            return (Criteria) this;
        }

        public Criteria andResField2Between(String value1, String value2) {
            addCriterion("RES_FIELD2 between", value1, value2, "resField2");
            return (Criteria) this;
        }

        public Criteria andResField2NotBetween(String value1, String value2) {
            addCriterion("RES_FIELD2 not between", value1, value2, "resField2");
            return (Criteria) this;
        }

        public Criteria andResField3IsNull() {
            addCriterion("RES_FIELD3 is null");
            return (Criteria) this;
        }

        public Criteria andResField3IsNotNull() {
            addCriterion("RES_FIELD3 is not null");
            return (Criteria) this;
        }

        public Criteria andResField3EqualTo(String value) {
            addCriterion("RES_FIELD3 =", value, "resField3");
            return (Criteria) this;
        }

        public Criteria andResField3NotEqualTo(String value) {
            addCriterion("RES_FIELD3 <>", value, "resField3");
            return (Criteria) this;
        }

        public Criteria andResField3GreaterThan(String value) {
            addCriterion("RES_FIELD3 >", value, "resField3");
            return (Criteria) this;
        }

        public Criteria andResField3GreaterThanOrEqualTo(String value) {
            addCriterion("RES_FIELD3 >=", value, "resField3");
            return (Criteria) this;
        }

        public Criteria andResField3LessThan(String value) {
            addCriterion("RES_FIELD3 <", value, "resField3");
            return (Criteria) this;
        }

        public Criteria andResField3LessThanOrEqualTo(String value) {
            addCriterion("RES_FIELD3 <=", value, "resField3");
            return (Criteria) this;
        }

        public Criteria andResField3Like(String value) {
            addCriterion("RES_FIELD3 like", value, "resField3");
            return (Criteria) this;
        }

        public Criteria andResField3NotLike(String value) {
            addCriterion("RES_FIELD3 not like", value, "resField3");
            return (Criteria) this;
        }

        public Criteria andResField3In(List<String> values) {
            addCriterion("RES_FIELD3 in", values, "resField3");
            return (Criteria) this;
        }

        public Criteria andResField3NotIn(List<String> values) {
            addCriterion("RES_FIELD3 not in", values, "resField3");
            return (Criteria) this;
        }

        public Criteria andResField3Between(String value1, String value2) {
            addCriterion("RES_FIELD3 between", value1, value2, "resField3");
            return (Criteria) this;
        }

        public Criteria andResField3NotBetween(String value1, String value2) {
            addCriterion("RES_FIELD3 not between", value1, value2, "resField3");
            return (Criteria) this;
        }

        public Criteria andResField4IsNull() {
            addCriterion("RES_FIELD4 is null");
            return (Criteria) this;
        }

        public Criteria andResField4IsNotNull() {
            addCriterion("RES_FIELD4 is not null");
            return (Criteria) this;
        }

        public Criteria andResField4EqualTo(String value) {
            addCriterion("RES_FIELD4 =", value, "resField4");
            return (Criteria) this;
        }

        public Criteria andResField4NotEqualTo(String value) {
            addCriterion("RES_FIELD4 <>", value, "resField4");
            return (Criteria) this;
        }

        public Criteria andResField4GreaterThan(String value) {
            addCriterion("RES_FIELD4 >", value, "resField4");
            return (Criteria) this;
        }

        public Criteria andResField4GreaterThanOrEqualTo(String value) {
            addCriterion("RES_FIELD4 >=", value, "resField4");
            return (Criteria) this;
        }

        public Criteria andResField4LessThan(String value) {
            addCriterion("RES_FIELD4 <", value, "resField4");
            return (Criteria) this;
        }

        public Criteria andResField4LessThanOrEqualTo(String value) {
            addCriterion("RES_FIELD4 <=", value, "resField4");
            return (Criteria) this;
        }

        public Criteria andResField4Like(String value) {
            addCriterion("RES_FIELD4 like", value, "resField4");
            return (Criteria) this;
        }

        public Criteria andResField4NotLike(String value) {
            addCriterion("RES_FIELD4 not like", value, "resField4");
            return (Criteria) this;
        }

        public Criteria andResField4In(List<String> values) {
            addCriterion("RES_FIELD4 in", values, "resField4");
            return (Criteria) this;
        }

        public Criteria andResField4NotIn(List<String> values) {
            addCriterion("RES_FIELD4 not in", values, "resField4");
            return (Criteria) this;
        }

        public Criteria andResField4Between(String value1, String value2) {
            addCriterion("RES_FIELD4 between", value1, value2, "resField4");
            return (Criteria) this;
        }

        public Criteria andResField4NotBetween(String value1, String value2) {
            addCriterion("RES_FIELD4 not between", value1, value2, "resField4");
            return (Criteria) this;
        }

        public Criteria andResField5IsNull() {
            addCriterion("RES_FIELD5 is null");
            return (Criteria) this;
        }

        public Criteria andResField5IsNotNull() {
            addCriterion("RES_FIELD5 is not null");
            return (Criteria) this;
        }

        public Criteria andResField5EqualTo(String value) {
            addCriterion("RES_FIELD5 =", value, "resField5");
            return (Criteria) this;
        }

        public Criteria andResField5NotEqualTo(String value) {
            addCriterion("RES_FIELD5 <>", value, "resField5");
            return (Criteria) this;
        }

        public Criteria andResField5GreaterThan(String value) {
            addCriterion("RES_FIELD5 >", value, "resField5");
            return (Criteria) this;
        }

        public Criteria andResField5GreaterThanOrEqualTo(String value) {
            addCriterion("RES_FIELD5 >=", value, "resField5");
            return (Criteria) this;
        }

        public Criteria andResField5LessThan(String value) {
            addCriterion("RES_FIELD5 <", value, "resField5");
            return (Criteria) this;
        }

        public Criteria andResField5LessThanOrEqualTo(String value) {
            addCriterion("RES_FIELD5 <=", value, "resField5");
            return (Criteria) this;
        }

        public Criteria andResField5Like(String value) {
            addCriterion("RES_FIELD5 like", value, "resField5");
            return (Criteria) this;
        }

        public Criteria andResField5NotLike(String value) {
            addCriterion("RES_FIELD5 not like", value, "resField5");
            return (Criteria) this;
        }

        public Criteria andResField5In(List<String> values) {
            addCriterion("RES_FIELD5 in", values, "resField5");
            return (Criteria) this;
        }

        public Criteria andResField5NotIn(List<String> values) {
            addCriterion("RES_FIELD5 not in", values, "resField5");
            return (Criteria) this;
        }

        public Criteria andResField5Between(String value1, String value2) {
            addCriterion("RES_FIELD5 between", value1, value2, "resField5");
            return (Criteria) this;
        }

        public Criteria andResField5NotBetween(String value1, String value2) {
            addCriterion("RES_FIELD5 not between", value1, value2, "resField5");
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