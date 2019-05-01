<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>高校新生报到系统</title>
    <!--<meta name="viewport" content="width=device-width, initial-scale=1">-->
    <link rel="stylesheet" type="text/css" media="screen" href="../../static/login/css/notice.css" />
    <script src="../../static/login/js/notice.js"></script>
    <script src="../../static/login/js/jquery-3.0.0.min.js"></script>
</head>
<body>
    <div class="div-main">
        <div class="div-header-list">
            <img class="image-logo" src="../../static/login/images/logo.png" alt="" srcset="">
        </div>
        <div class="div-mid">
            <div class="div-left">
                <ul>
                    <#list list as item>
                    <li><a href="/notice/text?id=${item.noticeid}">${item.noticetitle}<span>[${item.changedate?datetime}]</span></a></li>
                    </#list>
                </ul>
            </div>
            <div class="div-right">
                <table class="tb-notice">
                    <tr>
                        <td class="td-notice-title" colspan="2">${select.noticetitle}</td>
                    </tr>
                    <tr class="tr-notice-info">
                        <td class="td-notice-user">${select.userid}</td>
                        <td class="td-notice-time">${select.changedate?datetime}</td>
                    </tr>
                    <tr>
                        <td class="td-nitice-text" colspan="2">
                            <pre>${select.noticetext}</pre></td>
                    </tr>
                </table>
            </div>
        </div>
        <div class="div-footer">
                <p>copyright 2018-2019 by <a href="#">蓝天之约</a> all rights reserved.</p>
        </div>
    </div>
</body>
</html>