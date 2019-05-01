<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>高校新生报到系统</title>
    <!--<meta name="viewport" content="width=device-width, initial-scale=1">-->
    <link rel="stylesheet" type="text/css" media="screen" href="../../static/home/css/menu.css" />
    <link rel="stylesheet" type="text/css" media="screen" href="../../static/home/css/home.css" />
    <script src="../../static/home/js/home.js"></script>
    <script src="../../static/home/js/jquery.min.js"></script>
    <script src="../../static/home/js/menu.js"></script>
</head>
<body>
                <div class="main-area">
                    <table class="tb-userinfo-table">
                        <tr>
                            <td class="tb-info-left">用户名：</td>
                            <td>${info.username}</td>
                        </tr>
                        <tr>
                            <td class="tb-info-left">用户密码：</td>
                            <td>******<a href="/web/model?au=0&model=1&item=4">修改密码</a></td>
                        </tr>
                        <tr>
                            <td class="tb-info-left">用户权限：</td>
                            <td>${info.authority}</td>
                        </tr>
                        <tr>
                            <td class="tb-info-left">用户类型：</td>
                            <td>${info.userstyle}</td>
                        </tr>
                        <tr>
                            <td class="tb-info-left">姓名：</td>
                            <td>${info.name}</td>
                        </tr>
                        <tr>
                            <td class="tb-info-left">性别：</td>
                            <td>${info.sex}</td>
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