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
                    <form action="/api/stu/changeStu" method="post">
                        <table class="tb-userinfo-table">
                            <tr>
                                <td class="tb-info-left">用户名：</td>
                                <td><input id="username" name="username" type="text" value="${user.username}" disabled><span>使用学号</span></td>
                                <input id="id" name="id" type="text" value="${user.id}" hidden>
                            </tr>
                            <tr hidden>
                                <td class="tb-info-left">学号：</td>
                                <td><input id="stuid" name="stuid" type="text" value="${user.stuid}" hidden></td>
                            </tr>
                            <tr class="tr-stuID" hidden>
                                <td class="tb-info-left">用户密码：</td>
                                <td><input id="userpwd" name="userpwd" type="password" value="******" disabled></td>
                            </tr>
                            <tr class="tr-teacherID" >
                                <td class="tb-info-left">用户权限：</td>
                                <td><input id="authority" name="authority" type="text" value="${user.authority!'3'}" disabled></td>
                            </tr>
                            <tr class="tr-Authority">
                                <td class="tb-info-left">用户类型：</td>
                                <td><input id="userstyle" name="userstyle" type="text" disabled value="${user.userstyle!'学生'}"></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">姓名：</td>
                                <td><input id="name" name="name" type="text" value="${user.name}"></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">性别：</td>
                                <td>
                                    <select name="sex" id="sex" >
                                        <#if user.sex==""><option value="" selected >请选择</option></#if>
                                        <option value="男" <#if user.sex=="男">selected</#if> >男</option>
                                        <option value="女" <#if user.sex=="女">selected</#if> >女</option>
                                    </select>
                                </td>
                            </tr>
                            <tr class="tr-static" hidden>
                                <td class="tb-info-left">报到状态：</td>
                                <td>
                                    <select name="registerstatic" id="registerstatic" disabled>
                                        <option value="" <#if user.registerstatic=="">selected</#if>>请选择</option>
                                        <option value="未报到" <#if user.registerstatic=="未报到">selected</#if> >未报到</option>
                                        <option value="已报到" <#if user.registerstatic=="已报到">selected</#if> >已报到</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">出生年月：</td>
                                <td><input name="stringdateofbirth" id="dateofbirth" type="date" value=""></td>
                                <script>$("#dateofbirth").val('${stu.dateofbirth?string('yyyy-MM-dd')}');sessionStorage.</script>
                            </tr>
                            <tr>
                                <td class="tb-info-left">身份证号：</td>
                                <td><input name="idcard" id="idcard" type="text" value="${stu.idcard}"></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">民族：</td>
                                <td><input name="nation" id="nation" type="text" value="${stu.nation}"></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">录取通知书编号：</td>
                                <td><input id="enrollmentnumber" name="enrollmentnumber" type="text" value="${stu.enrollmentnumber}" disabled></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">籍贯：</td>
                                <td><input id="nativeplace" name="nativeplace" type="text" value="${stu.nativeplace}"></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">家庭住址：</td>
                                <td><input id="address" name="address" type="text" value="${stu.address}"></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">原就读学校：</td>
                                <td><input id="formerschool" name="formerschool" type="text" value="${stu.formerschool}"></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">联系电话：</td>
                                <td><input id="tel" name="tel" type="text" value="${stu.tel}"></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">QQ账号：</td>
                                <td><input id="qq" name="qq" type="text" value="${stu.qq}"></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">电子邮箱：</td>
                                <td><input id="email" name="email" type="text" value="${stu.email}"></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">家长姓名：</td>
                                <td><input id="parentname" name="parentname" type="text" value="${stu.parentname}"></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">家长电话：</td>
                                <td><input id="parenttel" name="parenttel" type="text" value="${stu.parenttel}"></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">专业：</td>
                                <td><input id="major" name="major" type="text" value="${maj.majorname}" disabled></td>
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