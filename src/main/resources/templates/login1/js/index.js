function changeClass() {
    $('.listdiv td a').click(function(e){
        e.preventDefault();
        //修改li的actionDiv的位置
        //console.log(this);
        //console.log($(this).attr('href'));
        $(this).parent().addClass('actionDiv').siblings('.actionDiv').removeClass('actionDiv');
        //修改右侧主体中的div的active的位置
        $('iframe').attr('src',$(this).attr('href'));
      });
}