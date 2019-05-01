<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>高校新生报到系统</title>
    <!--<meta name="viewport" content="width=device-width, initial-scale=1">-->
    <link rel="stylesheet" type="text/css" media="screen" href="../../static/home-js/css/menu.css" />
    <link rel="stylesheet" type="text/css" media="screen" href="../../static/home-js/css/home.css" />
    <script src="../../static/home-js/js/home.js"></script>
    <script src="../../static/home-js/js/jquery.min.js"></script>
    <script src="../../static/home-js/js/menu.js"></script>
</head>
<body>
                <div class="main-area">
                    <table class="tb-userinfo-table">
                        <tr>
                            <td class="tb-info-left">用户名：</td>
                            <td>${user.username}</td>
                        </tr>
                        <tr hidden>
                            <td class="tb-info-left">用户密码：</td>
                            <td>********<a href="/web/model?au=1&model=1&item=4">修改密码</a></td>
                        </tr>
                        <tr>
                            <td class="tb-info-left">用户权限：</td>
                            <td>${user.authority}</td>
                        </tr>
                        <tr>
                            <td class="tb-info-left">用户类型：</td>
                            <td>${user.userstyle}</td>
                        </tr>
                        <tr>
                            <td class="tb-info-left">姓名：</td>
                            <td>${user.name}</td>
                        </tr>
                        <tr>
                            <td class="tb-info-left">性别：</td>
                            <td>${user.sex}</td>
                        </tr>
                        <tr>
                            <td class="tb-info-left">职称：</td>
                            <td>${teacher.title}</td>
                        </tr>
                        <tr>
                            <td class="tb-info-left">专业：</td>
                            <td>${maj.majorname}</td>
                        </tr>
                        <tr>
                            <td class="tb-info-left">院/系：</td>
                            <td>${dep.departmentname}</td>
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