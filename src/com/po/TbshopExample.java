package com.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbshopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbshopExample() {
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

        public Criteria andShossthhIdIsNull() {
            addCriterion("SHOssthh_id is null");
            return (Criteria) this;
        }

        public Criteria andShossthhIdIsNotNull() {
            addCriterion("SHOssthh_id is not null");
            return (Criteria) this;
        }

        public Criteria andShossthhIdEqualTo(String value) {
            addCriterion("SHOssthh_id =", value, "shossthhId");
            return (Criteria) this;
        }

        public Criteria andShossthhIdNotEqualTo(String value) {
            addCriterion("SHOssthh_id <>", value, "shossthhId");
            return (Criteria) this;
        }

        public Criteria andShossthhIdGreaterThan(String value) {
            addCriterion("SHOssthh_id >", value, "shossthhId");
            return (Criteria) this;
        }

        public Criteria andShossthhIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHOssthh_id >=", value, "shossthhId");
            return (Criteria) this;
        }

        public Criteria andShossthhIdLessThan(String value) {
            addCriterion("SHOssthh_id <", value, "shossthhId");
            return (Criteria) this;
        }

        public Criteria andShossthhIdLessThanOrEqualTo(String value) {
            addCriterion("SHOssthh_id <=", value, "shossthhId");
            return (Criteria) this;
        }

        public Criteria andShossthhIdLike(String value) {
            addCriterion("SHOssthh_id like", value, "shossthhId");
            return (Criteria) this;
        }

        public Criteria andShossthhIdNotLike(String value) {
            addCriterion("SHOssthh_id not like", value, "shossthhId");
            return (Criteria) this;
        }

        public Criteria andShossthhIdIn(List<String> values) {
            addCriterion("SHOssthh_id in", values, "shossthhId");
            return (Criteria) this;
        }

        public Criteria andShossthhIdNotIn(List<String> values) {
            addCriterion("SHOssthh_id not in", values, "shossthhId");
            return (Criteria) this;
        }

        public Criteria andShossthhIdBetween(String value1, String value2) {
            addCriterion("SHOssthh_id between", value1, value2, "shossthhId");
            return (Criteria) this;
        }

        public Criteria andShossthhIdNotBetween(String value1, String value2) {
            addCriterion("SHOssthh_id not between", value1, value2, "shossthhId");
            return (Criteria) this;
        }

        public Criteria andShonameIsNull() {
            addCriterion("SHOname is null");
            return (Criteria) this;
        }

        public Criteria andShonameIsNotNull() {
            addCriterion("SHOname is not null");
            return (Criteria) this;
        }

        public Criteria andShonameEqualTo(String value) {
            addCriterion("SHOname =", value, "shoname");
            return (Criteria) this;
        }

        public Criteria andShonameNotEqualTo(String value) {
            addCriterion("SHOname <>", value, "shoname");
            return (Criteria) this;
        }

        public Criteria andShonameGreaterThan(String value) {
            addCriterion("SHOname >", value, "shoname");
            return (Criteria) this;
        }

        public Criteria andShonameGreaterThanOrEqualTo(String value) {
            addCriterion("SHOname >=", value, "shoname");
            return (Criteria) this;
        }

        public Criteria andShonameLessThan(String value) {
            addCriterion("SHOname <", value, "shoname");
            return (Criteria) this;
        }

        public Criteria andShonameLessThanOrEqualTo(String value) {
            addCriterion("SHOname <=", value, "shoname");
            return (Criteria) this;
        }

        public Criteria andShonameLike(String value) {
            addCriterion("SHOname like", value, "shoname");
            return (Criteria) this;
        }

        public Criteria andShonameNotLike(String value) {
            addCriterion("SHOname not like", value, "shoname");
            return (Criteria) this;
        }

        public Criteria andShonameIn(List<String> values) {
            addCriterion("SHOname in", values, "shoname");
            return (Criteria) this;
        }

        public Criteria andShonameNotIn(List<String> values) {
            addCriterion("SHOname not in", values, "shoname");
            return (Criteria) this;
        }

        public Criteria andShonameBetween(String value1, String value2) {
            addCriterion("SHOname between", value1, value2, "shoname");
            return (Criteria) this;
        }

        public Criteria andShonameNotBetween(String value1, String value2) {
            addCriterion("SHOname not between", value1, value2, "shoname");
            return (Criteria) this;
        }

        public Criteria andShotypeIsNull() {
            addCriterion("SHOtype is null");
            return (Criteria) this;
        }

        public Criteria andShotypeIsNotNull() {
            addCriterion("SHOtype is not null");
            return (Criteria) this;
        }

        public Criteria andShotypeEqualTo(String value) {
            addCriterion("SHOtype =", value, "shotype");
            return (Criteria) this;
        }

        public Criteria andShotypeNotEqualTo(String value) {
            addCriterion("SHOtype <>", value, "shotype");
            return (Criteria) this;
        }

        public Criteria andShotypeGreaterThan(String value) {
            addCriterion("SHOtype >", value, "shotype");
            return (Criteria) this;
        }

        public Criteria andShotypeGreaterThanOrEqualTo(String value) {
            addCriterion("SHOtype >=", value, "shotype");
            return (Criteria) this;
        }

        public Criteria andShotypeLessThan(String value) {
            addCriterion("SHOtype <", value, "shotype");
            return (Criteria) this;
        }

        public Criteria andShotypeLessThanOrEqualTo(String value) {
            addCriterion("SHOtype <=", value, "shotype");
            return (Criteria) this;
        }

        public Criteria andShotypeLike(String value) {
            addCriterion("SHOtype like", value, "shotype");
            return (Criteria) this;
        }

        public Criteria andShotypeNotLike(String value) {
            addCriterion("SHOtype not like", value, "shotype");
            return (Criteria) this;
        }

        public Criteria andShotypeIn(List<String> values) {
            addCriterion("SHOtype in", values, "shotype");
            return (Criteria) this;
        }

        public Criteria andShotypeNotIn(List<String> values) {
            addCriterion("SHOtype not in", values, "shotype");
            return (Criteria) this;
        }

        public Criteria andShotypeBetween(String value1, String value2) {
            addCriterion("SHOtype between", value1, value2, "shotype");
            return (Criteria) this;
        }

        public Criteria andShotypeNotBetween(String value1, String value2) {
            addCriterion("SHOtype not between", value1, value2, "shotype");
            return (Criteria) this;
        }

        public Criteria andShophoneIsNull() {
            addCriterion("SHOphone is null");
            return (Criteria) this;
        }

        public Criteria andShophoneIsNotNull() {
            addCriterion("SHOphone is not null");
            return (Criteria) this;
        }

        public Criteria andShophoneEqualTo(String value) {
            addCriterion("SHOphone =", value, "shophone");
            return (Criteria) this;
        }

        public Criteria andShophoneNotEqualTo(String value) {
            addCriterion("SHOphone <>", value, "shophone");
            return (Criteria) this;
        }

        public Criteria andShophoneGreaterThan(String value) {
            addCriterion("SHOphone >", value, "shophone");
            return (Criteria) this;
        }

        public Criteria andShophoneGreaterThanOrEqualTo(String value) {
            addCriterion("SHOphone >=", value, "shophone");
            return (Criteria) this;
        }

        public Criteria andShophoneLessThan(String value) {
            addCriterion("SHOphone <", value, "shophone");
            return (Criteria) this;
        }

        public Criteria andShophoneLessThanOrEqualTo(String value) {
            addCriterion("SHOphone <=", value, "shophone");
            return (Criteria) this;
        }

        public Criteria andShophoneLike(String value) {
            addCriterion("SHOphone like", value, "shophone");
            return (Criteria) this;
        }

        public Criteria andShophoneNotLike(String value) {
            addCriterion("SHOphone not like", value, "shophone");
            return (Criteria) this;
        }

        public Criteria andShophoneIn(List<String> values) {
            addCriterion("SHOphone in", values, "shophone");
            return (Criteria) this;
        }

        public Criteria andShophoneNotIn(List<String> values) {
            addCriterion("SHOphone not in", values, "shophone");
            return (Criteria) this;
        }

        public Criteria andShophoneBetween(String value1, String value2) {
            addCriterion("SHOphone between", value1, value2, "shophone");
            return (Criteria) this;
        }

        public Criteria andShophoneNotBetween(String value1, String value2) {
            addCriterion("SHOphone not between", value1, value2, "shophone");
            return (Criteria) this;
        }

        public Criteria andShopictureIsNull() {
            addCriterion("SHOpicture is null");
            return (Criteria) this;
        }

        public Criteria andShopictureIsNotNull() {
            addCriterion("SHOpicture is not null");
            return (Criteria) this;
        }

        public Criteria andShopictureEqualTo(String value) {
            addCriterion("SHOpicture =", value, "shopicture");
            return (Criteria) this;
        }

        public Criteria andShopictureNotEqualTo(String value) {
            addCriterion("SHOpicture <>", value, "shopicture");
            return (Criteria) this;
        }

        public Criteria andShopictureGreaterThan(String value) {
            addCriterion("SHOpicture >", value, "shopicture");
            return (Criteria) this;
        }

        public Criteria andShopictureGreaterThanOrEqualTo(String value) {
            addCriterion("SHOpicture >=", value, "shopicture");
            return (Criteria) this;
        }

        public Criteria andShopictureLessThan(String value) {
            addCriterion("SHOpicture <", value, "shopicture");
            return (Criteria) this;
        }

        public Criteria andShopictureLessThanOrEqualTo(String value) {
            addCriterion("SHOpicture <=", value, "shopicture");
            return (Criteria) this;
        }

        public Criteria andShopictureLike(String value) {
            addCriterion("SHOpicture like", value, "shopicture");
            return (Criteria) this;
        }

        public Criteria andShopictureNotLike(String value) {
            addCriterion("SHOpicture not like", value, "shopicture");
            return (Criteria) this;
        }

        public Criteria andShopictureIn(List<String> values) {
            addCriterion("SHOpicture in", values, "shopicture");
            return (Criteria) this;
        }

        public Criteria andShopictureNotIn(List<String> values) {
            addCriterion("SHOpicture not in", values, "shopicture");
            return (Criteria) this;
        }

        public Criteria andShopictureBetween(String value1, String value2) {
            addCriterion("SHOpicture between", value1, value2, "shopicture");
            return (Criteria) this;
        }

        public Criteria andShopictureNotBetween(String value1, String value2) {
            addCriterion("SHOpicture not between", value1, value2, "shopicture");
            return (Criteria) this;
        }

        public Criteria andShostateIsNull() {
            addCriterion("SHOstate is null");
            return (Criteria) this;
        }

        public Criteria andShostateIsNotNull() {
            addCriterion("SHOstate is not null");
            return (Criteria) this;
        }

        public Criteria andShostateEqualTo(String value) {
            addCriterion("SHOstate =", value, "shostate");
            return (Criteria) this;
        }

        public Criteria andShostateNotEqualTo(String value) {
            addCriterion("SHOstate <>", value, "shostate");
            return (Criteria) this;
        }

        public Criteria andShostateGreaterThan(String value) {
            addCriterion("SHOstate >", value, "shostate");
            return (Criteria) this;
        }

        public Criteria andShostateGreaterThanOrEqualTo(String value) {
            addCriterion("SHOstate >=", value, "shostate");
            return (Criteria) this;
        }

        public Criteria andShostateLessThan(String value) {
            addCriterion("SHOstate <", value, "shostate");
            return (Criteria) this;
        }

        public Criteria andShostateLessThanOrEqualTo(String value) {
            addCriterion("SHOstate <=", value, "shostate");
            return (Criteria) this;
        }

        public Criteria andShostateLike(String value) {
            addCriterion("SHOstate like", value, "shostate");
            return (Criteria) this;
        }

        public Criteria andShostateNotLike(String value) {
            addCriterion("SHOstate not like", value, "shostate");
            return (Criteria) this;
        }

        public Criteria andShostateIn(List<String> values) {
            addCriterion("SHOstate in", values, "shostate");
            return (Criteria) this;
        }

        public Criteria andShostateNotIn(List<String> values) {
            addCriterion("SHOstate not in", values, "shostate");
            return (Criteria) this;
        }

        public Criteria andShostateBetween(String value1, String value2) {
            addCriterion("SHOstate between", value1, value2, "shostate");
            return (Criteria) this;
        }

        public Criteria andShostateNotBetween(String value1, String value2) {
            addCriterion("SHOstate not between", value1, value2, "shostate");
            return (Criteria) this;
        }

        public Criteria andShochangeTimeIsNull() {
            addCriterion("SHOchange_time is null");
            return (Criteria) this;
        }

        public Criteria andShochangeTimeIsNotNull() {
            addCriterion("SHOchange_time is not null");
            return (Criteria) this;
        }

        public Criteria andShochangeTimeEqualTo(Date value) {
            addCriterion("SHOchange_time =", value, "shochangeTime");
            return (Criteria) this;
        }

        public Criteria andShochangeTimeNotEqualTo(Date value) {
            addCriterion("SHOchange_time <>", value, "shochangeTime");
            return (Criteria) this;
        }

        public Criteria andShochangeTimeGreaterThan(Date value) {
            addCriterion("SHOchange_time >", value, "shochangeTime");
            return (Criteria) this;
        }

        public Criteria andShochangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SHOchange_time >=", value, "shochangeTime");
            return (Criteria) this;
        }

        public Criteria andShochangeTimeLessThan(Date value) {
            addCriterion("SHOchange_time <", value, "shochangeTime");
            return (Criteria) this;
        }

        public Criteria andShochangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("SHOchange_time <=", value, "shochangeTime");
            return (Criteria) this;
        }

        public Criteria andShochangeTimeIn(List<Date> values) {
            addCriterion("SHOchange_time in", values, "shochangeTime");
            return (Criteria) this;
        }

        public Criteria andShochangeTimeNotIn(List<Date> values) {
            addCriterion("SHOchange_time not in", values, "shochangeTime");
            return (Criteria) this;
        }

        public Criteria andShochangeTimeBetween(Date value1, Date value2) {
            addCriterion("SHOchange_time between", value1, value2, "shochangeTime");
            return (Criteria) this;
        }

        public Criteria andShochangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("SHOchange_time not between", value1, value2, "shochangeTime");
            return (Criteria) this;
        }

        public Criteria andShochangerIsNull() {
            addCriterion("SHOchanger is null");
            return (Criteria) this;
        }

        public Criteria andShochangerIsNotNull() {
            addCriterion("SHOchanger is not null");
            return (Criteria) this;
        }

        public Criteria andShochangerEqualTo(String value) {
            addCriterion("SHOchanger =", value, "shochanger");
            return (Criteria) this;
        }

        public Criteria andShochangerNotEqualTo(String value) {
            addCriterion("SHOchanger <>", value, "shochanger");
            return (Criteria) this;
        }

        public Criteria andShochangerGreaterThan(String value) {
            addCriterion("SHOchanger >", value, "shochanger");
            return (Criteria) this;
        }

        public Criteria andShochangerGreaterThanOrEqualTo(String value) {
            addCriterion("SHOchanger >=", value, "shochanger");
            return (Criteria) this;
        }

        public Criteria andShochangerLessThan(String value) {
            addCriterion("SHOchanger <", value, "shochanger");
            return (Criteria) this;
        }

        public Criteria andShochangerLessThanOrEqualTo(String value) {
            addCriterion("SHOchanger <=", value, "shochanger");
            return (Criteria) this;
        }

        public Criteria andShochangerLike(String value) {
            addCriterion("SHOchanger like", value, "shochanger");
            return (Criteria) this;
        }

        public Criteria andShochangerNotLike(String value) {
            addCriterion("SHOchanger not like", value, "shochanger");
            return (Criteria) this;
        }

        public Criteria andShochangerIn(List<String> values) {
            addCriterion("SHOchanger in", values, "shochanger");
            return (Criteria) this;
        }

        public Criteria andShochangerNotIn(List<String> values) {
            addCriterion("SHOchanger not in", values, "shochanger");
            return (Criteria) this;
        }

        public Criteria andShochangerBetween(String value1, String value2) {
            addCriterion("SHOchanger between", value1, value2, "shochanger");
            return (Criteria) this;
        }

        public Criteria andShochangerNotBetween(String value1, String value2) {
            addCriterion("SHOchanger not between", value1, value2, "shochanger");
            return (Criteria) this;
        }

        public Criteria andShomidIsNull() {
            addCriterion("SHOMid is null");
            return (Criteria) this;
        }

        public Criteria andShomidIsNotNull() {
            addCriterion("SHOMid is not null");
            return (Criteria) this;
        }

        public Criteria andShomidEqualTo(Long value) {
            addCriterion("SHOMid =", value, "shomid");
            return (Criteria) this;
        }

        public Criteria andShomidNotEqualTo(Long value) {
            addCriterion("SHOMid <>", value, "shomid");
            return (Criteria) this;
        }

        public Criteria andShomidGreaterThan(Long value) {
            addCriterion("SHOMid >", value, "shomid");
            return (Criteria) this;
        }

        public Criteria andShomidGreaterThanOrEqualTo(Long value) {
            addCriterion("SHOMid >=", value, "shomid");
            return (Criteria) this;
        }

        public Criteria andShomidLessThan(Long value) {
            addCriterion("SHOMid <", value, "shomid");
            return (Criteria) this;
        }

        public Criteria andShomidLessThanOrEqualTo(Long value) {
            addCriterion("SHOMid <=", value, "shomid");
            return (Criteria) this;
        }

        public Criteria andShomidIn(List<Long> values) {
            addCriterion("SHOMid in", values, "shomid");
            return (Criteria) this;
        }

        public Criteria andShomidNotIn(List<Long> values) {
            addCriterion("SHOMid not in", values, "shomid");
            return (Criteria) this;
        }

        public Criteria andShomidBetween(Long value1, Long value2) {
            addCriterion("SHOMid between", value1, value2, "shomid");
            return (Criteria) this;
        }

        public Criteria andShomidNotBetween(Long value1, Long value2) {
            addCriterion("SHOMid not between", value1, value2, "shomid");
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