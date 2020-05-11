(function($) {
    $.fn.extend({
        Scroll: function(opt, callback) {
            if (!opt) var opt = {};
            var _this = this.eq(0).find("ul:first");
            var lineH = _this.find("li:first").height(), //获取行高
              //每次滚动的行数，默认为一屏，即父容器高度
              line = opt.line ? parseInt(opt.line, 10) : parseInt(this.height() / lineH, 10),
              speed = opt.speed ? parseInt(opt.speed, 10) : 500, //卷动速度，数值越大，速度越慢（毫秒）
              timer = opt.timer ? parseInt(opt.timer, 10) : 3000; //滚动的时间间隔（毫秒）
            if (line == 0) line = 1;
            var upHeight = 0 - line * lineH;
            //滚动函数

            scrollUp = function() {
                _this.animate({
                    marginTop: upHeight
                }, speed, function() {
                    for (i = 1; i <= line; i++) {
                        _this.find("li:first").appendTo(_this);
                    }
                    _this.css({
                        marginTop: 0
                    });
                });
            };

            //鼠标事件绑定
            _this.hover(function() {
                clearInterval(timerID);
            }, function() {
                timerID = setInterval("scrollUp()", timer);
            }).mouseout();
        }
    });

    //form表单数据转成json
    $.fn.serializeJson=function(){
        var serializeObj={};
        var array=this.serializeArray();
        var str=this.serialize();
        $(array).each(function(){
            if(serializeObj[this.name]){
                if($.isArray(serializeObj[this.name])){
                    serializeObj[this.name].push(this.value);
                }else{
                    serializeObj[this.name]=[serializeObj[this.name],this.value];
                }
            }else{
                serializeObj[this.name]=this.value;
            }
        });
        return serializeObj;
    };
  /*鼠标禁止事件*/
  $.fn.moveStopEvent = function(callback){
    return this.each(function(){
      var x = 0,
        y = 0,
        x1 = 0,
        y1 = 0,
        isRun = false,
        si,
        self = this;

      var sif = function(){
        si = setInterval(function(){
          if(x == x1 && y ==y1)
          {
            clearInterval(si);
            isRun = false;
            callback && callback.call(self);
          }
          x = x1;
          y = y1;
        }, 10000);
      }

      $(this).mousemove(function(e){
        x1 = e.pageX;
        y1 = e.pageY;
        !isRun && sif(), isRun = true;
      }).mouseout(function(){
        clearInterval(si);
        isRun = false;
      });
    });
  }
})(jQuery);