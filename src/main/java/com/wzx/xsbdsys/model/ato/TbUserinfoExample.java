package com.wzx.xsbdsys.model.ato;

import java.util.ArrayList;
import java.util.List;

public class TbUserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserinfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andStuidIsNull() {
            addCriterion("StuId is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("StuId is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(String value) {
            addCriterion("StuId =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(String value) {
            addCriterion("StuId <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(String value) {
            addCriterion("StuId >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(String value) {
            addCriterion("StuId >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(String value) {
            addCriterion("StuId <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(String value) {
            addCriterion("StuId <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLike(String value) {
            addCriterion("StuId like", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotLike(String value) {
            addCriterion("StuId not like", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<String> values) {
            addCriterion("StuId in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<String> values) {
            addCriterion("StuId not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(String value1, String value2) {
            addCriterion("StuId between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(String value1, String value2) {
            addCriterion("StuId not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNull() {
            addCriterion("TeacherID is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("TeacherID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(String value) {
            addCriterion("TeacherID =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(String value) {
            addCriterion("TeacherID <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(String value) {
            addCriterion("TeacherID >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherID >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(String value) {
            addCriterion("TeacherID <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(String value) {
            addCriterion("TeacherID <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLike(String value) {
            addCriterion("TeacherID like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotLike(String value) {
            addCriterion("TeacherID not like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<String> values) {
            addCriterion("TeacherID in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<String> values) {
            addCriterion("TeacherID not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(String value1, String value2) {
            addCriterion("TeacherID between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(String value1, String value2) {
            addCriterion("TeacherID not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNull() {
            addCriterion("UserPwd is null");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNotNull() {
            addCriterion("UserPwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserpwdEqualTo(String value) {
            addCriterion("UserPwd =", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotEqualTo(String value) {
            addCriterion("UserPwd <>", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThan(String value) {
            addCriterion("UserPwd >", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThanOrEqualTo(String value) {
            addCriterion("UserPwd >=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThan(String value) {
            addCriterion("UserPwd <", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThanOrEqualTo(String value) {
            addCriterion("UserPwd <=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLike(String value) {
            addCriterion("UserPwd like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotLike(String value) {
            addCriterion("UserPwd not like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdIn(List<String> values) {
            addCriterion("UserPwd in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotIn(List<String> values) {
            addCriterion("UserPwd not in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdBetween(String value1, String value2) {
            addCriterion("UserPwd between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotBetween(String value1, String value2) {
            addCriterion("UserPwd not between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andAuthorityIsNull() {
            addCriterion("Authority is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIsNotNull() {
            addCriterion("Authority is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityEqualTo(Integer value) {
            addCriterion("Authority =", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotEqualTo(Integer value) {
            addCriterion("Authority <>", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThan(Integer value) {
            addCriterion("Authority >", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Authority >=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThan(Integer value) {
            addCriterion("Authority <", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThanOrEqualTo(Integer value) {
            addCriterion("Authority <=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityIn(List<Integer> values) {
            addCriterion("Authority in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotIn(List<Integer> values) {
            addCriterion("Authority not in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityBetween(Integer value1, Integer value2) {
            addCriterion("Authority between", value1, value2, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotBetween(Integer value1, Integer value2) {
            addCriterion("Authority not between", value1, value2, "authority");
            return (Criteria) this;
        }

        public Criteria andUserstyleIsNull() {
            addCriterion("UserStyle is null");
            return (Criteria) this;
        }

        public Criteria andUserstyleIsNotNull() {
            addCriterion("UserStyle is not null");
            return (Criteria) this;
        }

        public Criteria andUserstyleEqualTo(String value) {
            addCriterion("UserStyle =", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleNotEqualTo(String value) {
            addCriterion("UserStyle <>", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleGreaterThan(String value) {
            addCriterion("UserStyle >", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleGreaterThanOrEqualTo(String value) {
            addCriterion("UserStyle >=", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleLessThan(String value) {
            addCriterion("UserStyle <", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleLessThanOrEqualTo(String value) {
            addCriterion("UserStyle <=", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleLike(String value) {
            addCriterion("UserStyle like", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleNotLike(String value) {
            addCriterion("UserStyle not like", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleIn(List<String> values) {
            addCriterion("UserStyle in", values, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleNotIn(List<String> values) {
            addCriterion("UserStyle not in", values, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleBetween(String value1, String value2) {
            addCriterion("UserStyle between", value1, value2, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleNotBetween(String value1, String value2) {
            addCriterion("UserStyle not between", value1, value2, "userstyle");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("Sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("Sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("Sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("Sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("Sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("Sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("Sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("Sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("Sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("Sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("Sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("Sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("Sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("Sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andRegisterstaticIsNull() {
            addCriterion("RegisterStatic is null");
            return (Criteria) this;
        }

        public Criteria andRegisterstaticIsNotNull() {
            addCriterion("RegisterStatic is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterstaticEqualTo(String value) {
            addCriterion("RegisterStatic =", value, "registerstatic");
            return (Criteria) this;
        }

        public Criteria andRegisterstaticNotEqualTo(String value) {
            addCriterion("RegisterStatic <>", value, "registerstatic");
            return (Criteria) this;
        }

        public Criteria andRegisterstaticGreaterThan(String value) {
            addCriterion("RegisterStatic >", value, "registerstatic");
            return (Criteria) this;
        }

        public Criteria andRegisterstaticGreaterThanOrEqualTo(String value) {
            addCriterion("RegisterStatic >=", value, "registerstatic");
            return (Criteria) this;
        }

        public Criteria andRegisterstaticLessThan(String value) {
            addCriterion("RegisterStatic <", value, "registerstatic");
            return (Criteria) this;
        }

        public Criteria andRegisterstaticLessThanOrEqualTo(String value) {
            addCriterion("RegisterStatic <=", value, "registerstatic");
            return (Criteria) this;
        }

        public Criteria andRegisterstaticLike(String value) {
            addCriterion("RegisterStatic like", value, "registerstatic");
            return (Criteria) this;
        }

        public Criteria andRegisterstaticNotLike(String value) {
            addCriterion("RegisterStatic not like", value, "registerstatic");
            return (Criteria) this;
        }

        public Criteria andRegisterstaticIn(List<String> values) {
            addCriterion("RegisterStatic in", values, "registerstatic");
            return (Criteria) this;
        }

        public Criteria andRegisterstaticNotIn(List<String> values) {
            addCriterion("RegisterStatic not in", values, "registerstatic");
            return (Criteria) this;
        }

        public Criteria andRegisterstaticBetween(String value1, String value2) {
            addCriterion("RegisterStatic between", value1, value2, "registerstatic");
            return (Criteria) this;
        }

        public Criteria andRegisterstaticNotBetween(String value1, String value2) {
            addCriterion("RegisterStatic not between", value1, value2, "registerstatic");
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