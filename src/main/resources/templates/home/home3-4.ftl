<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>高校新生报到系统</title>
    <!--<meta name="viewport" content="width=device-width, initial-scale=1">-->
    <link rel="stylesheet" type="text/css" media="screen" href="../../static/home/css/menu.css"/>
    <link rel="stylesheet" type="text/css" media="screen" href="../../static/home/css/home.css"/>
    <script src="../../static/home/js/home.js"></script>
    <script src="../../static/home/js/jquery.min.js"></script>
    <script src="../../static/home/js/menu.js"></script>
</head>
<body>
<div class="main-area">
    <form id="form1" action="/notice/delete" method="post">
        <table class="tb-userinfo-table">
            <tr>
                <td class="tb-info-left">公告编号：</td>
                <td>
                    <input name="id" id="noticeid" type="text" value=""><input type="button" value="查找"
                                                                               onclick="getjson();">
                </td>
            </tr>
            <tr>
                <td class="tb-info-left">公告标题：</td>
                <td>
                    <input id="noticetitle" type="text" value="">
                </td>
            </tr>
            <tr>
                <td class="td-btn" colspan="2"><input type="button" onclick="delNotice();" value="删除"><input
                        type="reset" value="取消"></td>
            </tr>
        </table>
        <script>

        </script>
    </form>
</div>
</div>
<script>
    function getjson() {
        $.ajax({
            url: "/notice/change?id=" + $("#noticeid").val(),
            type: "GET",
            dataType: "json",
            success: function (result) {
                $("#noticeid").val(result.noticeid);
                $("#noticetitle").val(result.noticetitle);
            }
        });
    }

    function delNotice() {
        var status = confirm('编号：' + $("#noticeid").val() + '\n公告标题：' + $("#noticetitle").val() + '\n确认删除？');
        if (status == true) {
            $("#form1").submit();
        }
    }
</script>
<script>
    $.ajax({
        url: "/web/checklogin",
        type: "GET",
        dataType: "json",
        error: function () {
            alert("无法连接服务器！");
        },
        success: function (result) {
            if (result == false) {
                sessionStorage.clear();
                alert("登录过期了！");
                parent.location.href = "/web/logout";
            }
        }
    });
</script>
</body>
</html>