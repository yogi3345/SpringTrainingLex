<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="java.text.*"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Infy Go</title>
<%-- <link rel="stylesheet"
	href="<c:url value='/resources/css/jquery-ui.css'/>" type="text/css"
	media="all"> --%>
	
	 <link rel="stylesheet" href="http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<!-- 	 
<link
	href="https://cdn.datatables.net/1.10.15/css/jquery.dataTables.min.css"
	rel="stylesheet" type="text/css"> -->



	<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

	<link rel="stylesheet" href="<c:url value='/resources/css/custom.css'/>"
	type="text/css" media="all">

<link rel="stylesheet"
	href="<c:url value='/resources/css/newstyle.css'/>" type="text/css"
	media="all">
	
	
<!-- 	
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-slider/9.8.1/css/bootstrap-slider.css" />

 -->

<%-- 
	
<link rel="stylesheet"
	href="<c:url value='/resources/css/datatable.min.css'/>" type="text/css"
	media="all">
			
	

	
	<link rel="stylesheet"
	href="<c:url value='/resources/css/slider.css'/>" type="text/css"
	media="all"> --%>
<!-- 	<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> -->
		
		<!-- 


 --%>

<script type="text/javascript" src="//cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<!-- 
 -->

<link rel="stylesheet"
	href="<c:url value='/resources/css/datatable-bootstrap.min.css'/>" type="text/css"
	media="all"/>
	
	<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/datatable.min.js"></script>	
	
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/datatable.jquery.min.js"></script>
	
	
	
 <!-- <script
	src="https://cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"></script>  -->
	
	

<!-- 
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-slider/9.8.1/bootstrap-slider.js"></script>
 -->

	<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap-slider.js"></script> --%>

<style>
.darkgrey {
	color: #ccd1d1;
	/* border-color: #ccd1d1;
	background-color: #ccd1d1;*/
	width: 100%;
}

.departborder {
	border: 5px solid rgb(232, 231, 228);
	background-color: white;
}

.departborder:hover {
	cursor: pointer;
}

.backgroundGrey {
	background-color: rgb(232, 231, 228);
	border-radius: 5px;
	border: 5px solid white;
}

</style>



