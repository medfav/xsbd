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
                        <table class="tb-userinfo-table">
                            <tr class="tr-search">
                                <td colspan="6">
                                    <form action="/api/user/search" target="iframe" method="post">
                                        <input type="text" name="username" id="" placeholder="请输入关键词">
                                        <input type="submit" name="" id="" value="搜索">
                                    </form>
                                </td>
                            </tr>
                            <tr class="tr-head">
                                <td>编号</td>
                                <td>用户名</td>
                                <td>用户权限</td>
                                <td>用户类型</td>
                                <td>姓名</td>
                                <td>性别</td>
                            </tr>
                            <#list list as item >
                            <tr>
                                <td>${item.id!}</td>
                                <td>${item.username!}</td>
                                <td>${item.authority!}</td>
                                <td>${item.userstyle!}</td>
                                <td>${item.name!}</td>
                                <td>${item.sex!}</td>
                            </tr>
                            </#list>
                            <tr>
                                <td class="td-page" colspan="6">
                                    <a <#if info.isFirstPage!=true>href="/api/user/showlist?pageNum=${info.navigateFirstPage}"</#if> title="第一页">首页</a>
                                    <a <#if info.isFirstPage!=true>href="/api/user/showlist?pageNum=${info.prePage}"</#if> title="上一页">上一页</a>
                                    <span>第${info.pageNum}页/共${info.pages}页</span>
                                    <a <#if info.isLastPage!=true>href="/api/user/showlist?pageNum=${info.nextPage}"</#if> title="下一页">下一页</a>
                                    <a <#if info.isLastPage!=true>href="/api/user/showlist?pageNum=${info.navigateLastPage}"</#if> title="尾页">尾页</a>
                                </td>
                            </tr>
                        </table>
                        <script>checkPwd(this);</script>
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