package com.po;

import java.util.ArrayList;
import java.util.List;

public class TbsetupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbsetupExample() {
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

        public Criteria andSetuidIsNull() {
            addCriterion("SETUid is null");
            return (Criteria) this;
        }

        public Criteria andSetuidIsNotNull() {
            addCriterion("SETUid is not null");
            return (Criteria) this;
        }

        public Criteria andSetuidEqualTo(Long value) {
            addCriterion("SETUid =", value, "setuid");
            return (Criteria) this;
        }

        public Criteria andSetuidNotEqualTo(Long value) {
            addCriterion("SETUid <>", value, "setuid");
            return (Criteria) this;
        }

        public Criteria andSetuidGreaterThan(Long value) {
            addCriterion("SETUid >", value, "setuid");
            return (Criteria) this;
        }

        public Criteria andSetuidGreaterThanOrEqualTo(Long value) {
            addCriterion("SETUid >=", value, "setuid");
            return (Criteria) this;
        }

        public Criteria andSetuidLessThan(Long value) {
            addCriterion("SETUid <", value, "setuid");
            return (Criteria) this;
        }

        public Criteria andSetuidLessThanOrEqualTo(Long value) {
            addCriterion("SETUid <=", value, "setuid");
            return (Criteria) this;
        }

        public Criteria andSetuidIn(List<Long> values) {
            addCriterion("SETUid in", values, "setuid");
            return (Criteria) this;
        }

        public Criteria andSetuidNotIn(List<Long> values) {
            addCriterion("SETUid not in", values, "setuid");
            return (Criteria) this;
        }

        public Criteria andSetuidBetween(Long value1, Long value2) {
            addCriterion("SETUid between", value1, value2, "setuid");
            return (Criteria) this;
        }

        public Criteria andSetuidNotBetween(Long value1, Long value2) {
            addCriterion("SETUid not between", value1, value2, "setuid");
            return (Criteria) this;
        }

        public Criteria andSetpropellingIsNull() {
            addCriterion("SETpropelling is null");
            return (Criteria) this;
        }

        public Criteria andSetpropellingIsNotNull() {
            addCriterion("SETpropelling is not null");
            return (Criteria) this;
        }

        public Criteria andSetpropellingEqualTo(String value) {
            addCriterion("SETpropelling =", value, "setpropelling");
            return (Criteria) this;
        }

        public Criteria andSetpropellingNotEqualTo(String value) {
            addCriterion("SETpropelling <>", value, "setpropelling");
            return (Criteria) this;
        }

        public Criteria andSetpropellingGreaterThan(String value) {
            addCriterion("SETpropelling >", value, "setpropelling");
            return (Criteria) this;
        }

        public Criteria andSetpropellingGreaterThanOrEqualTo(String value) {
            addCriterion("SETpropelling >=", value, "setpropelling");
            return (Criteria) this;
        }

        public Criteria andSetpropellingLessThan(String value) {
            addCriterion("SETpropelling <", value, "setpropelling");
            return (Criteria) this;
        }

        public Criteria andSetpropellingLessThanOrEqualTo(String value) {
            addCriterion("SETpropelling <=", value, "setpropelling");
            return (Criteria) this;
        }

        public Criteria andSetpropellingLike(String value) {
            addCriterion("SETpropelling like", value, "setpropelling");
            return (Criteria) this;
        }

        public Criteria andSetpropellingNotLike(String value) {
            addCriterion("SETpropelling not like", value, "setpropelling");
            return (Criteria) this;
        }

        public Criteria andSetpropellingIn(List<String> values) {
            addCriterion("SETpropelling in", values, "setpropelling");
            return (Criteria) this;
        }

        public Criteria andSetpropellingNotIn(List<String> values) {
            addCriterion("SETpropelling not in", values, "setpropelling");
            return (Criteria) this;
        }

        public Criteria andSetpropellingBetween(String value1, String value2) {
            addCriterion("SETpropelling between", value1, value2, "setpropelling");
            return (Criteria) this;
        }

        public Criteria andSetpropellingNotBetween(String value1, String value2) {
            addCriterion("SETpropelling not between", value1, value2, "setpropelling");
            return (Criteria) this;
        }

        public Criteria andSetupgradeIsNull() {
            addCriterion("SETupgrade is null");
            return (Criteria) this;
        }

