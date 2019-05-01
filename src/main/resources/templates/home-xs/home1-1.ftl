<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>高校新生报到系统</title>
    <!--<meta name="viewport" content="width=device-width, initial-scale=1">-->
    <link rel="stylesheet" type="text/css" media="screen" href="../../static/home-xs/css/menu.css" />
    <link rel="stylesheet" type="text/css" media="screen" href="../../static/home-xs/css/home.css" />
    <script src="../../static/home-xs/js/home.js"></script>
    <script src="../../static/home-xs/js/jquery.min.js"></script>
    <script src="../../static/home-xs/js/menu.js"></script>
</head>
<body>
                <div class="main-area">
                    <table class="tb-userinfo">
                        <tr>
                            <td><img src="../../static/home-xs/images/user-larg.png" alt="" srcset=""></td>
                            <td>
                                <table class="tb-userinfo-text">
                                    <tr>
                                        <td>当前时间：</td>
                                        <td id="td-date"><script>getTime();</script></td>
                                    </tr>
                                    <tr>
                                        <td>用户名：</td>
                                        <td>${info.username}</td>
                                    </tr>
                                    <tr>
                                        <td>姓名：</td>
                                        <td>${info.name}</td>
                                    </tr>
                                    <tr>
                                        <td colspan="2">欢迎登录高校新生报到系统！</td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </div>
<script>
    $.ajax({
        url:"/web/checklogin",
        type:"GET",
        dataType:"json",
        error:function () {
            alert("无法连接服务器！");
        },
        success:function (result) {
            if (result==false){
                sessionStorage.clear();
                alert("登录过期了！");
                parent.location.href="/web/logout";
            }
        }
    });
</script>
</body>
</html>