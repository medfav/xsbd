package com.wzx.xsbdsys.model.ato;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbStudentinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbStudentinfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andDateofbirthIsNull() {
            addCriterion("DateOfBirth is null");
            return (Criteria) this;
        }

        public Criteria andDateofbirthIsNotNull() {
            addCriterion("DateOfBirth is not null");
            return (Criteria) this;
        }

        public Criteria andDateofbirthEqualTo(Date value) {
            addCriterionForJDBCDate("DateOfBirth =", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("DateOfBirth <>", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthGreaterThan(Date value) {
            addCriterionForJDBCDate("DateOfBirth >", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DateOfBirth >=", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthLessThan(Date value) {
            addCriterionForJDBCDate("DateOfBirth <", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DateOfBirth <=", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthIn(List<Date> values) {
            addCriterionForJDBCDate("DateOfBirth in", values, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("DateOfBirth not in", values, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DateOfBirth between", value1, value2, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DateOfBirth not between", value1, value2, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("Nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("Nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("Nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("Nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("Nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("Nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("Nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("Nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("Nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("Nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("Nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("Nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("Nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("Nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andEnrollmentnumberIsNull() {
            addCriterion("EnrollmentNumber is null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentnumberIsNotNull() {
            addCriterion("EnrollmentNumber is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentnumberEqualTo(String value) {
            addCriterion("EnrollmentNumber =", value, "enrollmentnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollmentnumberNotEqualTo(String value) {
            addCriterion("EnrollmentNumber <>", value, "enrollmentnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollmentnumberGreaterThan(String value) {
            addCriterion("EnrollmentNumber >", value, "enrollmentnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollmentnumberGreaterThanOrEqualTo(String value) {
            addCriterion("EnrollmentNumber >=", value, "enrollmentnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollmentnumberLessThan(String value) {
            addCriterion("EnrollmentNumber <", value, "enrollmentnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollmentnumberLessThanOrEqualTo(String value) {
            addCriterion("EnrollmentNumber <=", value, "enrollmentnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollmentnumberLike(String value) {
            addCriterion("EnrollmentNumber like", value, "enrollmentnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollmentnumberNotLike(String value) {
            addCriterion("EnrollmentNumber not like", value, "enrollmentnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollmentnumberIn(List<String> values) {
            addCriterion("EnrollmentNumber in", values, "enrollmentnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollmentnumberNotIn(List<String> values) {
            addCriterion("EnrollmentNumber not in", values, "enrollmentnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollmentnumberBetween(String value1, String value2) {
            addCriterion("EnrollmentNumber between", value1, value2, "enrollmentnumber");
            return (Criteria) this;
        }

        public Criteria andEnrollmentnumberNotBetween(String value1, String value2) {
            addCriterion("EnrollmentNumber not between", value1, value2, "enrollmentnumber");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNull() {
            addCriterion("NativePlace is null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNotNull() {
            addCriterion("NativePlace is not null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceEqualTo(String value) {
            addCriterion("NativePlace =", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotEqualTo(String value) {
            addCriterion("NativePlace <>", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThan(String value) {
            addCriterion("NativePlace >", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("NativePlace >=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThan(String value) {
            addCriterion("NativePlace <", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("NativePlace <=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLike(String value) {
            addCriterion("NativePlace like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotLike(String value) {
            addCriterion("NativePlace not like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIn(List<String> values) {
            addCriterion("NativePlace in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotIn(List<String> values) {
            addCriterion("NativePlace not in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceBetween(String value1, String value2) {
            addCriterion("NativePlace between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotBetween(String value1, String value2) {
            addCriterion("NativePlace not between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andFormerschoolIsNull() {
            addCriterion("FormerSchool is null");
            return (Criteria) this;
        }

        public Criteria andFormerschoolIsNotNull() {
            addCriterion("FormerSchool is not null");
            return (Criteria) this;
        }

        public Criteria andFormerschoolEqualTo(String value) {
            addCriterion("FormerSchool =", value, "formerschool");
            return (Criteria) this;
        }

        public Criteria andFormerschoolNotEqualTo(String value) {
            addCriterion("FormerSchool <>", value, "formerschool");
            return (Criteria) this;
        }

        public Criteria andFormerschoolGreaterThan(String value) {
            addCriterion("FormerSchool >", value, "formerschool");
            return (Criteria) this;
        }

        public Criteria andFormerschoolGreaterThanOrEqualTo(String value) {
            addCriterion("FormerSchool >=", value, "formerschool");
            return (Criteria) this;
        }

        public Criteria andFormerschoolLessThan(String value) {
            addCriterion("FormerSchool <", value, "formerschool");
            return (Criteria) this;
        }

        public Criteria andFormerschoolLessThanOrEqualTo(String value) {
            addCriterion("FormerSchool <=", value, "formerschool");
            return (Criteria) this;
        }

        public Criteria andFormerschoolLike(String value) {
            addCriterion("FormerSchool like", value, "formerschool");
            return (Criteria) this;
        }

        public Criteria andFormerschoolNotLike(String value) {
            addCriterion("FormerSchool not like", value, "formerschool");
            return (Criteria) this;
        }

        public Criteria andFormerschoolIn(List<String> values) {
            addCriterion("FormerSchool in", values, "formerschool");
            return (Criteria) this;
        }

        public Criteria andFormerschoolNotIn(List<String> values) {
            addCriterion("FormerSchool not in", values, "formerschool");
            return (Criteria) this;
        }

        public Criteria andFormerschoolBetween(String value1, String value2) {
            addCriterion("FormerSchool between", value1, value2, "formerschool");
            return (Criteria) this;
        }

        public Criteria andFormerschoolNotBetween(String value1, String value2) {
            addCriterion("FormerSchool not between", value1, value2, "formerschool");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("Tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("Tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("Tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("Tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("Tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("Tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("Tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("Tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("Tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("Tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("Tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("Tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("Tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("Tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("QQ =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("QQ <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("QQ >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("QQ <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("QQ like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("QQ not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("QQ in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("QQ not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andParentnameIsNull() {
            addCriterion("ParentName is null");
            return (Criteria) this;
        }

        public Criteria andParentnameIsNotNull() {
            addCriterion("ParentName is not null");
            return (Criteria) this;
        }

        public Criteria andParentnameEqualTo(String value) {
            addCriterion("ParentName =", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotEqualTo(String value) {
            addCriterion("ParentName <>", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameGreaterThan(String value) {
            addCriterion("ParentName >", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameGreaterThanOrEqualTo(String value) {
            addCriterion("ParentName >=", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameLessThan(String value) {
            addCriterion("ParentName <", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameLessThanOrEqualTo(String value) {
            addCriterion("ParentName <=", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameLike(String value) {
            addCriterion("ParentName like", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotLike(String value) {
            addCriterion("ParentName not like", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameIn(List<String> values) {
            addCriterion("ParentName in", values, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotIn(List<String> values) {
            addCriterion("ParentName not in", values, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameBetween(String value1, String value2) {
            addCriterion("ParentName between", value1, value2, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotBetween(String value1, String value2) {
            addCriterion("ParentName not between", value1, value2, "parentname");
            return (Criteria) this;
        }

        public Criteria andParenttelIsNull() {
            addCriterion("ParentTel is null");
            return (Criteria) this;
        }

        public Criteria andParenttelIsNotNull() {
            addCriterion("ParentTel is not null");
            return (Criteria) this;
        }

        public Criteria andParenttelEqualTo(String value) {
            addCriterion("ParentTel =", value, "parenttel");
            return (Criteria) this;
        }

        public Criteria andParenttelNotEqualTo(String value) {
            addCriterion("ParentTel <>", value, "parenttel");
            return (Criteria) this;
        }

        public Criteria andParenttelGreaterThan(String value) {
            addCriterion("ParentTel >", value, "parenttel");
            return (Criteria) this;
        }

        public Criteria andParenttelGreaterThanOrEqualTo(String value) {
            addCriterion("ParentTel >=", value, "parenttel");
            return (Criteria) this;
        }

        public Criteria andParenttelLessThan(String value) {
            addCriterion("ParentTel <", value, "parenttel");
            return (Criteria) this;
        }

        public Criteria andParenttelLessThanOrEqualTo(String value) {
            addCriterion("ParentTel <=", value, "parenttel");
            return (Criteria) this;
        }

        public Criteria andParenttelLike(String value) {
            addCriterion("ParentTel like", value, "parenttel");
            return (Criteria) this;
        }

        public Criteria andParenttelNotLike(String value) {
            addCriterion("ParentTel not like", value, "parenttel");
            return (Criteria) this;
        }

        public Criteria andParenttelIn(List<String> values) {
            addCriterion("ParentTel in", values, "parenttel");
            return (Criteria) this;
        }

        public Criteria andParenttelNotIn(List<String> values) {
            addCriterion("ParentTel not in", values, "parenttel");
            return (Criteria) this;
        }

        public Criteria andParenttelBetween(String value1, String value2) {
            addCriterion("ParentTel between", value1, value2, "parenttel");
            return (Criteria) this;
        }

        public Criteria andParenttelNotBetween(String value1, String value2) {
            addCriterion("ParentTel not between", value1, value2, "parenttel");
            return (Criteria) this;
        }

        public Criteria andMajoridIsNull() {
            addCriterion("MajorID is null");
            return (Criteria) this;
        }

        public Criteria andMajoridIsNotNull() {
            addCriterion("MajorID is not null");
            return (Criteria) this;
        }

        public Criteria andMajoridEqualTo(String value) {
            addCriterion("MajorID =", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotEqualTo(String value) {
            addCriterion("MajorID <>", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThan(String value) {
            addCriterion("MajorID >", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThanOrEqualTo(String value) {
            addCriterion("MajorID >=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThan(String value) {
            addCriterion("MajorID <", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThanOrEqualTo(String value) {
            addCriterion("MajorID <=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLike(String value) {
            addCriterion("MajorID like", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotLike(String value) {
            addCriterion("MajorID not like", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridIn(List<String> values) {
            addCriterion("MajorID in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotIn(List<String> values) {
            addCriterion("MajorID not in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridBetween(String value1, String value2) {
            addCriterion("MajorID between", value1, value2, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotBetween(String value1, String value2) {
            addCriterion("MajorID not between", value1, value2, "majorid");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("ClassID is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("ClassID is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(String value) {
            addCriterion("ClassID =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(String value) {
            addCriterion("ClassID <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(String value) {
            addCriterion("ClassID >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(String value) {
            addCriterion("ClassID >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(String value) {
            addCriterion("ClassID <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(String value) {
            addCriterion("ClassID <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLike(String value) {
            addCriterion("ClassID like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotLike(String value) {
            addCriterion("ClassID not like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<String> values) {
            addCriterion("ClassID in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<String> values) {
            addCriterion("ClassID not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(String value1, String value2) {
            addCriterion("ClassID between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(String value1, String value2) {
            addCriterion("ClassID not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andDormitoryidIsNull() {
            addCriterion("DormitoryID is null");
            return (Criteria) this;
        }

        public Criteria andDormitoryidIsNotNull() {
            addCriterion("DormitoryID is not null");
            return (Criteria) this;
        }

        public Criteria andDormitoryidEqualTo(String value) {
            addCriterion("DormitoryID =", value, "dormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryidNotEqualTo(String value) {
            addCriterion("DormitoryID <>", value, "dormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryidGreaterThan(String value) {
            addCriterion("DormitoryID >", value, "dormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryidGreaterThanOrEqualTo(String value) {
            addCriterion("DormitoryID >=", value, "dormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryidLessThan(String value) {
            addCriterion("DormitoryID <", value, "dormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryidLessThanOrEqualTo(String value) {
            addCriterion("DormitoryID <=", value, "dormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryidLike(String value) {
            addCriterion("DormitoryID like", value, "dormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryidNotLike(String value) {
            addCriterion("DormitoryID not like", value, "dormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryidIn(List<String> values) {
            addCriterion("DormitoryID in", values, "dormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryidNotIn(List<String> values) {
            addCriterion("DormitoryID not in", values, "dormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryidBetween(String value1, String value2) {
            addCriterion("DormitoryID between", value1, value2, "dormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryidNotBetween(String value1, String value2) {
            addCriterion("DormitoryID not between", value1, value2, "dormitoryid");
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