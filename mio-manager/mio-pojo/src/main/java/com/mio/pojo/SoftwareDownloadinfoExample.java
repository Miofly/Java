package com.mio.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SoftwareDownloadinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SoftwareDownloadinfoExample() {
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

        public Criteria andDownloadUserIsNull() {
            addCriterion("download_user is null");
            return (Criteria) this;
        }

        public Criteria andDownloadUserIsNotNull() {
            addCriterion("download_user is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadUserEqualTo(String value) {
            addCriterion("download_user =", value, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserNotEqualTo(String value) {
            addCriterion("download_user <>", value, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserGreaterThan(String value) {
            addCriterion("download_user >", value, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserGreaterThanOrEqualTo(String value) {
            addCriterion("download_user >=", value, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserLessThan(String value) {
            addCriterion("download_user <", value, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserLessThanOrEqualTo(String value) {
            addCriterion("download_user <=", value, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserLike(String value) {
            addCriterion("download_user like", value, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserNotLike(String value) {
            addCriterion("download_user not like", value, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserIn(List<String> values) {
            addCriterion("download_user in", values, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserNotIn(List<String> values) {
            addCriterion("download_user not in", values, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserBetween(String value1, String value2) {
            addCriterion("download_user between", value1, value2, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadUserNotBetween(String value1, String value2) {
            addCriterion("download_user not between", value1, value2, "downloadUser");
            return (Criteria) this;
        }

        public Criteria andDownloadTimeIsNull() {
            addCriterion("download_time is null");
            return (Criteria) this;
        }

        public Criteria andDownloadTimeIsNotNull() {
            addCriterion("download_time is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadTimeEqualTo(Date value) {
            addCriterion("download_time =", value, "downloadTime");
            return (Criteria) this;
        }

        public Criteria andDownloadTimeNotEqualTo(Date value) {
            addCriterion("download_time <>", value, "downloadTime");
            return (Criteria) this;
        }

        public Criteria andDownloadTimeGreaterThan(Date value) {
            addCriterion("download_time >", value, "downloadTime");
            return (Criteria) this;
        }

        public Criteria andDownloadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("download_time >=", value, "downloadTime");
            return (Criteria) this;
        }

        public Criteria andDownloadTimeLessThan(Date value) {
            addCriterion("download_time <", value, "downloadTime");
            return (Criteria) this;
        }

        public Criteria andDownloadTimeLessThanOrEqualTo(Date value) {
            addCriterion("download_time <=", value, "downloadTime");
            return (Criteria) this;
        }

        public Criteria andDownloadTimeIn(List<Date> values) {
            addCriterion("download_time in", values, "downloadTime");
            return (Criteria) this;
        }

        public Criteria andDownloadTimeNotIn(List<Date> values) {
            addCriterion("download_time not in", values, "downloadTime");
            return (Criteria) this;
        }

        public Criteria andDownloadTimeBetween(Date value1, Date value2) {
            addCriterion("download_time between", value1, value2, "downloadTime");
            return (Criteria) this;
        }

        public Criteria andDownloadTimeNotBetween(Date value1, Date value2) {
            addCriterion("download_time not between", value1, value2, "downloadTime");
            return (Criteria) this;
        }

        public Criteria andDownloadIpIsNull() {
            addCriterion("download_ip is null");
            return (Criteria) this;
        }

        public Criteria andDownloadIpIsNotNull() {
            addCriterion("download_ip is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadIpEqualTo(String value) {
            addCriterion("download_ip =", value, "downloadIp");
            return (Criteria) this;
        }

        public Criteria andDownloadIpNotEqualTo(String value) {
            addCriterion("download_ip <>", value, "downloadIp");
            return (Criteria) this;
        }

        public Criteria andDownloadIpGreaterThan(String value) {
            addCriterion("download_ip >", value, "downloadIp");
            return (Criteria) this;
        }

        public Criteria andDownloadIpGreaterThanOrEqualTo(String value) {
            addCriterion("download_ip >=", value, "downloadIp");
            return (Criteria) this;
        }

        public Criteria andDownloadIpLessThan(String value) {
            addCriterion("download_ip <", value, "downloadIp");
            return (Criteria) this;
        }

        public Criteria andDownloadIpLessThanOrEqualTo(String value) {
            addCriterion("download_ip <=", value, "downloadIp");
            return (Criteria) this;
        }

        public Criteria andDownloadIpLike(String value) {
            addCriterion("download_ip like", value, "downloadIp");
            return (Criteria) this;
        }

        public Criteria andDownloadIpNotLike(String value) {
            addCriterion("download_ip not like", value, "downloadIp");
            return (Criteria) this;
        }

        public Criteria andDownloadIpIn(List<String> values) {
            addCriterion("download_ip in", values, "downloadIp");
            return (Criteria) this;
        }

        public Criteria andDownloadIpNotIn(List<String> values) {
            addCriterion("download_ip not in", values, "downloadIp");
            return (Criteria) this;
        }

        public Criteria andDownloadIpBetween(String value1, String value2) {
            addCriterion("download_ip between", value1, value2, "downloadIp");
            return (Criteria) this;
        }

        public Criteria andDownloadIpNotBetween(String value1, String value2) {
            addCriterion("download_ip not between", value1, value2, "downloadIp");
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