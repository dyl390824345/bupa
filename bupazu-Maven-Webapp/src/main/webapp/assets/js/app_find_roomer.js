
$(document).ready(function() {

	$(".am-dropdown-content a").click(function(event){
			event.preventDefault();
			
			var $linkobj = $(this);
			
			// 获取<a>下面span便签对象,span中是菜单项值
			var $menuitemobj = $linkobj.find('span');
			var menuitemval = $menuitemobj.html();
			
			//  找到对应dropdown的div对象 	
			var $father1  = $linkobj.parent().parent();
			var $dropdown = $father1.parent().parent();
			var data = $dropdown.data('amui.dropdown');
			
			//  找到对应菜单标题对象
			var $titleobj = $dropdown.find('a').find('span').eq(0);
			var titleval    = $titleobj.html();
			
			//alert(menuitemval);
			//alert($titleobj.html());
			
			// 将菜单项的值设置到菜单标题中
	 		$titleobj.html(menuitemval);
			
			// 关闭下拉菜单
	 		data.active ? $dropdown.dropdown('close') : alert('没有开哪有关,善哉！');
			
			event.stopPropagation(); 
        });
		
});


