<%-- 
    Document   : Contact
    Created on : Mar 3, 2020, 10:49:14 AM
    Author     : TRUNG KIEN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <div class="header">
                <div class="link">
                    <a class="${status==-1?"text1":"text"}"  href="HomeControl">My front page</a>
                     <c:forEach items="${galleries}" var="item">
                        <a class="${item.getId()==status?"text1":"text"}" href="GalleryControl?id=${item.getId()}">Gallery ${item.getId()}</a>
                    </c:forEach>
                    <a class="${status==0?"text1":"text"}" href="ContactControl">Contact</a>
                </div>
                <div class="title">
                    <div class="content-image">
                        <a  href="HomeControl">
                            <img src="images/logo.jpg">       
                        </a>
                    </div>
                    <div class="content-title">
                        <a>
                            PHOTOGRAPHER
                        </a>
                        <h2>Welcome to this website</h2>
                    </div>
                </div>
            </div>

            <div class="content">
                <div class="left">
                    <div class="contact">
                        <div class="titleContact">
                            <p>Contact</p><br>
                            PHOTOGRAPHER<br>
                        </div>
                        <div class="detailContact">
                            Address: ${contact.address}<br>
                            City: ${contact.city}<br>
                            Country: ${contact.country}<br><br>
                            Tel: ${contact.tel}<br>
                            Email: ${contact.email}<br>
                        </div>
                    </div>
                    <div class="map">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d283696.78626557876!2d105.683304907564!3d20.892439247183!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31344e20a460eb7b%3A0xf92dde0b27d944ba!2zUGjDuiBOZ2jEqWEsIENoxrDGoW5nIE3hu7ksIEjDoCBO4buZaSwgVmnhu4d0IE5hbQ!5e0!3m2!1svi!2s!4v1583816325908!5m2!1svi!2s" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
                    </div>
                </div>
                <div class="right">
                    <div class="share">
                        <div class="sharePage">Share this page</div>
                        <a class="social" href="#">
                            <div class="fb">
                                Share on Facebook
                            </div>
                        </a>
                        <a class="social" href="#">
                            <div class="twitter">
                                Share on Twitter
                            </div>
                        </a>
                        <a class="social" href="#">
                            <div class="google">
                                Share on Google+
                            </div>
                        </a>
                    </div>
                </div>

            </div>
            <div class="footer">
                <div class="footer-content">Create with SimpleSite</div>
                <div class="number">0  4  4  0  6  0</div>
            </div>
        </div>
    </body>
</html>
