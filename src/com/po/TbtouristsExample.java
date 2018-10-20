package com.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbtouristsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbtouristsExample() {
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

        public Criteria andToussthhIdIsNull() {
            addCriterion("TOUssthh_id is null");
            return (Criteria) this;
        }

        public Criteria andToussthhIdIsNotNull() {
            addCriterion("TOUssthh_id is not null");
            return (Criteria) this;
        }

        public Criteria andToussthhIdEqualTo(String value) {
            addCriterion("TOUssthh_id =", value, "toussthhId");
            return (Criteria) this;
        }

        public Criteria andToussthhIdNotEqualTo(String value) {
            addCriterion("TOUssthh_id <>", value, "toussthhId");
            return (Criteria) this;
        }

        public Criteria andToussthhIdGreaterThan(String value) {
            addCriterion("TOUssthh_id >", value, "toussthhId");
            return (Criteria) this;
        }

        public Criteria andToussthhIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOUssthh_id >=", value, "toussthhId");
            return (Criteria) this;
        }

        public Criteria andToussthhIdLessThan(String value) {
            addCriterion("TOUssthh_id <", value, "toussthhId");
            return (Criteria) this;
        }

        public Criteria andToussthhIdLessThanOrEqualTo(String value) {
            addCriterion("TOUssthh_id <=", value, "toussthhId");
            return (Criteria) this;
        }

        public Criteria andToussthhIdLike(String value) {
            addCriterion("TOUssthh_id like", value, "toussthhId");
            return (Criteria) this;
        }

        public Criteria andToussthhIdNotLike(String value) {
            addCriterion("TOUssthh_id not like", value, "toussthhId");
            return (Criteria) this;
        }

        public Criteria andToussthhIdIn(List<String> values) {
            addCriterion("TOUssthh_id in", values, "toussthhId");
            return (Criteria) this;
        }

        public Criteria andToussthhIdNotIn(List<String> values) {
            addCriterion("TOUssthh_id not in", values, "toussthhId");
            return (Criteria) this;
        }

        public Criteria andToussthhIdBetween(String value1, String value2) {
            addCriterion("TOUssthh_id between", value1, value2, "toussthhId");
            return (Criteria) this;
        }

        public Criteria andToussthhIdNotBetween(String value1, String value2) {
            addCriterion("TOUssthh_id not between", value1, value2, "toussthhId");
            return (Criteria) this;
        }

        public Criteria andToutitleIsNull() {
            addCriterion("TOUtitle is null");
            return (Criteria) this;
        }

        public Criteria andToutitleIsNotNull() {
            addCriterion("TOUtitle is not null");
            return (Criteria) this;
        }

        public Criteria andToutitleEqualTo(String value) {
            addCriterion("TOUtitle =", value, "toutitle");
            return (Criteria) this;
        }

        public Criteria andToutitleNotEqualTo(String value) {
            addCriterion("TOUtitle <>", value, "toutitle");
            return (Criteria) this;
        }

        public Criteria andToutitleGreaterThan(String value) {
            addCriterion("TOUtitle >", value, "toutitle");
            return (Criteria) this;
        }

        public Criteria andToutitleGreaterThanOrEqualTo(String value) {
            addCriterion("TOUtitle >=", value, "toutitle");
            return (Criteria) this;
        }

        public Criteria andToutitleLessThan(String value) {
            addCriterion("TOUtitle <", value, "toutitle");
            return (Criteria) this;
        }

        public Criteria andToutitleLessThanOrEqualTo(String value) {
            addCriterion("TOUtitle <=", value, "toutitle");
            return (Criteria) this;
        }

        public Criteria andToutitleLike(String value) {
            addCriterion("TOUtitle like", value, "toutitle");
            return (Criteria) this;
        }

        public Criteria andToutitleNotLike(String value) {
            addCriterion("TOUtitle not like", value, "toutitle");
            return (Criteria) this;
        }

        public Criteria andToutitleIn(List<String> values) {
            addCriterion("TOUtitle in", values, "toutitle");
            return (Criteria) this;
        }

        public Criteria andToutitleNotIn(List<String> values) {
            addCriterion("TOUtitle not in", values, "toutitle");
            return (Criteria) this;
        }

        public Criteria andToutitleBetween(String value1, String value2) {
            addCriterion("TOUtitle between", value1, value2, "toutitle");
            return (Criteria) this;
        }

        public Criteria andToutitleNotBetween(String value1, String value2) {
            addCriterion("TOUtitle not between", value1, value2, "toutitle");
            return (Criteria) this;
        }

        public Criteria andToupictureIsNull() {
            addCriterion("TOUpicture is null");
            return (Criteria) this;
        }

        public Criteria andToupictureIsNotNull() {
            addCriterion("TOUpicture is not null");
            return (Criteria) this;
        }

        public Criteria andToupictureEqualTo(String value) {
            addCriterion("TOUpicture =", value, "toupicture");
            return (Criteria) this;
        }

        public Criteria andToupictureNotEqualTo(String value) {
            addCriterion("TOUpicture <>", value, "toupicture");
            return (Criteria) this;
        }

        public Criteria andToupictureGreaterThan(String value) {
            addCriterion("TOUpicture >", value, "toupicture");
            return (Criteria) this;
        }

        public Criteria andToupictureGreaterThanOrEqualTo(String value) {
            addCriterion("TOUpicture >=", value, "toupicture");
            return (Criteria) this;
        }

        public Criteria andToupictureLessThan(String value) {
            addCriterion("TOUpicture <", value, "toupicture");
            return (Criteria) this;
        }

        public Criteria andToupictureLessThanOrEqualTo(String value) {
            addCriterion("TOUpicture <=", value, "toupicture");
            return (Criteria) this;
        }

        public Criteria andToupictureLike(String value) {
            addCriterion("TOUpicture like", value, "toupicture");
            return (Criteria) this;
        }

        public Criteria andToupictureNotLike(String value) {
            addCriterion("TOUpicture not like", value, "toupicture");
            return (Criteria) this;
        }

        public Criteria andToupictureIn(List<String> values) {
            addCriterion("TOUpicture in", values, "toupicture");
            return (Criteria) this;
        }

        public Criteria andToupictureNotIn(List<String> values) {
            addCriterion("TOUpicture not in", values, "toupicture");
            return (Criteria) this;
        }

        public Criteria andToupictureBetween(String value1, String value2) {
            addCriterion("TOUpicture between", value1, value2, "toupicture");
            return (Criteria) this;
        }

        public Criteria andToupictureNotBetween(String value1, String value2) {
            addCriterion("TOUpicture not between", value1, value2, "toupicture");
            return (Criteria) this;
        }

        public Criteria andTouchangeTimeIsNull() {
            addCriterion("TOUchange_time is null");
            return (Criteria) this;
        }

        public Criteria andTouchangeTimeIsNotNull() {
            addCriterion("TOUchange_time is not null");
            return (Criteria) this;
        }

        public Criteria andTouchangeTimeEqualTo(Date value) {
            addCriterion("TOUchange_time =", value, "touchangeTime");
            return (Criteria) this;
        }

        public Criteria andTouchangeTimeNotEqualTo(Date value) {
            addCriterion("TOUchange_time <>", value, "touchangeTime");
            return (Criteria) this;
        }

        public Criteria andTouchangeTimeGreaterThan(Date value) {
            addCriterion("TOUchange_time >", value, "touchangeTime");
            return (Criteria) this;
        }

        public Criteria andTouchangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TOUchange_time >=", value, "touchangeTime");
            return (Criteria) this;
        }

        public Criteria andTouchangeTimeLessThan(Date value) {
            addCriterion("TOUchange_time <", value, "touchangeTime");
            return (Criteria) this;
        }

        public Criteria andTouchangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("TOUchange_time <=", value, "touchangeTime");
            return (Criteria) this;
        }

        public Criteria andTouchangeTimeIn(List<Date> values) {
            addCriterion("TOUchange_time in", values, "touchangeTime");
            return (Criteria) this;
        }

        public Criteria andTouchangeTimeNotIn(List<Date> values) {
            addCriterion("TOUchange_time not in", values, "touchangeTime");
            return (Criteria) this;
        }

        public Criteria andTouchangeTimeBetween(Date value1, Date value2) {
            addCriterion("TOUchange_time between", value1, value2, "touchangeTime");
            return (Criteria) this;
        }

        public Criteria andTouchangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("TOUchange_time not between", value1, value2, "touchangeTime");
            return (Criteria) this;
        }

        public Criteria andTouchangerIsNull() {
            addCriterion("TOUchanger is null");
            return (Criteria) this;
        }

        public Criteria andTouchangerIsNotNull() {
            addCriterion("TOUchanger is not null");
            return (Criteria) this;
        }

        public Criteria andTouchangerEqualTo(String value) {
            addCriterion("TOUchanger =", value, "touchanger");
            return (Criteria) this;
        }

        public Criteria andTouchangerNotEqualTo(String value) {
            addCriterion("TOUchanger <>", value, "touchanger");
            return (Criteria) this;
        }

        public Criteria andTouchangerGreaterThan(String value) {
            addCriterion("TOUchanger >", value, "touchanger");
            return (Criteria) this;
        }

        public Criteria andTouchangerGreaterThanOrEqualTo(String value) {
            addCriterion("TOUchanger >=", value, "touchanger");
            return (Criteria) this;
        }

        public Criteria andTouchangerLessThan(String value) {
            addCriterion("TOUchanger <", value, "touchanger");
            return (Criteria) this;
        }

        public Criteria andTouchangerLessThanOrEqualTo(String value) {
            addCriterion("TOUchanger <=", value, "touchanger");
            return (Criteria) this;
        }

        public Criteria andTouchangerLike(String value) {
            addCriterion("TOUchanger like", value, "touchanger");
            return (Criteria) this;
        }

        public Criteria andTouchangerNotLike(String value) {
            addCriterion("TOUchanger not like", value, "touchanger");
            return (Criteria) this;
        }

        public Criteria andTouchangerIn(List<String> values) {
            addCriterion("TOUchanger in", values, "touchanger");
            return (Criteria) this;
        }

        public Criteria andTouchangerNotIn(List<String> values) {
            addCriterion("TOUchanger not in", values, "touchanger");
            return (Criteria) this;
        }

        public Criteria andTouchangerBetween(String value1, String value2) {
            addCriterion("TOUchanger between", value1, value2, "touchanger");
            return (Criteria) this;
        }

        public Criteria andTouchangerNotBetween(String value1, String value2) {
            addCriterion("TOUchanger not between", value1, value2, "touchanger");
            return (Criteria) this;
        }

        public Criteria andToustateIsNull() {
            addCriterion("TOUstate is null");
            return (Criteria) this;
        }

        public Criteria andToustateIsNotNull() {
            addCriterion("TOUstate is not null");
            return (Criteria) this;
        }

        public Criteria andToustateEqualTo(String value) {
            addCriterion("TOUstate =", value, "toustate");
            return (Criteria) this;
        }

        public Criteria andToustateNotEqualTo(String value) {
            addCriterion("TOUstate <>", value, "toustate");
            return (Criteria) this;
        }

        public Criteria andToustateGreaterThan(String value) {
            addCriterion("TOUstate >", value, "toustate");
            return (Criteria) this;
        }

        public Criteria andToustateGreaterThanOrEqualTo(String value) {
            addCriterion("TOUstate >=", value, "toustate");
            return (Criteria) this;
        }

        public Criteria andToustateLessThan(String value) {
            addCriterion("TOUstate <", value, "toustate");
            return (Criteria) this;
        }

        public Criteria andToustateLessThanOrEqualTo(String value) {
            addCriterion("TOUstate <=", value, "toustate");
            return (Criteria) this;
        }

        public Criteria andToustateLike(String value) {
            addCriterion("TOUstate like", value, "toustate");
            return (Criteria) this;
        }

        public Criteria andToustateNotLike(String value) {
            addCriterion("TOUstate not like", value, "toustate");
            return (Criteria) this;
        }

        public Criteria andToustateIn(List<String> values) {
            addCriterion("TOUstate in", values, "toustate");
            return (Criteria) this;
        }

        public Criteria andToustateNotIn(List<String> values) {
            addCriterion("TOUstate not in", values, "toustate");
            return (Criteria) this;
        }

        public Criteria andToustateBetween(String value1, String value2) {
            addCriterion("TOUstate between", value1, value2, "toustate");
            return (Criteria) this;
        }

        public Criteria andToustateNotBetween(String value1, String value2) {
            addCriterion("TOUstate not between", value1, value2, "toustate");
            return (Criteria) this;
        }

        public Criteria andToumidIsNull() {
            addCriterion("TOUMid is null");
            return (Criteria) this;
        }

        public Criteria andToumidIsNotNull() {
            addCriterion("TOUMid is not null");
            return (Criteria) this;
        }

        public Criteria andToumidEqualTo(Long value) {
            addCriterion("TOUMid =", value, "toumid");
            return (Criteria) this;
        }

        public Criteria andToumidNotEqualTo(Long value) {
            addCriterion("TOUMid <>", value, "toumid");
            return (Criteria) this;
        }

        public Criteria andToumidGreaterThan(Long value) {
            addCriterion("TOUMid >", value, "toumid");
            return (Criteria) this;
        }

        public Criteria andToumidGreaterThanOrEqualTo(Long value) {
            addCriterion("TOUMid >=", value, "toumid");
            return (Criteria) this;
        }

        public Criteria andToumidLessThan(Long value) {
            addCriterion("TOUMid <", value, "toumid");
            return (Criteria) this;
        }

        public Criteria andToumidLessThanOrEqualTo(Long value) {
            addCriterion("TOUMid <=", value, "toumid");
            return (Criteria) this;
        }

        public Criteria andToumidIn(List<Long> values) {
            addCriterion("TOUMid in", values, "toumid");
            return (Criteria) this;
        }

        public Criteria andToumidNotIn(List<Long> values) {
            addCriterion("TOUMid not in", values, "toumid");
            return (Criteria) this;
        }

        public Criteria andToumidBetween(Long value1, Long value2) {
            addCriterion("TOUMid between", value1, value2, "toumid");
            return (Criteria) this;
        }

        public Criteria andToumidNotBetween(Long value1, Long value2) {
            addCriterion("TOUMid not between", value1, value2, "toumid");
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