$(document).ready(function() {
	
  /* 合租方式选择窗口事件 将选择值存入对应控件中 */
  $('#id-hezuleixing').click(function(event) {	
  		  var $radios = $('[name="radio8"]');

		  /* 将选择的值返回到对应的控件中 */
		  $('#myalert8').modal({
			  relatedTarget: this,
			  onConfirm: function(e) {
				$('#txt-hezuleixing').text($radios.filter(':checked').val());
			  }
			});
				
		event.stopPropagation(); 
  }); 
  
  
  $('#id-myalert1').click(function(event) {	
  		  var $radios = $('[name="radio1"]');

		  /* 将选择的值返回到对应的控件中 */
		  $('#myalert1').modal({
			  relatedTarget: this,
			  onConfirm: function(e) {
				$('#txt-myalert1').text($radios.filter(':checked').val());
			  }
			});
				
		event.stopPropagation(); 
  }); 
  
    $('#id-myalert2').click(function(event) {	
  		  var $radios = $('[name="radio2"]');

		  /* 将选择的值返回到对应的控件中 */
		  $('#myalert2').modal({
			  relatedTarget: this,
			  onConfirm: function(e) {
				$('#txt-myalert2').text($radios.filter(':checked').val());
			  }
			});
				
		event.stopPropagation(); 
  }); 
  
  $('#id-myalert3').click(function(event) {	
  		  var $radios = $('[name="radio3"]');

		  /* 将选择的值返回到对应的控件中 */
		  $('#myalert3').modal({
			  relatedTarget: this,
			  onConfirm: function(e) {
				$('#txt-myalert3').text($radios.filter(':checked').val());
			  }
			});
				
		event.stopPropagation(); 
  }); 
	
});


