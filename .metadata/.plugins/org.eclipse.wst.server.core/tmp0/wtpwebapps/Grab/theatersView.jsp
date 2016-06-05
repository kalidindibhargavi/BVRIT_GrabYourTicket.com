<!DOCTYPE html>
<html lang="en">
<head>
  <!-- Theme Made By www.w3schools.com - No Copyright -->
  <title>Bootstrap </title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <link href="http://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <link href="http://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
  body {
      font: 400 15px/1.8 Lato, sans-serif;
      background-color: black;
      color: #777;
  }
  h3, h4 {
      margin: 10px 0 30px 0;
      letter-spacing: 10px;      
      font-size: 20px;
      color: #111;
  }
  .container {
      padding: 80px 120px;
  }
  .person {
      border: 10px solid transparent;
      margin-bottom: 25px;
      width: 80%;
      height: 80%;
      opacity: 0.7;
  }
  .person:hover {
      border-color: #f1f1f1;
  }
  .carousel-inner img {
      -webkit-filter: grayscale(90%);
      filter: grayscale(80%); /* make all photos black and white */ 
      width: 100%; /* Set width to 100% */
      margin: auto;
  }
  .carousel-caption h3 {
      color: #fff !important;
  }
  @media (max-width: 500px) {
    .carousel-caption {
      display: none; /* Hide the carousel text when the screen is less than 600 pixels wide */
    }
  }
  .bg-1 {
      background: #2d2d30;
      color: #bdbdbd;
  }
  .bg-1 h3 {color: #fff;}
  .bg-1 p {font-style: italic;}
  .list-group-item:first-child {
      border-top-right-radius: 0;
      border-top-left-radius: 0;
  }
  .list-group-item:last-child {
      border-bottom-right-radius: 0;
      border-bottom-left-radius: 0;
  }
  .thumbnail {
      padding: 0 0 15px 0;
      border: none;
      border-radius: 0;
  }
  .thumbnail p {
      margin-top: 15px;
      color: #555;
  }
  .btn {
      padding: 10px 20px;
      background-color: #333;
      color: #f1f1f1;
      border-radius: 0;
      transition: .2s;
  }
  .btn:hover, .btn:focus {
      border: 1px solid #333;
      background-color: #fff;
      color: #000;
  }
  .modal-header, h4, .close {
      background-color: #333;
      color: #fff !important;
      text-align: center;
      font-size: 30px;
  }
  .modal-header, .modal-body {
      padding: 40px 50px;
  }
  .nav-tabs li a {
      color: #777;
  }
  #googleMap {
      width: 100%;
      height: 400px;
      -webkit-filter: grayscale(100%);
      filter: grayscale(100%);
  }  
  .navbar {
      font-family: Montserrat, sans-serif;
      margin-bottom: 0;
      background-color: #2d2d30;
      border: 0;
      font-size: 11px !important;
      letter-spacing: 4px;
      opacity: 0.9;
  }
  .navbar li a, .navbar .navbar-brand { 
      color: #d5d5d5 !important;
  }
  .navbar-nav li a:hover {
      color: #fff !important;
  }
  .navbar-nav li.active a {
      color: #fff !important;
      background-color: #29292c !important;
  }
  .navbar-default .navbar-toggle {
      border-color: transparent;
  }
  .open .dropdown-toggle {
      color: #fff;
      background-color: #555 !important;
  }
  .dropdown-menu li a {
      color: #000 !important;
  }
  .dropdown-menu li a:hover {
      background-color: transparent !important;
  }
  footer {
      background-color: #2d2d30;
      color: #f5f5f5;
      padding: 32px;
  }
  footer a {
      color: #f5f5f5;
  }
  footer a:hover {
      color: #777;
      text-decoration: none;
  }  
  .form-control {
      border-radius: 0;
  }
  textarea {
      resize: none;
  }
  </style>
  
  
  <script type="text/javascript">
	var datefield = document.createElement("span")
	datefield.setAttribute("type", "date")
	if (datefield.type != "date") {
		document
				.write('<link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" />\n')
		document
				.write('<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"><\/script>\n')
		document
				.write('<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"><\/script>\n')
	}
</script>
<script>
	if (datefield.type != "date") {
		jQuery(function($) {
			$('#date').datepicker({
				dateFormat : 'yy/mm/dd',
				maxDate : "+6d",
				minDate : "-0d"
			});
		})
	}
	
	/* $('#psw').validate({rules: {
        id_material : {
            required : true,
            maxNumber : "+5",
            minNumber : "+0"
        }
    } }*/);
</script>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">

<div class="container">
  <div class="panel panel-default">
  <h3>Select date</h3><input type=date placeholder="Select Date" id=date style="width: 300px" name="date">
  <!-- <button type="button"  id = date style = "width:300px"  name =date class="btn btn-default btn-sm">
          <span class="glyphicon glyphicon-calendar"></span> Calendar
        </button>
   -->   
    
  </div>
</div>
<!-- theatre list stars here -->

<div>
			<!--<form action = "ReserveController">-->
