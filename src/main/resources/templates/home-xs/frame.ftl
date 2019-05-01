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
    <script type="text/javascript">
        if(!sessionStorage.getItem("status")){
            sessionStorage.clear();
            windows.location.replace(window.location.host+"/web/login?page=3");
        }
    </script>
</head>
<body>
    <div class="div-main">
        <div class="div-header-list">
            <img class="image-logo" src="../../static/home/images/logo.png" alt="" srcset="">
            <table class="table-user">
                <tr>
                    <td><img class="image-user" src="../../static/home/images/user.png" alt="" srcset=""></td>
                    <td class="td-first"><a id="username" href="">${Session.username}</a></td>
                    <td class="td-last"><a id=" id="logout" onclick="logout();" target="_parent">注　销</a></td>
                </tr>
            </table>
        </div>
        <div class="div-mid">
            <div class="div-left">
                <div class="wrap-menu">

                </div>
                    <script>
                        $(function(){
                            $.ajax({
                                url:"/api/au/get?au=2",
                                type: 'GET',
                                dataType: 'json',
                                success:function(result){
                                    new AccordionMenu({menuArrs:result});
                                }});
                        });
                    </script>
                </div>
            <div class="div-right">
                <div class="div-address">当前位置：<span>信息管理->基本信息</span></div>
                <iframe name="iframe" id="iframe" src="/api/user/showuserinfo">
                <#--page-->
                </iframe>
            </div>
        </div>
        <div class="div-footer">
                <p>copyright 2018-2019 by <a href="#">蓝天之约</a> all rights reserved.</p>
        </div>
    </div>
    <script>
        function logout() {
            if(confirm('现在退出系统？')){
                sessionStorage.clear();
                parent.location.href='/web/logout';
            }
        }
    </script>
</body>
</html>