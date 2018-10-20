package com.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbspecialtyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbspecialtyExample() {
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

        public Criteria andSpessthhIdIsNull() {
            addCriterion("SPEssthh_id is null");
            return (Criteria) this;
        }

        public Criteria andSpessthhIdIsNotNull() {
            addCriterion("SPEssthh_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpessthhIdEqualTo(String value) {
            addCriterion("SPEssthh_id =", value, "spessthhId");
            return (Criteria) this;
        }

        public Criteria andSpessthhIdNotEqualTo(String value) {
            addCriterion("SPEssthh_id <>", value, "spessthhId");
            return (Criteria) this;
        }

        public Criteria andSpessthhIdGreaterThan(String value) {
            addCriterion("SPEssthh_id >", value, "spessthhId");
            return (Criteria) this;
        }

        public Criteria andSpessthhIdGreaterThanOrEqualTo(String value) {
            addCriterion("SPEssthh_id >=", value, "spessthhId");
            return (Criteria) this;
        }

        public Criteria andSpessthhIdLessThan(String value) {
            addCriterion("SPEssthh_id <", value, "spessthhId");
            return (Criteria) this;
        }

        public Criteria andSpessthhIdLessThanOrEqualTo(String value) {
            addCriterion("SPEssthh_id <=", value, "spessthhId");
            return (Criteria) this;
        }

        public Criteria andSpessthhIdLike(String value) {
            addCriterion("SPEssthh_id like", value, "spessthhId");
            return (Criteria) this;
        }

        public Criteria andSpessthhIdNotLike(String value) {
            addCriterion("SPEssthh_id not like", value, "spessthhId");
            return (Criteria) this;
        }

        public Criteria andSpessthhIdIn(List<String> values) {
            addCriterion("SPEssthh_id in", values, "spessthhId");
            return (Criteria) this;
        }

        public Criteria andSpessthhIdNotIn(List<String> values) {
            addCriterion("SPEssthh_id not in", values, "spessthhId");
            return (Criteria) this;
        }

        public Criteria andSpessthhIdBetween(String value1, String value2) {
            addCriterion("SPEssthh_id between", value1, value2, "spessthhId");
            return (Criteria) this;
        }

        public Criteria andSpessthhIdNotBetween(String value1, String value2) {
            addCriterion("SPEssthh_id not between", value1, value2, "spessthhId");
            return (Criteria) this;
        }

        public Criteria andSpenameIsNull() {
            addCriterion("SPEname is null");
            return (Criteria) this;
        }

        public Criteria andSpenameIsNotNull() {
            addCriterion("SPEname is not null");
            return (Criteria) this;
        }

        public Criteria andSpenameEqualTo(String value) {
            addCriterion("SPEname =", value, "spename");
            return (Criteria) this;
        }

        public Criteria andSpenameNotEqualTo(String value) {
            addCriterion("SPEname <>", value, "spename");
            return (Criteria) this;
        }

        public Criteria andSpenameGreaterThan(String value) {
            addCriterion("SPEname >", value, "spename");
            return (Criteria) this;
        }

        public Criteria andSpenameGreaterThanOrEqualTo(String value) {
            addCriterion("SPEname >=", value, "spename");
            return (Criteria) this;
        }

        public Criteria andSpenameLessThan(String value) {
            addCriterion("SPEname <", value, "spename");
            return (Criteria) this;
        }

        public Criteria andSpenameLessThanOrEqualTo(String value) {
            addCriterion("SPEname <=", value, "spename");
            return (Criteria) this;
        }

        public Criteria andSpenameLike(String value) {
            addCriterion("SPEname like", value, "spename");
            return (Criteria) this;
        }

        public Criteria andSpenameNotLike(String value) {
            addCriterion("SPEname not like", value, "spename");
            return (Criteria) this;
        }

        public Criteria andSpenameIn(List<String> values) {
            addCriterion("SPEname in", values, "spename");
            return (Criteria) this;
        }

        public Criteria andSpenameNotIn(List<String> values) {
            addCriterion("SPEname not in", values, "spename");
            return (Criteria) this;
        }

        public Criteria andSpenameBetween(String value1, String value2) {
            addCriterion("SPEname between", value1, value2, "spename");
            return (Criteria) this;
        }

        public Criteria andSpenameNotBetween(String value1, String value2) {
            addCriterion("SPEname not between", value1, value2, "spename");
            return (Criteria) this;
        }

        public Criteria andSpepriceIsNull() {
            addCriterion("SPEprice is null");
            return (Criteria) this;
        }

        public Criteria andSpepriceIsNotNull() {
            addCriterion("SPEprice is not null");
            return (Criteria) this;
        }

        public Criteria andSpepriceEqualTo(String value) {
            addCriterion("SPEprice =", value, "speprice");
            return (Criteria) this;
        }

        public Criteria andSpepriceNotEqualTo(String value) {
            addCriterion("SPEprice <>", value, "speprice");
            return (Criteria) this;
        }

        public Criteria andSpepriceGreaterThan(String value) {
            addCriterion("SPEprice >", value, "speprice");
            return (Criteria) this;
        }

        public Criteria andSpepriceGreaterThanOrEqualTo(String value) {
            addCriterion("SPEprice >=", value, "speprice");
            return (Criteria) this;
        }

        public Criteria andSpepriceLessThan(String value) {
            addCriterion("SPEprice <", value, "speprice");
            return (Criteria) this;
        }

        public Criteria andSpepriceLessThanOrEqualTo(String value) {
            addCriterion("SPEprice <=", value, "speprice");
            return (Criteria) this;
        }

        public Criteria andSpepriceLike(String value) {
            addCriterion("SPEprice like", value, "speprice");
            return (Criteria) this;
        }

        public Criteria andSpepriceNotLike(String value) {
            addCriterion("SPEprice not like", value, "speprice");
            return (Criteria) this;
        }

        public Criteria andSpepriceIn(List<String> values) {
            addCriterion("SPEprice in", values, "speprice");
            return (Criteria) this;
        }

        public Criteria andSpepriceNotIn(List<String> values) {
            addCriterion("SPEprice not in", values, "speprice");
            return (Criteria) this;
        }

        public Criteria andSpepriceBetween(String value1, String value2) {
            addCriterion("SPEprice between", value1, value2, "speprice");
            return (Criteria) this;
        }

        public Criteria andSpepriceNotBetween(String value1, String value2) {
            addCriterion("SPEprice not between", value1, value2, "speprice");
            return (Criteria) this;
        }

        public Criteria andSpepictureIsNull() {
            addCriterion("SPEpicture is null");
            return (Criteria) this;
        }

        public Criteria andSpepictureIsNotNull() {
            addCriterion("SPEpicture is not null");
            return (Criteria) this;
        }

        public Criteria andSpepictureEqualTo(String value) {
            addCriterion("SPEpicture =", value, "spepicture");
            return (Criteria) this;
        }

        public Criteria andSpepictureNotEqualTo(String value) {
            addCriterion("SPEpicture <>", value, "spepicture");
            return (Criteria) this;
        }

        public Criteria andSpepictureGreaterThan(String value) {
            addCriterion("SPEpicture >", value, "spepicture");
            return (Criteria) this;
        }

        public Criteria andSpepictureGreaterThanOrEqualTo(String value) {
            addCriterion("SPEpicture >=", value, "spepicture");
            return (Criteria) this;
        }

        public Criteria andSpepictureLessThan(String value) {
            addCriterion("SPEpicture <", value, "spepicture");
            return (Criteria) this;
        }

        public Criteria andSpepictureLessThanOrEqualTo(String value) {
            addCriterion("SPEpicture <=", value, "spepicture");
            return (Criteria) this;
        }

        public Criteria andSpepictureLike(String value) {
            addCriterion("SPEpicture like", value, "spepicture");
            return (Criteria) this;
        }

        public Criteria andSpepictureNotLike(String value) {
            addCriterion("SPEpicture not like", value, "spepicture");
            return (Criteria) this;
        }

        public Criteria andSpepictureIn(List<String> values) {
            addCriterion("SPEpicture in", values, "spepicture");
            return (Criteria) this;
        }

        public Criteria andSpepictureNotIn(List<String> values) {
            addCriterion("SPEpicture not in", values, "spepicture");
            return (Criteria) this;
        }

        public Criteria andSpepictureBetween(String value1, String value2) {
            addCriterion("SPEpicture between", value1, value2, "spepicture");
            return (Criteria) this;
        }

        public Criteria andSpepictureNotBetween(String value1, String value2) {
            addCriterion("SPEpicture not between", value1, value2, "spepicture");
            return (Criteria) this;
        }

        public Criteria andSpechangeTimeIsNull() {
            addCriterion("SPEchange_time is null");
            return (Criteria) this;
        }

        public Criteria andSpechangeTimeIsNotNull() {
            addCriterion("SPEchange_time is not null");
            return (Criteria) this;
        }

        public Criteria andSpechangeTimeEqualTo(Date value) {
            addCriterion("SPEchange_time =", value, "spechangeTime");
            return (Criteria) this;
        }

        public Criteria andSpechangeTimeNotEqualTo(Date value) {
            addCriterion("SPEchange_time <>", value, "spechangeTime");
            return (Criteria) this;
        }

        public Criteria andSpechangeTimeGreaterThan(Date value) {
            addCriterion("SPEchange_time >", value, "spechangeTime");
            return (Criteria) this;
        }

        public Criteria andSpechangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SPEchange_time >=", value, "spechangeTime");
            return (Criteria) this;
        }

        public Criteria andSpechangeTimeLessThan(Date value) {
            addCriterion("SPEchange_time <", value, "spechangeTime");
            return (Criteria) this;
        }

        public Criteria andSpechangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("SPEchange_time <=", value, "spechangeTime");
            return (Criteria) this;
        }

        public Criteria andSpechangeTimeIn(List<Date> values) {
            addCriterion("SPEchange_time in", values, "spechangeTime");
            return (Criteria) this;
        }

        public Criteria andSpechangeTimeNotIn(List<Date> values) {
            addCriterion("SPEchange_time not in", values, "spechangeTime");
            return (Criteria) this;
        }

        public Criteria andSpechangeTimeBetween(Date value1, Date value2) {
            addCriterion("SPEchange_time between", value1, value2, "spechangeTime");
            return (Criteria) this;
        }

        public Criteria andSpechangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("SPEchange_time not between", value1, value2, "spechangeTime");
            return (Criteria) this;
        }

        public Criteria andSpestateIsNull() {
            addCriterion("SPEstate is null");
            return (Criteria) this;
        }

        public Criteria andSpestateIsNotNull() {
            addCriterion("SPEstate is not null");
            return (Criteria) this;
        }

        public Criteria andSpestateEqualTo(String value) {
            addCriterion("SPEstate =", value, "spestate");
            return (Criteria) this;
        }

        public Criteria andSpestateNotEqualTo(String value) {
            addCriterion("SPEstate <>", value, "spestate");
            return (Criteria) this;
        }

        public Criteria andSpestateGreaterThan(String value) {
            addCriterion("SPEstate >", value, "spestate");
            return (Criteria) this;
        }

        public Criteria andSpestateGreaterThanOrEqualTo(String value) {
            addCriterion("SPEstate >=", value, "spestate");
            return (Criteria) this;
        }

        public Criteria andSpestateLessThan(String value) {
            addCriterion("SPEstate <", value, "spestate");
            return (Criteria) this;
        }

        public Criteria andSpestateLessThanOrEqualTo(String value) {
            addCriterion("SPEstate <=", value, "spestate");
            return (Criteria) this;
        }

        public Criteria andSpestateLike(String value) {
            addCriterion("SPEstate like", value, "spestate");
            return (Criteria) this;
        }

        public Criteria andSpestateNotLike(String value) {
            addCriterion("SPEstate not like", value, "spestate");
            return (Criteria) this;
        }

        public Criteria andSpestateIn(List<String> values) {
            addCriterion("SPEstate in", values, "spestate");
            return (Criteria) this;
        }

        public Criteria andSpestateNotIn(List<String> values) {
            addCriterion("SPEstate not in", values, "spestate");
            return (Criteria) this;
        }

        public Criteria andSpestateBetween(String value1, String value2) {
            addCriterion("SPEstate between", value1, value2, "spestate");
            return (Criteria) this;
        }

        public Criteria andSpestateNotBetween(String value1, String value2) {
            addCriterion("SPEstate not between", value1, value2, "spestate");
            return (Criteria) this;
        }

        public Criteria andSpechangerIsNull() {
            addCriterion("SPEchanger is null");
            return (Criteria) this;
        }

        public Criteria andSpechangerIsNotNull() {
            addCriterion("SPEchanger is not null");
            return (Criteria) this;
        }

        public Criteria andSpechangerEqualTo(String value) {
            addCriterion("SPEchanger =", value, "spechanger");
            return (Criteria) this;
        }

        public Criteria andSpechangerNotEqualTo(String value) {
            addCriterion("SPEchanger <>", value, "spechanger");
            return (Criteria) this;
        }

        public Criteria andSpechangerGreaterThan(String value) {
            addCriterion("SPEchanger >", value, "spechanger");
            return (Criteria) this;
        }

        public Criteria andSpechangerGreaterThanOrEqualTo(String value) {
            addCriterion("SPEchanger >=", value, "spechanger");
            return (Criteria) this;
        }

        public Criteria andSpechangerLessThan(String value) {
            addCriterion("SPEchanger <", value, "spechanger");
            return (Criteria) this;
        }

        public Criteria andSpechangerLessThanOrEqualTo(String value) {
            addCriterion("SPEchanger <=", value, "spechanger");
            return (Criteria) this;
        }

        public Criteria andSpechangerLike(String value) {
            addCriterion("SPEchanger like", value, "spechanger");
            return (Criteria) this;
        }

        public Criteria andSpechangerNotLike(String value) {
            addCriterion("SPEchanger not like", value, "spechanger");
            return (Criteria) this;
        }

        public Criteria andSpechangerIn(List<String> values) {
            addCriterion("SPEchanger in", values, "spechanger");
            return (Criteria) this;
        }

        public Criteria andSpechangerNotIn(List<String> values) {
            addCriterion("SPEchanger not in", values, "spechanger");
            return (Criteria) this;
        }

        public Criteria andSpechangerBetween(String value1, String value2) {
            addCriterion("SPEchanger between", value1, value2, "spechanger");
            return (Criteria) this;
        }

        public Criteria andSpechangerNotBetween(String value1, String value2) {
            addCriterion("SPEchanger not between", value1, value2, "spechanger");
            return (Criteria) this;
        }

        public Criteria andSpetypeIsNull() {
            addCriterion("SPEtype is null");
            return (Criteria) this;
        }

        public Criteria andSpetypeIsNotNull() {
            addCriterion("SPEtype is not null");
            return (Criteria) this;
        }

        public Criteria andSpetypeEqualTo(String value) {
            addCriterion("SPEtype =", value, "spetype");
            return (Criteria) this;
        }

        public Criteria andSpetypeNotEqualTo(String value) {
            addCriterion("SPEtype <>", value, "spetype");
            return (Criteria) this;
        }

        public Criteria andSpetypeGreaterThan(String value) {
            addCriterion("SPEtype >", value, "spetype");
            return (Criteria) this;
        }

        public Criteria andSpetypeGreaterThanOrEqualTo(String value) {
            addCriterion("SPEtype >=", value, "spetype");
            return (Criteria) this;
        }

        public Criteria andSpetypeLessThan(String value) {
            addCriterion("SPEtype <", value, "spetype");
            return (Criteria) this;
        }

        public Criteria andSpetypeLessThanOrEqualTo(String value) {
            addCriterion("SPEtype <=", value, "spetype");
            return (Criteria) this;
        }

        public Criteria andSpetypeLike(String value) {
            addCriterion("SPEtype like", value, "spetype");
            return (Criteria) this;
        }

        public Criteria andSpetypeNotLike(String value) {
            addCriterion("SPEtype not like", value, "spetype");
            return (Criteria) this;
        }

        public Criteria andSpetypeIn(List<String> values) {
            addCriterion("SPEtype in", values, "spetype");
            return (Criteria) this;
        }

        public Criteria andSpetypeNotIn(List<String> values) {
            addCriterion("SPEtype not in", values, "spetype");
            return (Criteria) this;
        }

        public Criteria andSpetypeBetween(String value1, String value2) {
            addCriterion("SPEtype between", value1, value2, "spetype");
            return (Criteria) this;
        }

        public Criteria andSpetypeNotBetween(String value1, String value2) {
            addCriterion("SPEtype not between", value1, value2, "spetype");
            return (Criteria) this;
        }

        public Criteria andSpemidIsNull() {
            addCriterion("SPEMid is null");
            return (Criteria) this;
        }

        public Criteria andSpemidIsNotNull() {
            addCriterion("SPEMid is not null");
            return (Criteria) this;
        }

        public Criteria andSpemidEqualTo(Long value) {
            addCriterion("SPEMid =", value, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidNotEqualTo(Long value) {
            addCriterion("SPEMid <>", value, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidGreaterThan(Long value) {
            addCriterion("SPEMid >", value, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidGreaterThanOrEqualTo(Long value) {
            addCriterion("SPEMid >=", value, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidLessThan(Long value) {
            addCriterion("SPEMid <", value, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidLessThanOrEqualTo(Long value) {
            addCriterion("SPEMid <=", value, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidIn(List<Long> values) {
            addCriterion("SPEMid in", values, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidNotIn(List<Long> values) {
            addCriterion("SPEMid not in", values, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidBetween(Long value1, Long value2) {
            addCriterion("SPEMid between", value1, value2, "spemid");
            return (Criteria) this;
        }

        public Criteria andSpemidNotBetween(Long value1, Long value2) {
            addCriterion("SPEMid not between", value1, value2, "spemid");
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