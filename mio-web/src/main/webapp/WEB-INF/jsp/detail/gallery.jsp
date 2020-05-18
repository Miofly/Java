<!DOCTYPE html>
<html>
<head>
	<title>Detail Admin - Gallery</title>
    
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	
    <!-- bootstrap -->
    <link href="../../WEB-INF/jsp/detail/css/bootstrap/bootstrap.css" rel="stylesheet" />
    <link href="../../WEB-INF/jsp/detail/css/bootstrap/bootstrap-responsive.css" rel="stylesheet" />
    <link href="../../WEB-INF/jsp/detail/css/bootstrap/bootstrap-overrides.css" type="text/css" rel="stylesheet" />

    <!-- global styles -->
    <link rel="stylesheet" type="text/css" href="../../../css/detail/layout.css" />
    <link rel="stylesheet" type="text/css" href="../../../css/detail/elements.css" />
    <link rel="stylesheet" type="text/css" href="../../../css/detail/icons.css" />

    <!-- libraries -->
    <link href="../../WEB-INF/jsp/detail/css/lib/font-awesome.css" type="text/css" rel="stylesheet" />
    
    <!-- this page specific styles -->
    <link rel="stylesheet" href="../../WEB-INF/jsp/detail/css/compiled/gallery.css" type="text/css" media="screen" />

    <!-- open sans font 
    <link href='http://fonts.useso.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css' />-->

    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
