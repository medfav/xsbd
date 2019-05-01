<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>高校新生报到系统</title>
    <link rel="stylesheet" href="../../static/login/css/index.css">
    <script src="../../static/login/js/index.js"></script>
</head>
<body>
    <!--<div class="headdiv"></div>-->
    <div class="main">
    <div class="framediv">
        <div class="banner">
            <image src="../../static/login/images/logo.png"></image>
        </div>
        <div class="listdiv">
            <table>
                <tr>
                    <td class="tdfirst actionDiv"><a href="/web/login?page=0">通　知</a></td>
                    <td><a href="/web/login?page=1">相关链接</a></td>
                    <td class="tdlast"><a href="/web/login?page=2">登　录</a></td>
                </tr>
            </table>
        </div>
        <div class="maindiv">
            <div class="mainlist">
                <ul>
                    <#list list as item>
                    <li><a href="/notice/text?id=${item.noticeid}" target="_blank">${item.noticetitle}</a>[${item.changedate?datetime}]</li>
                    </#list>
                </ul>
                <a href="/notice/text?id=${list[0].noticeid}" class="more-a" target="_blank">更多通知>>></a>
            </div>
        </div>
        <div class="footdiv">
            <p>copyright 2018-2019 by <a href="#">蓝天之约</a> all rights reserved.</p>
        </div>
    </div>
</div>
</body>
</html>