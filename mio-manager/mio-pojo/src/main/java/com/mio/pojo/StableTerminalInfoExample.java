package com.mio.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StableTerminalInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StableTerminalInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIsNull() {
            addCriterion("TERMINAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIsNotNull() {
            addCriterion("TERMINAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdEqualTo(String value) {
            addCriterion("TERMINAL_ID =", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotEqualTo(String value) {
            addCriterion("TERMINAL_ID <>", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThan(String value) {
            addCriterion("TERMINAL_ID >", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_ID >=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThan(String value) {
            addCriterion("TERMINAL_ID <", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_ID <=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLike(String value) {
            addCriterion("TERMINAL_ID like", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotLike(String value) {
            addCriterion("TERMINAL_ID not like", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIn(List<String> values) {
            addCriterion("TERMINAL_ID in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotIn(List<String> values) {
            addCriterion("TERMINAL_ID not in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdBetween(String value1, String value2) {
            addCriterion("TERMINAL_ID between", value1, value2, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_ID not between", value1, value2, "terminalId");
            return (Criteria) this;
        }

        public Criteria andHostIpIsNull() {
            addCriterion("HOST_IP is null");
            return (Criteria) this;
        }

        public Criteria andHostIpIsNotNull() {
            addCriterion("HOST_IP is not null");
            return (Criteria) this;
        }

        public Criteria andHostIpEqualTo(String value) {
            addCriterion("HOST_IP =", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotEqualTo(String value) {
            addCriterion("HOST_IP <>", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpGreaterThan(String value) {
            addCriterion("HOST_IP >", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpGreaterThanOrEqualTo(String value) {
            addCriterion("HOST_IP >=", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLessThan(String value) {
            addCriterion("HOST_IP <", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLessThanOrEqualTo(String value) {
            addCriterion("HOST_IP <=", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLike(String value) {
            addCriterion("HOST_IP like", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotLike(String value) {
            addCriterion("HOST_IP not like", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpIn(List<String> values) {
            addCriterion("HOST_IP in", values, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotIn(List<String> values) {
            addCriterion("HOST_IP not in", values, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpBetween(String value1, String value2) {
            addCriterion("HOST_IP between", value1, value2, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotBetween(String value1, String value2) {
            addCriterion("HOST_IP not between", value1, value2, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostNameIsNull() {
            addCriterion("HOST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHostNameIsNotNull() {
            addCriterion("HOST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHostNameEqualTo(String value) {
            addCriterion("HOST_NAME =", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotEqualTo(String value) {
            addCriterion("HOST_NAME <>", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThan(String value) {
            addCriterion("HOST_NAME >", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThanOrEqualTo(String value) {
            addCriterion("HOST_NAME >=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThan(String value) {
            addCriterion("HOST_NAME <", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThanOrEqualTo(String value) {
            addCriterion("HOST_NAME <=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLike(String value) {
            addCriterion("HOST_NAME like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotLike(String value) {
            addCriterion("HOST_NAME not like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameIn(List<String> values) {
            addCriterion("HOST_NAME in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotIn(List<String> values) {
            addCriterion("HOST_NAME not in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameBetween(String value1, String value2) {
            addCriterion("HOST_NAME between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotBetween(String value1, String value2) {
            addCriterion("HOST_NAME not between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andCpuModelIsNull() {
            addCriterion("CPU_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andCpuModelIsNotNull() {
            addCriterion("CPU_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andCpuModelEqualTo(String value) {
            addCriterion("CPU_MODEL =", value, "cpuModel");
            return (Criteria) this;
        }

        public Criteria andCpuModelNotEqualTo(String value) {
            addCriterion("CPU_MODEL <>", value, "cpuModel");
            return (Criteria) this;
        }

        public Criteria andCpuModelGreaterThan(String value) {
            addCriterion("CPU_MODEL >", value, "cpuModel");
            return (Criteria) this;
        }

        public Criteria andCpuModelGreaterThanOrEqualTo(String value) {
            addCriterion("CPU_MODEL >=", value, "cpuModel");
            return (Criteria) this;
        }

        public Criteria andCpuModelLessThan(String value) {
            addCriterion("CPU_MODEL <", value, "cpuModel");
            return (Criteria) this;
        }

        public Criteria andCpuModelLessThanOrEqualTo(String value) {
            addCriterion("CPU_MODEL <=", value, "cpuModel");
            return (Criteria) this;
        }

        public Criteria andCpuModelLike(String value) {
            addCriterion("CPU_MODEL like", value, "cpuModel");
            return (Criteria) this;
        }

        public Criteria andCpuModelNotLike(String value) {
            addCriterion("CPU_MODEL not like", value, "cpuModel");
            return (Criteria) this;
        }

        public Criteria andCpuModelIn(List<String> values) {
            addCriterion("CPU_MODEL in", values, "cpuModel");
            return (Criteria) this;
        }

        public Criteria andCpuModelNotIn(List<String> values) {
            addCriterion("CPU_MODEL not in", values, "cpuModel");
            return (Criteria) this;
        }

        public Criteria andCpuModelBetween(String value1, String value2) {
            addCriterion("CPU_MODEL between", value1, value2, "cpuModel");
            return (Criteria) this;
        }

        public Criteria andCpuModelNotBetween(String value1, String value2) {
            addCriterion("CPU_MODEL not between", value1, value2, "cpuModel");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyIsNull() {
            addCriterion("CPU_FREQUENCY is null");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyIsNotNull() {
            addCriterion("CPU_FREQUENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyEqualTo(BigDecimal value) {
            addCriterion("CPU_FREQUENCY =", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyNotEqualTo(BigDecimal value) {
            addCriterion("CPU_FREQUENCY <>", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyGreaterThan(BigDecimal value) {
            addCriterion("CPU_FREQUENCY >", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CPU_FREQUENCY >=", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyLessThan(BigDecimal value) {
            addCriterion("CPU_FREQUENCY <", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CPU_FREQUENCY <=", value, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyIn(List<BigDecimal> values) {
            addCriterion("CPU_FREQUENCY in", values, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyNotIn(List<BigDecimal> values) {
            addCriterion("CPU_FREQUENCY not in", values, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CPU_FREQUENCY between", value1, value2, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andCpuFrequencyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CPU_FREQUENCY not between", value1, value2, "cpuFrequency");
            return (Criteria) this;
        }

        public Criteria andMemorySizeIsNull() {
            addCriterion("MEMORY_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andMemorySizeIsNotNull() {
            addCriterion("MEMORY_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andMemorySizeEqualTo(BigDecimal value) {
            addCriterion("MEMORY_SIZE =", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeNotEqualTo(BigDecimal value) {
            addCriterion("MEMORY_SIZE <>", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeGreaterThan(BigDecimal value) {
            addCriterion("MEMORY_SIZE >", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MEMORY_SIZE >=", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeLessThan(BigDecimal value) {
            addCriterion("MEMORY_SIZE <", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MEMORY_SIZE <=", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeIn(List<BigDecimal> values) {
            addCriterion("MEMORY_SIZE in", values, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeNotIn(List<BigDecimal> values) {
            addCriterion("MEMORY_SIZE not in", values, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MEMORY_SIZE between", value1, value2, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MEMORY_SIZE not between", value1, value2, "memorySize");
            return (Criteria) this;
        }

        public Criteria andDiskSizeIsNull() {
            addCriterion("DISK_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andDiskSizeIsNotNull() {
            addCriterion("DISK_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andDiskSizeEqualTo(BigDecimal value) {
            addCriterion("DISK_SIZE =", value, "diskSize");
            return (Criteria) this;
        }

        public Criteria andDiskSizeNotEqualTo(BigDecimal value) {
            addCriterion("DISK_SIZE <>", value, "diskSize");
            return (Criteria) this;
        }

        public Criteria andDiskSizeGreaterThan(BigDecimal value) {
            addCriterion("DISK_SIZE >", value, "diskSize");
            return (Criteria) this;
        }

        public Criteria andDiskSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISK_SIZE >=", value, "diskSize");
            return (Criteria) this;
        }

        public Criteria andDiskSizeLessThan(BigDecimal value) {
            addCriterion("DISK_SIZE <", value, "diskSize");
            return (Criteria) this;
        }

        public Criteria andDiskSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISK_SIZE <=", value, "diskSize");
            return (Criteria) this;
        }

        public Criteria andDiskSizeIn(List<BigDecimal> values) {
            addCriterion("DISK_SIZE in", values, "diskSize");
            return (Criteria) this;
        }

        public Criteria andDiskSizeNotIn(List<BigDecimal> values) {
            addCriterion("DISK_SIZE not in", values, "diskSize");
            return (Criteria) this;
        }

        public Criteria andDiskSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISK_SIZE between", value1, value2, "diskSize");
            return (Criteria) this;
        }

        public Criteria andDiskSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISK_SIZE not between", value1, value2, "diskSize");
            return (Criteria) this;
        }

        public Criteria andGraphicIsNull() {
            addCriterion("GRAPHIC is null");
            return (Criteria) this;
        }

        public Criteria andGraphicIsNotNull() {
            addCriterion("GRAPHIC is not null");
            return (Criteria) this;
        }

        public Criteria andGraphicEqualTo(String value) {
            addCriterion("GRAPHIC =", value, "graphic");
            return (Criteria) this;
        }

        public Criteria andGraphicNotEqualTo(String value) {
            addCriterion("GRAPHIC <>", value, "graphic");
            return (Criteria) this;
        }

        public Criteria andGraphicGreaterThan(String value) {
            addCriterion("GRAPHIC >", value, "graphic");
            return (Criteria) this;
        }

        public Criteria andGraphicGreaterThanOrEqualTo(String value) {
            addCriterion("GRAPHIC >=", value, "graphic");
            return (Criteria) this;
        }

        public Criteria andGraphicLessThan(String value) {
            addCriterion("GRAPHIC <", value, "graphic");
            return (Criteria) this;
        }

        public Criteria andGraphicLessThanOrEqualTo(String value) {
            addCriterion("GRAPHIC <=", value, "graphic");
            return (Criteria) this;
        }

        public Criteria andGraphicLike(String value) {
            addCriterion("GRAPHIC like", value, "graphic");
            return (Criteria) this;
        }

        public Criteria andGraphicNotLike(String value) {
            addCriterion("GRAPHIC not like", value, "graphic");
            return (Criteria) this;
        }

        public Criteria andGraphicIn(List<String> values) {
            addCriterion("GRAPHIC in", values, "graphic");
            return (Criteria) this;
        }

        public Criteria andGraphicNotIn(List<String> values) {
            addCriterion("GRAPHIC not in", values, "graphic");
            return (Criteria) this;
        }

        public Criteria andGraphicBetween(String value1, String value2) {
            addCriterion("GRAPHIC between", value1, value2, "graphic");
            return (Criteria) this;
        }

        public Criteria andGraphicNotBetween(String value1, String value2) {
            addCriterion("GRAPHIC not between", value1, value2, "graphic");
            return (Criteria) this;
        }

        public Criteria andNetworkCardIsNull() {
            addCriterion("NETWORK_CARD is null");
            return (Criteria) this;
        }

        public Criteria andNetworkCardIsNotNull() {
            addCriterion("NETWORK_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkCardEqualTo(String value) {
            addCriterion("NETWORK_CARD =", value, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardNotEqualTo(String value) {
            addCriterion("NETWORK_CARD <>", value, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardGreaterThan(String value) {
            addCriterion("NETWORK_CARD >", value, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardGreaterThanOrEqualTo(String value) {
            addCriterion("NETWORK_CARD >=", value, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardLessThan(String value) {
            addCriterion("NETWORK_CARD <", value, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardLessThanOrEqualTo(String value) {
            addCriterion("NETWORK_CARD <=", value, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardLike(String value) {
            addCriterion("NETWORK_CARD like", value, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardNotLike(String value) {
            addCriterion("NETWORK_CARD not like", value, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardIn(List<String> values) {
            addCriterion("NETWORK_CARD in", values, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardNotIn(List<String> values) {
            addCriterion("NETWORK_CARD not in", values, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardBetween(String value1, String value2) {
            addCriterion("NETWORK_CARD between", value1, value2, "networkCard");
            return (Criteria) this;
        }

        public Criteria andNetworkCardNotBetween(String value1, String value2) {
            addCriterion("NETWORK_CARD not between", value1, value2, "networkCard");
            return (Criteria) this;
        }

        public Criteria andOperateSystemIsNull() {
            addCriterion("OPERATE_SYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andOperateSystemIsNotNull() {
            addCriterion("OPERATE_SYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andOperateSystemEqualTo(String value) {
            addCriterion("OPERATE_SYSTEM =", value, "operateSystem");
            return (Criteria) this;
        }

        public Criteria andOperateSystemNotEqualTo(String value) {
            addCriterion("OPERATE_SYSTEM <>", value, "operateSystem");
            return (Criteria) this;
        }

        public Criteria andOperateSystemGreaterThan(String value) {
            addCriterion("OPERATE_SYSTEM >", value, "operateSystem");
            return (Criteria) this;
        }

        public Criteria andOperateSystemGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE_SYSTEM >=", value, "operateSystem");
            return (Criteria) this;
        }

        public Criteria andOperateSystemLessThan(String value) {
            addCriterion("OPERATE_SYSTEM <", value, "operateSystem");
            return (Criteria) this;
        }

        public Criteria andOperateSystemLessThanOrEqualTo(String value) {
            addCriterion("OPERATE_SYSTEM <=", value, "operateSystem");
            return (Criteria) this;
        }

        public Criteria andOperateSystemLike(String value) {
            addCriterion("OPERATE_SYSTEM like", value, "operateSystem");
            return (Criteria) this;
        }

        public Criteria andOperateSystemNotLike(String value) {
            addCriterion("OPERATE_SYSTEM not like", value, "operateSystem");
            return (Criteria) this;
        }

        public Criteria andOperateSystemIn(List<String> values) {
            addCriterion("OPERATE_SYSTEM in", values, "operateSystem");
            return (Criteria) this;
        }

        public Criteria andOperateSystemNotIn(List<String> values) {
            addCriterion("OPERATE_SYSTEM not in", values, "operateSystem");
            return (Criteria) this;
        }

        public Criteria andOperateSystemBetween(String value1, String value2) {
            addCriterion("OPERATE_SYSTEM between", value1, value2, "operateSystem");
            return (Criteria) this;
        }

        public Criteria andOperateSystemNotBetween(String value1, String value2) {
            addCriterion("OPERATE_SYSTEM not between", value1, value2, "operateSystem");
            return (Criteria) this;
        }

        public Criteria andBrowserIsNull() {
            addCriterion("BROWSER is null");
            return (Criteria) this;
        }

        public Criteria andBrowserIsNotNull() {
            addCriterion("BROWSER is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserEqualTo(String value) {
            addCriterion("BROWSER =", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotEqualTo(String value) {
            addCriterion("BROWSER <>", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThan(String value) {
            addCriterion("BROWSER >", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThanOrEqualTo(String value) {
            addCriterion("BROWSER >=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThan(String value) {
            addCriterion("BROWSER <", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThanOrEqualTo(String value) {
            addCriterion("BROWSER <=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLike(String value) {
            addCriterion("BROWSER like", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotLike(String value) {
            addCriterion("BROWSER not like", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserIn(List<String> values) {
            addCriterion("BROWSER in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotIn(List<String> values) {
            addCriterion("BROWSER not in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserBetween(String value1, String value2) {
            addCriterion("BROWSER between", value1, value2, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotBetween(String value1, String value2) {
            addCriterion("BROWSER not between", value1, value2, "browser");
            return (Criteria) this;
        }

        public Criteria andPrinterModelIsNull() {
            addCriterion("PRINTER_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andPrinterModelIsNotNull() {
            addCriterion("PRINTER_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andPrinterModelEqualTo(String value) {
            addCriterion("PRINTER_MODEL =", value, "printerModel");
            return (Criteria) this;
        }

        public Criteria andPrinterModelNotEqualTo(String value) {
            addCriterion("PRINTER_MODEL <>", value, "printerModel");
            return (Criteria) this;
        }

        public Criteria andPrinterModelGreaterThan(String value) {
            addCriterion("PRINTER_MODEL >", value, "printerModel");
            return (Criteria) this;
        }

        public Criteria andPrinterModelGreaterThanOrEqualTo(String value) {
            addCriterion("PRINTER_MODEL >=", value, "printerModel");
            return (Criteria) this;
        }

        public Criteria andPrinterModelLessThan(String value) {
            addCriterion("PRINTER_MODEL <", value, "printerModel");
            return (Criteria) this;
        }

        public Criteria andPrinterModelLessThanOrEqualTo(String value) {
            addCriterion("PRINTER_MODEL <=", value, "printerModel");
            return (Criteria) this;
        }

        public Criteria andPrinterModelLike(String value) {
            addCriterion("PRINTER_MODEL like", value, "printerModel");
            return (Criteria) this;
        }

        public Criteria andPrinterModelNotLike(String value) {
            addCriterion("PRINTER_MODEL not like", value, "printerModel");
            return (Criteria) this;
        }

        public Criteria andPrinterModelIn(List<String> values) {
            addCriterion("PRINTER_MODEL in", values, "printerModel");
            return (Criteria) this;
        }

        public Criteria andPrinterModelNotIn(List<String> values) {
            addCriterion("PRINTER_MODEL not in", values, "printerModel");
            return (Criteria) this;
        }

        public Criteria andPrinterModelBetween(String value1, String value2) {
            addCriterion("PRINTER_MODEL between", value1, value2, "printerModel");
            return (Criteria) this;
        }

        public Criteria andPrinterModelNotBetween(String value1, String value2) {
            addCriterion("PRINTER_MODEL not between", value1, value2, "printerModel");
            return (Criteria) this;
        }

        public Criteria andTabletsModelIsNull() {
            addCriterion("TABLETS_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andTabletsModelIsNotNull() {
            addCriterion("TABLETS_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andTabletsModelEqualTo(String value) {
            addCriterion("TABLETS_MODEL =", value, "tabletsModel");
            return (Criteria) this;
        }

        public Criteria andTabletsModelNotEqualTo(String value) {
            addCriterion("TABLETS_MODEL <>", value, "tabletsModel");
            return (Criteria) this;
        }

        public Criteria andTabletsModelGreaterThan(String value) {
            addCriterion("TABLETS_MODEL >", value, "tabletsModel");
            return (Criteria) this;
        }

        public Criteria andTabletsModelGreaterThanOrEqualTo(String value) {
            addCriterion("TABLETS_MODEL >=", value, "tabletsModel");
            return (Criteria) this;
        }

        public Criteria andTabletsModelLessThan(String value) {
            addCriterion("TABLETS_MODEL <", value, "tabletsModel");
            return (Criteria) this;
        }

        public Criteria andTabletsModelLessThanOrEqualTo(String value) {
            addCriterion("TABLETS_MODEL <=", value, "tabletsModel");
            return (Criteria) this;
        }

        public Criteria andTabletsModelLike(String value) {
            addCriterion("TABLETS_MODEL like", value, "tabletsModel");
            return (Criteria) this;
        }

        public Criteria andTabletsModelNotLike(String value) {
            addCriterion("TABLETS_MODEL not like", value, "tabletsModel");
            return (Criteria) this;
        }

        public Criteria andTabletsModelIn(List<String> values) {
            addCriterion("TABLETS_MODEL in", values, "tabletsModel");
            return (Criteria) this;
        }

        public Criteria andTabletsModelNotIn(List<String> values) {
            addCriterion("TABLETS_MODEL not in", values, "tabletsModel");
            return (Criteria) this;
        }

        public Criteria andTabletsModelBetween(String value1, String value2) {
            addCriterion("TABLETS_MODEL between", value1, value2, "tabletsModel");
            return (Criteria) this;
        }

        public Criteria andTabletsModelNotBetween(String value1, String value2) {
            addCriterion("TABLETS_MODEL not between", value1, value2, "tabletsModel");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNull() {
            addCriterion("DISTRICT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNotNull() {
            addCriterion("DISTRICT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdEqualTo(String value) {
            addCriterion("DISTRICT_ID =", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotEqualTo(String value) {
            addCriterion("DISTRICT_ID <>", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThan(String value) {
            addCriterion("DISTRICT_ID >", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRICT_ID >=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThan(String value) {
            addCriterion("DISTRICT_ID <", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThanOrEqualTo(String value) {
            addCriterion("DISTRICT_ID <=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLike(String value) {
            addCriterion("DISTRICT_ID like", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotLike(String value) {
            addCriterion("DISTRICT_ID not like", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIn(List<String> values) {
            addCriterion("DISTRICT_ID in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotIn(List<String> values) {
            addCriterion("DISTRICT_ID not in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdBetween(String value1, String value2) {
            addCriterion("DISTRICT_ID between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotBetween(String value1, String value2) {
            addCriterion("DISTRICT_ID not between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdIsNull() {
            addCriterion("OFFICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andOfficeIdIsNotNull() {
            addCriterion("OFFICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeIdEqualTo(String value) {
            addCriterion("OFFICE_ID =", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdNotEqualTo(String value) {
            addCriterion("OFFICE_ID <>", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdGreaterThan(String value) {
            addCriterion("OFFICE_ID >", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE_ID >=", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdLessThan(String value) {
            addCriterion("OFFICE_ID <", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdLessThanOrEqualTo(String value) {
            addCriterion("OFFICE_ID <=", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdLike(String value) {
            addCriterion("OFFICE_ID like", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdNotLike(String value) {
            addCriterion("OFFICE_ID not like", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdIn(List<String> values) {
            addCriterion("OFFICE_ID in", values, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdNotIn(List<String> values) {
            addCriterion("OFFICE_ID not in", values, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdBetween(String value1, String value2) {
            addCriterion("OFFICE_ID between", value1, value2, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdNotBetween(String value1, String value2) {
            addCriterion("OFFICE_ID not between", value1, value2, "officeId");
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

        public Criteria andDeviceTypeIsNull() {
            addCriterion("DEVICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("DEVICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeEqualTo(String value) {
            addCriterion("DEVICE_TYPE =", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotEqualTo(String value) {
            addCriterion("DEVICE_TYPE <>", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThan(String value) {
            addCriterion("DEVICE_TYPE >", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_TYPE >=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThan(String value) {
            addCriterion("DEVICE_TYPE <", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_TYPE <=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLike(String value) {
            addCriterion("DEVICE_TYPE like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotLike(String value) {
            addCriterion("DEVICE_TYPE not like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIn(List<String> values) {
            addCriterion("DEVICE_TYPE in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotIn(List<String> values) {
            addCriterion("DEVICE_TYPE not in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeBetween(String value1, String value2) {
            addCriterion("DEVICE_TYPE between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotBetween(String value1, String value2) {
            addCriterion("DEVICE_TYPE not between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andClientIpIsNull() {
            addCriterion("CLIENT_IP is null");
            return (Criteria) this;
        }

        public Criteria andClientIpIsNotNull() {
            addCriterion("CLIENT_IP is not null");
            return (Criteria) this;
        }

        public Criteria andClientIpEqualTo(String value) {
            addCriterion("CLIENT_IP =", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotEqualTo(String value) {
            addCriterion("CLIENT_IP <>", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpGreaterThan(String value) {
            addCriterion("CLIENT_IP >", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_IP >=", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLessThan(String value) {
            addCriterion("CLIENT_IP <", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_IP <=", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLike(String value) {
            addCriterion("CLIENT_IP like", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotLike(String value) {
            addCriterion("CLIENT_IP not like", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpIn(List<String> values) {
            addCriterion("CLIENT_IP in", values, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotIn(List<String> values) {
            addCriterion("CLIENT_IP not in", values, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpBetween(String value1, String value2) {
            addCriterion("CLIENT_IP between", value1, value2, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotBetween(String value1, String value2) {
            addCriterion("CLIENT_IP not between", value1, value2, "clientIp");
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

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andDevUpTimeIsNull() {
            addCriterion("DEV_UP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDevUpTimeIsNotNull() {
            addCriterion("DEV_UP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDevUpTimeEqualTo(Date value) {
            addCriterionForJDBCDate("DEV_UP_TIME =", value, "devUpTime");
            return (Criteria) this;
        }

        public Criteria andDevUpTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("DEV_UP_TIME <>", value, "devUpTime");
            return (Criteria) this;
        }

        public Criteria andDevUpTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("DEV_UP_TIME >", value, "devUpTime");
            return (Criteria) this;
        }

        public Criteria andDevUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEV_UP_TIME >=", value, "devUpTime");
            return (Criteria) this;
        }

        public Criteria andDevUpTimeLessThan(Date value) {
            addCriterionForJDBCDate("DEV_UP_TIME <", value, "devUpTime");
            return (Criteria) this;
        }

        public Criteria andDevUpTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEV_UP_TIME <=", value, "devUpTime");
            return (Criteria) this;
        }

        public Criteria andDevUpTimeIn(List<Date> values) {
            addCriterionForJDBCDate("DEV_UP_TIME in", values, "devUpTime");
            return (Criteria) this;
        }

        public Criteria andDevUpTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("DEV_UP_TIME not in", values, "devUpTime");
            return (Criteria) this;
        }

        public Criteria andDevUpTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEV_UP_TIME between", value1, value2, "devUpTime");
            return (Criteria) this;
        }

        public Criteria andDevUpTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEV_UP_TIME not between", value1, value2, "devUpTime");
            return (Criteria) this;
        }

        public Criteria andDtdevDownTimeIsNull() {
            addCriterion("DTDEV_DOWN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDtdevDownTimeIsNotNull() {
            addCriterion("DTDEV_DOWN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDtdevDownTimeEqualTo(Date value) {
            addCriterionForJDBCDate("DTDEV_DOWN_TIME =", value, "dtdevDownTime");
            return (Criteria) this;
        }

        public Criteria andDtdevDownTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("DTDEV_DOWN_TIME <>", value, "dtdevDownTime");
            return (Criteria) this;
        }

        public Criteria andDtdevDownTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("DTDEV_DOWN_TIME >", value, "dtdevDownTime");
            return (Criteria) this;
        }

        public Criteria andDtdevDownTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DTDEV_DOWN_TIME >=", value, "dtdevDownTime");
            return (Criteria) this;
        }

        public Criteria andDtdevDownTimeLessThan(Date value) {
            addCriterionForJDBCDate("DTDEV_DOWN_TIME <", value, "dtdevDownTime");
            return (Criteria) this;
        }

        public Criteria andDtdevDownTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DTDEV_DOWN_TIME <=", value, "dtdevDownTime");
            return (Criteria) this;
        }

        public Criteria andDtdevDownTimeIn(List<Date> values) {
            addCriterionForJDBCDate("DTDEV_DOWN_TIME in", values, "dtdevDownTime");
            return (Criteria) this;
        }

        public Criteria andDtdevDownTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("DTDEV_DOWN_TIME not in", values, "dtdevDownTime");
            return (Criteria) this;
        }

        public Criteria andDtdevDownTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DTDEV_DOWN_TIME between", value1, value2, "dtdevDownTime");
            return (Criteria) this;
        }

        public Criteria andDtdevDownTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DTDEV_DOWN_TIME not between", value1, value2, "dtdevDownTime");
            return (Criteria) this;
        }

        public Criteria andDtdevFirstfoundTimeIsNull() {
            addCriterion("DTDEV_FIRSTFOUND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDtdevFirstfoundTimeIsNotNull() {
            addCriterion("DTDEV_FIRSTFOUND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDtdevFirstfoundTimeEqualTo(Date value) {
            addCriterionForJDBCDate("DTDEV_FIRSTFOUND_TIME =", value, "dtdevFirstfoundTime");
            return (Criteria) this;
        }

        public Criteria andDtdevFirstfoundTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("DTDEV_FIRSTFOUND_TIME <>", value, "dtdevFirstfoundTime");
            return (Criteria) this;
        }

        public Criteria andDtdevFirstfoundTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("DTDEV_FIRSTFOUND_TIME >", value, "dtdevFirstfoundTime");
            return (Criteria) this;
        }

        public Criteria andDtdevFirstfoundTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DTDEV_FIRSTFOUND_TIME >=", value, "dtdevFirstfoundTime");
            return (Criteria) this;
        }

        public Criteria andDtdevFirstfoundTimeLessThan(Date value) {
            addCriterionForJDBCDate("DTDEV_FIRSTFOUND_TIME <", value, "dtdevFirstfoundTime");
            return (Criteria) this;
        }

        public Criteria andDtdevFirstfoundTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DTDEV_FIRSTFOUND_TIME <=", value, "dtdevFirstfoundTime");
            return (Criteria) this;
        }

        public Criteria andDtdevFirstfoundTimeIn(List<Date> values) {
            addCriterionForJDBCDate("DTDEV_FIRSTFOUND_TIME in", values, "dtdevFirstfoundTime");
            return (Criteria) this;
        }

        public Criteria andDtdevFirstfoundTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("DTDEV_FIRSTFOUND_TIME not in", values, "dtdevFirstfoundTime");
            return (Criteria) this;
        }

        public Criteria andDtdevFirstfoundTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DTDEV_FIRSTFOUND_TIME between", value1, value2, "dtdevFirstfoundTime");
            return (Criteria) this;
        }

        public Criteria andDtdevFirstfoundTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DTDEV_FIRSTFOUND_TIME not between", value1, value2, "dtdevFirstfoundTime");
            return (Criteria) this;
        }

        public Criteria andIsStatusIsNull() {
            addCriterion("IS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andIsStatusIsNotNull() {
            addCriterion("IS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andIsStatusEqualTo(String value) {
            addCriterion("IS_STATUS =", value, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusNotEqualTo(String value) {
            addCriterion("IS_STATUS <>", value, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusGreaterThan(String value) {
            addCriterion("IS_STATUS >", value, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("IS_STATUS >=", value, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusLessThan(String value) {
            addCriterion("IS_STATUS <", value, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusLessThanOrEqualTo(String value) {
            addCriterion("IS_STATUS <=", value, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusLike(String value) {
            addCriterion("IS_STATUS like", value, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusNotLike(String value) {
            addCriterion("IS_STATUS not like", value, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusIn(List<String> values) {
            addCriterion("IS_STATUS in", values, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusNotIn(List<String> values) {
            addCriterion("IS_STATUS not in", values, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusBetween(String value1, String value2) {
            addCriterion("IS_STATUS between", value1, value2, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusNotBetween(String value1, String value2) {
            addCriterion("IS_STATUS not between", value1, value2, "isStatus");
            return (Criteria) this;
        }

        public Criteria andTerUseIsNull() {
            addCriterion("TER_USE is null");
            return (Criteria) this;
        }

        public Criteria andTerUseIsNotNull() {
            addCriterion("TER_USE is not null");
            return (Criteria) this;
        }

        public Criteria andTerUseEqualTo(String value) {
            addCriterion("TER_USE =", value, "terUse");
            return (Criteria) this;
        }

        public Criteria andTerUseNotEqualTo(String value) {
            addCriterion("TER_USE <>", value, "terUse");
            return (Criteria) this;
        }

        public Criteria andTerUseGreaterThan(String value) {
            addCriterion("TER_USE >", value, "terUse");
            return (Criteria) this;
        }

        public Criteria andTerUseGreaterThanOrEqualTo(String value) {
            addCriterion("TER_USE >=", value, "terUse");
            return (Criteria) this;
        }

        public Criteria andTerUseLessThan(String value) {
            addCriterion("TER_USE <", value, "terUse");
            return (Criteria) this;
        }

        public Criteria andTerUseLessThanOrEqualTo(String value) {
            addCriterion("TER_USE <=", value, "terUse");
            return (Criteria) this;
        }

        public Criteria andTerUseLike(String value) {
            addCriterion("TER_USE like", value, "terUse");
            return (Criteria) this;
        }

        public Criteria andTerUseNotLike(String value) {
            addCriterion("TER_USE not like", value, "terUse");
            return (Criteria) this;
        }

        public Criteria andTerUseIn(List<String> values) {
            addCriterion("TER_USE in", values, "terUse");
            return (Criteria) this;
        }

        public Criteria andTerUseNotIn(List<String> values) {
            addCriterion("TER_USE not in", values, "terUse");
            return (Criteria) this;
        }

        public Criteria andTerUseBetween(String value1, String value2) {
            addCriterion("TER_USE between", value1, value2, "terUse");
            return (Criteria) this;
        }

        public Criteria andTerUseNotBetween(String value1, String value2) {
            addCriterion("TER_USE not between", value1, value2, "terUse");
            return (Criteria) this;
        }

        public Criteria andMacIsNull() {
            addCriterion("MAC is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("MAC is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(String value) {
            addCriterion("MAC =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(String value) {
            addCriterion("MAC <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(String value) {
            addCriterion("MAC >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(String value) {
            addCriterion("MAC >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(String value) {
            addCriterion("MAC <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(String value) {
            addCriterion("MAC <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLike(String value) {
            addCriterion("MAC like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotLike(String value) {
            addCriterion("MAC not like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(List<String> values) {
            addCriterion("MAC in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(List<String> values) {
            addCriterion("MAC not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(String value1, String value2) {
            addCriterion("MAC between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(String value1, String value2) {
            addCriterion("MAC not between", value1, value2, "mac");
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