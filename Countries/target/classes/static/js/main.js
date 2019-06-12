/**
 * 
 */


$(document).ready(function() {
	
	$('.nBtn, .table .eBtn').on('click', function(event) {
		
		event.preventDefault();
		
		var href= $(this).attr('href');
		var text = $(this).text();

		if(text=='Edit') {
		$.get(href,function(country,status){
			$('.myForm #id').val(country.id);
			$('.myForm #name').val(country.name);
			$('.myForm #capital').val(country.capital);
			$('.myForm #subBtn').val("Edit and Save")
		});
		
		$('.myForm #exampleModal').modal();
		} else {
			$('.myForm #name').val('');
			$('.myForm #capital').val('');
			$('.myForm #exampleModal').modal();
			$('.myForm #subBtn').val("Create New")


		}
	});
	
	$('.myForm #subBtn').on('click', function(event) {
		
		event.preventDefault();
		
		var text = $(this).val();
		
		console.log(text);
		
		if (text=="Create New") {
			//$("#modalForm").setAttribute("method", "post");
			$("#modalForm").attr("action", "/save");
			$("#modalForm").submit();

		} 
		
		else {
			
			//$("#modalForm").setAttribute("method", "put");
			$("#modalForm").attr("action", "/update");
//			$("#modalForm").attr("method", "PUT");
//		    $("#modalForm").attr("action", "/update");
			$("#modalForm").submit();

		}
		
	});


});

