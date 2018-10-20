package com.po;

import java.util.ArrayList;
import java.util.List;

public class TbssExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbssExample() {
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

        public Criteria andSsidIsNull() {
            addCriterion("SSid is null");
            return (Criteria) this;
        }

        public Criteria andSsidIsNotNull() {
            addCriterion("SSid is not null");
            return (Criteria) this;
        }

        public Criteria andSsidEqualTo(Long value) {
            addCriterion("SSid =", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotEqualTo(Long value) {
            addCriterion("SSid <>", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThan(Long value) {
            addCriterion("SSid >", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThanOrEqualTo(Long value) {
            addCriterion("SSid >=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThan(Long value) {
            addCriterion("SSid <", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThanOrEqualTo(Long value) {
            addCriterion("SSid <=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidIn(List<Long> values) {
            addCriterion("SSid in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotIn(List<Long> values) {
            addCriterion("SSid not in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidBetween(Long value1, Long value2) {
            addCriterion("SSid between", value1, value2, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotBetween(Long value1, Long value2) {
            addCriterion("SSid not between", value1, value2, "ssid");
            return (Criteria) this;
        }

        public Criteria andSpeidIsNull() {
            addCriterion("SPEid is null");
            return (Criteria) this;
        }

        public Criteria andSpeidIsNotNull() {
            addCriterion("SPEid is not null");
            return (Criteria) this;
        }

        public Criteria andSpeidEqualTo(String value) {
            addCriterion("SPEid =", value, "speid");
            return (Criteria) this;
        }

        public Criteria andSpeidNotEqualTo(String value) {
            addCriterion("SPEid <>", value, "speid");
            return (Criteria) this;
        }

        public Criteria andSpeidGreaterThan(String value) {
            addCriterion("SPEid >", value, "speid");
            return (Criteria) this;
        }

        public Criteria andSpeidGreaterThanOrEqualTo(String value) {
            addCriterion("SPEid >=", value, "speid");
            return (Criteria) this;
        }

        public Criteria andSpeidLessThan(String value) {
            addCriterion("SPEid <", value, "speid");
            return (Criteria) this;
        }

        public Criteria andSpeidLessThanOrEqualTo(String value) {
            addCriterion("SPEid <=", value, "speid");
            return (Criteria) this;
        }

        public Criteria andSpeidLike(String value) {
            addCriterion("SPEid like", value, "speid");
            return (Criteria) this;
        }

        public Criteria andSpeidNotLike(String value) {
            addCriterion("SPEid not like", value, "speid");
            return (Criteria) this;
        }

        public Criteria andSpeidIn(List<String> values) {
            addCriterion("SPEid in", values, "speid");
            return (Criteria) this;
        }

        public Criteria andSpeidNotIn(List<String> values) {
            addCriterion("SPEid not in", values, "speid");
            return (Criteria) this;
        }

        public Criteria andSpeidBetween(String value1, String value2) {
            addCriterion("SPEid between", value1, value2, "speid");
            return (Criteria) this;
        }

        public Criteria andSpeidNotBetween(String value1, String value2) {
            addCriterion("SPEid not between", value1, value2, "speid");
            return (Criteria) this;
        }

        public Criteria andShoidIsNull() {
            addCriterion("SHOid is null");
            return (Criteria) this;
        }

        public Criteria andShoidIsNotNull() {
            addCriterion("SHOid is not null");
            return (Criteria) this;
        }

        public Criteria andShoidEqualTo(String value) {
            addCriterion("SHOid =", value, "shoid");
            return (Criteria) this;
        }

        public Criteria andShoidNotEqualTo(String value) {
            addCriterion("SHOid <>", value, "shoid");
            return (Criteria) this;
        }

        public Criteria andShoidGreaterThan(String value) {
            addCriterion("SHOid >", value, "shoid");
            return (Criteria) this;
        }

        public Criteria andShoidGreaterThanOrEqualTo(String value) {
            addCriterion("SHOid >=", value, "shoid");
            return (Criteria) this;
        }

        public Criteria andShoidLessThan(String value) {
            addCriterion("SHOid <", value, "shoid");
            return (Criteria) this;
        }

        public Criteria andShoidLessThanOrEqualTo(String value) {
            addCriterion("SHOid <=", value, "shoid");
            return (Criteria) this;
        }

        public Criteria andShoidLike(String value) {
            addCriterion("SHOid like", value, "shoid");
            return (Criteria) this;
        }

        public Criteria andShoidNotLike(String value) {
            addCriterion("SHOid not like", value, "shoid");
            return (Criteria) this;
        }

        public Criteria andShoidIn(List<String> values) {
            addCriterion("SHOid in", values, "shoid");
            return (Criteria) this;
        }

        public Criteria andShoidNotIn(List<String> values) {
            addCriterion("SHOid not in", values, "shoid");
            return (Criteria) this;
        }

        public Criteria andShoidBetween(String value1, String value2) {
            addCriterion("SHOid between", value1, value2, "shoid");
            return (Criteria) this;
        }

        public Criteria andShoidNotBetween(String value1, String value2) {
            addCriterion("SHOid not between", value1, value2, "shoid");
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