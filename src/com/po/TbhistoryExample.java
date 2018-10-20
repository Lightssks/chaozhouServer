package com.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbhistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbhistoryExample() {
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

        public Criteria andHisssthhIdIsNull() {
            addCriterion("HISssthh_id is null");
            return (Criteria) this;
        }

        public Criteria andHisssthhIdIsNotNull() {
            addCriterion("HISssthh_id is not null");
            return (Criteria) this;
        }

        public Criteria andHisssthhIdEqualTo(String value) {
            addCriterion("HISssthh_id =", value, "hisssthhId");
            return (Criteria) this;
        }

        public Criteria andHisssthhIdNotEqualTo(String value) {
            addCriterion("HISssthh_id <>", value, "hisssthhId");
            return (Criteria) this;
        }

        public Criteria andHisssthhIdGreaterThan(String value) {
            addCriterion("HISssthh_id >", value, "hisssthhId");
            return (Criteria) this;
        }

        public Criteria andHisssthhIdGreaterThanOrEqualTo(String value) {
            addCriterion("HISssthh_id >=", value, "hisssthhId");
            return (Criteria) this;
        }

        public Criteria andHisssthhIdLessThan(String value) {
            addCriterion("HISssthh_id <", value, "hisssthhId");
            return (Criteria) this;
        }

        public Criteria andHisssthhIdLessThanOrEqualTo(String value) {
            addCriterion("HISssthh_id <=", value, "hisssthhId");
            return (Criteria) this;
        }

        public Criteria andHisssthhIdLike(String value) {
            addCriterion("HISssthh_id like", value, "hisssthhId");
            return (Criteria) this;
        }

        public Criteria andHisssthhIdNotLike(String value) {
            addCriterion("HISssthh_id not like", value, "hisssthhId");
            return (Criteria) this;
        }

        public Criteria andHisssthhIdIn(List<String> values) {
            addCriterion("HISssthh_id in", values, "hisssthhId");
            return (Criteria) this;
        }

        public Criteria andHisssthhIdNotIn(List<String> values) {
            addCriterion("HISssthh_id not in", values, "hisssthhId");
            return (Criteria) this;
        }

        public Criteria andHisssthhIdBetween(String value1, String value2) {
            addCriterion("HISssthh_id between", value1, value2, "hisssthhId");
            return (Criteria) this;
        }

        public Criteria andHisssthhIdNotBetween(String value1, String value2) {
            addCriterion("HISssthh_id not between", value1, value2, "hisssthhId");
            return (Criteria) this;
        }

        public Criteria andHistitleIsNull() {
            addCriterion("HIStitle is null");
            return (Criteria) this;
        }

        public Criteria andHistitleIsNotNull() {
            addCriterion("HIStitle is not null");
            return (Criteria) this;
        }

        public Criteria andHistitleEqualTo(String value) {
            addCriterion("HIStitle =", value, "histitle");
            return (Criteria) this;
        }

        public Criteria andHistitleNotEqualTo(String value) {
            addCriterion("HIStitle <>", value, "histitle");
            return (Criteria) this;
        }

        public Criteria andHistitleGreaterThan(String value) {
            addCriterion("HIStitle >", value, "histitle");
            return (Criteria) this;
        }

        public Criteria andHistitleGreaterThanOrEqualTo(String value) {
            addCriterion("HIStitle >=", value, "histitle");
            return (Criteria) this;
        }

        public Criteria andHistitleLessThan(String value) {
            addCriterion("HIStitle <", value, "histitle");
            return (Criteria) this;
        }

        public Criteria andHistitleLessThanOrEqualTo(String value) {
            addCriterion("HIStitle <=", value, "histitle");
            return (Criteria) this;
        }

        public Criteria andHistitleLike(String value) {
            addCriterion("HIStitle like", value, "histitle");
            return (Criteria) this;
        }

        public Criteria andHistitleNotLike(String value) {
            addCriterion("HIStitle not like", value, "histitle");
            return (Criteria) this;
        }

        public Criteria andHistitleIn(List<String> values) {
            addCriterion("HIStitle in", values, "histitle");
            return (Criteria) this;
        }

        public Criteria andHistitleNotIn(List<String> values) {
            addCriterion("HIStitle not in", values, "histitle");
            return (Criteria) this;
        }

        public Criteria andHistitleBetween(String value1, String value2) {
            addCriterion("HIStitle between", value1, value2, "histitle");
            return (Criteria) this;
        }

        public Criteria andHistitleNotBetween(String value1, String value2) {
            addCriterion("HIStitle not between", value1, value2, "histitle");
            return (Criteria) this;
        }

        public Criteria andHispictureIsNull() {
            addCriterion("HISpicture is null");
            return (Criteria) this;
        }

        public Criteria andHispictureIsNotNull() {
            addCriterion("HISpicture is not null");
            return (Criteria) this;
        }

        public Criteria andHispictureEqualTo(String value) {
            addCriterion("HISpicture =", value, "hispicture");
            return (Criteria) this;
        }

        public Criteria andHispictureNotEqualTo(String value) {
            addCriterion("HISpicture <>", value, "hispicture");
            return (Criteria) this;
        }

        public Criteria andHispictureGreaterThan(String value) {
            addCriterion("HISpicture >", value, "hispicture");
            return (Criteria) this;
        }

        public Criteria andHispictureGreaterThanOrEqualTo(String value) {
            addCriterion("HISpicture >=", value, "hispicture");
            return (Criteria) this;
        }

        public Criteria andHispictureLessThan(String value) {
            addCriterion("HISpicture <", value, "hispicture");
            return (Criteria) this;
        }

        public Criteria andHispictureLessThanOrEqualTo(String value) {
            addCriterion("HISpicture <=", value, "hispicture");
            return (Criteria) this;
        }

        public Criteria andHispictureLike(String value) {
            addCriterion("HISpicture like", value, "hispicture");
            return (Criteria) this;
        }

        public Criteria andHispictureNotLike(String value) {
            addCriterion("HISpicture not like", value, "hispicture");
            return (Criteria) this;
        }

        public Criteria andHispictureIn(List<String> values) {
            addCriterion("HISpicture in", values, "hispicture");
            return (Criteria) this;
        }

        public Criteria andHispictureNotIn(List<String> values) {
            addCriterion("HISpicture not in", values, "hispicture");
            return (Criteria) this;
        }

        public Criteria andHispictureBetween(String value1, String value2) {
            addCriterion("HISpicture between", value1, value2, "hispicture");
            return (Criteria) this;
        }

        public Criteria andHispictureNotBetween(String value1, String value2) {
            addCriterion("HISpicture not between", value1, value2, "hispicture");
            return (Criteria) this;
        }

        public Criteria andHischangeTimeIsNull() {
            addCriterion("HISchange_time is null");
            return (Criteria) this;
        }

        public Criteria andHischangeTimeIsNotNull() {
            addCriterion("HISchange_time is not null");
            return (Criteria) this;
        }

        public Criteria andHischangeTimeEqualTo(Date value) {
            addCriterion("HISchange_time =", value, "hischangeTime");
            return (Criteria) this;
        }

        public Criteria andHischangeTimeNotEqualTo(Date value) {
            addCriterion("HISchange_time <>", value, "hischangeTime");
            return (Criteria) this;
        }

        public Criteria andHischangeTimeGreaterThan(Date value) {
            addCriterion("HISchange_time >", value, "hischangeTime");
            return (Criteria) this;
        }

        public Criteria andHischangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("HISchange_time >=", value, "hischangeTime");
            return (Criteria) this;
        }

        public Criteria andHischangeTimeLessThan(Date value) {
            addCriterion("HISchange_time <", value, "hischangeTime");
            return (Criteria) this;
        }

        public Criteria andHischangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("HISchange_time <=", value, "hischangeTime");
            return (Criteria) this;
        }

        public Criteria andHischangeTimeIn(List<Date> values) {
            addCriterion("HISchange_time in", values, "hischangeTime");
            return (Criteria) this;
        }

        public Criteria andHischangeTimeNotIn(List<Date> values) {
            addCriterion("HISchange_time not in", values, "hischangeTime");
            return (Criteria) this;
        }

        public Criteria andHischangeTimeBetween(Date value1, Date value2) {
            addCriterion("HISchange_time between", value1, value2, "hischangeTime");
            return (Criteria) this;
        }

        public Criteria andHischangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("HISchange_time not between", value1, value2, "hischangeTime");
            return (Criteria) this;
        }

        public Criteria andHischangerIsNull() {
            addCriterion("HISchanger is null");
            return (Criteria) this;
        }

        public Criteria andHischangerIsNotNull() {
            addCriterion("HISchanger is not null");
            return (Criteria) this;
        }

        public Criteria andHischangerEqualTo(String value) {
            addCriterion("HISchanger =", value, "hischanger");
            return (Criteria) this;
        }

        public Criteria andHischangerNotEqualTo(String value) {
            addCriterion("HISchanger <>", value, "hischanger");
            return (Criteria) this;
        }

        public Criteria andHischangerGreaterThan(String value) {
            addCriterion("HISchanger >", value, "hischanger");
            return (Criteria) this;
        }

        public Criteria andHischangerGreaterThanOrEqualTo(String value) {
            addCriterion("HISchanger >=", value, "hischanger");
            return (Criteria) this;
        }

        public Criteria andHischangerLessThan(String value) {
            addCriterion("HISchanger <", value, "hischanger");
            return (Criteria) this;
        }

        public Criteria andHischangerLessThanOrEqualTo(String value) {
            addCriterion("HISchanger <=", value, "hischanger");
            return (Criteria) this;
        }

        public Criteria andHischangerLike(String value) {
            addCriterion("HISchanger like", value, "hischanger");
            return (Criteria) this;
        }

        public Criteria andHischangerNotLike(String value) {
            addCriterion("HISchanger not like", value, "hischanger");
            return (Criteria) this;
        }

        public Criteria andHischangerIn(List<String> values) {
            addCriterion("HISchanger in", values, "hischanger");
            return (Criteria) this;
        }

        public Criteria andHischangerNotIn(List<String> values) {
            addCriterion("HISchanger not in", values, "hischanger");
            return (Criteria) this;
        }

        public Criteria andHischangerBetween(String value1, String value2) {
            addCriterion("HISchanger between", value1, value2, "hischanger");
            return (Criteria) this;
        }

        public Criteria andHischangerNotBetween(String value1, String value2) {
            addCriterion("HISchanger not between", value1, value2, "hischanger");
            return (Criteria) this;
        }

        public Criteria andHisstateIsNull() {
            addCriterion("HISstate is null");
            return (Criteria) this;
        }

        public Criteria andHisstateIsNotNull() {
            addCriterion("HISstate is not null");
            return (Criteria) this;
        }

        public Criteria andHisstateEqualTo(String value) {
            addCriterion("HISstate =", value, "hisstate");
            return (Criteria) this;
        }

        public Criteria andHisstateNotEqualTo(String value) {
            addCriterion("HISstate <>", value, "hisstate");
            return (Criteria) this;
        }

        public Criteria andHisstateGreaterThan(String value) {
            addCriterion("HISstate >", value, "hisstate");
            return (Criteria) this;
        }

        public Criteria andHisstateGreaterThanOrEqualTo(String value) {
            addCriterion("HISstate >=", value, "hisstate");
            return (Criteria) this;
        }

        public Criteria andHisstateLessThan(String value) {
            addCriterion("HISstate <", value, "hisstate");
            return (Criteria) this;
        }

        public Criteria andHisstateLessThanOrEqualTo(String value) {
            addCriterion("HISstate <=", value, "hisstate");
            return (Criteria) this;
        }

        public Criteria andHisstateLike(String value) {
            addCriterion("HISstate like", value, "hisstate");
            return (Criteria) this;
        }

        public Criteria andHisstateNotLike(String value) {
            addCriterion("HISstate not like", value, "hisstate");
            return (Criteria) this;
        }

        public Criteria andHisstateIn(List<String> values) {
            addCriterion("HISstate in", values, "hisstate");
            return (Criteria) this;
        }

        public Criteria andHisstateNotIn(List<String> values) {
            addCriterion("HISstate not in", values, "hisstate");
            return (Criteria) this;
        }

        public Criteria andHisstateBetween(String value1, String value2) {
            addCriterion("HISstate between", value1, value2, "hisstate");
            return (Criteria) this;
        }

        public Criteria andHisstateNotBetween(String value1, String value2) {
            addCriterion("HISstate not between", value1, value2, "hisstate");
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