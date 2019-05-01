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
                    <form id="form1" action="" method="post">
                        <table class="tb-userinfo-table">
                            <tr>
                                <td class="tb-info-left">用户名：</td>
                                <td>
                                    <input name="username" id="username" type="text" value="">
                                    <input id="btn_delete" type="button" onclick="deleteuser();" value="删除">
                                    <#--<input type="button" onclick="javascript:alert('用户：1801010045，姓名：小红\n确认删除？');" value="删除">-->
                                    <input type="reset" value="取消">
                                </td>
                            </tr>
                        </table>
                        <script>
                            function deleteuser() {
                                $.ajax({
                                    url:"/api/user/searchuser?username="+$("#username").val(),
                                    type:"GET",
                                    dataType:"json",
                                    error: function() { alert("找不到此用户!!!"); },
                                    success:function (result) {
                                        if(result!=null && result != ""){
                                            if(confirm("用户："+result.username+"，姓名："+result.name+"\n确认删除？")){
                                                window.location.href="/api/user/deleteuser?id="+result.id;
                                            }
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