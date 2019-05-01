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
                    <form action="/api/user/changeuser?user=mgr" method="post">
                        <table class="tb-userinfo-table">
                            <tr>
                                <td class="tb-info-left">用户类型：</td>
                                <td>
                                    <select name="userstyle" id="userStyle" onchange="javascript:checkUserStyle(this);">
                                        <option value="管理员" selected>管理员</option>
                                        <option value="教师">教师</option>
                                        <option value="学生">学生</option>
                                    </select>
                                </td>
                            </tr>
                            <tr hidden>
                                <td class="tb-info-left">用户ID：</td>
                                <td><input name="id" id="id" type="text" value="" hidden></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">用户名：</td>
                                <td><input name="username" id="username" type="text" value=""><input type="button" value="查找" onclick="serchuser();"></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">用户密码：</td>
                                <td><input name="userpwd" id="userpwd" type="password" value=""></td>
                            </tr>
                            <tr class="tr-stuID">
                                <td class="tb-info-left">学号：</td>
                                <td id="tdstuid"></td>
                                <input name="stuid" id="stuid" type="text" value="" hidden>
                            </tr>
                            <tr class="tr-teacherID" hidden>
                                <td class="tb-info-left">教师工号：</td>
                                <td><input name="teacherid" id="teacherid" type="text" value=""></td>
                            </tr>
                            <tr class="tr-Authority" hidden>
                                <td class="tb-info-left">用户权限：</td>
                                <td><input name="authority" id="authority" type="text" value="" hidden></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">姓名：</td>
                                <td><input name="name" id="name" type="text" value=""></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">性别：</td>
                                <td>
                                    <select name="sex" id="sex" >
                                        <option value="" selected>请选择</option>
                                        <option value="男">男</option>
                                        <option value="女">女</option>
                                    </select>
                                </td>
                            </tr>
                            <tr class="tr-static">
                                <td class="tb-info-left">报到状态：</td>
                                <td>
                                    <select name="registerstatic" id="registerstatic" >
                                        <option value="" selected>请选择</option>
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
                            function serchuser() {
                                $.ajax({
                                    url:"/api/user/selectbyau?username="+$("#username").val()+"&userstyle="+$("#userStyle").val(),
                                    type:"GET",
                                    dataType:"json",
                                    error: function() { alert("找不到此用户!!!"); },
                                    success:function (result) {
                                        if(result!=null && result != ""){
                                            $("#id").val(result.id);
                                            $("#username").val(result.username);
                                            $("#userpwd").val(result.userpwd);
                                            $("#tdstuid").text(result.stuid);
                                            $("#stuid").val(result.stuid);
                                            $("#teacherid").val(result.teacherid);
                                            $("#authority").val(result.authority);
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