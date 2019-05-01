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
                    <form action="/api/teacher/addstu" method="post">
                        <table class="tb-userinfo-table">
                            <tr>
                                <td class="tb-info-left">用户名：</td>
                                <td><input name="username" id="" type="text" value=""><span>使用学号</span></td>
                                <input name="id" type="text" value="" hidden disabled>
                            </tr>
                            <tr>
                                <td class="tb-info-left">学号：</td>
                                <td><input name="stuid" id="" type="text" value=""></td>
                            </tr>
                            <tr class="tr-stuID" >
                                <td class="tb-info-left">用户密码：</td>
                                <td><input name="userpwd" id="" type="password" value=""></td>
                            </tr>
                            <tr class="tr-teacherID" hidden>
                                <td class="tb-info-left">用户权限：</td>
                                <td><input name="authority" id="" type="text" value="2" hidden></td>
                            </tr>
                            <tr class="tr-Authority" hidden>
                                <td class="tb-info-left">用户类型：</td>
                                <td><input name="userstyle" id="" type="text" hidden value="学生"></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">姓名：</td>
                                <td><input name="name" id="" type="text" value=""></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">性别：</td>
                                <td>
                                    <select name="sex" id="" >
                                        <option value="男">男</option>
                                        <option value="女">女</option>
                                    </select>
                                </td>
                            </tr>
                            <tr class="tr-static">
                                <td class="tb-info-left">报到状态：</td>
                                <td>
                                    <select name="registerstatic" id="" >
                                        <option value="未报到">未报到</option>
                                        <option value="已报到">已报到</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td class="td-btn" colspan="2"><input type="submit" value="添加"><input type="reset" value="取消"></td>
                            </tr>
                        </table>
                        <script>checkPwd(this);</script>
                    </form>
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