package com.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class DictSchtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictSchtypeExample() {
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

        public Criteria andSchTypeIsNull() {
            addCriterion("SCH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSchTypeIsNotNull() {
            addCriterion("SCH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSchTypeEqualTo(String value) {
            addCriterion("SCH_TYPE =", value, "schType");
            return (Criteria) this;
        }

        public Criteria andSchTypeNotEqualTo(String value) {
            addCriterion("SCH_TYPE <>", value, "schType");
            return (Criteria) this;
        }

        public Criteria andSchTypeGreaterThan(String value) {
            addCriterion("SCH_TYPE >", value, "schType");
            return (Criteria) this;
        }

        public Criteria andSchTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SCH_TYPE >=", value, "schType");
            return (Criteria) this;
        }

        public Criteria andSchTypeLessThan(String value) {
            addCriterion("SCH_TYPE <", value, "schType");
            return (Criteria) this;
        }

        public Criteria andSchTypeLessThanOrEqualTo(String value) {
            addCriterion("SCH_TYPE <=", value, "schType");
            return (Criteria) this;
        }

        public Criteria andSchTypeLike(String value) {
            addCriterion("SCH_TYPE like", value, "schType");
            return (Criteria) this;
        }

        public Criteria andSchTypeNotLike(String value) {
            addCriterion("SCH_TYPE not like", value, "schType");
            return (Criteria) this;
        }

        public Criteria andSchTypeIn(List<String> values) {
            addCriterion("SCH_TYPE in", values, "schType");
            return (Criteria) this;
        }

        public Criteria andSchTypeNotIn(List<String> values) {
            addCriterion("SCH_TYPE not in", values, "schType");
            return (Criteria) this;
        }

        public Criteria andSchTypeBetween(String value1, String value2) {
            addCriterion("SCH_TYPE between", value1, value2, "schType");
            return (Criteria) this;
        }

        public Criteria andSchTypeNotBetween(String value1, String value2) {
            addCriterion("SCH_TYPE not between", value1, value2, "schType");
            return (Criteria) this;
        }

        public Criteria andSchTypenameIsNull() {
            addCriterion("SCH_TYPENAME is null");
            return (Criteria) this;
        }

        public Criteria andSchTypenameIsNotNull() {
            addCriterion("SCH_TYPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andSchTypenameEqualTo(String value) {
            addCriterion("SCH_TYPENAME =", value, "schTypename");
            return (Criteria) this;
        }

        public Criteria andSchTypenameNotEqualTo(String value) {
            addCriterion("SCH_TYPENAME <>", value, "schTypename");
            return (Criteria) this;
        }

        public Criteria andSchTypenameGreaterThan(String value) {
            addCriterion("SCH_TYPENAME >", value, "schTypename");
            return (Criteria) this;
        }

        public Criteria andSchTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("SCH_TYPENAME >=", value, "schTypename");
            return (Criteria) this;
        }

        public Criteria andSchTypenameLessThan(String value) {
            addCriterion("SCH_TYPENAME <", value, "schTypename");
            return (Criteria) this;
        }

        public Criteria andSchTypenameLessThanOrEqualTo(String value) {
            addCriterion("SCH_TYPENAME <=", value, "schTypename");
            return (Criteria) this;
        }

        public Criteria andSchTypenameLike(String value) {
            addCriterion("SCH_TYPENAME like", value, "schTypename");
            return (Criteria) this;
        }

        public Criteria andSchTypenameNotLike(String value) {
            addCriterion("SCH_TYPENAME not like", value, "schTypename");
            return (Criteria) this;
        }

        public Criteria andSchTypenameIn(List<String> values) {
            addCriterion("SCH_TYPENAME in", values, "schTypename");
            return (Criteria) this;
        }

        public Criteria andSchTypenameNotIn(List<String> values) {
            addCriterion("SCH_TYPENAME not in", values, "schTypename");
            return (Criteria) this;
        }

        public Criteria andSchTypenameBetween(String value1, String value2) {
            addCriterion("SCH_TYPENAME between", value1, value2, "schTypename");
            return (Criteria) this;
        }

        public Criteria andSchTypenameNotBetween(String value1, String value2) {
            addCriterion("SCH_TYPENAME not between", value1, value2, "schTypename");
            return (Criteria) this;
        }

        public Criteria andSchColorIsNull() {
            addCriterion("SCH_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andSchColorIsNotNull() {
            addCriterion("SCH_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andSchColorEqualTo(String value) {
            addCriterion("SCH_COLOR =", value, "schColor");
            return (Criteria) this;
        }

        public Criteria andSchColorNotEqualTo(String value) {
            addCriterion("SCH_COLOR <>", value, "schColor");
            return (Criteria) this;
        }

        public Criteria andSchColorGreaterThan(String value) {
            addCriterion("SCH_COLOR >", value, "schColor");
            return (Criteria) this;
        }

        public Criteria andSchColorGreaterThanOrEqualTo(String value) {
            addCriterion("SCH_COLOR >=", value, "schColor");
            return (Criteria) this;
        }

        public Criteria andSchColorLessThan(String value) {
            addCriterion("SCH_COLOR <", value, "schColor");
            return (Criteria) this;
        }

        public Criteria andSchColorLessThanOrEqualTo(String value) {
            addCriterion("SCH_COLOR <=", value, "schColor");
            return (Criteria) this;
        }

        public Criteria andSchColorLike(String value) {
            addCriterion("SCH_COLOR like", value, "schColor");
            return (Criteria) this;
        }

        public Criteria andSchColorNotLike(String value) {
            addCriterion("SCH_COLOR not like", value, "schColor");
            return (Criteria) this;
        }

        public Criteria andSchColorIn(List<String> values) {
            addCriterion("SCH_COLOR in", values, "schColor");
            return (Criteria) this;
        }

        public Criteria andSchColorNotIn(List<String> values) {
            addCriterion("SCH_COLOR not in", values, "schColor");
            return (Criteria) this;
        }

        public Criteria andSchColorBetween(String value1, String value2) {
            addCriterion("SCH_COLOR between", value1, value2, "schColor");
            return (Criteria) this;
        }

        public Criteria andSchColorNotBetween(String value1, String value2) {
            addCriterion("SCH_COLOR not between", value1, value2, "schColor");
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