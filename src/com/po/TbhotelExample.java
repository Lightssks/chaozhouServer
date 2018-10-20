package com.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbhotelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbhotelExample() {
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

        public Criteria andHotssthhIdIsNull() {
            addCriterion("HOTssthh_id is null");
            return (Criteria) this;
        }

        public Criteria andHotssthhIdIsNotNull() {
            addCriterion("HOTssthh_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotssthhIdEqualTo(String value) {
            addCriterion("HOTssthh_id =", value, "hotssthhId");
            return (Criteria) this;
        }

        public Criteria andHotssthhIdNotEqualTo(String value) {
            addCriterion("HOTssthh_id <>", value, "hotssthhId");
            return (Criteria) this;
        }

        public Criteria andHotssthhIdGreaterThan(String value) {
            addCriterion("HOTssthh_id >", value, "hotssthhId");
            return (Criteria) this;
        }

        public Criteria andHotssthhIdGreaterThanOrEqualTo(String value) {
            addCriterion("HOTssthh_id >=", value, "hotssthhId");
            return (Criteria) this;
        }

        public Criteria andHotssthhIdLessThan(String value) {
            addCriterion("HOTssthh_id <", value, "hotssthhId");
            return (Criteria) this;
        }

        public Criteria andHotssthhIdLessThanOrEqualTo(String value) {
            addCriterion("HOTssthh_id <=", value, "hotssthhId");
            return (Criteria) this;
        }

        public Criteria andHotssthhIdLike(String value) {
            addCriterion("HOTssthh_id like", value, "hotssthhId");
            return (Criteria) this;
        }

        public Criteria andHotssthhIdNotLike(String value) {
            addCriterion("HOTssthh_id not like", value, "hotssthhId");
            return (Criteria) this;
        }

        public Criteria andHotssthhIdIn(List<String> values) {
            addCriterion("HOTssthh_id in", values, "hotssthhId");
            return (Criteria) this;
        }

        public Criteria andHotssthhIdNotIn(List<String> values) {
            addCriterion("HOTssthh_id not in", values, "hotssthhId");
            return (Criteria) this;
        }

        public Criteria andHotssthhIdBetween(String value1, String value2) {
            addCriterion("HOTssthh_id between", value1, value2, "hotssthhId");
            return (Criteria) this;
        }

        public Criteria andHotssthhIdNotBetween(String value1, String value2) {
            addCriterion("HOTssthh_id not between", value1, value2, "hotssthhId");
            return (Criteria) this;
        }

        public Criteria andHotnameIsNull() {
            addCriterion("HOTname is null");
            return (Criteria) this;
        }

        public Criteria andHotnameIsNotNull() {
            addCriterion("HOTname is not null");
            return (Criteria) this;
        }

        public Criteria andHotnameEqualTo(String value) {
            addCriterion("HOTname =", value, "hotname");
            return (Criteria) this;
        }

        public Criteria andHotnameNotEqualTo(String value) {
            addCriterion("HOTname <>", value, "hotname");
            return (Criteria) this;
        }

        public Criteria andHotnameGreaterThan(String value) {
            addCriterion("HOTname >", value, "hotname");
            return (Criteria) this;
        }

        public Criteria andHotnameGreaterThanOrEqualTo(String value) {
            addCriterion("HOTname >=", value, "hotname");
            return (Criteria) this;
        }

        public Criteria andHotnameLessThan(String value) {
            addCriterion("HOTname <", value, "hotname");
            return (Criteria) this;
        }

        public Criteria andHotnameLessThanOrEqualTo(String value) {
            addCriterion("HOTname <=", value, "hotname");
            return (Criteria) this;
        }

        public Criteria andHotnameLike(String value) {
            addCriterion("HOTname like", value, "hotname");
            return (Criteria) this;
        }

        public Criteria andHotnameNotLike(String value) {
            addCriterion("HOTname not like", value, "hotname");
            return (Criteria) this;
        }

        public Criteria andHotnameIn(List<String> values) {
            addCriterion("HOTname in", values, "hotname");
            return (Criteria) this;
        }

        public Criteria andHotnameNotIn(List<String> values) {
            addCriterion("HOTname not in", values, "hotname");
            return (Criteria) this;
        }

        public Criteria andHotnameBetween(String value1, String value2) {
            addCriterion("HOTname between", value1, value2, "hotname");
            return (Criteria) this;
        }

        public Criteria andHotnameNotBetween(String value1, String value2) {
            addCriterion("HOTname not between", value1, value2, "hotname");
            return (Criteria) this;
        }

        public Criteria andHottypeIsNull() {
            addCriterion("HOTtype is null");
            return (Criteria) this;
        }

        public Criteria andHottypeIsNotNull() {
            addCriterion("HOTtype is not null");
            return (Criteria) this;
        }

        public Criteria andHottypeEqualTo(String value) {
            addCriterion("HOTtype =", value, "hottype");
            return (Criteria) this;
        }

        public Criteria andHottypeNotEqualTo(String value) {
            addCriterion("HOTtype <>", value, "hottype");
            return (Criteria) this;
        }

        public Criteria andHottypeGreaterThan(String value) {
            addCriterion("HOTtype >", value, "hottype");
            return (Criteria) this;
        }

        public Criteria andHottypeGreaterThanOrEqualTo(String value) {
            addCriterion("HOTtype >=", value, "hottype");
            return (Criteria) this;
        }

        public Criteria andHottypeLessThan(String value) {
            addCriterion("HOTtype <", value, "hottype");
            return (Criteria) this;
        }

        public Criteria andHottypeLessThanOrEqualTo(String value) {
            addCriterion("HOTtype <=", value, "hottype");
            return (Criteria) this;
        }

        public Criteria andHottypeLike(String value) {
            addCriterion("HOTtype like", value, "hottype");
            return (Criteria) this;
        }

        public Criteria andHottypeNotLike(String value) {
            addCriterion("HOTtype not like", value, "hottype");
            return (Criteria) this;
        }

        public Criteria andHottypeIn(List<String> values) {
            addCriterion("HOTtype in", values, "hottype");
            return (Criteria) this;
        }

        public Criteria andHottypeNotIn(List<String> values) {
            addCriterion("HOTtype not in", values, "hottype");
            return (Criteria) this;
        }

        public Criteria andHottypeBetween(String value1, String value2) {
            addCriterion("HOTtype between", value1, value2, "hottype");
            return (Criteria) this;
        }

        public Criteria andHottypeNotBetween(String value1, String value2) {
            addCriterion("HOTtype not between", value1, value2, "hottype");
            return (Criteria) this;
        }

        public Criteria andHotphoneIsNull() {
            addCriterion("HOTphone is null");
            return (Criteria) this;
        }

        public Criteria andHotphoneIsNotNull() {
            addCriterion("HOTphone is not null");
            return (Criteria) this;
        }

        public Criteria andHotphoneEqualTo(String value) {
            addCriterion("HOTphone =", value, "hotphone");
            return (Criteria) this;
        }

        public Criteria andHotphoneNotEqualTo(String value) {
            addCriterion("HOTphone <>", value, "hotphone");
            return (Criteria) this;
        }

        public Criteria andHotphoneGreaterThan(String value) {
            addCriterion("HOTphone >", value, "hotphone");
            return (Criteria) this;
        }

        public Criteria andHotphoneGreaterThanOrEqualTo(String value) {
            addCriterion("HOTphone >=", value, "hotphone");
            return (Criteria) this;
        }

        public Criteria andHotphoneLessThan(String value) {
            addCriterion("HOTphone <", value, "hotphone");
            return (Criteria) this;
        }

        public Criteria andHotphoneLessThanOrEqualTo(String value) {
            addCriterion("HOTphone <=", value, "hotphone");
            return (Criteria) this;
        }

        public Criteria andHotphoneLike(String value) {
            addCriterion("HOTphone like", value, "hotphone");
            return (Criteria) this;
        }

        public Criteria andHotphoneNotLike(String value) {
            addCriterion("HOTphone not like", value, "hotphone");
            return (Criteria) this;
        }

        public Criteria andHotphoneIn(List<String> values) {
            addCriterion("HOTphone in", values, "hotphone");
            return (Criteria) this;
        }

        public Criteria andHotphoneNotIn(List<String> values) {
            addCriterion("HOTphone not in", values, "hotphone");
            return (Criteria) this;
        }

        public Criteria andHotphoneBetween(String value1, String value2) {
            addCriterion("HOTphone between", value1, value2, "hotphone");
            return (Criteria) this;
        }

        public Criteria andHotphoneNotBetween(String value1, String value2) {
            addCriterion("HOTphone not between", value1, value2, "hotphone");
            return (Criteria) this;
        }

        public Criteria andHotpictureIsNull() {
            addCriterion("HOTpicture is null");
            return (Criteria) this;
        }

        public Criteria andHotpictureIsNotNull() {
            addCriterion("HOTpicture is not null");
            return (Criteria) this;
        }

        public Criteria andHotpictureEqualTo(String value) {
            addCriterion("HOTpicture =", value, "hotpicture");
            return (Criteria) this;
        }

        public Criteria andHotpictureNotEqualTo(String value) {
            addCriterion("HOTpicture <>", value, "hotpicture");
            return (Criteria) this;
        }

        public Criteria andHotpictureGreaterThan(String value) {
            addCriterion("HOTpicture >", value, "hotpicture");
            return (Criteria) this;
        }

        public Criteria andHotpictureGreaterThanOrEqualTo(String value) {
            addCriterion("HOTpicture >=", value, "hotpicture");
            return (Criteria) this;
        }

        public Criteria andHotpictureLessThan(String value) {
            addCriterion("HOTpicture <", value, "hotpicture");
            return (Criteria) this;
        }

        public Criteria andHotpictureLessThanOrEqualTo(String value) {
            addCriterion("HOTpicture <=", value, "hotpicture");
            return (Criteria) this;
        }

        public Criteria andHotpictureLike(String value) {
            addCriterion("HOTpicture like", value, "hotpicture");
            return (Criteria) this;
        }

        public Criteria andHotpictureNotLike(String value) {
            addCriterion("HOTpicture not like", value, "hotpicture");
            return (Criteria) this;
        }

        public Criteria andHotpictureIn(List<String> values) {
            addCriterion("HOTpicture in", values, "hotpicture");
            return (Criteria) this;
        }

        public Criteria andHotpictureNotIn(List<String> values) {
            addCriterion("HOTpicture not in", values, "hotpicture");
            return (Criteria) this;
        }

        public Criteria andHotpictureBetween(String value1, String value2) {
            addCriterion("HOTpicture between", value1, value2, "hotpicture");
            return (Criteria) this;
        }

        public Criteria andHotpictureNotBetween(String value1, String value2) {
            addCriterion("HOTpicture not between", value1, value2, "hotpicture");
            return (Criteria) this;
        }

        public Criteria andHotstateIsNull() {
            addCriterion("HOTstate is null");
            return (Criteria) this;
        }

        public Criteria andHotstateIsNotNull() {
            addCriterion("HOTstate is not null");
            return (Criteria) this;
        }

        public Criteria andHotstateEqualTo(String value) {
            addCriterion("HOTstate =", value, "hotstate");
            return (Criteria) this;
        }

        public Criteria andHotstateNotEqualTo(String value) {
            addCriterion("HOTstate <>", value, "hotstate");
            return (Criteria) this;
        }

        public Criteria andHotstateGreaterThan(String value) {
            addCriterion("HOTstate >", value, "hotstate");
            return (Criteria) this;
        }

        public Criteria andHotstateGreaterThanOrEqualTo(String value) {
            addCriterion("HOTstate >=", value, "hotstate");
            return (Criteria) this;
        }

        public Criteria andHotstateLessThan(String value) {
            addCriterion("HOTstate <", value, "hotstate");
            return (Criteria) this;
        }

        public Criteria andHotstateLessThanOrEqualTo(String value) {
            addCriterion("HOTstate <=", value, "hotstate");
            return (Criteria) this;
        }

        public Criteria andHotstateLike(String value) {
            addCriterion("HOTstate like", value, "hotstate");
            return (Criteria) this;
        }

        public Criteria andHotstateNotLike(String value) {
            addCriterion("HOTstate not like", value, "hotstate");
            return (Criteria) this;
        }

        public Criteria andHotstateIn(List<String> values) {
            addCriterion("HOTstate in", values, "hotstate");
            return (Criteria) this;
        }

        public Criteria andHotstateNotIn(List<String> values) {
            addCriterion("HOTstate not in", values, "hotstate");
            return (Criteria) this;
        }

        public Criteria andHotstateBetween(String value1, String value2) {
            addCriterion("HOTstate between", value1, value2, "hotstate");
            return (Criteria) this;
        }

        public Criteria andHotstateNotBetween(String value1, String value2) {
            addCriterion("HOTstate not between", value1, value2, "hotstate");
            return (Criteria) this;
        }

        public Criteria andHotchangeTimeIsNull() {
            addCriterion("HOTchange_time is null");
            return (Criteria) this;
        }

        public Criteria andHotchangeTimeIsNotNull() {
            addCriterion("HOTchange_time is not null");
            return (Criteria) this;
        }

        public Criteria andHotchangeTimeEqualTo(Date value) {
            addCriterion("HOTchange_time =", value, "hotchangeTime");
            return (Criteria) this;
        }

        public Criteria andHotchangeTimeNotEqualTo(Date value) {
            addCriterion("HOTchange_time <>", value, "hotchangeTime");
            return (Criteria) this;
        }

        public Criteria andHotchangeTimeGreaterThan(Date value) {
            addCriterion("HOTchange_time >", value, "hotchangeTime");
            return (Criteria) this;
        }

        public Criteria andHotchangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("HOTchange_time >=", value, "hotchangeTime");
            return (Criteria) this;
        }

        public Criteria andHotchangeTimeLessThan(Date value) {
            addCriterion("HOTchange_time <", value, "hotchangeTime");
            return (Criteria) this;
        }

        public Criteria andHotchangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("HOTchange_time <=", value, "hotchangeTime");
            return (Criteria) this;
        }

        public Criteria andHotchangeTimeIn(List<Date> values) {
            addCriterion("HOTchange_time in", values, "hotchangeTime");
            return (Criteria) this;
        }

        public Criteria andHotchangeTimeNotIn(List<Date> values) {
            addCriterion("HOTchange_time not in", values, "hotchangeTime");
            return (Criteria) this;
        }

        public Criteria andHotchangeTimeBetween(Date value1, Date value2) {
            addCriterion("HOTchange_time between", value1, value2, "hotchangeTime");
            return (Criteria) this;
        }

        public Criteria andHotchangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("HOTchange_time not between", value1, value2, "hotchangeTime");
            return (Criteria) this;
        }

        public Criteria andHotchangerIsNull() {
            addCriterion("HOTchanger is null");
            return (Criteria) this;
        }

        public Criteria andHotchangerIsNotNull() {
            addCriterion("HOTchanger is not null");
            return (Criteria) this;
        }

        public Criteria andHotchangerEqualTo(String value) {
            addCriterion("HOTchanger =", value, "hotchanger");
            return (Criteria) this;
        }

        public Criteria andHotchangerNotEqualTo(String value) {
            addCriterion("HOTchanger <>", value, "hotchanger");
            return (Criteria) this;
        }

        public Criteria andHotchangerGreaterThan(String value) {
            addCriterion("HOTchanger >", value, "hotchanger");
            return (Criteria) this;
        }

        public Criteria andHotchangerGreaterThanOrEqualTo(String value) {
            addCriterion("HOTchanger >=", value, "hotchanger");
            return (Criteria) this;
        }

        public Criteria andHotchangerLessThan(String value) {
            addCriterion("HOTchanger <", value, "hotchanger");
            return (Criteria) this;
        }

        public Criteria andHotchangerLessThanOrEqualTo(String value) {
            addCriterion("HOTchanger <=", value, "hotchanger");
            return (Criteria) this;
        }

        public Criteria andHotchangerLike(String value) {
            addCriterion("HOTchanger like", value, "hotchanger");
            return (Criteria) this;
        }

        public Criteria andHotchangerNotLike(String value) {
            addCriterion("HOTchanger not like", value, "hotchanger");
            return (Criteria) this;
        }

        public Criteria andHotchangerIn(List<String> values) {
            addCriterion("HOTchanger in", values, "hotchanger");
            return (Criteria) this;
        }

        public Criteria andHotchangerNotIn(List<String> values) {
            addCriterion("HOTchanger not in", values, "hotchanger");
            return (Criteria) this;
        }

        public Criteria andHotchangerBetween(String value1, String value2) {
            addCriterion("HOTchanger between", value1, value2, "hotchanger");
            return (Criteria) this;
        }

        public Criteria andHotchangerNotBetween(String value1, String value2) {
            addCriterion("HOTchanger not between", value1, value2, "hotchanger");
            return (Criteria) this;
        }

        public Criteria andHotmidIsNull() {
            addCriterion("HOTMid is null");
            return (Criteria) this;
        }

        public Criteria andHotmidIsNotNull() {
            addCriterion("HOTMid is not null");
            return (Criteria) this;
        }

        public Criteria andHotmidEqualTo(Long value) {
            addCriterion("HOTMid =", value, "hotmid");
            return (Criteria) this;
        }

        public Criteria andHotmidNotEqualTo(Long value) {
            addCriterion("HOTMid <>", value, "hotmid");
            return (Criteria) this;
        }

        public Criteria andHotmidGreaterThan(Long value) {
            addCriterion("HOTMid >", value, "hotmid");
            return (Criteria) this;
        }

        public Criteria andHotmidGreaterThanOrEqualTo(Long value) {
            addCriterion("HOTMid >=", value, "hotmid");
            return (Criteria) this;
        }

        public Criteria andHotmidLessThan(Long value) {
            addCriterion("HOTMid <", value, "hotmid");
            return (Criteria) this;
        }

        public Criteria andHotmidLessThanOrEqualTo(Long value) {
            addCriterion("HOTMid <=", value, "hotmid");
            return (Criteria) this;
        }

        public Criteria andHotmidIn(List<Long> values) {
            addCriterion("HOTMid in", values, "hotmid");
            return (Criteria) this;
        }

        public Criteria andHotmidNotIn(List<Long> values) {
            addCriterion("HOTMid not in", values, "hotmid");
            return (Criteria) this;
        }

        public Criteria andHotmidBetween(Long value1, Long value2) {
            addCriterion("HOTMid between", value1, value2, "hotmid");
            return (Criteria) this;
        }

        public Criteria andHotmidNotBetween(Long value1, Long value2) {
            addCriterion("HOTMid not between", value1, value2, "hotmid");
            return (Criteria) this;
        }

        public Criteria andHotroomIsNull() {
            addCriterion("HOTroom is null");
            return (Criteria) this;
        }

        public Criteria andHotroomIsNotNull() {
            addCriterion("HOTroom is not null");
            return (Criteria) this;
        }

        public Criteria andHotroomEqualTo(String value) {
            addCriterion("HOTroom =", value, "hotroom");
            return (Criteria) this;
        }

        public Criteria andHotroomNotEqualTo(String value) {
            addCriterion("HOTroom <>", value, "hotroom");
            return (Criteria) this;
        }

        public Criteria andHotroomGreaterThan(String value) {
            addCriterion("HOTroom >", value, "hotroom");
            return (Criteria) this;
        }

        public Criteria andHotroomGreaterThanOrEqualTo(String value) {
            addCriterion("HOTroom >=", value, "hotroom");
            return (Criteria) this;
        }

        public Criteria andHotroomLessThan(String value) {
            addCriterion("HOTroom <", value, "hotroom");
            return (Criteria) this;
        }

        public Criteria andHotroomLessThanOrEqualTo(String value) {
            addCriterion("HOTroom <=", value, "hotroom");
            return (Criteria) this;
        }

        public Criteria andHotroomLike(String value) {
            addCriterion("HOTroom like", value, "hotroom");
            return (Criteria) this;
        }

        public Criteria andHotroomNotLike(String value) {
            addCriterion("HOTroom not like", value, "hotroom");
            return (Criteria) this;
        }

        public Criteria andHotroomIn(List<String> values) {
            addCriterion("HOTroom in", values, "hotroom");
            return (Criteria) this;
        }

        public Criteria andHotroomNotIn(List<String> values) {
            addCriterion("HOTroom not in", values, "hotroom");
            return (Criteria) this;
        }

        public Criteria andHotroomBetween(String value1, String value2) {
            addCriterion("HOTroom between", value1, value2, "hotroom");
            return (Criteria) this;
        }

        public Criteria andHotroomNotBetween(String value1, String value2) {
            addCriterion("HOTroom not between", value1, value2, "hotroom");
            return (Criteria) this;
        }

        public Criteria andHotdeviceIsNull() {
            addCriterion("HOTdevice is null");
            return (Criteria) this;
        }

        public Criteria andHotdeviceIsNotNull() {
            addCriterion("HOTdevice is not null");
            return (Criteria) this;
        }

        public Criteria andHotdeviceEqualTo(String value) {
            addCriterion("HOTdevice =", value, "hotdevice");
            return (Criteria) this;
        }

        public Criteria andHotdeviceNotEqualTo(String value) {
            addCriterion("HOTdevice <>", value, "hotdevice");
            return (Criteria) this;
        }

        public Criteria andHotdeviceGreaterThan(String value) {
            addCriterion("HOTdevice >", value, "hotdevice");
            return (Criteria) this;
        }

        public Criteria andHotdeviceGreaterThanOrEqualTo(String value) {
            addCriterion("HOTdevice >=", value, "hotdevice");
            return (Criteria) this;
        }

        public Criteria andHotdeviceLessThan(String value) {
            addCriterion("HOTdevice <", value, "hotdevice");
            return (Criteria) this;
        }

        public Criteria andHotdeviceLessThanOrEqualTo(String value) {
            addCriterion("HOTdevice <=", value, "hotdevice");
            return (Criteria) this;
        }

        public Criteria andHotdeviceLike(String value) {
            addCriterion("HOTdevice like", value, "hotdevice");
            return (Criteria) this;
        }

        public Criteria andHotdeviceNotLike(String value) {
            addCriterion("HOTdevice not like", value, "hotdevice");
            return (Criteria) this;
        }

        public Criteria andHotdeviceIn(List<String> values) {
            addCriterion("HOTdevice in", values, "hotdevice");
            return (Criteria) this;
        }

        public Criteria andHotdeviceNotIn(List<String> values) {
            addCriterion("HOTdevice not in", values, "hotdevice");
            return (Criteria) this;
        }

        public Criteria andHotdeviceBetween(String value1, String value2) {
            addCriterion("HOTdevice between", value1, value2, "hotdevice");
            return (Criteria) this;
        }

        public Criteria andHotdeviceNotBetween(String value1, String value2) {
            addCriterion("HOTdevice not between", value1, value2, "hotdevice");
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