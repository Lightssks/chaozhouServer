package com.po;

import java.util.ArrayList;
import java.util.List;

public class TbmapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbmapExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("Mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("Mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Long value) {
            addCriterion("Mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Long value) {
            addCriterion("Mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Long value) {
            addCriterion("Mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Long value) {
            addCriterion("Mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Long value) {
            addCriterion("Mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Long value) {
            addCriterion("Mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Long> values) {
            addCriterion("Mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Long> values) {
            addCriterion("Mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Long value1, Long value2) {
            addCriterion("Mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Long value1, Long value2) {
            addCriterion("Mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMlongitudeIsNull() {
            addCriterion("Mlongitude is null");
            return (Criteria) this;
        }

        public Criteria andMlongitudeIsNotNull() {
            addCriterion("Mlongitude is not null");
            return (Criteria) this;
        }

        public Criteria andMlongitudeEqualTo(Double value) {
            addCriterion("Mlongitude =", value, "mlongitude");
            return (Criteria) this;
        }

        public Criteria andMlongitudeNotEqualTo(Double value) {
            addCriterion("Mlongitude <>", value, "mlongitude");
            return (Criteria) this;
        }

        public Criteria andMlongitudeGreaterThan(Double value) {
            addCriterion("Mlongitude >", value, "mlongitude");
            return (Criteria) this;
        }

        public Criteria andMlongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("Mlongitude >=", value, "mlongitude");
            return (Criteria) this;
        }

        public Criteria andMlongitudeLessThan(Double value) {
            addCriterion("Mlongitude <", value, "mlongitude");
            return (Criteria) this;
        }

        public Criteria andMlongitudeLessThanOrEqualTo(Double value) {
            addCriterion("Mlongitude <=", value, "mlongitude");
            return (Criteria) this;
        }

        public Criteria andMlongitudeIn(List<Double> values) {
            addCriterion("Mlongitude in", values, "mlongitude");
            return (Criteria) this;
        }

        public Criteria andMlongitudeNotIn(List<Double> values) {
            addCriterion("Mlongitude not in", values, "mlongitude");
            return (Criteria) this;
        }

        public Criteria andMlongitudeBetween(Double value1, Double value2) {
            addCriterion("Mlongitude between", value1, value2, "mlongitude");
            return (Criteria) this;
        }

        public Criteria andMlongitudeNotBetween(Double value1, Double value2) {
            addCriterion("Mlongitude not between", value1, value2, "mlongitude");
            return (Criteria) this;
        }

        public Criteria andMlatitudeIsNull() {
            addCriterion("Mlatitude is null");
            return (Criteria) this;
        }

        public Criteria andMlatitudeIsNotNull() {
            addCriterion("Mlatitude is not null");
            return (Criteria) this;
        }

        public Criteria andMlatitudeEqualTo(Double value) {
            addCriterion("Mlatitude =", value, "mlatitude");
            return (Criteria) this;
        }

        public Criteria andMlatitudeNotEqualTo(Double value) {
            addCriterion("Mlatitude <>", value, "mlatitude");
            return (Criteria) this;
        }

        public Criteria andMlatitudeGreaterThan(Double value) {
            addCriterion("Mlatitude >", value, "mlatitude");
            return (Criteria) this;
        }

        public Criteria andMlatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("Mlatitude >=", value, "mlatitude");
            return (Criteria) this;
        }

        public Criteria andMlatitudeLessThan(Double value) {
            addCriterion("Mlatitude <", value, "mlatitude");
            return (Criteria) this;
        }

        public Criteria andMlatitudeLessThanOrEqualTo(Double value) {
            addCriterion("Mlatitude <=", value, "mlatitude");
            return (Criteria) this;
        }

        public Criteria andMlatitudeIn(List<Double> values) {
            addCriterion("Mlatitude in", values, "mlatitude");
            return (Criteria) this;
        }

        public Criteria andMlatitudeNotIn(List<Double> values) {
            addCriterion("Mlatitude not in", values, "mlatitude");
            return (Criteria) this;
        }

        public Criteria andMlatitudeBetween(Double value1, Double value2) {
            addCriterion("Mlatitude between", value1, value2, "mlatitude");
            return (Criteria) this;
        }

        public Criteria andMlatitudeNotBetween(Double value1, Double value2) {
            addCriterion("Mlatitude not between", value1, value2, "mlatitude");
            return (Criteria) this;
        }

        public Criteria andMareaIsNull() {
            addCriterion("Marea is null");
            return (Criteria) this;
        }

        public Criteria andMareaIsNotNull() {
            addCriterion("Marea is not null");
            return (Criteria) this;
        }

        public Criteria andMareaEqualTo(String value) {
            addCriterion("Marea =", value, "marea");
            return (Criteria) this;
        }

        public Criteria andMareaNotEqualTo(String value) {
            addCriterion("Marea <>", value, "marea");
            return (Criteria) this;
        }

        public Criteria andMareaGreaterThan(String value) {
            addCriterion("Marea >", value, "marea");
            return (Criteria) this;
        }

        public Criteria andMareaGreaterThanOrEqualTo(String value) {
            addCriterion("Marea >=", value, "marea");
            return (Criteria) this;
        }

        public Criteria andMareaLessThan(String value) {
            addCriterion("Marea <", value, "marea");
            return (Criteria) this;
        }

        public Criteria andMareaLessThanOrEqualTo(String value) {
            addCriterion("Marea <=", value, "marea");
            return (Criteria) this;
        }

        public Criteria andMareaLike(String value) {
            addCriterion("Marea like", value, "marea");
            return (Criteria) this;
        }

        public Criteria andMareaNotLike(String value) {
            addCriterion("Marea not like", value, "marea");
            return (Criteria) this;
        }

        public Criteria andMareaIn(List<String> values) {
            addCriterion("Marea in", values, "marea");
            return (Criteria) this;
        }

        public Criteria andMareaNotIn(List<String> values) {
            addCriterion("Marea not in", values, "marea");
            return (Criteria) this;
        }

        public Criteria andMareaBetween(String value1, String value2) {
            addCriterion("Marea between", value1, value2, "marea");
            return (Criteria) this;
        }

        public Criteria andMareaNotBetween(String value1, String value2) {
            addCriterion("Marea not between", value1, value2, "marea");
            return (Criteria) this;
        }

        public Criteria andMroadIsNull() {
            addCriterion("Mroad is null");
            return (Criteria) this;
        }

        public Criteria andMroadIsNotNull() {
            addCriterion("Mroad is not null");
            return (Criteria) this;
        }

        public Criteria andMroadEqualTo(String value) {
            addCriterion("Mroad =", value, "mroad");
            return (Criteria) this;
        }

        public Criteria andMroadNotEqualTo(String value) {
            addCriterion("Mroad <>", value, "mroad");
            return (Criteria) this;
        }

        public Criteria andMroadGreaterThan(String value) {
            addCriterion("Mroad >", value, "mroad");
            return (Criteria) this;
        }

        public Criteria andMroadGreaterThanOrEqualTo(String value) {
            addCriterion("Mroad >=", value, "mroad");
            return (Criteria) this;
        }

        public Criteria andMroadLessThan(String value) {
            addCriterion("Mroad <", value, "mroad");
            return (Criteria) this;
        }

        public Criteria andMroadLessThanOrEqualTo(String value) {
            addCriterion("Mroad <=", value, "mroad");
            return (Criteria) this;
        }

        public Criteria andMroadLike(String value) {
            addCriterion("Mroad like", value, "mroad");
            return (Criteria) this;
        }

        public Criteria andMroadNotLike(String value) {
            addCriterion("Mroad not like", value, "mroad");
            return (Criteria) this;
        }

        public Criteria andMroadIn(List<String> values) {
            addCriterion("Mroad in", values, "mroad");
            return (Criteria) this;
        }

        public Criteria andMroadNotIn(List<String> values) {
            addCriterion("Mroad not in", values, "mroad");
            return (Criteria) this;
        }

        public Criteria andMroadBetween(String value1, String value2) {
            addCriterion("Mroad between", value1, value2, "mroad");
            return (Criteria) this;
        }

        public Criteria andMroadNotBetween(String value1, String value2) {
            addCriterion("Mroad not between", value1, value2, "mroad");
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