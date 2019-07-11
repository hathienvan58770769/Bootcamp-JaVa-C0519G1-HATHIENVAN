<%--
  Created by IntelliJ IDEA.
  User: hathienvan
  Date: 2019-07-04
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <style type="text/css">
      .contents{
          width: 450px;
          margin: 0 auto;
          padding: 0px 20px 20px;
          background: white;
          border: 2px solid navy;
      }
      h1{
          color: navy;
      }
      label{
          width: 10em;
          padding-right: 1em;
          float: left;
      }
      .data input{
          float: left;
          width: 15em;
          margin-bottom: .5em;
      }

      .buttons input{
          float: left;
          margin-bottom: .5em;
      }
      br{
          clear: left;
      }

  </style>
  <body>
  <div class="contents">
  <h1>Product Discount Calculator</h1>

    <form method="post" action="/display-discount">
        <div class="data">
            <label>Product Description : </label>
            <input type="text" name="product" placeholder="Product Description" >
            <br>
            <label>List Price : </label>

            <input type="text" name="price" placeholder="Price">
            <br>
            <label>Discount Percent : </label>

            <input type="text" name="percent" placeholder="Percent">(%)
            <br>
        </div>
        <div class="buttons">
            <label >&nbsp;</label>
            <input type="submit" id="submit" value="Calculate Discount">
        </div>
    </form>
  </div>
  </body>
</html>
