<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>高校新生报到系统</title>
    <link rel="stylesheet" href="../../static/login/css/index.css">
    <script src="../../static/login/js/index.js"></script>
    <script src="../../static/login/js/jquery-3.0.0.min.js"></script>
</head>
<body onload="javascript:changeClass()">
    <!--<div class="headdiv"></div>-->
    <div class="main">
    <div class="framediv">
        <div class="banner">
            <image src="../../static/login/images/logo.png"></image>
        </div>
        <div class="listdiv">
            <table>
                <tr>
                    <td id="td1" class="tdfirst actionDiv"><a href="index-notice.html" target="child-frame">通　知</a></td>
                    <td id="td2" class=""><a href="index-link.html" target="child-frame">相关链接</a></td>
                    <td id="td3" class="tdlast"><a href="index-login.html" target="child-frame">登　录</a></td>
                </tr>
            </table>
        </div>
        <div class="maindiv">
            <iframe id="iframe" src="index-notice.html" name="child-frame" frameborder="0"></iframe>
        </div>
        <div class="footdiv">
            <p>copyright 2018-2019 by <a href="#">蓝天之约</a> all rights reserved.</p>
        </div>
    </div>
</div>
</body>
</html>