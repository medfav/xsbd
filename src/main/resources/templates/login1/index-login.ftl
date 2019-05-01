<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>高校新生报到系统</title>
    <link rel="stylesheet" href="../../static/login/css/index.css">
    <script src="../../static/login/js/index.js"></script>
</head>
<body>
            <div class="mainlist">
               <div class="login-div">
                   <div class="bgcolor">
                    <table class="tb-login"> 
                        <tr>
                            <td class="title-td" colspan="2">登　　录</td>
                        </tr>
                        <tr>
                            <td>用户名：</td>
                            <td class="input-td"><input type="text" placeholder="学号/工号/账号" name=""></td>
                        </tr>
                        <tr>
                            <td>密　码：</td>
                            <td class="input-td"><input type="password" name="" id=""></td>
                        </tr>
                        <tr>
                            <td>身　份：</td>
                            <td>
                                <select name="">
                                    <option value="STU" usrid="学　号">学生</option>
                                    <option value="TEA" usrid="工　号">教师</option>
                                    <option value="SYS" usrid="帐　号">管理员</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td class="btn-td" colspan="2">
                                <input type="submit" value="登　录">
                                <input type="reset" value="取　消">
                            </td>
                        </tr>
                    </table>
                </div>
               </div>
            </div>
</body>
</html>