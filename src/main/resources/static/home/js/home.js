function getTime() {
    showTime();
    setInterval((null) => {
        showTime();
    }, 1000);
}
function showTime(params) {
    var t = new Date();//获取当前时间
    var year = t.getFullYear();//获取当前时间的年份
    var month = t.getMonth();//获取当前时间的月份
    var day = t.getDate();//获取当前时间的日
    var week = t.getDay();//获取当前时间的星期
    var arr = new Array("星期日","星期一","星期二","星期三","星期四","星期五","星期六");//规范星期的输出
    var hour = t.getHours();//获取当前时间的时
    var minute = t.getMinutes();//获取当前时间的分
    var second = t.getSeconds();//获取当前时间的秒
    var showTime = year + "年" + month + "月" + day + "日 " + arr[week] + " " 
    + hour + ":" + (minute<10?"0"+minute:minute) + ":" + (second<10?"0"+second:second) + (hour>12?" 下午":" 上午");//规范整体时间输出
    $('#td-date').text(showTime);
}
function checkPwd(params) {
    $('#input-2').bind('input propertychange', function () {
        var input_1 = $('#input-1');
        if ($(this).val() == $(input_1).val()) {
            $(this).css('background-color','');
            $(input_1).css('background-color','');
        } else  {
            $(this).css('background-color','#ffa2a2');
            $(input_1).css('background-color','#ffa2a2');
        }
    })
}
function checkUserStyle(params) {
    var userStyle = $('#userStyle option:selected').val();
    if (userStyle == "管理员") {
        $('.tr-stuID').attr('hidden','hidden');
        $('.tr-teacherID').attr('hidden','hidden');
        $('.tr-static').attr('hidden','hidden');
        $('.tr-Authority input').val('0');
    }
    if (userStyle == "教师") {
        $('.tr-stuID').attr('hidden','hidden');
        $('.tr-teacherID').removeAttr('hidden');
        $('.tr-static').attr('hidden','hidden');
        $('.tr-Authority input').val('1');
    }
    if (userStyle == "学生") {
        $('.tr-stuID').removeAttr('hidden','hidden');
        $('.tr-teacherID').attr('hidden','hidden');
        $('.tr-static').removeAttr('hidden','hidden');
        $('.tr-Authority input').val('2');
    }
}
function SaveAs() {
    var $eleForm = $("<form method='get'></form>");
    $eleForm.attr("action","./users.xlsx");
    $(document.body).append($eleForm);
    //提交表单，实现下载
    $eleForm.submit();
}
function importFile() {
    $('#file').click();
}
