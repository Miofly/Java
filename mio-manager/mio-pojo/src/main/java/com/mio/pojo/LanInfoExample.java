package com.mio.pojo;

import java.util.ArrayList;
import java.util.List;

public class LanInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LanInfoExample() {
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

        public Criteria andLanCodeIsNull() {
            addCriterion("LAN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLanCodeIsNotNull() {
            addCriterion("LAN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLanCodeEqualTo(String value) {
            addCriterion("LAN_CODE =", value, "lanCode");
            return (Criteria) this;
        }

        public Criteria andLanCodeNotEqualTo(String value) {
            addCriterion("LAN_CODE <>", value, "lanCode");
            return (Criteria) this;
        }

        public Criteria andLanCodeGreaterThan(String value) {
            addCriterion("LAN_CODE >", value, "lanCode");
            return (Criteria) this;
        }

        public Criteria andLanCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LAN_CODE >=", value, "lanCode");
            return (Criteria) this;
        }

        public Criteria andLanCodeLessThan(String value) {
            addCriterion("LAN_CODE <", value, "lanCode");
            return (Criteria) this;
        }

        public Criteria andLanCodeLessThanOrEqualTo(String value) {
            addCriterion("LAN_CODE <=", value, "lanCode");
            return (Criteria) this;
        }

        public Criteria andLanCodeLike(String value) {
            addCriterion("LAN_CODE like", value, "lanCode");
            return (Criteria) this;
        }

        public Criteria andLanCodeNotLike(String value) {
            addCriterion("LAN_CODE not like", value, "lanCode");
            return (Criteria) this;
        }

        public Criteria andLanCodeIn(List<String> values) {
            addCriterion("LAN_CODE in", values, "lanCode");
            return (Criteria) this;
        }

        public Criteria andLanCodeNotIn(List<String> values) {
            addCriterion("LAN_CODE not in", values, "lanCode");
            return (Criteria) this;
        }

        public Criteria andLanCodeBetween(String value1, String value2) {
            addCriterion("LAN_CODE between", value1, value2, "lanCode");
            return (Criteria) this;
        }

        public Criteria andLanCodeNotBetween(String value1, String value2) {
            addCriterion("LAN_CODE not between", value1, value2, "lanCode");
            return (Criteria) this;
        }

        public Criteria andLanNameIsNull() {
            addCriterion("LAN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLanNameIsNotNull() {
            addCriterion("LAN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLanNameEqualTo(String value) {
            addCriterion("LAN_NAME =", value, "lanName");
            return (Criteria) this;
        }

        public Criteria andLanNameNotEqualTo(String value) {
            addCriterion("LAN_NAME <>", value, "lanName");
            return (Criteria) this;
        }

        public Criteria andLanNameGreaterThan(String value) {
            addCriterion("LAN_NAME >", value, "lanName");
            return (Criteria) this;
        }

        public Criteria andLanNameGreaterThanOrEqualTo(String value) {
            addCriterion("LAN_NAME >=", value, "lanName");
            return (Criteria) this;
        }

        public Criteria andLanNameLessThan(String value) {
            addCriterion("LAN_NAME <", value, "lanName");
            return (Criteria) this;
        }

        public Criteria andLanNameLessThanOrEqualTo(String value) {
            addCriterion("LAN_NAME <=", value, "lanName");
            return (Criteria) this;
        }

        public Criteria andLanNameLike(String value) {
            addCriterion("LAN_NAME like", value, "lanName");
            return (Criteria) this;
        }

        public Criteria andLanNameNotLike(String value) {
            addCriterion("LAN_NAME not like", value, "lanName");
            return (Criteria) this;
        }

        public Criteria andLanNameIn(List<String> values) {
            addCriterion("LAN_NAME in", values, "lanName");
            return (Criteria) this;
        }

        public Criteria andLanNameNotIn(List<String> values) {
            addCriterion("LAN_NAME not in", values, "lanName");
            return (Criteria) this;
        }

        public Criteria andLanNameBetween(String value1, String value2) {
            addCriterion("LAN_NAME between", value1, value2, "lanName");
            return (Criteria) this;
        }

        public Criteria andLanNameNotBetween(String value1, String value2) {
            addCriterion("LAN_NAME not between", value1, value2, "lanName");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNull() {
            addCriterion("PINYIN is null");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNotNull() {
            addCriterion("PINYIN is not null");
            return (Criteria) this;
        }

        public Criteria andPinyinEqualTo(String value) {
            addCriterion("PINYIN =", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotEqualTo(String value) {
            addCriterion("PINYIN <>", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThan(String value) {
            addCriterion("PINYIN >", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("PINYIN >=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThan(String value) {
            addCriterion("PINYIN <", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThanOrEqualTo(String value) {
            addCriterion("PINYIN <=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLike(String value) {
            addCriterion("PINYIN like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotLike(String value) {
            addCriterion("PINYIN not like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinIn(List<String> values) {
            addCriterion("PINYIN in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotIn(List<String> values) {
            addCriterion("PINYIN not in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinBetween(String value1, String value2) {
            addCriterion("PINYIN between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotBetween(String value1, String value2) {
            addCriterion("PINYIN not between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andOrderMarksIsNull() {
            addCriterion("ORDER_MARKS is null");
            return (Criteria) this;
        }

        public Criteria andOrderMarksIsNotNull() {
            addCriterion("ORDER_MARKS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMarksEqualTo(Integer value) {
            addCriterion("ORDER_MARKS =", value, "orderMarks");
            return (Criteria) this;
        }

        public Criteria andOrderMarksNotEqualTo(Integer value) {
            addCriterion("ORDER_MARKS <>", value, "orderMarks");
            return (Criteria) this;
        }

        public Criteria andOrderMarksGreaterThan(Integer value) {
            addCriterion("ORDER_MARKS >", value, "orderMarks");
            return (Criteria) this;
        }

        public Criteria andOrderMarksGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_MARKS >=", value, "orderMarks");
            return (Criteria) this;
        }

        public Criteria andOrderMarksLessThan(Integer value) {
            addCriterion("ORDER_MARKS <", value, "orderMarks");
            return (Criteria) this;
        }

        public Criteria andOrderMarksLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_MARKS <=", value, "orderMarks");
            return (Criteria) this;
        }

        public Criteria andOrderMarksIn(List<Integer> values) {
            addCriterion("ORDER_MARKS in", values, "orderMarks");
            return (Criteria) this;
        }

        public Criteria andOrderMarksNotIn(List<Integer> values) {
            addCriterion("ORDER_MARKS not in", values, "orderMarks");
            return (Criteria) this;
        }

        public Criteria andOrderMarksBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_MARKS between", value1, value2, "orderMarks");
            return (Criteria) this;
        }

        public Criteria andOrderMarksNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_MARKS not between", value1, value2, "orderMarks");
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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Short value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Short value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Short value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Short value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Short value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Short> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Short> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Short value1, Short value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Short value1, Short value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andLanIdSdIsNull() {
            addCriterion("LAN_ID_SD is null");
            return (Criteria) this;
        }

        public Criteria andLanIdSdIsNotNull() {
            addCriterion("LAN_ID_SD is not null");
            return (Criteria) this;
        }

        public Criteria andLanIdSdEqualTo(String value) {
            addCriterion("LAN_ID_SD =", value, "lanIdSd");
            return (Criteria) this;
        }

        public Criteria andLanIdSdNotEqualTo(String value) {
            addCriterion("LAN_ID_SD <>", value, "lanIdSd");
            return (Criteria) this;
        }

        public Criteria andLanIdSdGreaterThan(String value) {
            addCriterion("LAN_ID_SD >", value, "lanIdSd");
            return (Criteria) this;
        }

        public Criteria andLanIdSdGreaterThanOrEqualTo(String value) {
            addCriterion("LAN_ID_SD >=", value, "lanIdSd");
            return (Criteria) this;
        }

        public Criteria andLanIdSdLessThan(String value) {
            addCriterion("LAN_ID_SD <", value, "lanIdSd");
            return (Criteria) this;
        }

        public Criteria andLanIdSdLessThanOrEqualTo(String value) {
            addCriterion("LAN_ID_SD <=", value, "lanIdSd");
            return (Criteria) this;
        }

        public Criteria andLanIdSdLike(String value) {
            addCriterion("LAN_ID_SD like", value, "lanIdSd");
            return (Criteria) this;
        }

        public Criteria andLanIdSdNotLike(String value) {
            addCriterion("LAN_ID_SD not like", value, "lanIdSd");
            return (Criteria) this;
        }

        public Criteria andLanIdSdIn(List<String> values) {
            addCriterion("LAN_ID_SD in", values, "lanIdSd");
            return (Criteria) this;
        }

        public Criteria andLanIdSdNotIn(List<String> values) {
            addCriterion("LAN_ID_SD not in", values, "lanIdSd");
            return (Criteria) this;
        }

        public Criteria andLanIdSdBetween(String value1, String value2) {
            addCriterion("LAN_ID_SD between", value1, value2, "lanIdSd");
            return (Criteria) this;
        }

        public Criteria andLanIdSdNotBetween(String value1, String value2) {
            addCriterion("LAN_ID_SD not between", value1, value2, "lanIdSd");
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

        public Criteria andCityIdSdIsNull() {
            addCriterion("CITY_ID_SD is null");
            return (Criteria) this;
        }

        public Criteria andCityIdSdIsNotNull() {
            addCriterion("CITY_ID_SD is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdSdEqualTo(Short value) {
            addCriterion("CITY_ID_SD =", value, "cityIdSd");
            return (Criteria) this;
        }

        public Criteria andCityIdSdNotEqualTo(Short value) {
            addCriterion("CITY_ID_SD <>", value, "cityIdSd");
            return (Criteria) this;
        }

        public Criteria andCityIdSdGreaterThan(Short value) {
            addCriterion("CITY_ID_SD >", value, "cityIdSd");
            return (Criteria) this;
        }

        public Criteria andCityIdSdGreaterThanOrEqualTo(Short value) {
            addCriterion("CITY_ID_SD >=", value, "cityIdSd");
            return (Criteria) this;
        }

        public Criteria andCityIdSdLessThan(Short value) {
            addCriterion("CITY_ID_SD <", value, "cityIdSd");
            return (Criteria) this;
        }

        public Criteria andCityIdSdLessThanOrEqualTo(Short value) {
            addCriterion("CITY_ID_SD <=", value, "cityIdSd");
            return (Criteria) this;
        }

        public Criteria andCityIdSdIn(List<Short> values) {
            addCriterion("CITY_ID_SD in", values, "cityIdSd");
            return (Criteria) this;
        }

        public Criteria andCityIdSdNotIn(List<Short> values) {
            addCriterion("CITY_ID_SD not in", values, "cityIdSd");
            return (Criteria) this;
        }

        public Criteria andCityIdSdBetween(Short value1, Short value2) {
            addCriterion("CITY_ID_SD between", value1, value2, "cityIdSd");
            return (Criteria) this;
        }

        public Criteria andCityIdSdNotBetween(Short value1, Short value2) {
            addCriterion("CITY_ID_SD not between", value1, value2, "cityIdSd");
            return (Criteria) this;
        }

        public Criteria andBigAreaIsNull() {
            addCriterion("BIG_AREA is null");
            return (Criteria) this;
        }

        public Criteria andBigAreaIsNotNull() {
            addCriterion("BIG_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andBigAreaEqualTo(String value) {
            addCriterion("BIG_AREA =", value, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaNotEqualTo(String value) {
            addCriterion("BIG_AREA <>", value, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaGreaterThan(String value) {
            addCriterion("BIG_AREA >", value, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaGreaterThanOrEqualTo(String value) {
            addCriterion("BIG_AREA >=", value, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaLessThan(String value) {
            addCriterion("BIG_AREA <", value, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaLessThanOrEqualTo(String value) {
            addCriterion("BIG_AREA <=", value, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaLike(String value) {
            addCriterion("BIG_AREA like", value, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaNotLike(String value) {
            addCriterion("BIG_AREA not like", value, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaIn(List<String> values) {
            addCriterion("BIG_AREA in", values, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaNotIn(List<String> values) {
            addCriterion("BIG_AREA not in", values, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaBetween(String value1, String value2) {
            addCriterion("BIG_AREA between", value1, value2, "bigArea");
            return (Criteria) this;
        }

        public Criteria andBigAreaNotBetween(String value1, String value2) {
            addCriterion("BIG_AREA not between", value1, value2, "bigArea");
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