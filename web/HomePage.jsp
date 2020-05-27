<%-- 
    Document   : HomePage
    Created on : Mar 2, 2020, 9:38:36 PM
    Author     : TRUNG KIEN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
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
                    <div class="gallery">
                        <div class="titleImg">
                            <img src="images/i4.jpg" width="700px" height="500px">
                            <i><p>Lorem ipsum dolor sit amet</p></i>
                        </div>
                        <table>
                            <tr>
                                <c:forEach items="${galleries}" var="i">
                                    <td><img src="images/${i.mainPicture}" width="220px" height="170px" ></td>
                                    </c:forEach> 
                            </tr>
                            <tr>
                                <c:forEach items="${galleries}" var="i">
                                    <td><a class="viewGallery" href="GalleryControl?id=${i.id}">View ${i.name}</a></td>
                                </c:forEach> 
                            </tr>
                            <tr>
                                <c:forEach items="${galleries}" var="i">
                                    <td><div class="description">${i.description}</div></td>
                                    </c:forEach> 
                            </tr>
                        </table>
                    </div>
                    <div class="about">
                        <div class="about_me">About me</div>
                        <div class="aboutText">${contact.aboutMe}</div>
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
