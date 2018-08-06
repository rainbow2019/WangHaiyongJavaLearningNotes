<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>  
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

//1、格式化单个命令/表单对象的值（好像比较麻烦，真心没有好办法）  
<spring:bind path="dataBinderTest.phoneNumber">${status.value}</spring:bind>   