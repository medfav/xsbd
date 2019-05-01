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
                    <form action="/api/user/changeinfo" method="post">
                        <table class="tb-userinfo-table">
                            <tr>
                                <td class="tb-info-left">用户名：</td>
                                <td id="username">userName</td>
                                <input name="id" id="id" value="" type="text" hidden>
                            </tr>
                            <tr>
                                <td class="tb-info-left">用户密码：</td>
                                <td>********<a href="">修改密码</a></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">用户权限：</td>
                                <td id="authority">userAU</td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">用户类型：</td>
                                <td id="userstyle">userStyle</td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">姓名：</td>
                                <td><input id="name" name="name" type="text" value="张三"></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">性别：</td>
                                <td>
                                    <select name="sex" id="sex">
                                        <option value="" selected>请选择</option>
                                        <option value="男">男</option>
                                        <option value="女">女</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td class="td-btn" colspan="2"><input type="submit" value="修改"><input type="reset" value="取消"></td>
                            </tr>
                        </table>
                        <script>
                                $.ajax({
                                    url:"/api/user/searchuser?username="+sessionStorage.getItem("username"),
                                    type:"GET",
                                    dataType:"json",
                                    error: function() { alert("找不到此用户!!!"); },
                                    success:function (result) {
                                        if(result!=null && result != "" && result.authority == sessionStorage.getItem("au")){
                                            $("#id").val(result.id);
                                            $("#username").text(result.username);
                                            // $("#userpwd").text(result.userpwd);
                                            // $("#stuid").text(result.stuid);
                                            // $("#teacherid").text(result.teacherid);
                                            $("#authority").text(result.authority);
                                            $("#userstyle").text(result.userstyle);
                                            $("#name").val(result.name);
                                            $("#sex").val(result.sex);
                                            // $("#registerstatic").text(result.registerstatic);
                                        }else {
                                            alert("找不到此用户！");
                                        }
                                    }
                                });

                        </script>
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