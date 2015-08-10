
function speak(textToSpeak) {
	
   //创建一个 SpeechSynthesisUtterance的实例
   var newUtterance = new SpeechSynthesisUtterance();
   
   newUtterance.voiceURI = 'native';
   newUtterance.volume = 1; 
   newUtterance.rate = 0.15;
   newUtterance.pitch = 1; 

   // 设置文本
   newUtterance.text = textToSpeak;

   // 添加到队列
   window.speechSynthesis.speak(newUtterance);
}

$(document).ready(function() {
	
  $('#idyuyin').click(function(event) {	
  
  		alert("--- yuyin enter --");
  		
		var newRecognition = webkitSpeechRecognition();
		newRecognition.continuous = true;
		
		// 开始
		newRecognition.start();
		
		// 停止
		newRecognition.stop();


		event.stopPropagation(); 
  }); 

	
});



