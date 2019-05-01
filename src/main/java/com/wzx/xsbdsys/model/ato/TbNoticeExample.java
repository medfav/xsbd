package com.wzx.xsbdsys.model.ato;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbNoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbNoticeExample() {
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

        public Criteria andNoticeidIsNull() {
            addCriterion("NoticeID is null");
            return (Criteria) this;
        }

        public Criteria andNoticeidIsNotNull() {
            addCriterion("NoticeID is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeidEqualTo(Integer value) {
            addCriterion("NoticeID =", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidNotEqualTo(Integer value) {
            addCriterion("NoticeID <>", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidGreaterThan(Integer value) {
            addCriterion("NoticeID >", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("NoticeID >=", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidLessThan(Integer value) {
            addCriterion("NoticeID <", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidLessThanOrEqualTo(Integer value) {
            addCriterion("NoticeID <=", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidIn(List<Integer> values) {
            addCriterion("NoticeID in", values, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidNotIn(List<Integer> values) {
            addCriterion("NoticeID not in", values, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidBetween(Integer value1, Integer value2) {
            addCriterion("NoticeID between", value1, value2, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidNotBetween(Integer value1, Integer value2) {
            addCriterion("NoticeID not between", value1, value2, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticetitleIsNull() {
            addCriterion("NoticeTitle is null");
            return (Criteria) this;
        }

        public Criteria andNoticetitleIsNotNull() {
            addCriterion("NoticeTitle is not null");
            return (Criteria) this;
        }

        public Criteria andNoticetitleEqualTo(String value) {
            addCriterion("NoticeTitle =", value, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleNotEqualTo(String value) {
            addCriterion("NoticeTitle <>", value, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleGreaterThan(String value) {
            addCriterion("NoticeTitle >", value, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleGreaterThanOrEqualTo(String value) {
            addCriterion("NoticeTitle >=", value, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleLessThan(String value) {
            addCriterion("NoticeTitle <", value, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleLessThanOrEqualTo(String value) {
            addCriterion("NoticeTitle <=", value, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleLike(String value) {
            addCriterion("NoticeTitle like", value, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleNotLike(String value) {
            addCriterion("NoticeTitle not like", value, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleIn(List<String> values) {
            addCriterion("NoticeTitle in", values, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleNotIn(List<String> values) {
            addCriterion("NoticeTitle not in", values, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleBetween(String value1, String value2) {
            addCriterion("NoticeTitle between", value1, value2, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleNotBetween(String value1, String value2) {
            addCriterion("NoticeTitle not between", value1, value2, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andCreatedataIsNull() {
            addCriterion("CreateData is null");
            return (Criteria) this;
        }

        public Criteria andCreatedataIsNotNull() {
            addCriterion("CreateData is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedataEqualTo(Date value) {
            addCriterion("CreateData =", value, "createdata");
            return (Criteria) this;
        }

        public Criteria andCreatedataNotEqualTo(Date value) {
            addCriterion("CreateData <>", value, "createdata");
            return (Criteria) this;
        }

        public Criteria andCreatedataGreaterThan(Date value) {
            addCriterion("CreateData >", value, "createdata");
            return (Criteria) this;
        }

        public Criteria andCreatedataGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateData >=", value, "createdata");
            return (Criteria) this;
        }

        public Criteria andCreatedataLessThan(Date value) {
            addCriterion("CreateData <", value, "createdata");
            return (Criteria) this;
        }

        public Criteria andCreatedataLessThanOrEqualTo(Date value) {
            addCriterion("CreateData <=", value, "createdata");
            return (Criteria) this;
        }

        public Criteria andCreatedataIn(List<Date> values) {
            addCriterion("CreateData in", values, "createdata");
            return (Criteria) this;
        }

        public Criteria andCreatedataNotIn(List<Date> values) {
            addCriterion("CreateData not in", values, "createdata");
            return (Criteria) this;
        }

        public Criteria andCreatedataBetween(Date value1, Date value2) {
            addCriterion("CreateData between", value1, value2, "createdata");
            return (Criteria) this;
        }

        public Criteria andCreatedataNotBetween(Date value1, Date value2) {
            addCriterion("CreateData not between", value1, value2, "createdata");
            return (Criteria) this;
        }

        public Criteria andChangedateIsNull() {
            addCriterion("ChangeDate is null");
            return (Criteria) this;
        }

        public Criteria andChangedateIsNotNull() {
            addCriterion("ChangeDate is not null");
            return (Criteria) this;
        }

        public Criteria andChangedateEqualTo(Date value) {
            addCriterion("ChangeDate =", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotEqualTo(Date value) {
            addCriterion("ChangeDate <>", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateGreaterThan(Date value) {
            addCriterion("ChangeDate >", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateGreaterThanOrEqualTo(Date value) {
            addCriterion("ChangeDate >=", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateLessThan(Date value) {
            addCriterion("ChangeDate <", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateLessThanOrEqualTo(Date value) {
            addCriterion("ChangeDate <=", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateIn(List<Date> values) {
            addCriterion("ChangeDate in", values, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotIn(List<Date> values) {
            addCriterion("ChangeDate not in", values, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateBetween(Date value1, Date value2) {
            addCriterion("ChangeDate between", value1, value2, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotBetween(Date value1, Date value2) {
            addCriterion("ChangeDate not between", value1, value2, "changedate");
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