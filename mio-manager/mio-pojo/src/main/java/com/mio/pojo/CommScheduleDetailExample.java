package com.mio.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommScheduleDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommScheduleDetailExample() {
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

        public Criteria andDetailIdIsNull() {
            addCriterion("DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(String value) {
            addCriterion("DETAIL_ID =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(String value) {
            addCriterion("DETAIL_ID <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(String value) {
            addCriterion("DETAIL_ID >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_ID >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(String value) {
            addCriterion("DETAIL_ID <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_ID <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLike(String value) {
            addCriterion("DETAIL_ID like", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotLike(String value) {
            addCriterion("DETAIL_ID not like", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<String> values) {
            addCriterion("DETAIL_ID in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<String> values) {
            addCriterion("DETAIL_ID not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(String value1, String value2) {
            addCriterion("DETAIL_ID between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(String value1, String value2) {
            addCriterion("DETAIL_ID not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailTypeIsNull() {
            addCriterion("DETAIL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDetailTypeIsNotNull() {
            addCriterion("DETAIL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDetailTypeEqualTo(String value) {
            addCriterion("DETAIL_TYPE =", value, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeNotEqualTo(String value) {
            addCriterion("DETAIL_TYPE <>", value, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeGreaterThan(String value) {
            addCriterion("DETAIL_TYPE >", value, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_TYPE >=", value, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeLessThan(String value) {
            addCriterion("DETAIL_TYPE <", value, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_TYPE <=", value, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeLike(String value) {
            addCriterion("DETAIL_TYPE like", value, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeNotLike(String value) {
            addCriterion("DETAIL_TYPE not like", value, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeIn(List<String> values) {
            addCriterion("DETAIL_TYPE in", values, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeNotIn(List<String> values) {
            addCriterion("DETAIL_TYPE not in", values, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeBetween(String value1, String value2) {
            addCriterion("DETAIL_TYPE between", value1, value2, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailTypeNotBetween(String value1, String value2) {
            addCriterion("DETAIL_TYPE not between", value1, value2, "detailType");
            return (Criteria) this;
        }

        public Criteria andDetailContentIsNull() {
            addCriterion("DETAIL_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andDetailContentIsNotNull() {
            addCriterion("DETAIL_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andDetailContentEqualTo(String value) {
            addCriterion("DETAIL_CONTENT =", value, "detailContent");
            return (Criteria) this;
        }

        public Criteria andDetailContentNotEqualTo(String value) {
            addCriterion("DETAIL_CONTENT <>", value, "detailContent");
            return (Criteria) this;
        }

        public Criteria andDetailContentGreaterThan(String value) {
            addCriterion("DETAIL_CONTENT >", value, "detailContent");
            return (Criteria) this;
        }

        public Criteria andDetailContentGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_CONTENT >=", value, "detailContent");
            return (Criteria) this;
        }

        public Criteria andDetailContentLessThan(String value) {
            addCriterion("DETAIL_CONTENT <", value, "detailContent");
            return (Criteria) this;
        }

        public Criteria andDetailContentLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_CONTENT <=", value, "detailContent");
            return (Criteria) this;
        }

        public Criteria andDetailContentLike(String value) {
            addCriterion("DETAIL_CONTENT like", value, "detailContent");
            return (Criteria) this;
        }

        public Criteria andDetailContentNotLike(String value) {
            addCriterion("DETAIL_CONTENT not like", value, "detailContent");
            return (Criteria) this;
        }

        public Criteria andDetailContentIn(List<String> values) {
            addCriterion("DETAIL_CONTENT in", values, "detailContent");
            return (Criteria) this;
        }

        public Criteria andDetailContentNotIn(List<String> values) {
            addCriterion("DETAIL_CONTENT not in", values, "detailContent");
            return (Criteria) this;
        }

        public Criteria andDetailContentBetween(String value1, String value2) {
            addCriterion("DETAIL_CONTENT between", value1, value2, "detailContent");
            return (Criteria) this;
        }

        public Criteria andDetailContentNotBetween(String value1, String value2) {
            addCriterion("DETAIL_CONTENT not between", value1, value2, "detailContent");
            return (Criteria) this;
        }

        public Criteria andDetailDescIsNull() {
            addCriterion("DETAIL_DESC is null");
            return (Criteria) this;
        }

        public Criteria andDetailDescIsNotNull() {
            addCriterion("DETAIL_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDetailDescEqualTo(String value) {
            addCriterion("DETAIL_DESC =", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescNotEqualTo(String value) {
            addCriterion("DETAIL_DESC <>", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescGreaterThan(String value) {
            addCriterion("DETAIL_DESC >", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_DESC >=", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescLessThan(String value) {
            addCriterion("DETAIL_DESC <", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_DESC <=", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescLike(String value) {
            addCriterion("DETAIL_DESC like", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescNotLike(String value) {
            addCriterion("DETAIL_DESC not like", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescIn(List<String> values) {
            addCriterion("DETAIL_DESC in", values, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescNotIn(List<String> values) {
            addCriterion("DETAIL_DESC not in", values, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescBetween(String value1, String value2) {
            addCriterion("DETAIL_DESC between", value1, value2, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescNotBetween(String value1, String value2) {
            addCriterion("DETAIL_DESC not between", value1, value2, "detailDesc");
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

        public Criteria andDetailRespIsNull() {
            addCriterion("DETAIL_RESP is null");
            return (Criteria) this;
        }

        public Criteria andDetailRespIsNotNull() {
            addCriterion("DETAIL_RESP is not null");
            return (Criteria) this;
        }

        public Criteria andDetailRespEqualTo(String value) {
            addCriterion("DETAIL_RESP =", value, "detailResp");
            return (Criteria) this;
        }

        public Criteria andDetailRespNotEqualTo(String value) {
            addCriterion("DETAIL_RESP <>", value, "detailResp");
            return (Criteria) this;
        }

        public Criteria andDetailRespGreaterThan(String value) {
            addCriterion("DETAIL_RESP >", value, "detailResp");
            return (Criteria) this;
        }

        public Criteria andDetailRespGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_RESP >=", value, "detailResp");
            return (Criteria) this;
        }

        public Criteria andDetailRespLessThan(String value) {
            addCriterion("DETAIL_RESP <", value, "detailResp");
            return (Criteria) this;
        }

        public Criteria andDetailRespLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_RESP <=", value, "detailResp");
            return (Criteria) this;
        }

        public Criteria andDetailRespLike(String value) {
            addCriterion("DETAIL_RESP like", value, "detailResp");
            return (Criteria) this;
        }

        public Criteria andDetailRespNotLike(String value) {
            addCriterion("DETAIL_RESP not like", value, "detailResp");
            return (Criteria) this;
        }

        public Criteria andDetailRespIn(List<String> values) {
            addCriterion("DETAIL_RESP in", values, "detailResp");
            return (Criteria) this;
        }

        public Criteria andDetailRespNotIn(List<String> values) {
            addCriterion("DETAIL_RESP not in", values, "detailResp");
            return (Criteria) this;
        }

        public Criteria andDetailRespBetween(String value1, String value2) {
            addCriterion("DETAIL_RESP between", value1, value2, "detailResp");
            return (Criteria) this;
        }

        public Criteria andDetailRespNotBetween(String value1, String value2) {
            addCriterion("DETAIL_RESP not between", value1, value2, "detailResp");
            return (Criteria) this;
        }

        public Criteria andDetailRespnameIsNull() {
            addCriterion("DETAIL_RESPNAME is null");
            return (Criteria) this;
        }

        public Criteria andDetailRespnameIsNotNull() {
            addCriterion("DETAIL_RESPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDetailRespnameEqualTo(String value) {
            addCriterion("DETAIL_RESPNAME =", value, "detailRespname");
            return (Criteria) this;
        }

        public Criteria andDetailRespnameNotEqualTo(String value) {
            addCriterion("DETAIL_RESPNAME <>", value, "detailRespname");
            return (Criteria) this;
        }

        public Criteria andDetailRespnameGreaterThan(String value) {
            addCriterion("DETAIL_RESPNAME >", value, "detailRespname");
            return (Criteria) this;
        }

        public Criteria andDetailRespnameGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_RESPNAME >=", value, "detailRespname");
            return (Criteria) this;
        }

        public Criteria andDetailRespnameLessThan(String value) {
            addCriterion("DETAIL_RESPNAME <", value, "detailRespname");
            return (Criteria) this;
        }

        public Criteria andDetailRespnameLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_RESPNAME <=", value, "detailRespname");
            return (Criteria) this;
        }

        public Criteria andDetailRespnameLike(String value) {
            addCriterion("DETAIL_RESPNAME like", value, "detailRespname");
            return (Criteria) this;
        }

        public Criteria andDetailRespnameNotLike(String value) {
            addCriterion("DETAIL_RESPNAME not like", value, "detailRespname");
            return (Criteria) this;
        }

        public Criteria andDetailRespnameIn(List<String> values) {
            addCriterion("DETAIL_RESPNAME in", values, "detailRespname");
            return (Criteria) this;
        }

        public Criteria andDetailRespnameNotIn(List<String> values) {
            addCriterion("DETAIL_RESPNAME not in", values, "detailRespname");
            return (Criteria) this;
        }

        public Criteria andDetailRespnameBetween(String value1, String value2) {
            addCriterion("DETAIL_RESPNAME between", value1, value2, "detailRespname");
            return (Criteria) this;
        }

        public Criteria andDetailRespnameNotBetween(String value1, String value2) {
            addCriterion("DETAIL_RESPNAME not between", value1, value2, "detailRespname");
            return (Criteria) this;
        }

        public Criteria andDetailStateIsNull() {
            addCriterion("DETAIL_STATE is null");
            return (Criteria) this;
        }

        public Criteria andDetailStateIsNotNull() {
            addCriterion("DETAIL_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andDetailStateEqualTo(String value) {
            addCriterion("DETAIL_STATE =", value, "detailState");
            return (Criteria) this;
        }

        public Criteria andDetailStateNotEqualTo(String value) {
            addCriterion("DETAIL_STATE <>", value, "detailState");
            return (Criteria) this;
        }

        public Criteria andDetailStateGreaterThan(String value) {
            addCriterion("DETAIL_STATE >", value, "detailState");
            return (Criteria) this;
        }

        public Criteria andDetailStateGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_STATE >=", value, "detailState");
            return (Criteria) this;
        }

        public Criteria andDetailStateLessThan(String value) {
            addCriterion("DETAIL_STATE <", value, "detailState");
            return (Criteria) this;
        }

        public Criteria andDetailStateLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_STATE <=", value, "detailState");
            return (Criteria) this;
        }

        public Criteria andDetailStateLike(String value) {
            addCriterion("DETAIL_STATE like", value, "detailState");
            return (Criteria) this;
        }

        public Criteria andDetailStateNotLike(String value) {
            addCriterion("DETAIL_STATE not like", value, "detailState");
            return (Criteria) this;
        }

        public Criteria andDetailStateIn(List<String> values) {
            addCriterion("DETAIL_STATE in", values, "detailState");
            return (Criteria) this;
        }

        public Criteria andDetailStateNotIn(List<String> values) {
            addCriterion("DETAIL_STATE not in", values, "detailState");
            return (Criteria) this;
        }

        public Criteria andDetailStateBetween(String value1, String value2) {
            addCriterion("DETAIL_STATE between", value1, value2, "detailState");
            return (Criteria) this;
        }

        public Criteria andDetailStateNotBetween(String value1, String value2) {
            addCriterion("DETAIL_STATE not between", value1, value2, "detailState");
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
            addCriterionForJDBCDate("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME not between", value1, value2, "updateTime");
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