</head>
<body >

	<jsp:include page="header2.jsp"></jsp:include>
	<div class="container">
	
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h4>Add a Flight</h4>
					</div>
					<spring:message code="addFlight.addFlight" text="default text" /> 
					<div class="panel-body">

	<form:form method="POST" action="addFlight" modelAttribute="command">
		<!-- ADD -->
		 <div class="row">
						<div class="form-group col-sm-offset-1 col-sm-4 text-right fontstyle" >
							<spring:message code="addFlight.flightid" text="default text"
								 />flightId
								 <span style="color: red">*</span>
							</div>
							<div class="col-sm-6">
								<form:input path="flightId" class="form-control" />
								<br> 
								<form:errors path="flightId" />
							</div>
							<br>
						</div>
						
						 <div class="row">
						<div class="form-group col-sm-offset-1 col-sm-4 text-right fontstyle" >
							<spring:message code="addFlight.airlines" text="default text"
								 />airlines
							<span style="color: red">*</span>
							</div>
							<div class="col-sm-6">
								<form:input path="airlines" class="form-control" />
								<br> 
								<form:errors path="airlines" />
							</div>
							<br>
						
						</div>
						 <div class="row">
						<div class="form-group col-sm-offset-1 col-sm-4 text-right fontstyle" >
					
							<spring:message code="addFlight.source"
								text="default text" />source
							<span style="color: red">*</span>
							</div>
							<div class="col-sm-6">
								<form:input path="source" class="form-control" />
								<br> 								<form:errors path="source" />
							</div>
							<br>
						</div>
						 <div class="row">
						<div class="form-group col-sm-offset-1 col-sm-4 text-right fontstyle" >
						
							<spring:message code="addFlight.destination"
								text="default text" />destination
							<span style="color: red">*</span>
							</div>
							<div class="col-sm-6">
								<form:input path="destination" class="form-control" />
								<br> 
								<form:errors path="destination" />
							</div>
							<br>
						</div>
						
						 <div class="row">
						<div class="form-group col-sm-offset-1 col-sm-4 text-right fontstyle" >
					
							<spring:message code="addFlight.fare"
								 text="default text" />fare
							<span style="color: red">*</span>
							</div>
							<div class="col-sm-6">
								<form:input path="fare" class="form-control" />
								<br> 
								<form:errors path="fare" />
							</div>
							<br>
						
						</div>
						 <div class="row">
						<div class="form-group col-sm-offset-1 col-sm-4 text-right fontstyle" >
						
							<spring:message code="addFlight.flightAvailableDate"
							text="default text" />flightAvailableDate
							<span style="color: red">*</span>
						</div>
							<div class="col-sm-6">
								<form:input path="flightAvailableDate" class="form-control" id="datepicker" required="true" />
								<br> 
								<form:errors path="flightAvailableDate" />
							</div>
							<br>
						</div>
						
						<div class="row">
						<div class="form-group col-sm-offset-1 col-sm-4 text-right fontstyle" >
						
							<spring:message code="addFlight.departureTime"
							text="default text" />departureTime
							<span style="color: red">*</span>
						</div>
							<div class="col-sm-6">
								<form:input path="departureTime" class="form-control" maxlength="10" />
								<br> 
								<form:errors path="departureTime" />
							</div>
							<br>
						</div>
						
						<div class="row">
						<div class="form-group col-sm-offset-1 col-sm-4 text-right fontstyle" >
						
							<spring:message code="addFlight.arrivalTime"
							text="default text" />arrivalTime
							<span style="color: red">*</span>
						</div>
							<div class="col-sm-6">
								<form:input path="arrivalTime" class="form-control" maxlength="10" />
								<br> 
								<form:errors path="arrivalTime" />
							</div>
							<br>
						</div>
						
						<div class="row">
						<div class="form-group col-sm-offset-1 col-sm-4 text-right fontstyle" >
						
							<spring:message code="addFlight.seatCount"
							text="default text" />seatCount
							<span style="color: red">*</span>
						</div>
							<div class="col-sm-6">
								<form:input path="seatCount" class="form-control" maxlength="10" />
								<br> 
								<form:errors path="seatCount" />
							</div>
							<br>
						</div>
						
						 <div class="row">
						<div class="form-group col-sm-offset-1 col-sm-3 text-right fontstyle" >
		
						</div>
							<div class="col-sm-6">
								<input type="submit" class="btn btn-primary"
									value="<spring:message code="addFlight.submit"/>"/>${flightId}
																</div>
							<div class="col-md-12 text-center">
            <div class="text-center text-danger">${message}</div>  
            </div></div><br>
            <c:if test="${successMessage ne null}">
				<div class="alert alert-success col-md-12" align="center">${successMessage}
				<br>
				Click<button type="submit" class="btn btn-primary fontfamily" >Submit</button>to add the Flight ${flightId}.
                  </div>
		</c:if>	
	</form:form>
	<div class="col-md-12 text-center">
            <div class="text-center text-danger">${flightId}</div>  
            </div>
					

<%--	<c:if test="${size <=0}">


		<div class="text-center">
			<h2>Sorry !!! There are no flights available for the selected
				Source and Destination...</h2>
		</div>
	</c:if> --%>
	
	
	

				</div>
				</div>
