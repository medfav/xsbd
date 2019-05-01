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
                    <form action="" method="post">
                        <table class="tb-userinfo-table">
                                <tr>
                                    <td class="tb-info-left">报到状态：</td>
                                    <td id="registerstatic" name="registerstatic" class="tb-baodao-status">未知</td>
                                </tr>
                            <tr class="tr-baodao">
                                <td colspan="2">
                                    <input type="button" onclick="baodao();" value="现在报到" >
                                </td>
                            </tr>
                        </table>
                        <script>
                            $.ajax({
                                url:"/api/user/searchuser?username="+sessionStorage.getItem("username"),
                                type:"GET",
                                dateType:"json",
                                success:function (result) {
                                    $("#registerstatic").text(result.registerstatic);
                                    if(result.registerstatic=="已报到"){
                                        $('.main-area .tr-baodao input').attr('disabled','disabled');
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