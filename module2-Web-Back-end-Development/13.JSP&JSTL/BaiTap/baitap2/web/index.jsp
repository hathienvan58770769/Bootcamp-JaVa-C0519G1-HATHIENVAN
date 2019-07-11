<%--
  Created by IntelliJ IDEA.
  User: hathienvan
  Date: 2019-07-05
  Time: 09:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>CALCULATOR</title>
    <style type="text/css">
      .content{
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
      fieldset{
        border: 1px solid navy;
      }
      legend {
        color: navy;
      }
      .data input{
        float: left;
        width: 15em;
        margin-bottom: .5em;
      }
      .data select{
        float: left;
        width: 15em;
        margin-bottom: .5em;
      }
      .buttons input{
        float: left;
        color: navy;
        border : 1px solid navy;
        border-radius: 2px;
        margin-bottom: .5em;
      }
      br{
        clear: left;
      }
    </style>
  </head>
  <body>
  <div class="content">
  <h1>Simple Calculator</h1>
  <form action="/calculate" method="post">
    <fieldset>
    <legend>Calculator</legend>
      <div class="data">
    <label >First operand : </label>
    <input type="text" name="first" placeholder="first operand ">
    <br>
    <label >Operator : </label>
    <select name="operator" id="operator">
      <option value="+">Addition</option>
      <option value="-">Subtraction</option>
      <option value="*">Multiplication</option>
      <option value="/">Division</option>
    </select>
    <br>
    <label > Second operand : </label>
    <input type="text" name="second" placeholder="second operand ">
    <br>
      </div>
      <div class="buttons">
      <label >&nbsp;</label>
    <input type="submit" id="submit" value="Calculator">
      </div>
    </fieldset>
  </form>
  </div>
  </body>
</html>
