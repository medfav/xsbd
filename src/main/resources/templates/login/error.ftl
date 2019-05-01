<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>高校新生报到系统</title>
    <!--<meta name="viewport" content="width=device-width, initial-scale=1">-->
    <link rel="stylesheet" type="text/css" media="screen" href="../../static/login/css/notice.css" />
    <script src="../../static/login/js/notice.js"></script>
    <script src="../../static/login/js/jquery-3.0.0.min.js"></script>
</head>
<body>
    <div class="error-info">
        <p>登录过期！</p>
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
                    parent.location.href="/web/login?page=2";
                }
            }
        });
    </script>
</body>
</html>