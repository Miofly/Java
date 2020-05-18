package com.mio.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartInfoExample() {
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

        public Criteria andDepartIdIsNull() {
            addCriterion("DEPART_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNotNull() {
            addCriterion("DEPART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartIdEqualTo(String value) {
            addCriterion("DEPART_ID =", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotEqualTo(String value) {
            addCriterion("DEPART_ID <>", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThan(String value) {
            addCriterion("DEPART_ID >", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPART_ID >=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThan(String value) {
            addCriterion("DEPART_ID <", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThanOrEqualTo(String value) {
            addCriterion("DEPART_ID <=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLike(String value) {
            addCriterion("DEPART_ID like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotLike(String value) {
            addCriterion("DEPART_ID not like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdIn(List<String> values) {
            addCriterion("DEPART_ID in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotIn(List<String> values) {
            addCriterion("DEPART_ID not in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdBetween(String value1, String value2) {
            addCriterion("DEPART_ID between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotBetween(String value1, String value2) {
            addCriterion("DEPART_ID not between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("AREA_ID =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("AREA_ID <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("AREA_ID >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_ID >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("AREA_ID <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("AREA_ID <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("AREA_ID like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("AREA_ID not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("AREA_ID in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("AREA_ID not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("AREA_ID between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("AREA_ID not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNull() {
            addCriterion("DEPART_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNotNull() {
            addCriterion("DEPART_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepartNameEqualTo(String value) {
            addCriterion("DEPART_NAME =", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotEqualTo(String value) {
            addCriterion("DEPART_NAME <>", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThan(String value) {
            addCriterion("DEPART_NAME >", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPART_NAME >=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThan(String value) {
            addCriterion("DEPART_NAME <", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThanOrEqualTo(String value) {
            addCriterion("DEPART_NAME <=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLike(String value) {
            addCriterion("DEPART_NAME like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotLike(String value) {
            addCriterion("DEPART_NAME not like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameIn(List<String> values) {
            addCriterion("DEPART_NAME in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotIn(List<String> values) {
            addCriterion("DEPART_NAME not in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameBetween(String value1, String value2) {
            addCriterion("DEPART_NAME between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotBetween(String value1, String value2) {
            addCriterion("DEPART_NAME not between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andChnlTypeIsNull() {
            addCriterion("CHNL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andChnlTypeIsNotNull() {
            addCriterion("CHNL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChnlTypeEqualTo(String value) {
            addCriterion("CHNL_TYPE =", value, "chnlType");
            return (Criteria) this;
        }

        public Criteria andChnlTypeNotEqualTo(String value) {
            addCriterion("CHNL_TYPE <>", value, "chnlType");
            return (Criteria) this;
        }

        public Criteria andChnlTypeGreaterThan(String value) {
            addCriterion("CHNL_TYPE >", value, "chnlType");
            return (Criteria) this;
        }

        public Criteria andChnlTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHNL_TYPE >=", value, "chnlType");
            return (Criteria) this;
        }

        public Criteria andChnlTypeLessThan(String value) {
            addCriterion("CHNL_TYPE <", value, "chnlType");
            return (Criteria) this;
        }

        public Criteria andChnlTypeLessThanOrEqualTo(String value) {
            addCriterion("CHNL_TYPE <=", value, "chnlType");
            return (Criteria) this;
        }

        public Criteria andChnlTypeLike(String value) {
            addCriterion("CHNL_TYPE like", value, "chnlType");
            return (Criteria) this;
        }

        public Criteria andChnlTypeNotLike(String value) {
            addCriterion("CHNL_TYPE not like", value, "chnlType");
            return (Criteria) this;
        }

        public Criteria andChnlTypeIn(List<String> values) {
            addCriterion("CHNL_TYPE in", values, "chnlType");
            return (Criteria) this;
        }

        public Criteria andChnlTypeNotIn(List<String> values) {
            addCriterion("CHNL_TYPE not in", values, "chnlType");
            return (Criteria) this;
        }

        public Criteria andChnlTypeBetween(String value1, String value2) {
            addCriterion("CHNL_TYPE between", value1, value2, "chnlType");
            return (Criteria) this;
        }

        public Criteria andChnlTypeNotBetween(String value1, String value2) {
            addCriterion("CHNL_TYPE not between", value1, value2, "chnlType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeIsNull() {
            addCriterion("DEPART_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDepartTypeIsNotNull() {
            addCriterion("DEPART_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDepartTypeEqualTo(String value) {
            addCriterion("DEPART_TYPE =", value, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeNotEqualTo(String value) {
            addCriterion("DEPART_TYPE <>", value, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeGreaterThan(String value) {
            addCriterion("DEPART_TYPE >", value, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPART_TYPE >=", value, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeLessThan(String value) {
            addCriterion("DEPART_TYPE <", value, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeLessThanOrEqualTo(String value) {
            addCriterion("DEPART_TYPE <=", value, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeLike(String value) {
            addCriterion("DEPART_TYPE like", value, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeNotLike(String value) {
            addCriterion("DEPART_TYPE not like", value, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeIn(List<String> values) {
            addCriterion("DEPART_TYPE in", values, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeNotIn(List<String> values) {
            addCriterion("DEPART_TYPE not in", values, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeBetween(String value1, String value2) {
            addCriterion("DEPART_TYPE between", value1, value2, "departType");
            return (Criteria) this;
        }

        public Criteria andDepartTypeNotBetween(String value1, String value2) {
            addCriterion("DEPART_TYPE not between", value1, value2, "departType");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("LONGITUDE like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("LONGITUDE not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("LATITUDE =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("LATITUDE >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("LATITUDE <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("LATITUDE like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("LATITUDE not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andPreAreaIdIsNull() {
            addCriterion("PRE_AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andPreAreaIdIsNotNull() {
            addCriterion("PRE_AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPreAreaIdEqualTo(String value) {
            addCriterion("PRE_AREA_ID =", value, "preAreaId");
            return (Criteria) this;
        }

        public Criteria andPreAreaIdNotEqualTo(String value) {
            addCriterion("PRE_AREA_ID <>", value, "preAreaId");
            return (Criteria) this;
        }

        public Criteria andPreAreaIdGreaterThan(String value) {
            addCriterion("PRE_AREA_ID >", value, "preAreaId");
            return (Criteria) this;
        }

        public Criteria andPreAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_AREA_ID >=", value, "preAreaId");
            return (Criteria) this;
        }

        public Criteria andPreAreaIdLessThan(String value) {
            addCriterion("PRE_AREA_ID <", value, "preAreaId");
            return (Criteria) this;
        }

        public Criteria andPreAreaIdLessThanOrEqualTo(String value) {
            addCriterion("PRE_AREA_ID <=", value, "preAreaId");
            return (Criteria) this;
        }

        public Criteria andPreAreaIdLike(String value) {
            addCriterion("PRE_AREA_ID like", value, "preAreaId");
            return (Criteria) this;
        }

        public Criteria andPreAreaIdNotLike(String value) {
            addCriterion("PRE_AREA_ID not like", value, "preAreaId");
            return (Criteria) this;
        }

        public Criteria andPreAreaIdIn(List<String> values) {
            addCriterion("PRE_AREA_ID in", values, "preAreaId");
            return (Criteria) this;
        }

        public Criteria andPreAreaIdNotIn(List<String> values) {
            addCriterion("PRE_AREA_ID not in", values, "preAreaId");
            return (Criteria) this;
        }

        public Criteria andPreAreaIdBetween(String value1, String value2) {
            addCriterion("PRE_AREA_ID between", value1, value2, "preAreaId");
            return (Criteria) this;
        }

        public Criteria andPreAreaIdNotBetween(String value1, String value2) {
            addCriterion("PRE_AREA_ID not between", value1, value2, "preAreaId");
            return (Criteria) this;
        }

        public Criteria andChnlIdIsNull() {
            addCriterion("CHNL_ID is null");
            return (Criteria) this;
        }

        public Criteria andChnlIdIsNotNull() {
            addCriterion("CHNL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChnlIdEqualTo(String value) {
            addCriterion("CHNL_ID =", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdNotEqualTo(String value) {
            addCriterion("CHNL_ID <>", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdGreaterThan(String value) {
            addCriterion("CHNL_ID >", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHNL_ID >=", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdLessThan(String value) {
            addCriterion("CHNL_ID <", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdLessThanOrEqualTo(String value) {
            addCriterion("CHNL_ID <=", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdLike(String value) {
            addCriterion("CHNL_ID like", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdNotLike(String value) {
            addCriterion("CHNL_ID not like", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdIn(List<String> values) {
            addCriterion("CHNL_ID in", values, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdNotIn(List<String> values) {
            addCriterion("CHNL_ID not in", values, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdBetween(String value1, String value2) {
            addCriterion("CHNL_ID between", value1, value2, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdNotBetween(String value1, String value2) {
            addCriterion("CHNL_ID not between", value1, value2, "chnlId");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andToBomcIsNull() {
            addCriterion("TO_BOMC is null");
            return (Criteria) this;
        }

        public Criteria andToBomcIsNotNull() {
            addCriterion("TO_BOMC is not null");
            return (Criteria) this;
        }

        public Criteria andToBomcEqualTo(String value) {
            addCriterion("TO_BOMC =", value, "toBomc");
            return (Criteria) this;
        }

        public Criteria andToBomcNotEqualTo(String value) {
            addCriterion("TO_BOMC <>", value, "toBomc");
            return (Criteria) this;
        }

        public Criteria andToBomcGreaterThan(String value) {
            addCriterion("TO_BOMC >", value, "toBomc");
            return (Criteria) this;
        }

        public Criteria andToBomcGreaterThanOrEqualTo(String value) {
            addCriterion("TO_BOMC >=", value, "toBomc");
            return (Criteria) this;
        }

        public Criteria andToBomcLessThan(String value) {
            addCriterion("TO_BOMC <", value, "toBomc");
            return (Criteria) this;
        }

        public Criteria andToBomcLessThanOrEqualTo(String value) {
            addCriterion("TO_BOMC <=", value, "toBomc");
            return (Criteria) this;
        }

        public Criteria andToBomcLike(String value) {
            addCriterion("TO_BOMC like", value, "toBomc");
            return (Criteria) this;
        }

        public Criteria andToBomcNotLike(String value) {
            addCriterion("TO_BOMC not like", value, "toBomc");
            return (Criteria) this;
        }

        public Criteria andToBomcIn(List<String> values) {
            addCriterion("TO_BOMC in", values, "toBomc");
            return (Criteria) this;
        }

        public Criteria andToBomcNotIn(List<String> values) {
            addCriterion("TO_BOMC not in", values, "toBomc");
            return (Criteria) this;
        }

        public Criteria andToBomcBetween(String value1, String value2) {
            addCriterion("TO_BOMC between", value1, value2, "toBomc");
            return (Criteria) this;
        }

        public Criteria andToBomcNotBetween(String value1, String value2) {
            addCriterion("TO_BOMC not between", value1, value2, "toBomc");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andResponsibleIsNull() {
            addCriterion("RESPONSIBLE is null");
            return (Criteria) this;
        }

        public Criteria andResponsibleIsNotNull() {
            addCriterion("RESPONSIBLE is not null");
            return (Criteria) this;
        }

        public Criteria andResponsibleEqualTo(String value) {
            addCriterion("RESPONSIBLE =", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleNotEqualTo(String value) {
            addCriterion("RESPONSIBLE <>", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleGreaterThan(String value) {
            addCriterion("RESPONSIBLE >", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleGreaterThanOrEqualTo(String value) {
            addCriterion("RESPONSIBLE >=", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleLessThan(String value) {
            addCriterion("RESPONSIBLE <", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleLessThanOrEqualTo(String value) {
            addCriterion("RESPONSIBLE <=", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleLike(String value) {
            addCriterion("RESPONSIBLE like", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleNotLike(String value) {
            addCriterion("RESPONSIBLE not like", value, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleIn(List<String> values) {
            addCriterion("RESPONSIBLE in", values, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleNotIn(List<String> values) {
            addCriterion("RESPONSIBLE not in", values, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleBetween(String value1, String value2) {
            addCriterion("RESPONSIBLE between", value1, value2, "responsible");
            return (Criteria) this;
        }

        public Criteria andResponsibleNotBetween(String value1, String value2) {
            addCriterion("RESPONSIBLE not between", value1, value2, "responsible");
            return (Criteria) this;
        }

        public Criteria andRespMobileIsNull() {
            addCriterion("RESP_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andRespMobileIsNotNull() {
            addCriterion("RESP_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andRespMobileEqualTo(String value) {
            addCriterion("RESP_MOBILE =", value, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileNotEqualTo(String value) {
            addCriterion("RESP_MOBILE <>", value, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileGreaterThan(String value) {
            addCriterion("RESP_MOBILE >", value, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileGreaterThanOrEqualTo(String value) {
            addCriterion("RESP_MOBILE >=", value, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileLessThan(String value) {
            addCriterion("RESP_MOBILE <", value, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileLessThanOrEqualTo(String value) {
            addCriterion("RESP_MOBILE <=", value, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileLike(String value) {
            addCriterion("RESP_MOBILE like", value, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileNotLike(String value) {
            addCriterion("RESP_MOBILE not like", value, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileIn(List<String> values) {
            addCriterion("RESP_MOBILE in", values, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileNotIn(List<String> values) {
            addCriterion("RESP_MOBILE not in", values, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileBetween(String value1, String value2) {
            addCriterion("RESP_MOBILE between", value1, value2, "respMobile");
            return (Criteria) this;
        }

        public Criteria andRespMobileNotBetween(String value1, String value2) {
            addCriterion("RESP_MOBILE not between", value1, value2, "respMobile");
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