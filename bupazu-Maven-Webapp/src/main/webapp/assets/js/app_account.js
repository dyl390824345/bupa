/*
*
*  file_head:	<input type="file"> 文件选择框
*  preview: 	<img>标签id
*
*/
function setImagePreview(file_head,preview) 
{  
            var preview, img_txt, localImag;
			var file_head = document.getElementById(file_head);
            var picture  =  file_head.value; 	
			
            if (!picture.match(/.jpg|.gif|.png|.bmp/i)) 
			  return alert("1您上传的图片格式不正确，请重新选择！"), !1;  
			
            if ( file_head.files && file_head.files[0] )
			{
				preview = document.getElementById(preview);
                preview.src = window.navigator.userAgent.indexOf("Chrome") >= 1 || window.navigator.userAgent.indexOf("Safari") >= 1 ? window.webkitURL.createObjectURL(file_head.files[0]) : window.URL.createObjectURL(file_head.files[0]);  
				
			}
			else
			{ 
                file_head.select(),  
                file_head.blur(),  
                
				alert("2您上传的图片格式不正确，请重新选择！");
                document.selection.empty()
            }  
			
			//alert("img path:" + preview.src);	
}  

$(document).ready(function() {
	
  $('#id-myaction1').click(function(event) {	
  		  var $radios = $('[name="radiomyaction1"]');
		  var $modal = $('#myaction1');

		  /* 将选择的值返回到对应的控件中 */
		  $('#myaction1').modal({
			  relatedTarget: this,
			  onConfirm: function(e) {
				$('#txt-myaction1').text($radios.filter(':checked').val());
				 $modal.modal('close');
			  }
			});
				
		event.stopPropagation(); 
  }); 
  
   $('#idphoto').click(function(event) {	
  		  
		// 触发文件选择事件
		$('#file_head').trigger("click");
		event.stopPropagation(); 
  }); 


});


