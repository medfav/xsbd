<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>高校新生报到系统</title>
    <link rel="stylesheet" href="../../static/login/css/index.css">
    <script src="../../static/login/js/index.js"></script>
    <script src="../../static/login/js/jquery-3.0.0.min.js"></script>
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
                    <td class="tdfirst"><a href="/web/login?page=0">通　知</a></td>
                    <td><a href="/web/login?page=1">相关链接</a></td>
                    <td class="tdlast actionDiv"><a href="/web/login?page=2">登　录</a></td>
                </tr>
            </table>
        </div>
        <div class="maindiv">
            <div class="mainlist">
               <div class="login-div">
                   <div class="bgcolor">
                       <form id="form" name="form" action="/api/user/userlogin" method="post">
                    <table class="tb-login"> 
                        <tr>
                            <td class="title-td" colspan="2">登　　录</td>
                        </tr>
                        <tr>
                            <td>用户名：</td>
                            <td class="input-td"><input id="username" name="username" type="text" placeholder="学号/工号/账号" name=""></td>
                        </tr>
                        <tr>
                            <td>密　码：</td>
                            <td class="input-td"><input id="userpwd" name="userpwd" type="password" name="" id=""></td>
                        </tr>
                        <tr>
                            <td>身　份：</td>
                            <td>
                                <select id="au" name="au">
                                    <option value="2" usrid="学　号">学生</option>
                                    <option value="1" usrid="工　号">教师</option>
                                    <option value="0" usrid="帐　号">管理员</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td class="btn-td" colspan="2">
                                <input id="login" type="button" onclick="setSession();" value="登　录">
                                <input id="reset" type="reset" value="取　消">
                            </td>
                        </tr>
                    </table>
                           </form>
                </div>
               </div>
            </div>
        </div>
        <div class="footdiv">
            <p>copyright 2018-2019 by <a href="#">蓝天之约</a> all rights reserved.</p>
        </div>
    </div>
    </div>
<script>
    function setSession() {
        var username = document.getElementById("username").value;
        var au = document.getElementById("au").value;
        var status; //document.getElementById("username").value;
        var fd = new FormData(document.querySelector("form"));
        $.ajax({
            url:"/api/user/checkuser",
            type: 'post',
            data: fd,
            processData: false,// 不处理数据
            contentType: false,// 不设置内容类型
            async:false,
            dataType: 'text',
            success:function(result){
                status = result;
            }
        });
        sessionStorage.setItem("username",document.getElementById("username").value);
        sessionStorage.setItem("status",status);
        sessionStorage.setItem("au",au);
        if(status=="true") {
            document.getElementById("form");
            form.submit();
        }else {
            alert("登录失败！\n用户名或密码错误！");
            document.getElementById("reset").click();
        }
    }
    //防止页面后退
    history.pushState(null, null, document.URL);
    window.addEventListener('popstate', function () {
        history.pushState(null, null, document.URL);
    });
</script>
</body>
</html>