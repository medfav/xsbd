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
                    <form action="/api/teacher/changeteacher" method="post">
                        <table class="tb-userinfo-table">
                            <tr>
                                <td class="tb-info-left">用户名：</td>
                                <td id="username">${user.username}</td>
                                <input id="id" name="id" type="text" value="${user.id}" hidden>
                            </tr>
                            <tr hidden>
                                <td class="tb-info-left">教师工号：</td>
                                <input id="teacherid" name="teacherid" type="text" value="${user.teacherid}" hidden>
                            </tr>
                            <tr class="tr-stuID" hidden>
                                <td class="tb-info-left">用户密码：</td>
                                <td><input id="userpwd" name="" type="password" value="******" disabled></td>
                            </tr>
                            <tr class="tr-teacherID" >
                                <td class="tb-info-left">用户权限：</td>
                                <td><input id="authority" name="" type="text" value="${user.authority!'3'}" disabled></td>
                            </tr>
                            <tr class="tr-Authority">
                                <td class="tb-info-left">用户类型：</td>
                                <td><input id="userstyle" name="" type="text" disabled value="${user.userstyle!'教师'}"></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">姓名：</td>
                                <td><input id="name" name="name" type="text" value="${user.name}"></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">性别：</td>
                                <td>
                                    <select name="sex" id="sex">
                                        <option value="男" <#if user.sex=="男">selected</#if> >男</option>
                                        <option value="女" <#if user.sex=="女">selected</#if> >女</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">职称：</td>
                                <td>
                                    <input id="title" name="title" type="text" value="${teacher.title}">
                                </td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">专业：</td>
                                <td>
                                    <select name="majorid" id="major">
                                        <#list majlist as item>
                                            <option value="${item.majorid}" <#if item.majorid==teacher.majorid>selected</#if> >${item.majorname}</option>
                                        </#list>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td class="td-btn" colspan="2"><input type="submit" value="修改"><input type="reset" value="取消"></td>
                            </tr>
                        </table>
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