<body>

    <!-- navbar -->
    <div class="navbar navbar-inverse">
        <div class="navbar-inner">
            <button type="button" class="btn btn-navbar visible-phone" id="menu-toggler">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            
            <a class="brand" href="index.html"><img src="../../WEB-INF/jsp/detail/img/logo.png" /></a>

            <ul class="nav pull-right">                
                <li class="hidden-phone">
                    <input class="search" type="text" />
                </li>
                <li class="notification-dropdown hidden-phone">
                    <a href="#" class="trigger">
                        <i class="icon-warning-sign"></i>
                        <span class="count">8</span>
                    </a>
                    <div class="pop-dialog">
                        <div class="pointer right">
                            <div class="arrow"></div>
                            <div class="arrow_border"></div>
                        </div>
                        <div class="body">
                            <a href="#" class="close-icon"><i class="icon-remove-sign"></i></a>
                            <div class="notifications">
                                <h3>You have 6 new notifications</h3>
                                <a href="#" class="item">
                                    <i class="icon-signin"></i> New user registration
                                    <span class="time"><i class="icon-time"></i> 13 min.</span>
                                </a>
                                <a href="#" class="item">
                                    <i class="icon-signin"></i> New user registration
                                    <span class="time"><i class="icon-time"></i> 18 min.</span>
                                </a>
                                <a href="#" class="item">
                                    <i class="icon-envelope-alt"></i> New message from Alejandra
                                    <span class="time"><i class="icon-time"></i> 28 min.</span>
                                </a>
                                <a href="#" class="item">
                                    <i class="icon-signin"></i> New user registration
                                    <span class="time"><i class="icon-time"></i> 49 min.</span>
                                </a>
                                <a href="#" class="item">
                                    <i class="icon-download-alt"></i> New order placed
                                    <span class="time"><i class="icon-time"></i> 1 day.</span>
                                </a>
                                <div class="footer">
                                    <a href="#" class="logout">View all notifications</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </li>
                <li class="notification-dropdown hidden-phone">
                    <a href="#" class="trigger">
                        <i class="icon-envelope-alt"></i>
                    </a>
                    <div class="pop-dialog">
                        <div class="pointer right">
                            <div class="arrow"></div>
                            <div class="arrow_border"></div>
                        </div>
                        <div class="body">
                            <a href="#" class="close-icon"><i class="icon-remove-sign"></i></a>
                            <div class="messages">
                                <a href="#" class="item">
                                    <img src="../../WEB-INF/jsp/detail/img/contact-img.png" class="display" />
                                    <div class="name">Alejandra Galván</div>
                                    <div class="msg">
                                        There are many variations of available, but the majority have suffered alterations.
                                    </div>
                                    <span class="time"><i class="icon-time"></i> 13 min.</span>
                                </a>
                                <a href="#" class="item">
                                    <img src="../../WEB-INF/jsp/detail/img/contact-img2.png" class="display" />
                                    <div class="name">Alejandra Galván</div>
                                    <div class="msg">
                                        There are many variations of available, have suffered alterations.
                                    </div>
                                    <span class="time"><i class="icon-time"></i> 26 min.</span>
                                </a>
                                <a href="#" class="item last">
                                    <img src="../../WEB-INF/jsp/detail/img/contact-img.png" class="display" />
                                    <div class="name">Alejandra Galván</div>
                                    <div class="msg">
                                        There are many variations of available, but the majority have suffered alterations.
                                    </div>
                                    <span class="time"><i class="icon-time"></i> 48 min.</span>
                                </a>
                                <div class="footer">
                                    <a href="#" class="logout">View all messages</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle hidden-phone" data-toggle="dropdown">
                        Your account
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="personal-info.html">Personal info</a></li>
                        <li><a href="#">Account settings</a></li>
                        <li><a href="#">Billing</a></li>
                        <li><a href="#">Export your data</a></li>
                        <li><a href="#">Send feedback</a></li>
                    </ul>
                </li>
                <li class="settings hidden-phone">
                    <a href="personal-info.html" role="button">
                        <i class="icon-cog"></i>
                    </a>
                </li>
                <li class="settings hidden-phone">
                    <a href="signin.html" role="button">
                        <i class="icon-share-alt"></i>
                    </a>
                </li>
            </ul>            
        </div>
    </div>
    <!-- end navbar -->

    <!-- sidebar -->
    <div id="sidebar-nav">
        <ul id="dashboard-menu">
            <li>                
                <a href="index.html">
                    <i class="icon-home"></i>
                    <span>Home</span>
                </a>
            </li>            
            <li>
                <a href="chart-showcase.html">                    
                    <i class="icon-signal"></i>
                    <span>Charts</span>
                </a>
            </li>
            <li>
                <a class="dropdown-toggle" href="#">
                    <i class="icon-group"></i>
                    <span>Users</span>
                    <i class="icon-chevron-down"></i>
                </a>
                <ul class="submenu">
                    <li><a href="user-list.html">User list</a></li>
                    <li><a href="new-user.html">New user form</a></li>
                    <li><a href="user-profile.html">User profile</a></li>
                </ul>
            </li>
            <li>
                <a class="dropdown-toggle" href="#">
                    <i class="icon-edit"></i>
                    <span>Forms</span>
                    <i class="icon-chevron-down"></i>
                </a>
                <ul class="submenu">
                    <li><a href="form-showcase.html">Form showcase</a></li>
                    <li><a href="form-wizard.html">Form wizard</a></li>
                </ul>
            </li>
            <li class="active">
                <a href="gallery.html">
                    <div class="pointer">
                        <div class="arrow"></div>
                        <div class="arrow_border"></div>
                    </div>
                    <i class="icon-picture"></i>
                    <span>Gallery</span>
                </a>
            </li>
            <li>
                <a href="calendar.html">                    
                    <i class="icon-calendar-empty"></i>
                    <span>Calendar</span>
                </a>
            </li>
            <li>
                <a href="tables.html">
                    <i class="icon-th-large"></i>
                    <span>Tables</span>
                </a>
            </li>
            <li>
                <a class="dropdown-toggle ui-elements" href="#">
                    <i class="icon-code-fork"></i>
                    <span>UI Elements</span>
                    <i class="icon-chevron-down"></i>
                </a>
                <ul class="submenu">
                    <li><a href="ui-elements.html">UI Elements</a></li>
                    <li><a href="icons.html">Icons</a></li>
                </ul>
            </li>
            <li>
                <a href="personal-info.html">
                    <i class="icon-cog"></i>
                    <span>My Info</span>
                </a>
            </li>
            <li>
                <a class="dropdown-toggle" href="#">
                    <i class="icon-share-alt"></i>
                    <span>Extras</span>
                    <i class="icon-chevron-down"></i>
                </a>
                <ul class="submenu">
                    <li><a href="code-editor.html">Code editor</a></li>
                    <li><a href="grids.html">Grids</a></li>
                    <li><a href="signin.html">Sign in</a></li>
                    <li><a href="signup.html">Sign up</a></li>
                </ul>
            </li>
        </ul>
    </div>
    <!-- end sidebar -->


	<!-- main container -->
    <div class="content">
        
        <!-- settings changer -->
        <div class="skins-nav">
            <a href="#" class="skin first_nav selected">
                <span class="icon"></span><span class="text">Default</span>
            </a>
            <a href="#" class="skin second_nav" data-file="css/skins/dark.css">
                <span class="icon"></span><span class="text">Dark skin</span>
            </a>
        </div>
        
        <div class="container-fluid">
            <div id="pad-wrapper" class="gallery">
                <div class="row-fluid header">
                    <h3>Gallery</h3>                    
                </div>

                <!-- gallery wrapper -->
                <div class="gallery-wrapper">
                    <div class="row gallery-row">
                        <!-- single image -->
                        <div class="span3 img-container">
                            <div class="img-box">
                                <span class="icon edit">
                                    <i class="gallery-edit"></i>
                                </span>
                                <span class="icon trash">
                                    <i class="gallery-trash"></i>
                                </span>
                                <img src="../../WEB-INF/jsp/detail/img/gallery3.jpg" />
                                <p class="title">
                                    Beach pic title
                                </p>
                            </div>
                        </div>
                        <!-- single image -->
                        <div class="span3 img-container">
                            <div class="img-box">
                                <span class="icon edit">
                                    <i class="gallery-edit"></i>
                                </span>
                                <span class="icon trash">
                                    <i class="gallery-trash"></i>
                                </span>
                                <img src="../../WEB-INF/jsp/detail/img/gallery2.jpg" />
                                <p class="title">
                                    Beach pic title 2 
                                </p>
                            </div>
                        </div>
                        <!-- single image -->
                        <div class="span3 img-container">
                            <div class="img-box">
                                <span class="icon edit">
                                    <i class="gallery-edit"></i>
                                </span>
                                <span class="icon trash">
                                    <i class="gallery-trash"></i>
                                </span>
                                <img src="../../WEB-INF/jsp/detail/img/gallery1.jpg" />
                                <p class="title">
                                    Beach pic title 3
                                </p>
                            </div>
                        </div>
                        <!-- single image -->
                        <div class="span3 img-container">
                            <div class="img-box">
                                <span class="icon edit">
                                    <i class="gallery-edit"></i>
                                </span>
                                <span class="icon trash">
                                    <i class="gallery-trash"></i>
                                </span>
                                <img src="../../WEB-INF/jsp/detail/img/gallery3.jpg" />
                                <p class="title">
                                    Beach pic title
                                </p>
                            </div>
                        </div> 
                        <!-- single image -->
                        <div class="span3 img-container">
                            <div class="img-box">
                                <span class="icon edit">
                                    <i class="gallery-edit"></i>
                                </span>
                                <span class="icon trash">
                                    <i class="gallery-trash"></i>
                                </span>
                                <img src="../../WEB-INF/jsp/detail/img/gallery2.jpg" />
                                <p class="title">
                                    Beach pic title 2 
                                </p>
                            </div>
                        </div>

                        <!-- new image button -->
                        <div class="span3 new-img">
                            <img src="../../WEB-INF/jsp/detail/img/new-gallery-img.png" />
                        </div>


                        <!-- edit image pop up -->
                        <div class="popup">
                            <div class="pointer">
                                <div class="arrow"></div>
                                <div class="arrow_border"></div>
                            </div>
                            <i class="close-pop table-delete"></i>
                            <h5>Edit Image</h5>
                            <div class="thumb">
                                <img src="../../WEB-INF/jsp/detail/img/gallery-preview.jpg" />
                            </div>
                            <div class="title">
                                <input type="text" class="inline-input" placeholder="Title" />
                                <div class="ui-select">
                                    <select>
                                      <option />Category
                                      <option />Mountains
                                      <option />Lake and rivers
                                    </select>
                                </div>
                            </div>
                            <div class="description">
                                <h6>Description</h6>
                                <textarea></textarea>
                                <input type="submit" value="Save" class="btn-glow primary" />
                            </div>
                        </div>

                    </div>
                </div>
                <!-- end gallery wrapper -->

                <!-- blank state -->
                 <div class="no-gallery">
                    <div class="row-fluid header">
                        <h3>Gallery Blank State</h3>
                    </div>
                    <div class="center">
                        <img src="../../WEB-INF/jsp/detail/img/no-img-gallery.png" />
                        <h6>You don't have any images</h6>
                        <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form</p>
                        <a class="btn-glow primary">Add new image</a>
                    </div>
                </div>
                <!-- end blank state -->
            </div>
        </div>
    </div>
    <!-- end main container -->


	<!-- this page scripts -->
    <script src="../../../js/detail/jquery-latest.js"></script>
    <script src="../../../js/detail/bootstrap.min.js"></script>
    <script src="../../../js/detail/theme.js"></script>

</body>
</html>