<!DOCTYPE html>
<html>
<head>
	<title>Detail Admin - Form Wizard</title>
    
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	
    <!-- bootstrap -->
    <link href="../../WEB-INF/jsp/detail/css/bootstrap/bootstrap.css" rel="stylesheet" />
    <link href="../../WEB-INF/jsp/detail/css/bootstrap/bootstrap-responsive.css" rel="stylesheet" />
    <link href="../../WEB-INF/jsp/detail/css/bootstrap/bootstrap-overrides.css" type="text/css" rel="stylesheet" />

    <!-- libraries -->
    <link href="../../WEB-INF/jsp/detail/css/lib/bootstrap-wysihtml5.css" type="text/css" rel="stylesheet" />
    <link href="../../WEB-INF/jsp/detail/css/lib/uniform.default.css" type="text/css" rel="stylesheet" />
    <link href="../../WEB-INF/jsp/detail/css/lib/select2.css" type="text/css" rel="stylesheet" />
    <link href="../../WEB-INF/jsp/detail/css/lib/bootstrap.datepicker.css" type="text/css" rel="stylesheet" />
    <link href="../../WEB-INF/jsp/detail/css/lib/font-awesome.css" type="text/css" rel="stylesheet" />

    <!-- global styles -->
    <link rel="stylesheet" type="text/css" href="../../../css/detail/layout.css" />
    <link rel="stylesheet" type="text/css" href="../../../css/detail/elements.css" />
    <link rel="stylesheet" type="text/css" href="../../../css/detail/icons.css" />
    
    <!-- this page specific styles -->
    <link rel="stylesheet" href="../../WEB-INF/jsp/detail/css/compiled/form-wizard.css" type="text/css" media="screen" />

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
            <li class="active">
                <a class="dropdown-toggle" href="#">
                    <div class="pointer">
                        <div class="arrow"></div>
                        <div class="arrow_border"></div>
                    </div>
                    <i class="icon-edit"></i>
                    <span>Forms</span>
                    <i class="icon-chevron-down"></i>
                </a>
                <ul class="active submenu">
                    <li><a href="form-showcase.html">Form showcase</a></li>
                    <li><a href="form-wizard.html" class="active">Form wizard</a></li>
                </ul>
            </li>
            <li>
                <a href="gallery.html">
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
            <div id="pad-wrapper">
                <!-- <div class="row-fluid head">
                    <div class="span12">
                        <h4>Form wizard</h4>
                    </div>
                </div> -->

                <div class="row-fluid">
                    <div class="span12">
                        <div id="fuelux-wizard" class="wizard row-fluid">
                            <ul class="wizard-steps">
                                <li data-target="#step1" class="active">
                                    <span class="step">1</span>
                                    <span class="title">General <br /> information</span>
                                </li>
                                <li data-target="#step2">
                                    <span class="step">2</span>
                                    <span class="title">Address <br /> information</span>
                                </li>
                                <li data-target="#step3">
                                    <span class="step">3</span>
                                    <span class="title">User <br /> settings</span>
                                </li>
                                <li data-target="#step4">
                                    <span class="step">4</span>
                                    <span class="title">Payment <br /> info</span>
                                </li>
                            </ul>                            
                        </div>
                        <div class="step-content">
                            <div class="step-pane active" id="step1">
                                <div class="row-fluid form-wrapper">
                                    <div class="span8">
                                        <form />
                                            <div class="field-box">
                                                <label>Name:</label>
                                                <input class="span8" type="text" />
                                            </div>
                                            <div class="field-box error">
                                                <label>Company:</label>
                                                <input class="span8" type="text" />
                                                <span class="alert-msg"><i class="icon-remove-sign"></i> Please enter your company</span>
                                            </div>
                                            <div class="field-box">
                                                <label>Email:</label>
                                                <input class="span8" type="text" />
                                            </div>
                                            <div class="field-box success">
                                                <label>Username:</label>
                                                <input class="span8" type="text" />
                                                <span class="alert-msg"><i class="icon-ok-sign"></i> Username available</span>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                            <div class="step-pane" id="step2">
                                <div class="row-fluid form-wrapper">
                                    <div class="span8">
                                        <form />
                                            <div class="field-box">
                                                <label>Address:</label>
                                                <input class="span8" type="text" />
                                            </div>
                                            <div class="field-box">
                                                <label>City:</label>
                                                <input class="span8" type="text" />
                                            </div>
                                            <div class="field-box">
                                                <label>Postal/ZIP code:</label>
                                                <input class="span8" type="text" />
                                            </div>
                                            <div class="field-box">
                                                <label>Country:</label>
                                                <input class="span8" type="text" />
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                            <div class="step-pane" id="step3">
                                <div class="row-fluid form-wrapper">
                                    <div class="span8">
                                        <form />
                                            <div class="field-box">
                                                <label>Username:</label>
                                                <input class="span8" type="text" />
                                            </div>
                                            <div class="field-box">
                                                <label>Photo:</label>
                                                <input type="file" />
                                            </div>
                                            <div class="field-box">
                                                <label>App name:</label>
                                                <input class="span8" type="text" />
                                            </div>
                                            <div class="field-box">
                                                <label>Time zone:</label>
                                                <select>
                                                    <option value="Hawaii" />(GMT-10:00) Hawaii
                                                    <option value="Alaska" />(GMT-09:00) Alaska
                                                    <option value="Pacific Time (US &amp; Canada)" />(GMT-08:00) Pacific Time (US &amp; Canada)
                                                    <option value="Arizona" />(GMT-07:00) Arizona
                                                    <option value="Mountain Time (US &amp; Canada)" />(GMT-07:00) Mountain Time (US &amp; Canada)
                                                    <option value="Central Time (US &amp; Canada)" />(GMT-06:00) Central Time (US &amp; Canada)
                                                    <option value="Eastern Time (US &amp; Canada)" />(GMT-05:00) Eastern Time (US &amp; Canada)
                                                    <option value="Indiana (East)" />(GMT-05:00) Indiana (East)<option value="" disabled="disabled" />-------------
                                                    <option value="American Samoa" />(GMT-11:00) American Samoa
                                                    <option value="International Date Line West" />(GMT-11:00) International Date Line West
                                                    <option value="Midway Island" />(GMT-11:00) Midway Island
                                                </select>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                            <div class="step-pane" id="step4">
                                <div class="row-fluid form-wrapper payment-info">
                                    <div class="span8">
                                        <form />
                                            <div class="field-box">
                                                <label>Subscription Plan:</label>
                                                <select id="plan" class="span5">
                                                    <option value="66" />Basic - $2.99/month (USD)
                                                    <option value="67" />Pro - $9.99/month (USD)
                                                    <option value="68" />Premium - $49.99/month (USD)
                                                </select>
                                            </div>
                                            <div class="field-box">
                                                <label>Credit Card Number:</label>
                                                <input class="span5" type="text" />
                                            </div>
                                            <div class="field-box">
                                                <label>Expiration:</label>
                                                <input style="width:60px;" placeholder="MM" type="text" /> 
                                                &nbsp; / &nbsp;
                                                <input style="width:85px;" placeholder="YYYY" type="text" />
                                            </div>
                                            <div class="field-box">
                                                <label>Card CVC Number:</label>
                                                <input class="span4" type="text" />
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="wizard-actions">
                            <button type="button" disabled="" class="btn-glow primary btn-prev"> 
                                <i class="icon-chevron-left"></i> Prev
                            </button>
                            <button type="button" class="btn-glow primary btn-next" data-last="Finish">
                                Next <i class="icon-chevron-right"></i>
                            </button>
                            <button type="button" class="btn-glow success btn-finish">
                                Setup your account!
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- end main container -->

	<!-- scripts for this page -->
    <script src="../../../js/detail/jquery-latest.js"></script>
    <script src="../../../js/detail/bootstrap.min.js"></script>
    <script src="../../../js/detail/theme.js"></script>
    <script src="../../../js/detail/fuelux.wizard.js"></script>

    <script type="text/javascript">
        $(function () {
            var $wizard = $('#fuelux-wizard'),
                $btnPrev = $('.wizard-actions .btn-prev'),
                $btnNext = $('.wizard-actions .btn-next'),
                $btnFinish = $(".wizard-actions .btn-finish");

            $wizard.wizard().on('finished', function(e) {
                // wizard complete code
            }).on("changed", function(e) {
                var step = $wizard.wizard("selectedItem");
                // reset states
                $btnNext.removeAttr("disabled");
                $btnPrev.removeAttr("disabled");
                $btnNext.show();
                $btnFinish.hide();

                if (step.step === 1) {
                    $btnPrev.attr("disabled", "disabled");
                } else if (step.step === 4) {
                    $btnNext.hide();
                    $btnFinish.show();
                }
            });

            $btnPrev.on('click', function() {
                $wizard.wizard('previous');
            });
            $btnNext.on('click', function() {
                $wizard.wizard('next');
            });
        });
    </script>

</body>
</html>