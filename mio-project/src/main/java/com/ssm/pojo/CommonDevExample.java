package com.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommonDevExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommonDevExample() {
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

        public Criteria andDevnameIsNull() {
            addCriterion("devname is null");
            return (Criteria) this;
        }

        public Criteria andDevnameIsNotNull() {
            addCriterion("devname is not null");
            return (Criteria) this;
        }

        public Criteria andDevnameEqualTo(String value) {
            addCriterion("devname =", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameNotEqualTo(String value) {
            addCriterion("devname <>", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameGreaterThan(String value) {
            addCriterion("devname >", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameGreaterThanOrEqualTo(String value) {
            addCriterion("devname >=", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameLessThan(String value) {
            addCriterion("devname <", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameLessThanOrEqualTo(String value) {
            addCriterion("devname <=", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameLike(String value) {
            addCriterion("devname like", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameNotLike(String value) {
            addCriterion("devname not like", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameIn(List<String> values) {
            addCriterion("devname in", values, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameNotIn(List<String> values) {
            addCriterion("devname not in", values, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameBetween(String value1, String value2) {
            addCriterion("devname between", value1, value2, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameNotBetween(String value1, String value2) {
            addCriterion("devname not between", value1, value2, "devname");
            return (Criteria) this;
        }

        public Criteria andDevipIsNull() {
            addCriterion("devip is null");
            return (Criteria) this;
        }

        public Criteria andDevipIsNotNull() {
            addCriterion("devip is not null");
            return (Criteria) this;
        }

        public Criteria andDevipEqualTo(String value) {
            addCriterion("devip =", value, "devip");
            return (Criteria) this;
        }

        public Criteria andDevipNotEqualTo(String value) {
            addCriterion("devip <>", value, "devip");
            return (Criteria) this;
        }

        public Criteria andDevipGreaterThan(String value) {
            addCriterion("devip >", value, "devip");
            return (Criteria) this;
        }

        public Criteria andDevipGreaterThanOrEqualTo(String value) {
            addCriterion("devip >=", value, "devip");
            return (Criteria) this;
        }

        public Criteria andDevipLessThan(String value) {
            addCriterion("devip <", value, "devip");
            return (Criteria) this;
        }

        public Criteria andDevipLessThanOrEqualTo(String value) {
            addCriterion("devip <=", value, "devip");
            return (Criteria) this;
        }

        public Criteria andDevipLike(String value) {
            addCriterion("devip like", value, "devip");
            return (Criteria) this;
        }

        public Criteria andDevipNotLike(String value) {
            addCriterion("devip not like", value, "devip");
            return (Criteria) this;
        }

        public Criteria andDevipIn(List<String> values) {
            addCriterion("devip in", values, "devip");
            return (Criteria) this;
        }

        public Criteria andDevipNotIn(List<String> values) {
            addCriterion("devip not in", values, "devip");
            return (Criteria) this;
        }

        public Criteria andDevipBetween(String value1, String value2) {
            addCriterion("devip between", value1, value2, "devip");
            return (Criteria) this;
        }

        public Criteria andDevipNotBetween(String value1, String value2) {
            addCriterion("devip not between", value1, value2, "devip");
            return (Criteria) this;
        }

        public Criteria andDevmacIsNull() {
            addCriterion("devmac is null");
            return (Criteria) this;
        }

        public Criteria andDevmacIsNotNull() {
            addCriterion("devmac is not null");
            return (Criteria) this;
        }

        public Criteria andDevmacEqualTo(String value) {
            addCriterion("devmac =", value, "devmac");
            return (Criteria) this;
        }

        public Criteria andDevmacNotEqualTo(String value) {
            addCriterion("devmac <>", value, "devmac");
            return (Criteria) this;
        }

        public Criteria andDevmacGreaterThan(String value) {
            addCriterion("devmac >", value, "devmac");
            return (Criteria) this;
        }

        public Criteria andDevmacGreaterThanOrEqualTo(String value) {
            addCriterion("devmac >=", value, "devmac");
            return (Criteria) this;
        }

        public Criteria andDevmacLessThan(String value) {
            addCriterion("devmac <", value, "devmac");
            return (Criteria) this;
        }

        public Criteria andDevmacLessThanOrEqualTo(String value) {
            addCriterion("devmac <=", value, "devmac");
            return (Criteria) this;
        }

        public Criteria andDevmacLike(String value) {
            addCriterion("devmac like", value, "devmac");
            return (Criteria) this;
        }

        public Criteria andDevmacNotLike(String value) {
            addCriterion("devmac not like", value, "devmac");
            return (Criteria) this;
        }

        public Criteria andDevmacIn(List<String> values) {
            addCriterion("devmac in", values, "devmac");
            return (Criteria) this;
        }

        public Criteria andDevmacNotIn(List<String> values) {
            addCriterion("devmac not in", values, "devmac");
            return (Criteria) this;
        }

        public Criteria andDevmacBetween(String value1, String value2) {
            addCriterion("devmac between", value1, value2, "devmac");
            return (Criteria) this;
        }

        public Criteria andDevmacNotBetween(String value1, String value2) {
            addCriterion("devmac not between", value1, value2, "devmac");
            return (Criteria) this;
        }

        public Criteria andDevtypeIsNull() {
            addCriterion("DevType is null");
            return (Criteria) this;
        }

        public Criteria andDevtypeIsNotNull() {
            addCriterion("DevType is not null");
            return (Criteria) this;
        }

        public Criteria andDevtypeEqualTo(String value) {
            addCriterion("DevType =", value, "devtype");
            return (Criteria) this;
        }

        public Criteria andDevtypeNotEqualTo(String value) {
            addCriterion("DevType <>", value, "devtype");
            return (Criteria) this;
        }

        public Criteria andDevtypeGreaterThan(String value) {
            addCriterion("DevType >", value, "devtype");
            return (Criteria) this;
        }

        public Criteria andDevtypeGreaterThanOrEqualTo(String value) {
            addCriterion("DevType >=", value, "devtype");
            return (Criteria) this;
        }

        public Criteria andDevtypeLessThan(String value) {
            addCriterion("DevType <", value, "devtype");
            return (Criteria) this;
        }

        public Criteria andDevtypeLessThanOrEqualTo(String value) {
            addCriterion("DevType <=", value, "devtype");
            return (Criteria) this;
        }

        public Criteria andDevtypeLike(String value) {
            addCriterion("DevType like", value, "devtype");
            return (Criteria) this;
        }

        public Criteria andDevtypeNotLike(String value) {
            addCriterion("DevType not like", value, "devtype");
            return (Criteria) this;
        }

        public Criteria andDevtypeIn(List<String> values) {
            addCriterion("DevType in", values, "devtype");
            return (Criteria) this;
        }

        public Criteria andDevtypeNotIn(List<String> values) {
            addCriterion("DevType not in", values, "devtype");
            return (Criteria) this;
        }

        public Criteria andDevtypeBetween(String value1, String value2) {
            addCriterion("DevType between", value1, value2, "devtype");
            return (Criteria) this;
        }

        public Criteria andDevtypeNotBetween(String value1, String value2) {
            addCriterion("DevType not between", value1, value2, "devtype");
            return (Criteria) this;
        }

        public Criteria andDevfoundtimeIsNull() {
            addCriterion("devfoundtime is null");
            return (Criteria) this;
        }

        public Criteria andDevfoundtimeIsNotNull() {
            addCriterion("devfoundtime is not null");
            return (Criteria) this;
        }

        public Criteria andDevfoundtimeEqualTo(Date value) {
            addCriterion("devfoundtime =", value, "devfoundtime");
            return (Criteria) this;
        }

        public Criteria andDevfoundtimeNotEqualTo(Date value) {
            addCriterion("devfoundtime <>", value, "devfoundtime");
            return (Criteria) this;
        }

        public Criteria andDevfoundtimeGreaterThan(Date value) {
            addCriterion("devfoundtime >", value, "devfoundtime");
            return (Criteria) this;
        }

        public Criteria andDevfoundtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("devfoundtime >=", value, "devfoundtime");
            return (Criteria) this;
        }

        public Criteria andDevfoundtimeLessThan(Date value) {
            addCriterion("devfoundtime <", value, "devfoundtime");
            return (Criteria) this;
        }

        public Criteria andDevfoundtimeLessThanOrEqualTo(Date value) {
            addCriterion("devfoundtime <=", value, "devfoundtime");
            return (Criteria) this;
        }

        public Criteria andDevfoundtimeIn(List<Date> values) {
            addCriterion("devfoundtime in", values, "devfoundtime");
            return (Criteria) this;
        }

        public Criteria andDevfoundtimeNotIn(List<Date> values) {
            addCriterion("devfoundtime not in", values, "devfoundtime");
            return (Criteria) this;
        }

        public Criteria andDevfoundtimeBetween(Date value1, Date value2) {
            addCriterion("devfoundtime between", value1, value2, "devfoundtime");
            return (Criteria) this;
        }

        public Criteria andDevfoundtimeNotBetween(Date value1, Date value2) {
            addCriterion("devfoundtime not between", value1, value2, "devfoundtime");
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