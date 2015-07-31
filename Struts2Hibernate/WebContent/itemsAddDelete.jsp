<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Item Master Entry - Struts2 Hibernate Example</title>
</head>
<body>

<h1>Add / Delete / List Item</h1>
<s:actionerror/>

<s:form action="add" method="post">
	<s:textfield name="item.item_name" label="Item Name"/>
	<s:textfield name="item.category" label="Category"/>
	<s:textfield name="item.price" label="Price"/>
	<s:textfield name="item.qty" label="Quantity"/>

	<s:submit value="Add Item" align="center"/>
</s:form>

<s:form action="list" method="post">
	<s:submit value="List items" align="center"/>
</s:form>

<h2>Items in Master</h2>
<table  border="1">
<tr>
	<th>Item Code</th>
	<th>Item Name</th>
	<th>Category</th>
	<th>Price</th>
	<th>Quantity</th>
	<th>Action</th>
</tr>
<s:iterator value="itemList" var="items">
	<tr>
		<td><s:property value="item_code"/></td>
		<td><s:property value="item_name"/></td>
		<td><s:property value="category"/></td>
		<td><s:property value="price"/></td>
		<td><s:property value="qty"/></td>
		<td><a href="delete?id=<s:property value="item_code"/>">delete</a></td>
	</tr>	
</s:iterator>
</table>
</body>
</html>