<table align="center" class="table table-bordered table-stripped" >
<tr><th>Theater Name</th><th colspan=4 align="center">Timings</th><th></th></tr>
<tr><td id="theater"><a href = "https://www.google.co.in/maps/place/Prasads+Large+Screen/@17.41287,78.4637323,17z/data=!3m1!4b1!4m5!3m4!1s0x3bcb975afb4afadd:0xf89ea8407df6c84!8m2!3d17.41287!4d78.465921?hl=en">Prasads-Imax</a></td><td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">11:30</label>
    </div></td><td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">3:15</label>
    </div></td>
    <td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">6:00</label>
    </div></td>
    <td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">9:15</label>
    </div></td>
   <td><button class="btn" data-toggle="modal" data-target="#myModal">BOOK</button></td></tr>
   
              <tr><td id="theater"><a href ="https://www.google.co.in/maps/place/Cinepolis+Multiplex+Cinema+Hall/@17.4130317,78.3956976,12z/data=!3m1!5s0x3bcb918d014210af:0xa0e81c6667b666c4!4m8!1m2!2m1!1sCinepolies!3m4!1s0x3bcb918cfe52a909:0xbb6f8f917c1d8997!8m2!3d17.4897758!4d78.3932155?hl=en">Cinepolies</a></td><td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">11:30</label>
    </div></td><td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">3:15</label>
    </div></td>
    <td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">6:00</label>
    </div></td>
    <td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">9:15</label>
    </div></td>
    <td><button class="btn" data-toggle="modal" data-target="#myModal">BOOK</button></td></tr>
    <tr><td id="theater"><a href = "https://www.google.co.in/maps/place/Forum+Sujana+Mall/@17.4841317,78.3866975,17z/data=!3m1!4b1!4m5!3m4!1s0x3bcb91892fad42ab:0x45a52c5555381afb!8m2!3d17.4841317!4d78.3888862?hl=en">Forum-Mall</a></td><td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">11:30</label>
    </div></td><td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">3:15</label>
    </div></td>
    <td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">6:00</label>
    </div></td>
    <td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">9:15</label>
    </div></td>
    <td><button class="btn" data-toggle="modal" data-target="#myModal">BOOK</button></td></tr>
    <tr><td id="theater"><a href = "https://www.google.co.in/maps/place/inorbit/@17.4410185,78.3898927,17z/data=!3m1!4b1!4m5!3m4!1s0x3bcb915c65fa9953:0xcfa71f78431e5be3!8m2!3d17.4410185!4d78.3920814?hl=en">Inorbit-Mall</a></td><td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">11:30</label>
    </div></td><td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">3:15</label>
    </div></td>
    <td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">6:00</label>
    </div></td>
    <td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">9:15</label>
    </div></td>
    <td><button class="btn" data-toggle="modal" data-target="#myModal">BOOK</button></td></tr>
    <tr><td id="theater"><a href ="https://www.google.co.in/maps/place/GVK+One/@17.4192183,78.4463622,17z/data=!3m1!4b1!4m5!3m4!1s0x3bcb9736975c54b9:0xb24847634360df71!8m2!3d17.4192183!4d78.4485509?hl=en">GVK One Mall</a></td><td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">11:30</label>
    </div></td><td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">3:15</label>
    </div></td>
    <td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">6:00</label>
    </div></td>
    <td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">9:15</label>
    </div></td>
    <td><button class="btn" data-toggle="modal" data-target="#myModal">BOOK</button></td></tr>
    <tr><td id="theater"><a href ="https://www.google.co.in/maps/place/Cine+Planet+Multiplex/@17.5294398,78.4835977,17z/data=!3m1!4b1!4m5!3m4!1s0x3bcb8551cc2375ed:0x365b2d3362aa5e02!8m2!3d17.5294398!4d78.4857864?hl=en">CinePlanet</a></td><td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">11:30</label>
    </div></td><td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">3:15</label>
    </div></td>
    <td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">6:00</label>
    </div></td>
    <td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">9:15</label>
    </div></td>
    <td><button class="btn" data-toggle="modal" data-target="#myModal">BOOK</button></td></tr>
    <tr><td id="theater"><a href ="https://www.google.co.in/maps/place/Asian+GPR+Multiplex/@17.4508945,78.4111155,12z/data=!4m8!1m2!2m1!1sAsian+Multiplex!3m4!1s0x3bcb91f14f7f035f:0xa323880995867fd7!8m2!3d17.49918!4d78.390627?hl=en">Asian Multiplex</a></td><td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">11:30</label>
    </div></td><td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">3:15</label>
    </div></td>
    <td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">6:00</label>
    </div></td>
    <td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">9:15</label>
    </div></td>
    <td><button class="btn" data-toggle="modal" data-target="#myModal">BOOK</button></td></tr>
    <tr><td id="theater"><a href="https://www.google.co.in/maps/place/PVR+Cinemas/@17.4231815,78.4254997,17z/data=!3m1!4b1!4m5!3m4!1s0x3bcb96d53d111d4b:0x471f8bcb641699a7!8m2!3d17.4231815!4d78.4276884?hl=en">PVR Cinemas</a></td><td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">11:30</label>
    </div></td><td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">3:15</label>
    </div></td>
    <td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">6:00</label>
    </div></td>
    <td id = "time"><div class="radio">
      <label><input type="radio" name="optradio">9:15</label>
    </div></td>
    <td><button class="btn" data-toggle="modal" data-target="#myModal">BOOK</button></td></tr>
    
</table>
<!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!--  modal content-->
     <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">�</button>
          <h4><span class="glyphicon glyphicon-lock"></span> Tickets</h4>
        </div>
        <div class="modal-body">
          <form role="form">
            <div class="form-group">
              <label for="psw"><span class="glyphicon glyphicon-shopping-cart"></span>enter number of persons</label>
              <input type="number" min="1" max="6" class="form-control" id="psw" placeholder="How many?">
             </div>
              <a href="SeatsView.jsp" class="btn btn-info" role="button">Proceed</a>
   
                        </form>
        </div>
 

<div class=well-lg size=70px style="background-color: #313637">
</div>
</div>
</body>
</html>