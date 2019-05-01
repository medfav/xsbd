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
                    <form action="/notice/update" method="post">
                        <table class="tb-userinfo-table">
                            <tr>
                                <td class="tb-info-left">公告编号：</td>
                                <td><input name="noticeid" id="noticeid" type="text" value=""><input type="button" value="查找" onclick="getjson();"></td>
                            </tr>
                            <tr>
                                <td class="tb-info-left">公告标题：</td>
                                <td><input name="noticetitle" id="noticetitle" type="text" value=""></td>
                            </tr>
                            <tr class="tr-textarea">
                                <td class="tb-info-left">公告内容：</td>
                                <td><textarea name="noticetext" id="noticetext" cols="80" rows="10"></textarea></td>
                            </tr>
                            <tr class="tr-stuID" hidden>
                                <td class="tb-info-left">发布人：</td>
                                <td><input name="userid" id="userid" type="text" value="" hidden></td>
                            </tr>
                            <tr class="tr-stuID" hidden>
                                <td class="tb-info-left">创建时间：</td>
                                <td><input name="createdata" id="createdata" type="text" value="" hidden></td>
                            </tr>
                            <tr>
                                <td class="td-btn" colspan="2"><input type="submit" value="修改"><input type="reset" value="取消"></td>
                            </tr>
                        </table>
                        <script>
                            function getjson() {
                                    $.ajax({
                                        url: "/notice/change?id=" + $("#noticeid").val(),
                                        type: "GET",
                                        dataType: "json",
                                        success:function (result) {
                                            $("#noticeid").val(result.noticeid);
                                            $("#noticetitle").val(result.noticetitle);
                                            $("#noticetext").val(result.noticetext);
                                            $("#userid").val(result.userid);
                                            $("#createdata").val(new Date(result.createdata));
                                        }
                                    });
                            }
                        </script>
                    </form>
                </div>
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