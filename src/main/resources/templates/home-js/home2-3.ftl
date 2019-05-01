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
                    <form action="/api/user/changeuser?user=teacher" method="post">
                        <table class="tb-userinfo-table">
                            <tr>
                                <td class="tb-info-left">用户名：</td>
                                <td>
                                    <input id="username" name="username" type="text" value="">
                                    <input id="" type="button" onclick="getStu();" value="查找">
                                    <span>使用学号</span>
                                </td>
                                <input name="id" id="id" type="text" value="" hidden>
                            </tr>
                            <tr>
                                <td class="tb-info-left">学号：</td>
                                <td>
                                    <input id="stuid" name="stuid" type="text" value="">
                                </td>
                            </tr>
                            <tr class="tr-stuID" hidden>
                                <td class="tb-info-left">用户密码：</td>
                                <td><input id="userpwd" type="password" value="******" hidden disabled></td>
                            </tr>
                            <tr class="tr-teacherID" hidden>
                                <td class="tb-info-left">用户权限：</td>
                                <td><input id="authority" type="text" value="2" disabled hidden></td>
                            </tr>
                            <tr class="tr-Authority">
                                <td class="tb-info-left">用户类型：</td>
                                <td><input id="userstyle" type="text" disabled value="学生"></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">姓名：</td>
                                <td><input id="name" name="name" type="text" value=""></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">性别：</td>
                                <td>
                                    <select name="sex" id="sex" >
                                        <option value="男">男</option>
                                        <option value="女">女</option>
                                    </select>
                                </td>
                            </tr>
                            <tr class="tr-static">
                                <td class="tb-info-left">报到状态：</td>
                                <td>
                                    <select name="registerstatic" id="registerstatic" >
                                        <option value="未报到">未报到</option>
                                        <option value="已报到">已报到</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td class="td-btn" colspan="2"><input type="submit" value="修改"><input type="reset" value="取消"></td>
                            </tr>
                        </table>
                        <script>
                            function getStu() {
                                $.ajax({
                                    url:"/api/user/searchuser?username="+$('#username').val(),
                                    type:"GET",
                                    dataType:"json",
                                    error: function() { alert("找不到此用户!!!"); },
                                    success:function (result) {
                                        if(result!=null && result != ""&&result.userstyle){
                                            $("#id").val(result.id);
                                            $("#username").val(result.username);
                                            // $("#userpwd").val(result.userpwd);
                                            $("#stuid").val(result.stuid);
                                            // $("#teacherid").val(result.teacherid);
                                            // $("#authority").val(result.authority);
                                            $("#userstyle").val(result.userstyle);
                                            $("#name").val(result.name);
                                            $("#sex").val(result.sex);
                                            $("#registerstatic").val(result.registerstatic);
                                        }else {
                                            alert("找不到此用户！");
                                        }
                                    }
                                });
                            }
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