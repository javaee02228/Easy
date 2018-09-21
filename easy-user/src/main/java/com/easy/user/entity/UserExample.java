package com.easy.user.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordContinueFailsIsNull() {
            addCriterion("password_continue_fails is null");
            return (Criteria) this;
        }

        public Criteria andPasswordContinueFailsIsNotNull() {
            addCriterion("password_continue_fails is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordContinueFailsEqualTo(Integer value) {
            addCriterion("password_continue_fails =", value, "passwordContinueFails");
            return (Criteria) this;
        }

        public Criteria andPasswordContinueFailsNotEqualTo(Integer value) {
            addCriterion("password_continue_fails <>", value, "passwordContinueFails");
            return (Criteria) this;
        }

        public Criteria andPasswordContinueFailsGreaterThan(Integer value) {
            addCriterion("password_continue_fails >", value, "passwordContinueFails");
            return (Criteria) this;
        }

        public Criteria andPasswordContinueFailsGreaterThanOrEqualTo(Integer value) {
            addCriterion("password_continue_fails >=", value, "passwordContinueFails");
            return (Criteria) this;
        }

        public Criteria andPasswordContinueFailsLessThan(Integer value) {
            addCriterion("password_continue_fails <", value, "passwordContinueFails");
            return (Criteria) this;
        }

        public Criteria andPasswordContinueFailsLessThanOrEqualTo(Integer value) {
            addCriterion("password_continue_fails <=", value, "passwordContinueFails");
            return (Criteria) this;
        }

        public Criteria andPasswordContinueFailsIn(List<Integer> values) {
            addCriterion("password_continue_fails in", values, "passwordContinueFails");
            return (Criteria) this;
        }

        public Criteria andPasswordContinueFailsNotIn(List<Integer> values) {
            addCriterion("password_continue_fails not in", values, "passwordContinueFails");
            return (Criteria) this;
        }

        public Criteria andPasswordContinueFailsBetween(Integer value1, Integer value2) {
            addCriterion("password_continue_fails between", value1, value2, "passwordContinueFails");
            return (Criteria) this;
        }

        public Criteria andPasswordContinueFailsNotBetween(Integer value1, Integer value2) {
            addCriterion("password_continue_fails not between", value1, value2, "passwordContinueFails");
            return (Criteria) this;
        }

        public Criteria andIsPasswordLockedIsNull() {
            addCriterion("is_password_locked is null");
            return (Criteria) this;
        }

        public Criteria andIsPasswordLockedIsNotNull() {
            addCriterion("is_password_locked is not null");
            return (Criteria) this;
        }

        public Criteria andIsPasswordLockedEqualTo(Boolean value) {
            addCriterion("is_password_locked =", value, "isPasswordLocked");
            return (Criteria) this;
        }

        public Criteria andIsPasswordLockedNotEqualTo(Boolean value) {
            addCriterion("is_password_locked <>", value, "isPasswordLocked");
            return (Criteria) this;
        }

        public Criteria andIsPasswordLockedGreaterThan(Boolean value) {
            addCriterion("is_password_locked >", value, "isPasswordLocked");
            return (Criteria) this;
        }

        public Criteria andIsPasswordLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_password_locked >=", value, "isPasswordLocked");
            return (Criteria) this;
        }

        public Criteria andIsPasswordLockedLessThan(Boolean value) {
            addCriterion("is_password_locked <", value, "isPasswordLocked");
            return (Criteria) this;
        }

        public Criteria andIsPasswordLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_password_locked <=", value, "isPasswordLocked");
            return (Criteria) this;
        }

        public Criteria andIsPasswordLockedIn(List<Boolean> values) {
            addCriterion("is_password_locked in", values, "isPasswordLocked");
            return (Criteria) this;
        }

        public Criteria andIsPasswordLockedNotIn(List<Boolean> values) {
            addCriterion("is_password_locked not in", values, "isPasswordLocked");
            return (Criteria) this;
        }

        public Criteria andIsPasswordLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_password_locked between", value1, value2, "isPasswordLocked");
            return (Criteria) this;
        }

        public Criteria andIsPasswordLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_password_locked not between", value1, value2, "isPasswordLocked");
            return (Criteria) this;
        }

        public Criteria andPasswordLockedTimeIsNull() {
            addCriterion("password_locked_time is null");
            return (Criteria) this;
        }

        public Criteria andPasswordLockedTimeIsNotNull() {
            addCriterion("password_locked_time is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordLockedTimeEqualTo(Date value) {
            addCriterion("password_locked_time =", value, "passwordLockedTime");
            return (Criteria) this;
        }

        public Criteria andPasswordLockedTimeNotEqualTo(Date value) {
            addCriterion("password_locked_time <>", value, "passwordLockedTime");
            return (Criteria) this;
        }

        public Criteria andPasswordLockedTimeGreaterThan(Date value) {
            addCriterion("password_locked_time >", value, "passwordLockedTime");
            return (Criteria) this;
        }

        public Criteria andPasswordLockedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("password_locked_time >=", value, "passwordLockedTime");
            return (Criteria) this;
        }

        public Criteria andPasswordLockedTimeLessThan(Date value) {
            addCriterion("password_locked_time <", value, "passwordLockedTime");
            return (Criteria) this;
        }

        public Criteria andPasswordLockedTimeLessThanOrEqualTo(Date value) {
            addCriterion("password_locked_time <=", value, "passwordLockedTime");
            return (Criteria) this;
        }

        public Criteria andPasswordLockedTimeIn(List<Date> values) {
            addCriterion("password_locked_time in", values, "passwordLockedTime");
            return (Criteria) this;
        }

        public Criteria andPasswordLockedTimeNotIn(List<Date> values) {
            addCriterion("password_locked_time not in", values, "passwordLockedTime");
            return (Criteria) this;
        }

        public Criteria andPasswordLockedTimeBetween(Date value1, Date value2) {
            addCriterion("password_locked_time between", value1, value2, "passwordLockedTime");
            return (Criteria) this;
        }

        public Criteria andPasswordLockedTimeNotBetween(Date value1, Date value2) {
            addCriterion("password_locked_time not between", value1, value2, "passwordLockedTime");
            return (Criteria) this;
        }

        public Criteria andIsAllowLoginIsNull() {
            addCriterion("is_allow_login is null");
            return (Criteria) this;
        }

        public Criteria andIsAllowLoginIsNotNull() {
            addCriterion("is_allow_login is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllowLoginEqualTo(Boolean value) {
            addCriterion("is_allow_login =", value, "isAllowLogin");
            return (Criteria) this;
        }

        public Criteria andIsAllowLoginNotEqualTo(Boolean value) {
            addCriterion("is_allow_login <>", value, "isAllowLogin");
            return (Criteria) this;
        }

        public Criteria andIsAllowLoginGreaterThan(Boolean value) {
            addCriterion("is_allow_login >", value, "isAllowLogin");
            return (Criteria) this;
        }

        public Criteria andIsAllowLoginGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_allow_login >=", value, "isAllowLogin");
            return (Criteria) this;
        }

        public Criteria andIsAllowLoginLessThan(Boolean value) {
            addCriterion("is_allow_login <", value, "isAllowLogin");
            return (Criteria) this;
        }

        public Criteria andIsAllowLoginLessThanOrEqualTo(Boolean value) {
            addCriterion("is_allow_login <=", value, "isAllowLogin");
            return (Criteria) this;
        }

        public Criteria andIsAllowLoginIn(List<Boolean> values) {
            addCriterion("is_allow_login in", values, "isAllowLogin");
            return (Criteria) this;
        }

        public Criteria andIsAllowLoginNotIn(List<Boolean> values) {
            addCriterion("is_allow_login not in", values, "isAllowLogin");
            return (Criteria) this;
        }

        public Criteria andIsAllowLoginBetween(Boolean value1, Boolean value2) {
            addCriterion("is_allow_login between", value1, value2, "isAllowLogin");
            return (Criteria) this;
        }

        public Criteria andIsAllowLoginNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_allow_login not between", value1, value2, "isAllowLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedIsNull() {
            addCriterion("is_email_verified is null");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedIsNotNull() {
            addCriterion("is_email_verified is not null");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedEqualTo(Boolean value) {
            addCriterion("is_email_verified =", value, "isEmailVerified");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedNotEqualTo(Boolean value) {
            addCriterion("is_email_verified <>", value, "isEmailVerified");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedGreaterThan(Boolean value) {
            addCriterion("is_email_verified >", value, "isEmailVerified");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_email_verified >=", value, "isEmailVerified");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedLessThan(Boolean value) {
            addCriterion("is_email_verified <", value, "isEmailVerified");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_email_verified <=", value, "isEmailVerified");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedIn(List<Boolean> values) {
            addCriterion("is_email_verified in", values, "isEmailVerified");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedNotIn(List<Boolean> values) {
            addCriterion("is_email_verified not in", values, "isEmailVerified");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_email_verified between", value1, value2, "isEmailVerified");
            return (Criteria) this;
        }

        public Criteria andIsEmailVerifiedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_email_verified not between", value1, value2, "isEmailVerified");
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