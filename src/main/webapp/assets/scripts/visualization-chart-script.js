var TUTORIAL_SAVVY = {
	
/*return google visualization data*/
	getvisualizationData : function(jsonData){
	
	 var   point1, point2, dataArray = [],
	 
		   data = new google.visualization.DataTable();
		   
	       data.addColumn('string', 'CauseCode');	      
	       data.addColumn('number', ' ');  
		   
	       data.addColumn({type: 'string',role: 'tooltip','p': {'html': true}});
	       /* for loop code for changing inputdata to 'data' of type google.visualization.DataTable*/
	      $.each(jsonData, function(i,obj){
	    	  
	    	  point1 ="CauseCode : "+ obj.CauseCode +""; 
	    	  
	    	 
	    	  
	    	  dataArray.push([obj.CauseCode,obj.percent,TUTORIAL_SAVVY.returnTooltip(point1)]);
	      });
	      
	     data.addRows(dataArray);
	     
	     return data;
	},
	/*return options for bar chart: these options are for various configuration of chart*/
	
	/*Draws a Bar chart*/	
	drawBarChart : function (inputdata) {

	
		
			  data = TUTORIAL_SAVVY.getvisualizationData(inputdata),
			  
			  chart = new google.visualization.ColumnChart(document.getElementById('student-bar-chart'));
			  
			  chart.draw(data, {width: 1210, height: 666, is3D: true, title: 'FMA Macx incidet data'});
			  /*for redrawing the bar chart on window resize*/
		    $(window).resize(function () {
		    	
		        chart.draw(data,{width: 600, height: 480, is3D: true, title: 'Company Performance'} );
		    });
	 },
	/* Returns a custom HTML tooltip for Visualization chart*/
	 returnTooltip : function(dataPoint1){
	   
		 return "<div style='height:30px;width:150px;font:12px,roboto;padding:15px 5px 5px 5px;border-radius:3px;'>"+
				 "<span style='color:#68130E;font:12px,roboto;padding-right:20px;'>"+dataPoint1+"%</span>"
				 
	 },
	/*Makes ajax call to servlet and download data */
	getStudentData : function(){
		
			$.ajax({
			
				url: "user/Failure_Image",
				
				dataType: "JSON",
				
				success: function(data){
	
					TUTORIAL_SAVVY.drawBarChart(data);
				}
			});
	}
};	

google.load("visualization", "1", {packages:["columnchart"]});
	
/*$(document).ready(function(){
	
	TUTORIAL_SAVVY.getStudentData();
});*/
