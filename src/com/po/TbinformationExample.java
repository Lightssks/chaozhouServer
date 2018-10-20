package com.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbinformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbinformationExample() {
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

        public Criteria andIntidIsNull() {
            addCriterion("INTid is null");
            return (Criteria) this;
        }

        public Criteria andIntidIsNotNull() {
            addCriterion("INTid is not null");
            return (Criteria) this;
        }

        public Criteria andIntidEqualTo(Long value) {
            addCriterion("INTid =", value, "intid");
            return (Criteria) this;
        }

        public Criteria andIntidNotEqualTo(Long value) {
            addCriterion("INTid <>", value, "intid");
            return (Criteria) this;
        }

        public Criteria andIntidGreaterThan(Long value) {
            addCriterion("INTid >", value, "intid");
            return (Criteria) this;
        }

        public Criteria andIntidGreaterThanOrEqualTo(Long value) {
            addCriterion("INTid >=", value, "intid");
            return (Criteria) this;
        }

        public Criteria andIntidLessThan(Long value) {
            addCriterion("INTid <", value, "intid");
            return (Criteria) this;
        }

        public Criteria andIntidLessThanOrEqualTo(Long value) {
            addCriterion("INTid <=", value, "intid");
            return (Criteria) this;
        }

        public Criteria andIntidIn(List<Long> values) {
            addCriterion("INTid in", values, "intid");
            return (Criteria) this;
        }

        public Criteria andIntidNotIn(List<Long> values) {
            addCriterion("INTid not in", values, "intid");
            return (Criteria) this;
        }

        public Criteria andIntidBetween(Long value1, Long value2) {
            addCriterion("INTid between", value1, value2, "intid");
            return (Criteria) this;
        }

        public Criteria andIntidNotBetween(Long value1, Long value2) {
            addCriterion("INTid not between", value1, value2, "intid");
            return (Criteria) this;
        }

        public Criteria andOtherIdIsNull() {
            addCriterion("other_id is null");
            return (Criteria) this;
        }

        public Criteria andOtherIdIsNotNull() {
            addCriterion("other_id is not null");
            return (Criteria) this;
        }

        public Criteria andOtherIdEqualTo(Long value) {
            addCriterion("other_id =", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdNotEqualTo(Long value) {
            addCriterion("other_id <>", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdGreaterThan(Long value) {
            addCriterion("other_id >", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdGreaterThanOrEqualTo(Long value) {
            addCriterion("other_id >=", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdLessThan(Long value) {
            addCriterion("other_id <", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdLessThanOrEqualTo(Long value) {
            addCriterion("other_id <=", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdIn(List<Long> values) {
            addCriterion("other_id in", values, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdNotIn(List<Long> values) {
            addCriterion("other_id not in", values, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdBetween(Long value1, Long value2) {
            addCriterion("other_id between", value1, value2, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdNotBetween(Long value1, Long value2) {
            addCriterion("other_id not between", value1, value2, "otherId");
            return (Criteria) this;
        }

        public Criteria andIntstateIsNull() {
            addCriterion("INTstate is null");
            return (Criteria) this;
        }

        public Criteria andIntstateIsNotNull() {
            addCriterion("INTstate is not null");
            return (Criteria) this;
        }

        public Criteria andIntstateEqualTo(String value) {
            addCriterion("INTstate =", value, "intstate");
            return (Criteria) this;
        }

        public Criteria andIntstateNotEqualTo(String value) {
            addCriterion("INTstate <>", value, "intstate");
            return (Criteria) this;
        }

        public Criteria andIntstateGreaterThan(String value) {
            addCriterion("INTstate >", value, "intstate");
            return (Criteria) this;
        }

        public Criteria andIntstateGreaterThanOrEqualTo(String value) {
            addCriterion("INTstate >=", value, "intstate");
            return (Criteria) this;
        }

        public Criteria andIntstateLessThan(String value) {
            addCriterion("INTstate <", value, "intstate");
            return (Criteria) this;
        }

        public Criteria andIntstateLessThanOrEqualTo(String value) {
            addCriterion("INTstate <=", value, "intstate");
            return (Criteria) this;
        }

        public Criteria andIntstateLike(String value) {
            addCriterion("INTstate like", value, "intstate");
            return (Criteria) this;
        }

        public Criteria andIntstateNotLike(String value) {
            addCriterion("INTstate not like", value, "intstate");
            return (Criteria) this;
        }

        public Criteria andIntstateIn(List<String> values) {
            addCriterion("INTstate in", values, "intstate");
            return (Criteria) this;
        }

        public Criteria andIntstateNotIn(List<String> values) {
            addCriterion("INTstate not in", values, "intstate");
            return (Criteria) this;
        }

        public Criteria andIntstateBetween(String value1, String value2) {
            addCriterion("INTstate between", value1, value2, "intstate");
            return (Criteria) this;
        }

        public Criteria andIntstateNotBetween(String value1, String value2) {
            addCriterion("INTstate not between", value1, value2, "intstate");
            return (Criteria) this;
        }

        public Criteria andInttimeIsNull() {
            addCriterion("INTtime is null");
            return (Criteria) this;
        }

        public Criteria andInttimeIsNotNull() {
            addCriterion("INTtime is not null");
            return (Criteria) this;
        }

        public Criteria andInttimeEqualTo(Date value) {
            addCriterion("INTtime =", value, "inttime");
            return (Criteria) this;
        }

        public Criteria andInttimeNotEqualTo(Date value) {
            addCriterion("INTtime <>", value, "inttime");
            return (Criteria) this;
        }

        public Criteria andInttimeGreaterThan(Date value) {
            addCriterion("INTtime >", value, "inttime");
            return (Criteria) this;
        }

        public Criteria andInttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INTtime >=", value, "inttime");
            return (Criteria) this;
        }

        public Criteria andInttimeLessThan(Date value) {
            addCriterion("INTtime <", value, "inttime");
            return (Criteria) this;
        }

        public Criteria andInttimeLessThanOrEqualTo(Date value) {
            addCriterion("INTtime <=", value, "inttime");
            return (Criteria) this;
        }

        public Criteria andInttimeIn(List<Date> values) {
            addCriterion("INTtime in", values, "inttime");
            return (Criteria) this;
        }

        public Criteria andInttimeNotIn(List<Date> values) {
            addCriterion("INTtime not in", values, "inttime");
            return (Criteria) this;
        }

        public Criteria andInttimeBetween(Date value1, Date value2) {
            addCriterion("INTtime between", value1, value2, "inttime");
            return (Criteria) this;
        }

        public Criteria andInttimeNotBetween(Date value1, Date value2) {
            addCriterion("INTtime not between", value1, value2, "inttime");
            return (Criteria) this;
        }

        public Criteria andIntuidIsNull() {
            addCriterion("INTUid is null");
            return (Criteria) this;
        }

        public Criteria andIntuidIsNotNull() {
            addCriterion("INTUid is not null");
            return (Criteria) this;
        }

        public Criteria andIntuidEqualTo(Long value) {
            addCriterion("INTUid =", value, "intuid");
            return (Criteria) this;
        }

        public Criteria andIntuidNotEqualTo(Long value) {
            addCriterion("INTUid <>", value, "intuid");
            return (Criteria) this;
        }

        public Criteria andIntuidGreaterThan(Long value) {
            addCriterion("INTUid >", value, "intuid");
            return (Criteria) this;
        }

        public Criteria andIntuidGreaterThanOrEqualTo(Long value) {
            addCriterion("INTUid >=", value, "intuid");
            return (Criteria) this;
        }

        public Criteria andIntuidLessThan(Long value) {
            addCriterion("INTUid <", value, "intuid");
            return (Criteria) this;
        }

        public Criteria andIntuidLessThanOrEqualTo(Long value) {
            addCriterion("INTUid <=", value, "intuid");
            return (Criteria) this;
        }

        public Criteria andIntuidIn(List<Long> values) {
            addCriterion("INTUid in", values, "intuid");
            return (Criteria) this;
        }

        public Criteria andIntuidNotIn(List<Long> values) {
            addCriterion("INTUid not in", values, "intuid");
            return (Criteria) this;
        }

        public Criteria andIntuidBetween(Long value1, Long value2) {
            addCriterion("INTUid between", value1, value2, "intuid");
            return (Criteria) this;
        }

        public Criteria andIntuidNotBetween(Long value1, Long value2) {
            addCriterion("INTUid not between", value1, value2, "intuid");
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