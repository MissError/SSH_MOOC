<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=GB2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>�����Ʒ</title>
</head>
<body>
	<h1>������Ʒ��ҳ��</h1>
	<s:form action="product_save" method="POST" namspace="/" theme="simple">
		<table border="1" width="400">
			<tr>
				<td>��Ʒ���ƣ�</td>
				<td><s:textfield name="pname" /></td>
			</tr>
			<tr>
				<td>��Ʒ�۸�</td>
				<td><s:textfield name="price" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="���" /></td>
			</tr>
		</table>
	</s:form>
</body>
</html>