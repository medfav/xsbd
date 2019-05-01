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
                    <form id="form1" action="/api/teacher/delstu"  method="post">
                        <table class="tb-userinfo-table">
                            <tr>
                                <td class="tb-info-left">用户名：</td>
                                <td>
                                    <input id="username" name="username" type="text" value="">
                                    <input id="id" name="id" type="text" value="" hidden>
                                    <input id="stuid" name="stuid" type="text" value="" hidden>
                                    <input type="button" onclick="deletestu()" value="删除">
                                    <input type="reset" value="取消">
                                </td>
                            </tr>
                            <tr hidden>
                                <td class="td-btn" colspan="2"><input type="submit" onclick="javascript:confirm('用户：1801010048\n姓名：小红\n确认删除？');" value="删除"><input type="reset" value="取消"></td>
                            </tr>
                        </table>
                        <script>
                            function deletestu() {
                                $.ajax({
                                    url:"/api/user/searchuser?username="+$("#username").val(),
                                    type:"GET",
                                    dateType:"json",
                                    error:function () {
                                        alert("该学生不存在！");
                                    },
                                    success:function (result) {
                                        if (result.userstyle=="学生"){
                                            $("#id").val(result.id);
                                            $("#stuid").val(result.stuid);
                                            if (confirm("确定要删除?\n用户名："+result.username+"\n姓名："+result.name)){
                                                $("#form1").submit();
                                            }
                                        }else {
                                            alert("该学生不存在！");
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