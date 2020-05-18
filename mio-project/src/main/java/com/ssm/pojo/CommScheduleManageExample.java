package com.ssm.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommScheduleManageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommScheduleManageExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSchIdIsNull() {
            addCriterion("SCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andSchIdIsNotNull() {
            addCriterion("SCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSchIdEqualTo(BigDecimal value) {
            addCriterion("SCH_ID =", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdNotEqualTo(BigDecimal value) {
            addCriterion("SCH_ID <>", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdGreaterThan(BigDecimal value) {
            addCriterion("SCH_ID >", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCH_ID >=", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdLessThan(BigDecimal value) {
            addCriterion("SCH_ID <", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCH_ID <=", value, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdIn(List<BigDecimal> values) {
            addCriterion("SCH_ID in", values, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdNotIn(List<BigDecimal> values) {
            addCriterion("SCH_ID not in", values, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCH_ID between", value1, value2, "schId");
            return (Criteria) this;
        }

        public Criteria andSchIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCH_ID not between", value1, value2, "schId");
            return (Criteria) this;
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

        public Criteria andSchSubscribeIsNull() {
            addCriterion("SCH_SUBSCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andSchSubscribeIsNotNull() {
            addCriterion("SCH_SUBSCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andSchSubscribeEqualTo(String value) {
            addCriterion("SCH_SUBSCRIBE =", value, "schSubscribe");
            return (Criteria) this;
        }

        public Criteria andSchSubscribeNotEqualTo(String value) {
            addCriterion("SCH_SUBSCRIBE <>", value, "schSubscribe");
            return (Criteria) this;
        }

        public Criteria andSchSubscribeGreaterThan(String value) {
            addCriterion("SCH_SUBSCRIBE >", value, "schSubscribe");
            return (Criteria) this;
        }

        public Criteria andSchSubscribeGreaterThanOrEqualTo(String value) {
            addCriterion("SCH_SUBSCRIBE >=", value, "schSubscribe");
            return (Criteria) this;
        }

        public Criteria andSchSubscribeLessThan(String value) {
            addCriterion("SCH_SUBSCRIBE <", value, "schSubscribe");
            return (Criteria) this;
        }

        public Criteria andSchSubscribeLessThanOrEqualTo(String value) {
            addCriterion("SCH_SUBSCRIBE <=", value, "schSubscribe");
            return (Criteria) this;
        }

        public Criteria andSchSubscribeLike(String value) {
            addCriterion("SCH_SUBSCRIBE like", value, "schSubscribe");
            return (Criteria) this;
        }

        public Criteria andSchSubscribeNotLike(String value) {
            addCriterion("SCH_SUBSCRIBE not like", value, "schSubscribe");
            return (Criteria) this;
        }

        public Criteria andSchSubscribeIn(List<String> values) {
            addCriterion("SCH_SUBSCRIBE in", values, "schSubscribe");
            return (Criteria) this;
        }

        public Criteria andSchSubscribeNotIn(List<String> values) {
            addCriterion("SCH_SUBSCRIBE not in", values, "schSubscribe");
            return (Criteria) this;
        }

        public Criteria andSchSubscribeBetween(String value1, String value2) {
            addCriterion("SCH_SUBSCRIBE between", value1, value2, "schSubscribe");
            return (Criteria) this;
        }

        public Criteria andSchSubscribeNotBetween(String value1, String value2) {
            addCriterion("SCH_SUBSCRIBE not between", value1, value2, "schSubscribe");
            return (Criteria) this;
        }

        public Criteria andSchTitleIsNull() {
            addCriterion("SCH_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andSchTitleIsNotNull() {
            addCriterion("SCH_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andSchTitleEqualTo(String value) {
            addCriterion("SCH_TITLE =", value, "schTitle");
            return (Criteria) this;
        }

        public Criteria andSchTitleNotEqualTo(String value) {
            addCriterion("SCH_TITLE <>", value, "schTitle");
            return (Criteria) this;
        }

        public Criteria andSchTitleGreaterThan(String value) {
            addCriterion("SCH_TITLE >", value, "schTitle");
            return (Criteria) this;
        }

        public Criteria andSchTitleGreaterThanOrEqualTo(String value) {
            addCriterion("SCH_TITLE >=", value, "schTitle");
            return (Criteria) this;
        }

        public Criteria andSchTitleLessThan(String value) {
            addCriterion("SCH_TITLE <", value, "schTitle");
            return (Criteria) this;
        }

        public Criteria andSchTitleLessThanOrEqualTo(String value) {
            addCriterion("SCH_TITLE <=", value, "schTitle");
            return (Criteria) this;
        }

        public Criteria andSchTitleLike(String value) {
            addCriterion("SCH_TITLE like", value, "schTitle");
            return (Criteria) this;
        }

        public Criteria andSchTitleNotLike(String value) {
            addCriterion("SCH_TITLE not like", value, "schTitle");
            return (Criteria) this;
        }

        public Criteria andSchTitleIn(List<String> values) {
            addCriterion("SCH_TITLE in", values, "schTitle");
            return (Criteria) this;
        }

        public Criteria andSchTitleNotIn(List<String> values) {
            addCriterion("SCH_TITLE not in", values, "schTitle");
            return (Criteria) this;
        }

        public Criteria andSchTitleBetween(String value1, String value2) {
            addCriterion("SCH_TITLE between", value1, value2, "schTitle");
            return (Criteria) this;
        }

        public Criteria andSchTitleNotBetween(String value1, String value2) {
            addCriterion("SCH_TITLE not between", value1, value2, "schTitle");
            return (Criteria) this;
        }

        public Criteria andSchDescIsNull() {
            addCriterion("SCH_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSchDescIsNotNull() {
            addCriterion("SCH_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSchDescEqualTo(String value) {
            addCriterion("SCH_DESC =", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescNotEqualTo(String value) {
            addCriterion("SCH_DESC <>", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescGreaterThan(String value) {
            addCriterion("SCH_DESC >", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescGreaterThanOrEqualTo(String value) {
            addCriterion("SCH_DESC >=", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescLessThan(String value) {
            addCriterion("SCH_DESC <", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescLessThanOrEqualTo(String value) {
            addCriterion("SCH_DESC <=", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescLike(String value) {
            addCriterion("SCH_DESC like", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescNotLike(String value) {
            addCriterion("SCH_DESC not like", value, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescIn(List<String> values) {
            addCriterion("SCH_DESC in", values, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescNotIn(List<String> values) {
            addCriterion("SCH_DESC not in", values, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescBetween(String value1, String value2) {
            addCriterion("SCH_DESC between", value1, value2, "schDesc");
            return (Criteria) this;
        }

        public Criteria andSchDescNotBetween(String value1, String value2) {
            addCriterion("SCH_DESC not between", value1, value2, "schDesc");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("BEGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("BEGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Date value) {
            addCriterionForJDBCDate("BEGIN_TIME =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("BEGIN_TIME <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("BEGIN_TIME >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BEGIN_TIME >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Date value) {
            addCriterionForJDBCDate("BEGIN_TIME <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BEGIN_TIME <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Date> values) {
            addCriterionForJDBCDate("BEGIN_TIME in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("BEGIN_TIME not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BEGIN_TIME between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BEGIN_TIME not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATED_TIME not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedUseridIsNull() {
            addCriterion("CREATED_USERID is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUseridIsNotNull() {
            addCriterion("CREATED_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUseridEqualTo(String value) {
            addCriterion("CREATED_USERID =", value, "createdUserid");
            return (Criteria) this;
        }

        public Criteria andCreatedUseridNotEqualTo(String value) {
            addCriterion("CREATED_USERID <>", value, "createdUserid");
            return (Criteria) this;
        }

        public Criteria andCreatedUseridGreaterThan(String value) {
            addCriterion("CREATED_USERID >", value, "createdUserid");
            return (Criteria) this;
        }

        public Criteria andCreatedUseridGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_USERID >=", value, "createdUserid");
            return (Criteria) this;
        }

        public Criteria andCreatedUseridLessThan(String value) {
            addCriterion("CREATED_USERID <", value, "createdUserid");
            return (Criteria) this;
        }

        public Criteria andCreatedUseridLessThanOrEqualTo(String value) {
            addCriterion("CREATED_USERID <=", value, "createdUserid");
            return (Criteria) this;
        }

        public Criteria andCreatedUseridLike(String value) {
            addCriterion("CREATED_USERID like", value, "createdUserid");
            return (Criteria) this;
        }

        public Criteria andCreatedUseridNotLike(String value) {
            addCriterion("CREATED_USERID not like", value, "createdUserid");
            return (Criteria) this;
        }

        public Criteria andCreatedUseridIn(List<String> values) {
            addCriterion("CREATED_USERID in", values, "createdUserid");
            return (Criteria) this;
        }

        public Criteria andCreatedUseridNotIn(List<String> values) {
            addCriterion("CREATED_USERID not in", values, "createdUserid");
            return (Criteria) this;
        }

        public Criteria andCreatedUseridBetween(String value1, String value2) {
            addCriterion("CREATED_USERID between", value1, value2, "createdUserid");
            return (Criteria) this;
        }

        public Criteria andCreatedUseridNotBetween(String value1, String value2) {
            addCriterion("CREATED_USERID not between", value1, value2, "createdUserid");
            return (Criteria) this;
        }

        public Criteria andCreatedUsernameIsNull() {
            addCriterion("CREATED_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUsernameIsNotNull() {
            addCriterion("CREATED_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUsernameEqualTo(String value) {
            addCriterion("CREATED_USERNAME =", value, "createdUsername");
            return (Criteria) this;
        }

        public Criteria andCreatedUsernameNotEqualTo(String value) {
            addCriterion("CREATED_USERNAME <>", value, "createdUsername");
            return (Criteria) this;
        }

        public Criteria andCreatedUsernameGreaterThan(String value) {
            addCriterion("CREATED_USERNAME >", value, "createdUsername");
            return (Criteria) this;
        }

        public Criteria andCreatedUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_USERNAME >=", value, "createdUsername");
            return (Criteria) this;
        }

        public Criteria andCreatedUsernameLessThan(String value) {
            addCriterion("CREATED_USERNAME <", value, "createdUsername");
            return (Criteria) this;
        }

        public Criteria andCreatedUsernameLessThanOrEqualTo(String value) {
            addCriterion("CREATED_USERNAME <=", value, "createdUsername");
            return (Criteria) this;
        }

        public Criteria andCreatedUsernameLike(String value) {
            addCriterion("CREATED_USERNAME like", value, "createdUsername");
            return (Criteria) this;
        }

        public Criteria andCreatedUsernameNotLike(String value) {
            addCriterion("CREATED_USERNAME not like", value, "createdUsername");
            return (Criteria) this;
        }

        public Criteria andCreatedUsernameIn(List<String> values) {
            addCriterion("CREATED_USERNAME in", values, "createdUsername");
            return (Criteria) this;
        }

        public Criteria andCreatedUsernameNotIn(List<String> values) {
            addCriterion("CREATED_USERNAME not in", values, "createdUsername");
            return (Criteria) this;
        }

        public Criteria andCreatedUsernameBetween(String value1, String value2) {
            addCriterion("CREATED_USERNAME between", value1, value2, "createdUsername");
            return (Criteria) this;
        }

        public Criteria andCreatedUsernameNotBetween(String value1, String value2) {
            addCriterion("CREATED_USERNAME not between", value1, value2, "createdUsername");
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

        public Criteria andSchSubtypeIsNull() {
            addCriterion("SCH_SUBTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSchSubtypeIsNotNull() {
            addCriterion("SCH_SUBTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSchSubtypeEqualTo(String value) {
            addCriterion("SCH_SUBTYPE =", value, "schSubtype");
            return (Criteria) this;
        }

        public Criteria andSchSubtypeNotEqualTo(String value) {
            addCriterion("SCH_SUBTYPE <>", value, "schSubtype");
            return (Criteria) this;
        }

        public Criteria andSchSubtypeGreaterThan(String value) {
            addCriterion("SCH_SUBTYPE >", value, "schSubtype");
            return (Criteria) this;
        }

        public Criteria andSchSubtypeGreaterThanOrEqualTo(String value) {
            addCriterion("SCH_SUBTYPE >=", value, "schSubtype");
            return (Criteria) this;
        }

        public Criteria andSchSubtypeLessThan(String value) {
            addCriterion("SCH_SUBTYPE <", value, "schSubtype");
            return (Criteria) this;
        }

        public Criteria andSchSubtypeLessThanOrEqualTo(String value) {
            addCriterion("SCH_SUBTYPE <=", value, "schSubtype");
            return (Criteria) this;
        }

        public Criteria andSchSubtypeLike(String value) {
            addCriterion("SCH_SUBTYPE like", value, "schSubtype");
            return (Criteria) this;
        }

        public Criteria andSchSubtypeNotLike(String value) {
            addCriterion("SCH_SUBTYPE not like", value, "schSubtype");
            return (Criteria) this;
        }

        public Criteria andSchSubtypeIn(List<String> values) {
            addCriterion("SCH_SUBTYPE in", values, "schSubtype");
            return (Criteria) this;
        }

        public Criteria andSchSubtypeNotIn(List<String> values) {
            addCriterion("SCH_SUBTYPE not in", values, "schSubtype");
            return (Criteria) this;
        }

        public Criteria andSchSubtypeBetween(String value1, String value2) {
            addCriterion("SCH_SUBTYPE between", value1, value2, "schSubtype");
            return (Criteria) this;
        }

        public Criteria andSchSubtypeNotBetween(String value1, String value2) {
            addCriterion("SCH_SUBTYPE not between", value1, value2, "schSubtype");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time not between", value1, value2, "updateTime");
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