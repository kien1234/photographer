<%-- 
    Document   : Gallery
    Created on : Mar 3, 2020, 10:30:22 AM
    Author     : TRUNG KIEN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gallery</title>
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
                    <div class="titleGallery">
                        <c:forEach items="${galleries}" var="i">
                            <c:if test="${i.id == id}">
                                ${i.name}
                            </c:if>
                        </c:forEach>
                    </div>
                    <div class="slide">
                        <img id="slider" src="images/${pictures.get(0).name}" height="500px" width="700px">
                        <a class="btnLeft" onclick="prev()"><img src="images/pre.png" width="40px" height="60px" alt="" style="cursor:pointer;"/></a>
                        <a class="btnRight" onclick="next()"><img src="images/next.jpg" width="40px" height="60px" alt="" style="cursor:pointer;"/></a>
                    </div>
                    <table>
                        <tr>
                            <c:forEach items="${pictures}" var="i" varStatus="x">


                                <td>
                                    <div class="bgPicture">
                                        <img id="${i.id}" class="imageItem" src="images/${i.name}"
                                             width="150px" height="130px" onclick="imageClick('${i.id}');" style="cursor:pointer;" >
                                    </div>
                                </td>
                                <c:if test="${x.count % 4 == 0 || pictures.size() == x.count}">
                                </tr>
                                <c:if test="${pictures.size()!=x.count}"><tr></c:if>
                                </c:if>
                            </c:forEach>


                    </table>
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
    <script>
        var images = [];
        <c:forEach items="${pictures}" var="i">
        images.push("images/${i.name}");
        </c:forEach>
        var num = 0;

        function next() {
            var slider = document.getElementById("slider");
            num++;
            if (num >= images.length) {
                num = 0;
            }
            slider.src = images[num];
        }

        function prev() {
            var slider = document.getElementById("slider");
            num--;
            if (num < 0) {
                num = images.length - 1;
            }
            slider.src = images[num];
        }

        function imageClick(k) {
            var s = k.toString();
            var slider = document.getElementById("slider");
            slider.src = document.getElementById(s).src;
        }

        setInterval(next, 5000);
    </script>
</html>
