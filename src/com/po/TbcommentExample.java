package com.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbcommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbcommentExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("Cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("Cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Long value) {
            addCriterion("Cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Long value) {
            addCriterion("Cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Long value) {
            addCriterion("Cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Long value) {
            addCriterion("Cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Long value) {
            addCriterion("Cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Long value) {
            addCriterion("Cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Long> values) {
            addCriterion("Cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Long> values) {
            addCriterion("Cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Long value1, Long value2) {
            addCriterion("Cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Long value1, Long value2) {
            addCriterion("Cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCuidIsNull() {
            addCriterion("CUid is null");
            return (Criteria) this;
        }

        public Criteria andCuidIsNotNull() {
            addCriterion("CUid is not null");
            return (Criteria) this;
        }

        public Criteria andCuidEqualTo(Long value) {
            addCriterion("CUid =", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotEqualTo(Long value) {
            addCriterion("CUid <>", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidGreaterThan(Long value) {
            addCriterion("CUid >", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidGreaterThanOrEqualTo(Long value) {
            addCriterion("CUid >=", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLessThan(Long value) {
            addCriterion("CUid <", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLessThanOrEqualTo(Long value) {
            addCriterion("CUid <=", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidIn(List<Long> values) {
            addCriterion("CUid in", values, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotIn(List<Long> values) {
            addCriterion("CUid not in", values, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidBetween(Long value1, Long value2) {
            addCriterion("CUid between", value1, value2, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotBetween(Long value1, Long value2) {
            addCriterion("CUid not between", value1, value2, "cuid");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("Ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("Ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("Ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("Ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("Ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("Ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("Ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("Ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("Ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("Ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("Ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCssthhIdIsNull() {
            addCriterion("Cssthh_id is null");
            return (Criteria) this;
        }

        public Criteria andCssthhIdIsNotNull() {
            addCriterion("Cssthh_id is not null");
            return (Criteria) this;
        }

        public Criteria andCssthhIdEqualTo(String value) {
            addCriterion("Cssthh_id =", value, "cssthhId");
            return (Criteria) this;
        }

        public Criteria andCssthhIdNotEqualTo(String value) {
            addCriterion("Cssthh_id <>", value, "cssthhId");
            return (Criteria) this;
        }

        public Criteria andCssthhIdGreaterThan(String value) {
            addCriterion("Cssthh_id >", value, "cssthhId");
            return (Criteria) this;
        }

        public Criteria andCssthhIdGreaterThanOrEqualTo(String value) {
            addCriterion("Cssthh_id >=", value, "cssthhId");
            return (Criteria) this;
        }

        public Criteria andCssthhIdLessThan(String value) {
            addCriterion("Cssthh_id <", value, "cssthhId");
            return (Criteria) this;
        }

        public Criteria andCssthhIdLessThanOrEqualTo(String value) {
            addCriterion("Cssthh_id <=", value, "cssthhId");
            return (Criteria) this;
        }

        public Criteria andCssthhIdLike(String value) {
            addCriterion("Cssthh_id like", value, "cssthhId");
            return (Criteria) this;
        }

        public Criteria andCssthhIdNotLike(String value) {
            addCriterion("Cssthh_id not like", value, "cssthhId");
            return (Criteria) this;
        }

        public Criteria andCssthhIdIn(List<String> values) {
            addCriterion("Cssthh_id in", values, "cssthhId");
            return (Criteria) this;
        }

        public Criteria andCssthhIdNotIn(List<String> values) {
            addCriterion("Cssthh_id not in", values, "cssthhId");
            return (Criteria) this;
        }

        public Criteria andCssthhIdBetween(String value1, String value2) {
            addCriterion("Cssthh_id between", value1, value2, "cssthhId");
            return (Criteria) this;
        }

        public Criteria andCssthhIdNotBetween(String value1, String value2) {
            addCriterion("Cssthh_id not between", value1, value2, "cssthhId");
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