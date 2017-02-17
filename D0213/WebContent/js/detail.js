$(document).ready(function(){
	  $('#delete').click(function(){
		  var id=$('#num').text();
		  
		   location.href="http://localhost:8080/D0216/board/delete.jsp?id="+id;
	  });
	  
	  $('#modify').on('click', function(){
		    var id=$('#num').text();
		    location.href="http://localhost:8080/D0216/board/modify.jsp?id="+id;
	  });
	
	
	
});