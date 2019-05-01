function AccordionMenu(options) {
    this.config = {
        containerCls        : '.wrap-menu',                // �������
        menuArrs            :  '',                         //  JSON������������
        type                :  'click',                    // Ĭ��Ϊclick Ҳ����mouseover
        renderCallBack      :  null,                       // ��Ⱦhtml�ṹ��ص�
        clickItemCallBack   : null                         // ÿ���ĳһ��ʱ��ص�
    };
    this.cache = {

    };
    this.init(options);
}


AccordionMenu.prototype = {

    constructor: AccordionMenu,

    init: function(options){
        this.config = $.extend(this.config,options || {});
        var self = this,
            _config = self.config,
            _cache = self.cache;

        // ��Ⱦhtml�ṹ
        $(_config.containerCls).each(function(index,item){

            self._renderHTML(item);

            // �������¼�
            self._bindEnv(item);
        });
    },
    _renderHTML: function(container){
        var self = this,
            _config = self.config,
            _cache = self.cache;
        var ulhtml = $('<ul></ul>');
        $(_config.menuArrs).each(function(index,item){
            var lihtml = $('<li><h2>'+item.name+'</h2></li>');

            if(item.submenu && item.submenu.length > 0) {
                $(lihtml).children('h2').prepend('<img src="../../static/home/images/blank.gif" alt=""/>');
                self._createSubMenu(item.submenu,lihtml);
            }
            $(ulhtml).append(lihtml);
        });
        $(container).append(ulhtml);

        _config.renderCallBack && $.isFunction(_config.renderCallBack) && _config.renderCallBack();

        // ����㼶����
        self._levelIndent(ulhtml);
    },
    /**
     * �����Ӳ˵�
     * @param {array} �Ӳ˵�
     * @param {lihtml} li��
     */
    _createSubMenu: function(submenu,lihtml){
        var self = this,
            _config = self.config,
            _cache = self.cache;
        var subUl = $('<ul></ul>'),
            callee = arguments.callee,
            subLi;

        $(submenu).each(function(index,item){
            var url = item.url || 'javascript:void(0)';

            subLi = $('<li><a href="'+url+'" target="iframe">'+item.name+'</a></li>');
            if(item.submenu && item.submenu.length > 0) {

                $(subLi).children('a').prepend('<img src="../../static/home/images/blank.gif" alt=""/>');
                callee(item.submenu, subLi);
            }
            $(subUl).append(subLi);
        });
        $(lihtml).append(subUl);
    },
    /**
     * ����㼶����
     */
    _levelIndent: function(ulList){
        var self = this,
            _config = self.config,
            _cache = self.cache,
            callee = arguments.callee;

        var initTextIndent = 2,
            lev = 1,
            $oUl = $(ulList);

        while($oUl.find('ul').length > 0){
            initTextIndent = parseInt(initTextIndent,10) + 2 + 'em';
            $oUl.children().children('ul').addClass('lev-' + lev)
                .children('li').css('text-indent', initTextIndent);
            $oUl = $oUl.children().children('ul');
            lev++;
        }
        $(ulList).find('ul').hide();
        $(ulList).find('ul:first').show();
        $(ulList).find('img:first').addClass('unfold');
    },
    /**
     * ���¼�
     */
    _bindEnv: function(container) {
        var self = this,
            _config = self.config;

        $('h2,a',container).unbind(_config.type);
        $('h2,a',container).bind(_config.type,function(e){
            if($(this).siblings('ul').length > 0) {
                $(this).siblings('ul').slideToggle('slow').end().children('img').toggleClass('unfold');
            }
            else {
                var num = $(this).parents('li').length;
                var str='';
                for (var index = 1; index <= num; index++) {
                    tmp = str;
                    str = str + $('.lev-'+index+':visible').parent().children('h2,a').text();
                    if (tmp != str) {
                        str = str + '->';
                    }
                    if(index==num) {
                        str = str + $(this).text();
                    }
                }
                $('.div-right div.div-address span').text(str);
                // $('.lev-1:visible').parent().children('h2,a').text();

                // $('.div-right div.div-address').text($(this).text());

                // var obj = $(this).parents('li').children('a,h2');
                // obj=$(obj).parent('li');
                // alert($(obj).children('h2,a').text());
            }

            $(this).parent('li').siblings().find('ul').hide('slow')
                .end().find('img.unfold').removeClass('unfold');
            _config.clickItemCallBack && $.isFunction(_config.clickItemCallBack) && _config.clickItemCallBack($(this));
        });
    }
};
