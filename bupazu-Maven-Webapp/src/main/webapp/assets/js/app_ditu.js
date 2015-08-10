/*
*  调用百度地图api获取gis信息并显示地图
*
*  mapdivid: 地图显示层的id
*
*/
function getcurrent_position(mapdivid){
		var map;  
        var gpsPoint;  
        var baiduPoint;  
        var gpsAddress;  
        var baiduAddress;  
		var cityName;
  
  		/* 获取GIS信息并在地图上显示 */
        function getLocation() {  
		
            //根据IP获取城市  
            var myCity = new BMap.LocalCity();  
            myCity.get(getCityByIP);  
  
            //获取GPS坐标  
            if (navigator.geolocation) 
			{  
                navigator.geolocation.getCurrentPosition(showMap, handleError, { enableHighAccuracy: true, maximumAge: 1000 });  
            } 
			else
			{  
                alert("您的浏览器不支持使用HTML 5来获取地理位置服务");  
            }  
        }  
        
        function showMap(value) 
		{  
            var longitude = value.coords.longitude;  
            var latitude = value.coords.latitude;  
			
			//alert("坐标经度为：" + latitude + "， 纬度为：" + longitude ); 
            
            gpsPoint = new BMap.Point(longitude, latitude);    // 创建点坐标
			
			map = new BMap.Map(mapdivid);  
            map.centerAndZoom(gpsPoint, 15);  
  
            //根据坐标逆解析地址  
            var geoc = new BMap.Geocoder();  
            geoc.getLocation(gpsPoint, getCityByCoordinate);  
  
            BMap.Convertor.translate(gpsPoint, 0, translateCallback);  
        } 
  
        function translateCallback(point) 
		{			
            baiduPoint = point;  
            var geoc = new BMap.Geocoder();  
            geoc.getLocation(baiduPoint, getCityByBaiduCoordinate);  
        }  
  
        function getCityByCoordinate(rs) 
		{
            gpsAddress = rs.addressComponents;  
            var address = "GPS标注：" + gpsAddress.province + "," + gpsAddress.city + "," + gpsAddress.district + "," + gpsAddress.street + "," + gpsAddress.streetNumber;  
            //alert(address); 
			
			//var marker = new BMap.Marker(gpsPoint);  // 创建标注  
            //map.addOverlay(marker);              	 // 将标注添加到地图中
			  
            //var labelgps = new BMap.Label(address, { offset: new BMap.Size(20, -10) });  
            //marker.setLabel(labelgps); //添加GPS标注 
        }  
  
        function getCityByBaiduCoordinate(rs) 
		{  
            baiduAddress = rs.addressComponents;  
            var address = "百度标注：" + baiduAddress.province + "," + baiduAddress.city + "," + baiduAddress.district + "," + baiduAddress.street + "," + baiduAddress.streetNumber;  
			//alert(address); 
			
            var marker = new BMap.Marker(baiduPoint);  // 创建标注
            map.addOverlay(marker);              	   // 将标注添加到地图中  
			
            var labelbaidu = new BMap.Label(address, { offset: new BMap.Size(20, -10) });  
            marker.setLabel(labelbaidu); //添加百度标注 

        }  
  
        //根据IP获取城市  
        function getCityByIP(rs)
		{  
            cityName = rs.name;  
            alert("根据IP定位yww您所在的城市为:" + cityName); 
        }  
  
        function handleError(value) {  
            switch (value.code) 
			{  
                case 1:  
                    alert("位置服务被拒绝");  
                    break;  
                case 2:  
                    alert("暂时获取不到位置信息");  
                    break;  
                case 3:  
                    alert("获取信息超时");  
                    break;  
                case 4:  
                    alert("未知错误");  
                    break;  
            }  
        }  
	 
}

/*
*  在当前城市中搜索地址并显示地图
*
*  mapdivid: 地图显示层的id
*  address:	 地址名 (eg：解放公园)
* 
*/
function find_city_address(mapdivid,address){
	
	var cityname;
	
	//根据IP获取城市  
     var myCity = new BMap.LocalCity();  
     myCity.get(getCityByIP);  
	 
    //根据IP获取城市  
    function getCityByIP(rs)
	{  
         cityname = rs.name;  
         //alert("根据IP定位您所在的yww城市为:" + cityname); 
		 find_area(mapdivid,address,cityname);
    } 
}

/*
*  在指定城市中搜索地址并显示地图
*
*  mapdivid: 地图显示层的id
*  address:	 地址名 (eg：解放公园)
*  cityname: 城市名 
*
*/
function find_area(mapdivid,address,cityname){
	
	//alert("find_area enter!"+mapdivid+' '+address+' '+cityname);

	// 百度地图API功能
    var map = new BMap.Map(mapdivid);
	
	var point = new BMap.Point(116.331398,39.897445);
	map.centerAndZoom(point,12);
	
	// 创建地址解析器实例
	var myGeo = new BMap.Geocoder();
	
	// 将地址解析结果显示在地图上,并调整地图视野
	myGeo.getPoint(address, function(point)
	{
		if (point)
		{
			map.centerAndZoom(point, 16);
		
			var marker = new BMap.Marker(point); 		// 创建标注点
			marker.enableDragging();
			map.addOverlay(marker);    					// 增加标注点
			
			marker.addEventListener("click",attribute);
			
			function attribute(){
				var p = marker.getPosition();  // 获取marker的位置
				//alert("marker的位置是" + p.lng + "," + p.lat);    
			}
		}
		else
		{
			alert("您选择地址没有解析到结果!");
		}
	}, 
	
	cityname);
		
}

$(document).ready(function() {

  $('#idsearch').click(function(event) {	
  		  
		var address = $('#idtxtarea').val(); 
		
		if( !address )
		{
			alert("地址框为空,请输入地址信息");
			$('#idtxtarea').focus();
			return;
		}
		//alert('address:'+address);
		
		/* 在当前城市中搜索地址并显示地图 */
		find_city_address('map',address);
		
		event.stopPropagation(); 
  }); 

	
});



