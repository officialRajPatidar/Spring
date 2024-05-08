<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="./base.jsp"%>
</head>
<body>
<div class="container mt-3">
<div class="row">
<div class="col-md-6 offset-md-3">
    <h2 class="text-center mb-3">Change Product Details</h2>
    <form action="${pageContext.request.contextPath }/handle-product" method="post">
    
                <input  type="hidden" name="id"
             value="${product.id }" />
        <div class="mb-3">
            <label for="productName" class="form-label">Product Name</label>
            <input type="text" class="form-control" id="productName" 
            name="name" 
            required
            value="${product.name }">
        </div>
        <div class="mb-3">
            <label for="productDescription" class="form-label">Product Description</label>
            <textarea class="form-control" id="productDescription" name="description" rows="3" required>${product.description }</textarea>
        </div>
        <div class="mb-3">
            <label for="productPrice" class="form-label">Product Price</label>
            <input type="number" class="form-control" id="productPrice" name="price" required
             value="${product.price }">
        </div>
        <div class="container text-center">
        <a href="${pageContext.request.contextPath }/" class="btn btn-outline-danger">Back</a>
        <button type="submit" class="btn btn-warning">Update</button>
   </div> </form>
</div>
</div></div>
</body>
</html>