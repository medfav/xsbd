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
                    <form action="/web/upload/excel" method="post" enctype="multipart/form-data" >
                        <table class="tb-userinfo-table">
                            <tr>
                                <td class="td-import-export" colspan="2">
                                    <input id="file" name="file" type="file">
                                    <input type="submit" value="导入新生数据">
                                    <input type="button" onclick="exportStu();" value="导出新生数据">
                                    <input type="file" name="" id="file" accept="application/vnd.openxmlformats-officedocument.spreadsheetml.sheet,application/vnd.ms-excel	" hidden>
                                </td>
                            </tr>
                        </table>
                        <script>
                            function exportStu() {
                                window.location.href="/io/export/excel/stuinfo";
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