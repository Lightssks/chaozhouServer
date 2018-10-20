package com.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbshareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbshareExample() {
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

        public Criteria andShassthhIdIsNull() {
            addCriterion("SHAssthh_id is null");
            return (Criteria) this;
        }

        public Criteria andShassthhIdIsNotNull() {
            addCriterion("SHAssthh_id is not null");
            return (Criteria) this;
        }

        public Criteria andShassthhIdEqualTo(String value) {
            addCriterion("SHAssthh_id =", value, "shassthhId");
            return (Criteria) this;
        }

        public Criteria andShassthhIdNotEqualTo(String value) {
            addCriterion("SHAssthh_id <>", value, "shassthhId");
            return (Criteria) this;
        }

        public Criteria andShassthhIdGreaterThan(String value) {
            addCriterion("SHAssthh_id >", value, "shassthhId");
            return (Criteria) this;
        }

        public Criteria andShassthhIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHAssthh_id >=", value, "shassthhId");
            return (Criteria) this;
        }

        public Criteria andShassthhIdLessThan(String value) {
            addCriterion("SHAssthh_id <", value, "shassthhId");
            return (Criteria) this;
        }

        public Criteria andShassthhIdLessThanOrEqualTo(String value) {
            addCriterion("SHAssthh_id <=", value, "shassthhId");
            return (Criteria) this;
        }

        public Criteria andShassthhIdLike(String value) {
            addCriterion("SHAssthh_id like", value, "shassthhId");
            return (Criteria) this;
        }

        public Criteria andShassthhIdNotLike(String value) {
            addCriterion("SHAssthh_id not like", value, "shassthhId");
            return (Criteria) this;
        }

        public Criteria andShassthhIdIn(List<String> values) {
            addCriterion("SHAssthh_id in", values, "shassthhId");
            return (Criteria) this;
        }

        public Criteria andShassthhIdNotIn(List<String> values) {
            addCriterion("SHAssthh_id not in", values, "shassthhId");
            return (Criteria) this;
        }

        public Criteria andShassthhIdBetween(String value1, String value2) {
            addCriterion("SHAssthh_id between", value1, value2, "shassthhId");
            return (Criteria) this;
        }

        public Criteria andShassthhIdNotBetween(String value1, String value2) {
            addCriterion("SHAssthh_id not between", value1, value2, "shassthhId");
            return (Criteria) this;
        }

        public Criteria andShauidIsNull() {
            addCriterion("SHAUid is null");
            return (Criteria) this;
        }

        public Criteria andShauidIsNotNull() {
            addCriterion("SHAUid is not null");
            return (Criteria) this;
        }

        public Criteria andShauidEqualTo(Long value) {
            addCriterion("SHAUid =", value, "shauid");
            return (Criteria) this;
        }

        public Criteria andShauidNotEqualTo(Long value) {
            addCriterion("SHAUid <>", value, "shauid");
            return (Criteria) this;
        }

        public Criteria andShauidGreaterThan(Long value) {
            addCriterion("SHAUid >", value, "shauid");
            return (Criteria) this;
        }

        public Criteria andShauidGreaterThanOrEqualTo(Long value) {
            addCriterion("SHAUid >=", value, "shauid");
            return (Criteria) this;
        }

        public Criteria andShauidLessThan(Long value) {
            addCriterion("SHAUid <", value, "shauid");
            return (Criteria) this;
        }

        public Criteria andShauidLessThanOrEqualTo(Long value) {
            addCriterion("SHAUid <=", value, "shauid");
            return (Criteria) this;
        }

        public Criteria andShauidIn(List<Long> values) {
            addCriterion("SHAUid in", values, "shauid");
            return (Criteria) this;
        }

        public Criteria andShauidNotIn(List<Long> values) {
            addCriterion("SHAUid not in", values, "shauid");
            return (Criteria) this;
        }

        public Criteria andShauidBetween(Long value1, Long value2) {
            addCriterion("SHAUid between", value1, value2, "shauid");
            return (Criteria) this;
        }

        public Criteria andShauidNotBetween(Long value1, Long value2) {
            addCriterion("SHAUid not between", value1, value2, "shauid");
            return (Criteria) this;
        }

        public Criteria andShapictureIsNull() {
            addCriterion("SHApicture is null");
            return (Criteria) this;
        }

        public Criteria andShapictureIsNotNull() {
            addCriterion("SHApicture is not null");
            return (Criteria) this;
        }

        public Criteria andShapictureEqualTo(String value) {
            addCriterion("SHApicture =", value, "shapicture");
            return (Criteria) this;
        }

        public Criteria andShapictureNotEqualTo(String value) {
            addCriterion("SHApicture <>", value, "shapicture");
            return (Criteria) this;
        }

        public Criteria andShapictureGreaterThan(String value) {
            addCriterion("SHApicture >", value, "shapicture");
            return (Criteria) this;
        }

        public Criteria andShapictureGreaterThanOrEqualTo(String value) {
            addCriterion("SHApicture >=", value, "shapicture");
            return (Criteria) this;
        }

        public Criteria andShapictureLessThan(String value) {
            addCriterion("SHApicture <", value, "shapicture");
            return (Criteria) this;
        }

        public Criteria andShapictureLessThanOrEqualTo(String value) {
            addCriterion("SHApicture <=", value, "shapicture");
            return (Criteria) this;
        }

        public Criteria andShapictureLike(String value) {
            addCriterion("SHApicture like", value, "shapicture");
            return (Criteria) this;
        }

        public Criteria andShapictureNotLike(String value) {
            addCriterion("SHApicture not like", value, "shapicture");
            return (Criteria) this;
        }

        public Criteria andShapictureIn(List<String> values) {
            addCriterion("SHApicture in", values, "shapicture");
            return (Criteria) this;
        }

        public Criteria andShapictureNotIn(List<String> values) {
            addCriterion("SHApicture not in", values, "shapicture");
            return (Criteria) this;
        }

        public Criteria andShapictureBetween(String value1, String value2) {
            addCriterion("SHApicture between", value1, value2, "shapicture");
            return (Criteria) this;
        }

        public Criteria andShapictureNotBetween(String value1, String value2) {
            addCriterion("SHApicture not between", value1, value2, "shapicture");
            return (Criteria) this;
        }

        public Criteria andShahitIsNull() {
            addCriterion("SHAhit is null");
            return (Criteria) this;
        }

        public Criteria andShahitIsNotNull() {
            addCriterion("SHAhit is not null");
            return (Criteria) this;
        }

        public Criteria andShahitEqualTo(Integer value) {
            addCriterion("SHAhit =", value, "shahit");
            return (Criteria) this;
        }

        public Criteria andShahitNotEqualTo(Integer value) {
            addCriterion("SHAhit <>", value, "shahit");
            return (Criteria) this;
        }

        public Criteria andShahitGreaterThan(Integer value) {
            addCriterion("SHAhit >", value, "shahit");
            return (Criteria) this;
        }

        public Criteria andShahitGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHAhit >=", value, "shahit");
            return (Criteria) this;
        }

        public Criteria andShahitLessThan(Integer value) {
            addCriterion("SHAhit <", value, "shahit");
            return (Criteria) this;
        }

        public Criteria andShahitLessThanOrEqualTo(Integer value) {
            addCriterion("SHAhit <=", value, "shahit");
            return (Criteria) this;
        }

        public Criteria andShahitIn(List<Integer> values) {
            addCriterion("SHAhit in", values, "shahit");
            return (Criteria) this;
        }

        public Criteria andShahitNotIn(List<Integer> values) {
            addCriterion("SHAhit not in", values, "shahit");
            return (Criteria) this;
        }

        public Criteria andShahitBetween(Integer value1, Integer value2) {
            addCriterion("SHAhit between", value1, value2, "shahit");
            return (Criteria) this;
        }

        public Criteria andShahitNotBetween(Integer value1, Integer value2) {
            addCriterion("SHAhit not between", value1, value2, "shahit");
            return (Criteria) this;
        }

        public Criteria andShatimeIsNull() {
            addCriterion("SHAtime is null");
            return (Criteria) this;
        }

        public Criteria andShatimeIsNotNull() {
            addCriterion("SHAtime is not null");
            return (Criteria) this;
        }

        public Criteria andShatimeEqualTo(Date value) {
            addCriterion("SHAtime =", value, "shatime");
            return (Criteria) this;
        }

        public Criteria andShatimeNotEqualTo(Date value) {
            addCriterion("SHAtime <>", value, "shatime");
            return (Criteria) this;
        }

        public Criteria andShatimeGreaterThan(Date value) {
            addCriterion("SHAtime >", value, "shatime");
            return (Criteria) this;
        }

        public Criteria andShatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SHAtime >=", value, "shatime");
            return (Criteria) this;
        }

        public Criteria andShatimeLessThan(Date value) {
            addCriterion("SHAtime <", value, "shatime");
            return (Criteria) this;
        }

        public Criteria andShatimeLessThanOrEqualTo(Date value) {
            addCriterion("SHAtime <=", value, "shatime");
            return (Criteria) this;
        }

        public Criteria andShatimeIn(List<Date> values) {
            addCriterion("SHAtime in", values, "shatime");
            return (Criteria) this;
        }

        public Criteria andShatimeNotIn(List<Date> values) {
            addCriterion("SHAtime not in", values, "shatime");
            return (Criteria) this;
        }

        public Criteria andShatimeBetween(Date value1, Date value2) {
            addCriterion("SHAtime between", value1, value2, "shatime");
            return (Criteria) this;
        }

        public Criteria andShatimeNotBetween(Date value1, Date value2) {
            addCriterion("SHAtime not between", value1, value2, "shatime");
            return (Criteria) this;
        }

        public Criteria andShaaddressIsNull() {
            addCriterion("SHAaddress is null");
            return (Criteria) this;
        }

        public Criteria andShaaddressIsNotNull() {
            addCriterion("SHAaddress is not null");
            return (Criteria) this;
        }

        public Criteria andShaaddressEqualTo(String value) {
            addCriterion("SHAaddress =", value, "shaaddress");
            return (Criteria) this;
        }

        public Criteria andShaaddressNotEqualTo(String value) {
            addCriterion("SHAaddress <>", value, "shaaddress");
            return (Criteria) this;
        }

        public Criteria andShaaddressGreaterThan(String value) {
            addCriterion("SHAaddress >", value, "shaaddress");
            return (Criteria) this;
        }

        public Criteria andShaaddressGreaterThanOrEqualTo(String value) {
            addCriterion("SHAaddress >=", value, "shaaddress");
            return (Criteria) this;
        }

        public Criteria andShaaddressLessThan(String value) {
            addCriterion("SHAaddress <", value, "shaaddress");
            return (Criteria) this;
        }

        public Criteria andShaaddressLessThanOrEqualTo(String value) {
            addCriterion("SHAaddress <=", value, "shaaddress");
            return (Criteria) this;
        }

        public Criteria andShaaddressLike(String value) {
            addCriterion("SHAaddress like", value, "shaaddress");
            return (Criteria) this;
        }

        public Criteria andShaaddressNotLike(String value) {
            addCriterion("SHAaddress not like", value, "shaaddress");
            return (Criteria) this;
        }

        public Criteria andShaaddressIn(List<String> values) {
            addCriterion("SHAaddress in", values, "shaaddress");
            return (Criteria) this;
        }

        public Criteria andShaaddressNotIn(List<String> values) {
            addCriterion("SHAaddress not in", values, "shaaddress");
            return (Criteria) this;
        }

        public Criteria andShaaddressBetween(String value1, String value2) {
            addCriterion("SHAaddress between", value1, value2, "shaaddress");
            return (Criteria) this;
        }

        public Criteria andShaaddressNotBetween(String value1, String value2) {
            addCriterion("SHAaddress not between", value1, value2, "shaaddress");
            return (Criteria) this;
        }

        public Criteria andShapowerIsNull() {
            addCriterion("SHApower is null");
            return (Criteria) this;
        }

        public Criteria andShapowerIsNotNull() {
            addCriterion("SHApower is not null");
            return (Criteria) this;
        }

        public Criteria andShapowerEqualTo(String value) {
            addCriterion("SHApower =", value, "shapower");
            return (Criteria) this;
        }

        public Criteria andShapowerNotEqualTo(String value) {
            addCriterion("SHApower <>", value, "shapower");
            return (Criteria) this;
        }

        public Criteria andShapowerGreaterThan(String value) {
            addCriterion("SHApower >", value, "shapower");
            return (Criteria) this;
        }

        public Criteria andShapowerGreaterThanOrEqualTo(String value) {
            addCriterion("SHApower >=", value, "shapower");
            return (Criteria) this;
        }

        public Criteria andShapowerLessThan(String value) {
            addCriterion("SHApower <", value, "shapower");
            return (Criteria) this;
        }

        public Criteria andShapowerLessThanOrEqualTo(String value) {
            addCriterion("SHApower <=", value, "shapower");
            return (Criteria) this;
        }

        public Criteria andShapowerLike(String value) {
            addCriterion("SHApower like", value, "shapower");
            return (Criteria) this;
        }

        public Criteria andShapowerNotLike(String value) {
            addCriterion("SHApower not like", value, "shapower");
            return (Criteria) this;
        }

        public Criteria andShapowerIn(List<String> values) {
            addCriterion("SHApower in", values, "shapower");
            return (Criteria) this;
        }

        public Criteria andShapowerNotIn(List<String> values) {
            addCriterion("SHApower not in", values, "shapower");
            return (Criteria) this;
        }

        public Criteria andShapowerBetween(String value1, String value2) {
            addCriterion("SHApower between", value1, value2, "shapower");
            return (Criteria) this;
        }

        public Criteria andShapowerNotBetween(String value1, String value2) {
            addCriterion("SHApower not between", value1, value2, "shapower");
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