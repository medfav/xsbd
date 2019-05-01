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
                    <form action="/web/upload/excel" method="post" enctype="multipart/form-data">
                        <table class="tb-userinfo-table">
                            <tr>
                                <td class="td-import-export" colspan="2">
                                    <input name="file" id="file" type="file">
                                    <input type="submit" onclick="javascript://importFile();" value="导入账户数据">
                                    <input type="button" onclick="javascript:window.location.href='/io/export/excel/userinfo'" value="导出账户数据">
                                    <input type="file" name="" id="file" accept="application/vnd.openxmlformats-officedocument.spreadsheetml.sheet,application/vnd.ms-excel	" hidden>
                                </td>
                            </tr>
                        </table>
                        <script>checkPwd(this);</script>
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