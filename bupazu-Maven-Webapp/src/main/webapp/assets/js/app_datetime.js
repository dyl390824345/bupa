$(document).ready(function() {
						   
    var curdate="";
    var startDate = new Date();
    var endDate = startDate;
    var $alert = $('#my-alert');
	
	function getdate()
	{
		var now=new Date();
		y=now.getFullYear();
		m=now.getMonth()+1;
		d=now.getDate();
		m=m<10?m:m;
		d=d<10?d:d;
		curdate = y+"-"+m+"-"+d;
	}
	
	/* 获取当前日期 */
	getdate();
	
	/* 将目前日期展示在text中 */
	$('#outTimeTo').val(curdate);
	
    $('#outTimeTo').datepicker().
		  on('changeDate.datepicker.amui', function(event) {
			if (event.date.valueOf() < startDate.valueOf()) {
			  	$alert.find('p').text('结束日期应大于当前日期！').end().show();
			} 
			else 
			{
			  $alert.hide();
			  endDate = new Date(event.date);
			}
			$(this).datepicker('close');
      });
		
	
});