        public Criteria andSetupgradeIsNotNull() {
            addCriterion("SETupgrade is not null");
            return (Criteria) this;
        }

        public Criteria andSetupgradeEqualTo(String value) {
            addCriterion("SETupgrade =", value, "setupgrade");
            return (Criteria) this;
        }

        public Criteria andSetupgradeNotEqualTo(String value) {
            addCriterion("SETupgrade <>", value, "setupgrade");
            return (Criteria) this;
        }

        public Criteria andSetupgradeGreaterThan(String value) {
            addCriterion("SETupgrade >", value, "setupgrade");
            return (Criteria) this;
        }

        public Criteria andSetupgradeGreaterThanOrEqualTo(String value) {
            addCriterion("SETupgrade >=", value, "setupgrade");
            return (Criteria) this;
        }

        public Criteria andSetupgradeLessThan(String value) {
            addCriterion("SETupgrade <", value, "setupgrade");
            return (Criteria) this;
        }

        public Criteria andSetupgradeLessThanOrEqualTo(String value) {
            addCriterion("SETupgrade <=", value, "setupgrade");
            return (Criteria) this;
        }

        public Criteria andSetupgradeLike(String value) {
            addCriterion("SETupgrade like", value, "setupgrade");
            return (Criteria) this;
        }

        public Criteria andSetupgradeNotLike(String value) {
            addCriterion("SETupgrade not like", value, "setupgrade");
            return (Criteria) this;
        }

        public Criteria andSetupgradeIn(List<String> values) {
            addCriterion("SETupgrade in", values, "setupgrade");
            return (Criteria) this;
        }

        public Criteria andSetupgradeNotIn(List<String> values) {
            addCriterion("SETupgrade not in", values, "setupgrade");
            return (Criteria) this;
        }

        public Criteria andSetupgradeBetween(String value1, String value2) {
            addCriterion("SETupgrade between", value1, value2, "setupgrade");
            return (Criteria) this;
        }

        public Criteria andSetupgradeNotBetween(String value1, String value2) {
            addCriterion("SETupgrade not between", value1, value2, "setupgrade");
            return (Criteria) this;
        }

        public Criteria andSetwarnIsNull() {
            addCriterion("SETwarn is null");
            return (Criteria) this;
        }

        public Criteria andSetwarnIsNotNull() {
            addCriterion("SETwarn is not null");
            return (Criteria) this;
        }

        public Criteria andSetwarnEqualTo(String value) {
            addCriterion("SETwarn =", value, "setwarn");
            return (Criteria) this;
        }

        public Criteria andSetwarnNotEqualTo(String value) {
            addCriterion("SETwarn <>", value, "setwarn");
            return (Criteria) this;
        }

        public Criteria andSetwarnGreaterThan(String value) {
            addCriterion("SETwarn >", value, "setwarn");
            return (Criteria) this;
        }

        public Criteria andSetwarnGreaterThanOrEqualTo(String value) {
            addCriterion("SETwarn >=", value, "setwarn");
            return (Criteria) this;
        }

        public Criteria andSetwarnLessThan(String value) {
            addCriterion("SETwarn <", value, "setwarn");
            return (Criteria) this;
        }

        public Criteria andSetwarnLessThanOrEqualTo(String value) {
            addCriterion("SETwarn <=", value, "setwarn");
            return (Criteria) this;
        }

        public Criteria andSetwarnLike(String value) {
            addCriterion("SETwarn like", value, "setwarn");
            return (Criteria) this;
        }

        public Criteria andSetwarnNotLike(String value) {
            addCriterion("SETwarn not like", value, "setwarn");
            return (Criteria) this;
        }

        public Criteria andSetwarnIn(List<String> values) {
            addCriterion("SETwarn in", values, "setwarn");
            return (Criteria) this;
        }

        public Criteria andSetwarnNotIn(List<String> values) {
            addCriterion("SETwarn not in", values, "setwarn");
            return (Criteria) this;
        }

        public Criteria andSetwarnBetween(String value1, String value2) {
            addCriterion("SETwarn between", value1, value2, "setwarn");
            return (Criteria) this;
        }

        public Criteria andSetwarnNotBetween(String value1, String value2) {
            addCriterion("SETwarn not between", value1, value2, "setwarn");
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