<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tekhnik
  Date: 26.01.2022
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/resources/css/repaircss.css"/>" rel="stylesheet">
    <title>International Repair Service</title>
</head>
<body>
<div class="wrapper">
    <div class="header">
        <div class="nested"><img src="<c:url value="/resources/images/logo_ru.png"/>" alt=""/></div>
        <div class="nested"><?php
phpinfo();
?></div>
        <div class="nested">
            <table class="log-in" >
                <tr>
                    <th> Login</th>
                </tr>
                <tr>
                    <td> <input title="Login" placeholder="login"></td>
                </tr>
                <tr>
                    <td> <input title="pass" placeholder="pass"></td>
                </tr>
                <tr>
                    <td>
                     <button>Sign in</button>
                    <a href="/" title="registry" onclick="" >registry</a>
                    </td>
                </tr>

            </table>

        </div>



    </div>
    <div class="box2">Two</div>
    <div class="bodydiv">

        <p>IS International Services, LLC (IS) is a global services and engineering company focused on clients with an emphasis on providing quick and quality deliverables. The global headquarters is located in Atlanta Georgia, USA.
        </p>
        <p>I  IS’ role is to ease the customer and the General Contractor pains by coordinating with all of the other disciplines on the projects as well as other vendors and skid manufacturers to provide a complete solution for projects.
        </p>
        <p>I Our Win-Win business model relies heavily on lowering our partners’ overall cost through innovation and cost-effective solutions.
        </p>
        <p>I In the electrical design arena, we develop our own automated tools linking the design drawings to contract drawings and the cable management application. This provides for superior change control in a brief period of time with high-quality deliverables.
        </p>
        <p>I Additionally, we are a platform agnostic systems integrator; we work across a variety of controls platforms: Rockwell, Siemens, GE and ABB, Honeywell and other PLC, DCS or SCADA systems.  We also have niche expertise in upgrading legacy systems to more modern applications. This makes IS a very experienced integrator of systems into one seamless platform. Our experience stretches from the manufacturing floor to our partners manufacturing enterprise systems (MES).
        </p>
        <p>IThe dynamic changes in the national and global industrial market demands a visionary service company who understands that positive change is the root of success. At IS, we make it our business to understand our partners’ businesses and provide them with fast, quality, experienced service at the geographic location of their choice. Such service is provided at competitive rates with quantifiable results.

    </div>
    <div class="box4">Four</div>
    <div class="box5">Five</div>
    <div class="footer">Bottom</div>
</div>
</body>
</html>