</div>
	<!-- FOOTER -->
	<%-- <footer id="footer">
		<div class="container">


			<div class="row">
				<div class="col-sm-6 col-sm-push-6 footer-social-icons padding-15">
					<span>Follow us:</span> <a href=""><img
						src="<c:url value='/resources/images/fb.png'/>"></img></a> <a href=""><img
						src="<c:url value='/resources/images/gp.png'/>"></img></a> <a href=""><img
						src="<c:url value='/resources/images/yt.png'/>"></img></a> <a href=""><img
						src="<c:url value='/resources/images/t.png'/>"></img></a>
				</div>
				<!-- /SOCIAL ICONS -->
				<div class="col-sm-6 col-sm-pull-6 padding-15">
					<p>
						&copy; 2017 <a href="${pageContext.servletContext.contextPath}">InfyGo</a>. All Rights Reserved.
					</p>
				</div>
			</div>

		</div>
	</footer> --%>
	<jsp:include page="footer.jsp"></jsp:include>
	<!-- /FOOTER -->

	<script type="text/javascript">
  $( document ).ready(function() {
	 
	  
	  $("#datepicker").datepicker({ dateFormat: 'dd-mm-yy' });

 
	  $( "#slider-range" ).slider({
	      range: true,
	      min: 2000,
	      max: 15000,
	      values: [ 3000, 5000 ],
	      slide: function( event, ui ) {
	        $( "#amount" ).html( "Rs." + ui.values[ 0 ] + " - Rs." + ui.values[ 1 ] );
	        
	  
	      }
	      
	    });
	    $( "#amount" ).html( "Rs." + $( "#slider-range" ).slider( "values", 0 ) +
	      " - Rs." + $( "#slider-range" ).slider( "values", 1 ) );
	 
	    $( "#slider-range" ).slider({
	    	  change: function( event, ui ) {
	    		  
	    		  console.log("Rs." + ui.values[ 0 ] + " - Rs." + ui.values[ 1 ]);
	    		  var airlinesarr=[];
	    		  <c:forEach var="listValue" items="${availableFlights}">
	    		  var flightdict={};
	    		  var flid='${listValue.flightId}';
	    		  flightdict.airlines='${listValue.airlines}'+"-"+'${listValue.flightId}';
	    		  //flightdict.flightid='${listValue.flightId}';
	    		  //flightdict.source='${listValue.source}';
	    		//  flightdict.destination='${listValue.destination}';
	    		  //flightdict.flightAvailableDate='${listValue.flightAvailableDate}';
	    		  flightdict.departureTime='${listValue.departureTime}';
	    		  flightdict.arrivalTime='${listValue.arrivalTime}';
	    		  flightdict.seatcount='${listValue.seatCount}';
	    		  flightdict.fare='${listValue.fare}';
	    		  flightdict.book='<a href="bookFlight?flightid='+flid+'">Book</a>';
	    		  airlinesarr.push(flightdict);
	    		      </c:forEach>
	    		      
	    		      
	    			console.log(airlinesarr);
	    			
	    			 
	    			
	    		 
	    		 	var childarray=[];
	    			 $.each(airlinesarr, function( index, value ) {
	    				  	if((value.fare>=ui.values[ 0 ]) && (value.fare<=ui.values[ 1 ]))
	    				  		{childarray.push(value);}
	    				});
	    			console.log("child array price");
	    			console.log(childarray);
	    			 $('#flightDetails').hide();
	    			 $('#flightDetails1').show();
	    			 console.log(childarray);
	    			 var datatable = new DataTable(document.querySelector('#flightDetails1'), {sort: [true, true, true, true,true],
	    				    data:childarray
	    				});
	    		  
	    	  }
	    	}); 
	/*  $("#ex2").on("slide", function(slideEvt) {
			$("#price").text(slideEvt.value);
			var range=slideEvt.value;			
			var min="Rs."+range[0];
			var max="Rs."+range[1];
		$("#min1").html(min);
		$("#max1").html(max);
		
		
		 var airlinesarr=[];
		  <c:forEach var="listValue" items="${availableFlights}">
		  var flightdict={};
		  var flid='${listValue.flightId}';
		  flightdict.airlines='${listValue.airlines}';
		  flightdict.flightid='${listValue.flightId}';
		  flightdict.source='${listValue.source}';
		  flightdict.destination='${listValue.destination}';
		  flightdict.flightAvailableDate='${listValue.flightAvailableDate}';
		  flightdict.departureTime='${listValue.departureTime}';
		  flightdict.seatcount='${listValue.seatCount}';
		  flightdict.fare='${listValue.fare}';
		  flightdict.book='<a href="bookFlight?flightid='+flid+'">Book</a>';
		  airlinesarr.push(flightdict);
		      </c:forEach>
		      
		      
			console.log(airlinesarr);
			
			 
			
		 
		 	var childarray=[];
			 $.each(airlinesarr, function( index, value ) {
				  	if((value.fare>=range[0]) && (value.fare<=range[1]))
				  		{childarray.push(value);}
				});
			console.log("child array price");
			console.log(childarray);
			 $('#flightDetails').hide();
			 $('#flightDetails1').show();
			 console.log(childarray);
			 var datatable = new DataTable(document.querySelector('#flightDetails1'), {sort: [true, true, true, true,true,true,true],
				    data:childarray
				});
			
			
		 	
		}); */
	  
	 $("#dep1").on("click", function() {
		 var airlinesarr=[];
		  <c:forEach var="listValue" items="${availableFlights}">
		  var flightdict={};
		  var flid='${listValue.flightId}';
		  flightdict.airlines='${listValue.airlines}'+'-'+'${listValue.flightId}';
		  /* flightdict.flightid='${listValue.flightId}'; */
		 /*  flightdict.source='${listValue.source}';
		  flightdict.destination='${listValue.destination}';
		  flightdict.flightAvailableDate='${listValue.flightAvailableDate}'; */
		  flightdict.departureTime='${listValue.departureTime}';
		  flightdict.arrivalTime='${listValue.arrivalTime}';
		  flightdict.seatcount='${listValue.seatCount}';
		  flightdict.fare='${listValue.fare}';
		  flightdict.book='<a href="bookFlight?flightid='+flid+'">Book</a>';
		  airlinesarr.push(flightdict);
		      </c:forEach>
		      
		      
			console.log(airlinesarr);
			 
		 	
		 	var childarray=[];
			 $.each(airlinesarr, function( index, value ) {
				 var deptime=value.departureTime;
				 var res = deptime.split(":");
				 console.log(res);
				  	if(res[0]<=12){
				  		childarray.push(value);
				  	}
				  		
				});
			 $('#flightDetails').hide();
			 $('#flightDetails1').show();
			 console.log(childarray);
			 var datatable = new DataTable(document.querySelector('#flightDetails1'), {    sort: [true, true, true, true,true,true,true],
				    data:childarray
				});
			
			});

	 $("#dep2").on("click", function() {
		 
		 var airlinesarr=[];
		  <c:forEach var="listValue" items="${availableFlights}">
		  var flightdict={};
		  var flid='${listValue.flightId}';
		  flightdict.airlines='${listValue.airlines}'+'-'+'${listValue.flightId}';
		  /* flightdict.flightid='${listValue.flightId}'; */
		/*   flightdict.source='${listValue.source}';
		  flightdict.destination='${listValue.destination}';
		  flightdict.flightAvailableDate='${listValue.flightAvailableDate}'; */
		  flightdict.departureTime='${listValue.departureTime}';
		  flightdict.arrivalTime='${listValue.arrivalTime}';
		  flightdict.seatcount='${listValue.seatCount}';
		  flightdict.fare='${listValue.fare}';
		  flightdict.book='<a href="bookFlight?flightid='+flid+'">Book</a>';
		  airlinesarr.push(flightdict);
		      </c:forEach>
		      
		      
			console.log(airlinesarr);
			 
		 	
		 	var childarray=[];
			 $.each(airlinesarr, function( index, value ) {
				 var deptime=value.departureTime;
				 var res = deptime.split(":");
				 console.log(res);
				  	if(res[0]>=12){
				  		childarray.push(value);
				  	}
				  		
				});
			 $('#flightDetails').hide();
			 $('#flightDetails1').show();
			 console.log(childarray);
			 var datatable = new DataTable(document.querySelector('#flightDetails1'), {    sort: [true, true, true, true,true,true,true],
				    data:childarray
				});
			
			});
	 
	 $(".chk").on("click", function(){
		 //adding flight details retrieved from the database to the dictionalry arry just like it is stored in dummydata
		function create(htmlStr) {
    var frag = document.createDocumentFragment(),
        temp = document.createElement('a');
    temp.innerHTML = htmlStr;
    while (temp.firstChild) {
        frag.appendChild(temp.firstChild);
    }
    return frag;
}
		 var airlinesarr=[];
		  <c:forEach var="listValue" items="${availableFlights}">
		  var flightdict={};
		  var flid='${listValue.flightId}';
		  
		 
		  /* flightdict.airlines='${listValue.airlines}';*/
		   flightdict.airlines='${listValue.airlines}'+'-'+'${listValue.flightId}'; 
		  /* flightdict.flightid='${listValue.flightId}'; */
		  /* flightdict.source='${listValue.source}';
		  flightdict.destination='${listValue.destination}';
		  flightdict.flightAvailableDate='${listValue.flightAvailableDate}'; */
		  flightdict.departureTime='${listValue.departureTime}';
		  flightdict.arrivalTime='${listValue.arrivalTime}';		  
		  flightdict.seatcount='${listValue.seatCount}';
		  flightdict.fare='${listValue.fare}';
		  //alert(flid);
		 // alert('<a href="bookFlight?flightid='+'${listValue.flightId}'+'">Book</a>');
		  flightdict.book='<a href="bookFlight?flightid='+flid+'">Book</a>';

		  airlinesarr.push(flightdict);
		      </c:forEach>
		      
		 var $airlines = $('input[name=airlines]:checked');

		 var localarray=[];
		
			 console.log("all flights:");
		  console.log(airlinesarr); //data from database
			
		 if(($airlines.length==0) || ($airlines.length==3))
		 { localarray=airlinesarr;}
		else
			{
			
			console.log("inside else");
			
				if($('#air1').is(':checked'))
					{
					console.log("inside if #air1");
					console.log(airlinesarr);
						$.each(airlinesarr, function( index, value ) {
							console.log(value.airlines);
							console.log(value);
						  	if((value.airlines.indexOf("WingMeIn"))>=0){
						  		/* value.airlines=value.airlines+"-"+flid; */
						  		/* console.log("value is");
						  		console.log(value.airlines.indexOf("WingMeIn"));
						  		console.log(value.airlines);
						  		console.log(value); */
						  		localarray.push(value);
						  		
						  	}
						  			
						});
					}
					  if($('#air2').is(':checked'))
						{
							$.each(airlinesarr, function( index, value ) {
							  	if((value.airlines.indexOf("Aviate"))>=0)
							  			/* value.airlines=value.airlines+"-"+flid; */
							  			localarray.push(value);
							});
						}
					  if($('#air3').is(':checked'))
						{
						  console.log("inside air3");
							$.each(airlinesarr, function( index, value ) {
							  	if((value.airlines.indexOf("FlyWithMe"))>=0)
							  			/* value.airlines=value.airlines+"-"+flid; */
							  			localarray.push(value);
							});
						}
					 
					  console.log(localarray);
				
			}
	
		 $('#flightDetails').hide();
		 $('#flightDetails1').show();
	
		 
		// console.log(localarray) //This retreives the flight details from the database correctly
		// alert($('#air1').is(':checked'));
		 var datatable = new DataTable(document.querySelector('#flightDetails1'), {    sort: [true, true, true, true,true,true,true],
			    data:localarray
			});
		 
	 });
			
			
			
			
			

  
  });
  </script>


</body>

</html>
