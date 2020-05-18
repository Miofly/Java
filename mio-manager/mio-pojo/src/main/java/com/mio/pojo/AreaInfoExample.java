package com.mio.pojo;

import java.util.ArrayList;
import java.util.List;

public class AreaInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaInfoExample() {
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

        public Criteria andAreaIdIsNull() {
            addCriterion("AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Long value) {
            addCriterion("AREA_ID =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Long value) {
            addCriterion("AREA_ID <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Long value) {
            addCriterion("AREA_ID >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AREA_ID >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Long value) {
            addCriterion("AREA_ID <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("AREA_ID <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Long> values) {
            addCriterion("AREA_ID in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Long> values) {
            addCriterion("AREA_ID not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Long value1, Long value2) {
            addCriterion("AREA_ID between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("AREA_ID not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("AREA_CODE like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("AREA_CODE not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("AREA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("AREA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("AREA_NAME =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("AREA_NAME <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("AREA_NAME >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_NAME >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("AREA_NAME <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("AREA_NAME <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("AREA_NAME like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("AREA_NAME not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("AREA_NAME in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("AREA_NAME not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("AREA_NAME between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("AREA_NAME not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andPtAreaIdIsNull() {
            addCriterion("PT_AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andPtAreaIdIsNotNull() {
            addCriterion("PT_AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPtAreaIdEqualTo(Long value) {
            addCriterion("PT_AREA_ID =", value, "ptAreaId");
            return (Criteria) this;
        }

        public Criteria andPtAreaIdNotEqualTo(Long value) {
            addCriterion("PT_AREA_ID <>", value, "ptAreaId");
            return (Criteria) this;
        }

        public Criteria andPtAreaIdGreaterThan(Long value) {
            addCriterion("PT_AREA_ID >", value, "ptAreaId");
            return (Criteria) this;
        }

        public Criteria andPtAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PT_AREA_ID >=", value, "ptAreaId");
            return (Criteria) this;
        }

        public Criteria andPtAreaIdLessThan(Long value) {
            addCriterion("PT_AREA_ID <", value, "ptAreaId");
            return (Criteria) this;
        }

        public Criteria andPtAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("PT_AREA_ID <=", value, "ptAreaId");
            return (Criteria) this;
        }

        public Criteria andPtAreaIdIn(List<Long> values) {
            addCriterion("PT_AREA_ID in", values, "ptAreaId");
            return (Criteria) this;
        }

        public Criteria andPtAreaIdNotIn(List<Long> values) {
            addCriterion("PT_AREA_ID not in", values, "ptAreaId");
            return (Criteria) this;
        }

        public Criteria andPtAreaIdBetween(Long value1, Long value2) {
            addCriterion("PT_AREA_ID between", value1, value2, "ptAreaId");
            return (Criteria) this;
        }

        public Criteria andPtAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("PT_AREA_ID not between", value1, value2, "ptAreaId");
            return (Criteria) this;
        }

        public Criteria andLanIdIsNull() {
            addCriterion("LAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andLanIdIsNotNull() {
            addCriterion("LAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLanIdEqualTo(Integer value) {
            addCriterion("LAN_ID =", value, "lanId");
            return (Criteria) this;
        }

        public Criteria andLanIdNotEqualTo(Integer value) {
            addCriterion("LAN_ID <>", value, "lanId");
            return (Criteria) this;
        }

        public Criteria andLanIdGreaterThan(Integer value) {
            addCriterion("LAN_ID >", value, "lanId");
            return (Criteria) this;
        }

        public Criteria andLanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LAN_ID >=", value, "lanId");
            return (Criteria) this;
        }

        public Criteria andLanIdLessThan(Integer value) {
            addCriterion("LAN_ID <", value, "lanId");
            return (Criteria) this;
        }

        public Criteria andLanIdLessThanOrEqualTo(Integer value) {
            addCriterion("LAN_ID <=", value, "lanId");
            return (Criteria) this;
        }

        public Criteria andLanIdIn(List<Integer> values) {
            addCriterion("LAN_ID in", values, "lanId");
            return (Criteria) this;
        }

        public Criteria andLanIdNotIn(List<Integer> values) {
            addCriterion("LAN_ID not in", values, "lanId");
            return (Criteria) this;
        }

        public Criteria andLanIdBetween(Integer value1, Integer value2) {
            addCriterion("LAN_ID between", value1, value2, "lanId");
            return (Criteria) this;
        }

        public Criteria andLanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LAN_ID not between", value1, value2, "lanId");
            return (Criteria) this;
        }

        public Criteria andXIsNull() {
            addCriterion("X is null");
            return (Criteria) this;
        }

        public Criteria andXIsNotNull() {
            addCriterion("X is not null");
            return (Criteria) this;
        }

        public Criteria andXEqualTo(String value) {
            addCriterion("X =", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotEqualTo(String value) {
            addCriterion("X <>", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThan(String value) {
            addCriterion("X >", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThanOrEqualTo(String value) {
            addCriterion("X >=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThan(String value) {
            addCriterion("X <", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThanOrEqualTo(String value) {
            addCriterion("X <=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLike(String value) {
            addCriterion("X like", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotLike(String value) {
            addCriterion("X not like", value, "x");
            return (Criteria) this;
        }

        public Criteria andXIn(List<String> values) {
            addCriterion("X in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXNotIn(List<String> values) {
            addCriterion("X not in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXBetween(String value1, String value2) {
            addCriterion("X between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andXNotBetween(String value1, String value2) {
            addCriterion("X not between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andYIsNull() {
            addCriterion("Y is null");
            return (Criteria) this;
        }

        public Criteria andYIsNotNull() {
            addCriterion("Y is not null");
            return (Criteria) this;
        }

        public Criteria andYEqualTo(String value) {
            addCriterion("Y =", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotEqualTo(String value) {
            addCriterion("Y <>", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThan(String value) {
            addCriterion("Y >", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThanOrEqualTo(String value) {
            addCriterion("Y >=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThan(String value) {
            addCriterion("Y <", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThanOrEqualTo(String value) {
            addCriterion("Y <=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLike(String value) {
            addCriterion("Y like", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotLike(String value) {
            addCriterion("Y not like", value, "y");
            return (Criteria) this;
        }

        public Criteria andYIn(List<String> values) {
            addCriterion("Y in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYNotIn(List<String> values) {
            addCriterion("Y not in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYBetween(String value1, String value2) {
            addCriterion("Y between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andYNotBetween(String value1, String value2) {
            addCriterion("Y not between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andBareaNameIsNull() {
            addCriterion("BAREA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBareaNameIsNotNull() {
            addCriterion("BAREA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBareaNameEqualTo(String value) {
            addCriterion("BAREA_NAME =", value, "bareaName");
            return (Criteria) this;
        }

        public Criteria andBareaNameNotEqualTo(String value) {
            addCriterion("BAREA_NAME <>", value, "bareaName");
            return (Criteria) this;
        }

        public Criteria andBareaNameGreaterThan(String value) {
            addCriterion("BAREA_NAME >", value, "bareaName");
            return (Criteria) this;
        }

        public Criteria andBareaNameGreaterThanOrEqualTo(String value) {
            addCriterion("BAREA_NAME >=", value, "bareaName");
            return (Criteria) this;
        }

        public Criteria andBareaNameLessThan(String value) {
            addCriterion("BAREA_NAME <", value, "bareaName");
            return (Criteria) this;
        }

        public Criteria andBareaNameLessThanOrEqualTo(String value) {
            addCriterion("BAREA_NAME <=", value, "bareaName");
            return (Criteria) this;
        }

        public Criteria andBareaNameLike(String value) {
            addCriterion("BAREA_NAME like", value, "bareaName");
            return (Criteria) this;
        }

        public Criteria andBareaNameNotLike(String value) {
            addCriterion("BAREA_NAME not like", value, "bareaName");
            return (Criteria) this;
        }

        public Criteria andBareaNameIn(List<String> values) {
            addCriterion("BAREA_NAME in", values, "bareaName");
            return (Criteria) this;
        }

        public Criteria andBareaNameNotIn(List<String> values) {
            addCriterion("BAREA_NAME not in", values, "bareaName");
            return (Criteria) this;
        }

        public Criteria andBareaNameBetween(String value1, String value2) {
            addCriterion("BAREA_NAME between", value1, value2, "bareaName");
            return (Criteria) this;
        }

        public Criteria andBareaNameNotBetween(String value1, String value2) {
            addCriterion("BAREA_NAME not between", value1, value2, "bareaName");
            return (Criteria) this;
        }

        public Criteria andSdAreaIdIsNull() {
            addCriterion("SD_AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andSdAreaIdIsNotNull() {
            addCriterion("SD_AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSdAreaIdEqualTo(String value) {
            addCriterion("SD_AREA_ID =", value, "sdAreaId");
            return (Criteria) this;
        }

        public Criteria andSdAreaIdNotEqualTo(String value) {
            addCriterion("SD_AREA_ID <>", value, "sdAreaId");
            return (Criteria) this;
        }

        public Criteria andSdAreaIdGreaterThan(String value) {
            addCriterion("SD_AREA_ID >", value, "sdAreaId");
            return (Criteria) this;
        }

        public Criteria andSdAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("SD_AREA_ID >=", value, "sdAreaId");
            return (Criteria) this;
        }

        public Criteria andSdAreaIdLessThan(String value) {
            addCriterion("SD_AREA_ID <", value, "sdAreaId");
            return (Criteria) this;
        }

        public Criteria andSdAreaIdLessThanOrEqualTo(String value) {
            addCriterion("SD_AREA_ID <=", value, "sdAreaId");
            return (Criteria) this;
        }

        public Criteria andSdAreaIdLike(String value) {
            addCriterion("SD_AREA_ID like", value, "sdAreaId");
            return (Criteria) this;
        }

        public Criteria andSdAreaIdNotLike(String value) {
            addCriterion("SD_AREA_ID not like", value, "sdAreaId");
            return (Criteria) this;
        }

        public Criteria andSdAreaIdIn(List<String> values) {
            addCriterion("SD_AREA_ID in", values, "sdAreaId");
            return (Criteria) this;
        }

        public Criteria andSdAreaIdNotIn(List<String> values) {
            addCriterion("SD_AREA_ID not in", values, "sdAreaId");
            return (Criteria) this;
        }

        public Criteria andSdAreaIdBetween(String value1, String value2) {
            addCriterion("SD_AREA_ID between", value1, value2, "sdAreaId");
            return (Criteria) this;
        }

        public Criteria andSdAreaIdNotBetween(String value1, String value2) {
            addCriterion("SD_AREA_ID not between", value1, value2, "sdAreaId");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Short value) {
            addCriterion("WEIGHT =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Short value) {
            addCriterion("WEIGHT <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Short value) {
            addCriterion("WEIGHT >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Short value) {
            addCriterion("WEIGHT >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Short value) {
            addCriterion("WEIGHT <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Short value) {
            addCriterion("WEIGHT <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Short> values) {
            addCriterion("WEIGHT in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Short> values) {
            addCriterion("WEIGHT not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Short value1, Short value2) {
            addCriterion("WEIGHT between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Short value1, Short value2) {
            addCriterion("WEIGHT not between", value1, value2, "weight");
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