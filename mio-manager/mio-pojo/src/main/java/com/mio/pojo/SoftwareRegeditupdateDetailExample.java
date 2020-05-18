package com.mio.pojo;

import java.util.ArrayList;
import java.util.List;

public class SoftwareRegeditupdateDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SoftwareRegeditupdateDetailExample() {
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

        public Criteria andStepIdIsNull() {
            addCriterion("step_id is null");
            return (Criteria) this;
        }

        public Criteria andStepIdIsNotNull() {
            addCriterion("step_id is not null");
            return (Criteria) this;
        }

        public Criteria andStepIdEqualTo(Integer value) {
            addCriterion("step_id =", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotEqualTo(Integer value) {
            addCriterion("step_id <>", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdGreaterThan(Integer value) {
            addCriterion("step_id >", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("step_id >=", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdLessThan(Integer value) {
            addCriterion("step_id <", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdLessThanOrEqualTo(Integer value) {
            addCriterion("step_id <=", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdIn(List<Integer> values) {
            addCriterion("step_id in", values, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotIn(List<Integer> values) {
            addCriterion("step_id not in", values, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdBetween(Integer value1, Integer value2) {
            addCriterion("step_id between", value1, value2, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotBetween(Integer value1, Integer value2) {
            addCriterion("step_id not between", value1, value2, "stepId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNull() {
            addCriterion("detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(Integer value) {
            addCriterion("detail_id =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(Integer value) {
            addCriterion("detail_id <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(Integer value) {
            addCriterion("detail_id >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail_id >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(Integer value) {
            addCriterion("detail_id <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("detail_id <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<Integer> values) {
            addCriterion("detail_id in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<Integer> values) {
            addCriterion("detail_id not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("detail_id between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("detail_id not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailNameIsNull() {
            addCriterion("detail_name is null");
            return (Criteria) this;
        }

        public Criteria andDetailNameIsNotNull() {
            addCriterion("detail_name is not null");
            return (Criteria) this;
        }

        public Criteria andDetailNameEqualTo(String value) {
            addCriterion("detail_name =", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameNotEqualTo(String value) {
            addCriterion("detail_name <>", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameGreaterThan(String value) {
            addCriterion("detail_name >", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameGreaterThanOrEqualTo(String value) {
            addCriterion("detail_name >=", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameLessThan(String value) {
            addCriterion("detail_name <", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameLessThanOrEqualTo(String value) {
            addCriterion("detail_name <=", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameLike(String value) {
            addCriterion("detail_name like", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameNotLike(String value) {
            addCriterion("detail_name not like", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameIn(List<String> values) {
            addCriterion("detail_name in", values, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameNotIn(List<String> values) {
            addCriterion("detail_name not in", values, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameBetween(String value1, String value2) {
            addCriterion("detail_name between", value1, value2, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameNotBetween(String value1, String value2) {
            addCriterion("detail_name not between", value1, value2, "detailName");
            return (Criteria) this;
        }

        public Criteria andVActionIsNull() {
            addCriterion("v_action is null");
            return (Criteria) this;
        }

        public Criteria andVActionIsNotNull() {
            addCriterion("v_action is not null");
            return (Criteria) this;
        }

        public Criteria andVActionEqualTo(String value) {
            addCriterion("v_action =", value, "vAction");
            return (Criteria) this;
        }

        public Criteria andVActionNotEqualTo(String value) {
            addCriterion("v_action <>", value, "vAction");
            return (Criteria) this;
        }

        public Criteria andVActionGreaterThan(String value) {
            addCriterion("v_action >", value, "vAction");
            return (Criteria) this;
        }

        public Criteria andVActionGreaterThanOrEqualTo(String value) {
            addCriterion("v_action >=", value, "vAction");
            return (Criteria) this;
        }

        public Criteria andVActionLessThan(String value) {
            addCriterion("v_action <", value, "vAction");
            return (Criteria) this;
        }

        public Criteria andVActionLessThanOrEqualTo(String value) {
            addCriterion("v_action <=", value, "vAction");
            return (Criteria) this;
        }

        public Criteria andVActionLike(String value) {
            addCriterion("v_action like", value, "vAction");
            return (Criteria) this;
        }

        public Criteria andVActionNotLike(String value) {
            addCriterion("v_action not like", value, "vAction");
            return (Criteria) this;
        }

        public Criteria andVActionIn(List<String> values) {
            addCriterion("v_action in", values, "vAction");
            return (Criteria) this;
        }

        public Criteria andVActionNotIn(List<String> values) {
            addCriterion("v_action not in", values, "vAction");
            return (Criteria) this;
        }

        public Criteria andVActionBetween(String value1, String value2) {
            addCriterion("v_action between", value1, value2, "vAction");
            return (Criteria) this;
        }

        public Criteria andVActionNotBetween(String value1, String value2) {
            addCriterion("v_action not between", value1, value2, "vAction");
            return (Criteria) this;
        }

        public Criteria andVPathIsNull() {
            addCriterion("v_path is null");
            return (Criteria) this;
        }

        public Criteria andVPathIsNotNull() {
            addCriterion("v_path is not null");
            return (Criteria) this;
        }

        public Criteria andVPathEqualTo(String value) {
            addCriterion("v_path =", value, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathNotEqualTo(String value) {
            addCriterion("v_path <>", value, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathGreaterThan(String value) {
            addCriterion("v_path >", value, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathGreaterThanOrEqualTo(String value) {
            addCriterion("v_path >=", value, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathLessThan(String value) {
            addCriterion("v_path <", value, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathLessThanOrEqualTo(String value) {
            addCriterion("v_path <=", value, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathLike(String value) {
            addCriterion("v_path like", value, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathNotLike(String value) {
            addCriterion("v_path not like", value, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathIn(List<String> values) {
            addCriterion("v_path in", values, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathNotIn(List<String> values) {
            addCriterion("v_path not in", values, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathBetween(String value1, String value2) {
            addCriterion("v_path between", value1, value2, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathNotBetween(String value1, String value2) {
            addCriterion("v_path not between", value1, value2, "vPath");
            return (Criteria) this;
        }

        public Criteria andVKeyIsNull() {
            addCriterion("v_key is null");
            return (Criteria) this;
        }

        public Criteria andVKeyIsNotNull() {
            addCriterion("v_key is not null");
            return (Criteria) this;
        }

        public Criteria andVKeyEqualTo(String value) {
            addCriterion("v_key =", value, "vKey");
            return (Criteria) this;
        }

        public Criteria andVKeyNotEqualTo(String value) {
            addCriterion("v_key <>", value, "vKey");
            return (Criteria) this;
        }

        public Criteria andVKeyGreaterThan(String value) {
            addCriterion("v_key >", value, "vKey");
            return (Criteria) this;
        }

        public Criteria andVKeyGreaterThanOrEqualTo(String value) {
            addCriterion("v_key >=", value, "vKey");
            return (Criteria) this;
        }

        public Criteria andVKeyLessThan(String value) {
            addCriterion("v_key <", value, "vKey");
            return (Criteria) this;
        }

        public Criteria andVKeyLessThanOrEqualTo(String value) {
            addCriterion("v_key <=", value, "vKey");
            return (Criteria) this;
        }

        public Criteria andVKeyLike(String value) {
            addCriterion("v_key like", value, "vKey");
            return (Criteria) this;
        }

        public Criteria andVKeyNotLike(String value) {
            addCriterion("v_key not like", value, "vKey");
            return (Criteria) this;
        }

        public Criteria andVKeyIn(List<String> values) {
            addCriterion("v_key in", values, "vKey");
            return (Criteria) this;
        }

        public Criteria andVKeyNotIn(List<String> values) {
            addCriterion("v_key not in", values, "vKey");
            return (Criteria) this;
        }

        public Criteria andVKeyBetween(String value1, String value2) {
            addCriterion("v_key between", value1, value2, "vKey");
            return (Criteria) this;
        }

        public Criteria andVKeyNotBetween(String value1, String value2) {
            addCriterion("v_key not between", value1, value2, "vKey");
            return (Criteria) this;
        }

        public Criteria andVKeytypeIsNull() {
            addCriterion("v_keytype is null");
            return (Criteria) this;
        }

        public Criteria andVKeytypeIsNotNull() {
            addCriterion("v_keytype is not null");
            return (Criteria) this;
        }

        public Criteria andVKeytypeEqualTo(String value) {
            addCriterion("v_keytype =", value, "vKeytype");
            return (Criteria) this;
        }

        public Criteria andVKeytypeNotEqualTo(String value) {
            addCriterion("v_keytype <>", value, "vKeytype");
            return (Criteria) this;
        }

        public Criteria andVKeytypeGreaterThan(String value) {
            addCriterion("v_keytype >", value, "vKeytype");
            return (Criteria) this;
        }

        public Criteria andVKeytypeGreaterThanOrEqualTo(String value) {
            addCriterion("v_keytype >=", value, "vKeytype");
            return (Criteria) this;
        }

        public Criteria andVKeytypeLessThan(String value) {
            addCriterion("v_keytype <", value, "vKeytype");
            return (Criteria) this;
        }

        public Criteria andVKeytypeLessThanOrEqualTo(String value) {
            addCriterion("v_keytype <=", value, "vKeytype");
            return (Criteria) this;
        }

        public Criteria andVKeytypeLike(String value) {
            addCriterion("v_keytype like", value, "vKeytype");
            return (Criteria) this;
        }

        public Criteria andVKeytypeNotLike(String value) {
            addCriterion("v_keytype not like", value, "vKeytype");
            return (Criteria) this;
        }

        public Criteria andVKeytypeIn(List<String> values) {
            addCriterion("v_keytype in", values, "vKeytype");
            return (Criteria) this;
        }

        public Criteria andVKeytypeNotIn(List<String> values) {
            addCriterion("v_keytype not in", values, "vKeytype");
            return (Criteria) this;
        }

        public Criteria andVKeytypeBetween(String value1, String value2) {
            addCriterion("v_keytype between", value1, value2, "vKeytype");
            return (Criteria) this;
        }

        public Criteria andVKeytypeNotBetween(String value1, String value2) {
            addCriterion("v_keytype not between", value1, value2, "vKeytype");
            return (Criteria) this;
        }

        public Criteria andVValueIsNull() {
            addCriterion("v_value is null");
            return (Criteria) this;
        }

        public Criteria andVValueIsNotNull() {
            addCriterion("v_value is not null");
            return (Criteria) this;
        }

        public Criteria andVValueEqualTo(String value) {
            addCriterion("v_value =", value, "vValue");
            return (Criteria) this;
        }

        public Criteria andVValueNotEqualTo(String value) {
            addCriterion("v_value <>", value, "vValue");
            return (Criteria) this;
        }

        public Criteria andVValueGreaterThan(String value) {
            addCriterion("v_value >", value, "vValue");
            return (Criteria) this;
        }

        public Criteria andVValueGreaterThanOrEqualTo(String value) {
            addCriterion("v_value >=", value, "vValue");
            return (Criteria) this;
        }

        public Criteria andVValueLessThan(String value) {
            addCriterion("v_value <", value, "vValue");
            return (Criteria) this;
        }

        public Criteria andVValueLessThanOrEqualTo(String value) {
            addCriterion("v_value <=", value, "vValue");
            return (Criteria) this;
        }

        public Criteria andVValueLike(String value) {
            addCriterion("v_value like", value, "vValue");
            return (Criteria) this;
        }

        public Criteria andVValueNotLike(String value) {
            addCriterion("v_value not like", value, "vValue");
            return (Criteria) this;
        }

        public Criteria andVValueIn(List<String> values) {
            addCriterion("v_value in", values, "vValue");
            return (Criteria) this;
        }

        public Criteria andVValueNotIn(List<String> values) {
            addCriterion("v_value not in", values, "vValue");
            return (Criteria) this;
        }

        public Criteria andVValueBetween(String value1, String value2) {
            addCriterion("v_value between", value1, value2, "vValue");
            return (Criteria) this;
        }

        public Criteria andVValueNotBetween(String value1, String value2) {
            addCriterion("v_value not between", value1, value2, "vValue");
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