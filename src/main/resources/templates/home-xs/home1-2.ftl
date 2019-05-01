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
                    <table class="tb-userinfo-table">
                        <tr>
                            <td id="username" class="tb-info-left">用户名：</td>
                            <td>${user.username!'未知'}</td>
                        </tr>
                        <tr>
                            <td id="stuid" class="tb-info-left">学号：</td>
                            <td>${user.stuid!'未知'}</td>
                        </tr>
                        <tr>
                            <td id="userpwd" class="tb-info-left">用户密码：</td>
                            <td>********<a href="/web/model?au=2&model=1&item=4">修改密码</a></td>
                        </tr>
                        <tr>
                            <td id="authority" class="tb-info-left">用户权限：</td>
                            <td>${user.authority!'未知'}</td>
                        </tr>
                        <tr>
                            <td id="userstyle" class="tb-info-left">用户类型：</td>
                            <td>${user.userstyle!'未知'}</td>
                        </tr>
                        <tr>
                            <td id="name" class="tb-info-left">姓名：</td>
                            <td>${user.name!'未知'}</td>
                        </tr>
                        <tr>
                            <td id="sex" class="tb-info-left">性别：</td>
                            <td>${user.sex!'未知'}</td>
                        </tr>
                        <tr>
                            <td id="dateofbirth" class="tb-info-left">出生年月：</td>
                            <td>${(stu.dateofbirth?string('yyyy年MM月'))!}</td>
                        </tr>
                        <tr>
                            <td id="idcard" class="tb-info-left">身份证号：</td>
                            <td>${stu.idcard!'未知'}</td>
                        </tr>
                        <tr>
                            <td id="nation" class="tb-info-left">民族：</td>
                            <td>${stu.nation!'未知'}</td>
                        </tr>
                        <tr>
                            <td id="enrollmentnumber" class="tb-info-left">录取通知书编号：</td>
                            <td>${stu.enrollmentnumber!'未知'}</td>
                        </tr>
                        <tr>
                            <td id="nativeplace" class="tb-info-left">籍贯：</td>
                            <td>${stu.nativeplace!'未知'}</td>
                        </tr>
                        <tr>
                            <td id="address" class="tb-info-left">家庭住址：</td>
                            <td>${stu.address!'未知'}</td>
                        </tr>
                        <tr>
                            <td id="formerschool" class="tb-info-left">原就读学校：</td>
                            <td>${stu.formerschool!'未知'}</td>
                        </tr>
                        <tr>
                            <td id="tel" class="tb-info-left">联系电话：</td>
                            <td>${stu.tel!'未知'}</td>
                        </tr>
                        <tr>
                            <td id="qq" class="tb-info-left">QQ账号：</td>
                            <td>${stu.qq!'未知'}</td>
                        </tr>
                        <tr>
                            <td id="eMail" class="tb-info-left">电子邮箱：</td>
                            <td>${stu.email!'未知'}</td>
                        </tr>
                        <tr>
                            <td id="parentname" class="tb-info-left">家长姓名：</td>
                            <td>${stu.parentname!'未知'}</td>
                        </tr>
                        <tr>
                            <td id="parenttel" class="tb-info-left">家长电话：</td>
                            <td>${stu.parenttel!'未知'}</td>
                        </tr>
                        <tr>
                            <td id="majorid" class="tb-info-left">专业：</td>
                            <td>${maj.majorname!'未知'}</td>
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