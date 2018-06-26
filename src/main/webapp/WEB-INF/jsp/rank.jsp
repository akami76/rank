<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>왜 떴지?</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.7 -->
    <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="bower_components/font-awesome/css/font-awesome.min.css">

    <!-- Theme style -->
    <link rel="stylesheet" href="dist/css/AdminLTE.css">
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
    <link rel="stylesheet" href="dist/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="dist/css/swiper.min.css">


    <!-- Google Font -->
</head>
<style>
    #cloud {
        width: 100%;
        height: 50px;
    }

    a link{

    }

    .news_box {
        -webkit-transform: translate(0, 0);
        -ms-transform: translate(0, 0);
        -o-transform: translate(0, 0);
        transform: translate(0, 0);
        padding: 0px;
        font-size :12px;
    }

    .new_title{
        position: relative;
        border-radius: 3px;
        background: #ffffff;
        border-bottom: 1px solid #00a65a;
        width: 100%;
        box-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
        margin-bottom: 1px;
        padding: 0 1rem;
        font-weight: bold;
        font-size: 15px;
        text-overflow:ellipsis;
        white-space:nowrap;
        word-wrap:normal;
        overflow:hidden;
    }

    .news_description{
        border-radius: 3px;
        background-color: #FFFFFF;
        padding: 0 1rem;
        font-size: 13px;
        border-bottom: 1px solid #efefef;
        padding:  0.5em;
    }

    .news_author{
        border-radius: 3px;
        font-size: 10px;
        box-shadow: 0 1px 2px 3px rgba(0, 0, 0, 0.1);
        padding: 0 0.5em;
        background-color : #5ff;
    }

    .keyword{
        border-radius: 5px;
        font-size: 20px;
        height: 30px;
        text-shadow: 1px 1px 3px #666666;
    }

    .relation_word{
        border-radius: 5px;
        font-size: 12px;
        color : #666 ;
    }

    .swiper-container {
        width: 100%;
        height: 100%;
        margin-left: auto;
        margin-right: auto;
    }
    .swiper-slide {
        text-align: center;
        font-size: 18px;
        /* Center slide text vertically */
        display: -webkit-box;
        display: -ms-flexbox;
        display: -webkit-flex;
        display: flex;
        -webkit-box-pack: center;
        -ms-flex-pack: center;
        -webkit-justify-content: center;
        justify-content: center;
        -webkit-box-align: center;
        -ms-flex-align: center;
        -webkit-align-items: center;
        align-items: center;
    }
    .pub_date{
        color : #999;
        float: right!important;
        font-size: 12px;
    }
    .news_title_box{
        display: block;
        margin-bottom: 2px;
        font-size: 12px;
    }
</style>

<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <header class="box-header with-border bg-blue-gradient">
        <!-- Logo -->
        <!-- logo for regular state and mobile devices -->
        <span class="logo-lg"><b>왜, 떴지?!</b></span>
        <%--<button id="dataBtn">Init</button>--%>
    </header>


    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper" >

        <!-- Main content -->
        <section class="content" style="background-color: #222d32" id="rankList">
            <!--  <div class="box-header with-border bg-green-gradient">
                <h3 class="box-title">Naver</h3>
              </div>-->
            <div class="keyword bg-green-gradient">&nbsp; 1. 대구 수돗물</div>
            <!-- 연관검색어 -->
            <div class="relation_word">대구 상수도,대구 수돗물 발암물질, 운문댐 저수율, 대구 수돗물 환경호르몬, 대구 물, 대구 수도, 대구수도사업소, 대구 발암물질, 수성구 수돗물, 대구 동구 수돗물 </div>
            <!-- /.box-header -->
            <!-- Swiper -->
            <!-- Swiper -->
            <div class="swiper-container">
                <div class="swiper-wrapper">
                    <div class="swiper-slide">Slide 1</div>
                    <div class="swiper-slide">Slide 2</div>
                    <div class="swiper-slide">Slide 3</div>
                    <div class="swiper-slide">Slide 4</div>
                    <div class="swiper-slide">Slide 5</div>
                    <div class="swiper-slide">Slide 6</div>
                    <div class="swiper-slide">Slide 7</div>
                    <div class="swiper-slide">Slide 8</div>
                    <div class="swiper-slide">Slide 9</div>
                    <div class="swiper-slide">Slide 10</div>
                </div>
                <!-- Add Pagination -->
                <div class="swiper-pagination"></div>
                <!-- Add Arrows -->
                <div class="swiper-button-next"></div>
                <div class="swiper-button-prev"></div>
            </div>
            <!-- Swiper -->


            <div class="news_box">
                <!-- news -->
                <div class="margin-bottom">
                    <div class="news_title_box">
                        <span class="news_author">스포츠투데이</span>
                        <span class="pub_date">2018-06-20 00:46</span>
                    </div>
                    <div class="new_title" >[폴란드 세네갈]'게예 선제골' 세네갈, 폴란드에 1-0 리드(1보)</div>
                    <div class="news_description">
                        좌우 측면의 스피드를 앞세워 폴란드를 괴롭히던 세네갈은 전반 37분 선제골을 터트렸다. 니앙이 좌측에서 수비와의 경합에서 승리해 공을 잡아낸 후 전진해 마네에게 패스했고, 마네가 이를 곧바로 게예에게 연결했다....
                    </div>
                </div>
                <div class="news_title_box">
                    <span class="news_author">스포츠투데이</span>
                    <span class="pub_date">2018-06-20 00:46</span>
                </div>
                <div class="new_title" >[폴란드 세네갈]'게예 선제골' 세네갈, 폴란드에 1-0 리드(1보)</div>
                <div class="news_description">
                    좌우 측면의 스피드를 앞세워 폴란드를 괴롭히던 세네갈은 전반 37분 선제골을 터트렸다. 니앙이 좌측에서 수비와의 경합에서 승리해 공을 잡아낸 후 전진해 마네에게 패스했고, 마네가 이를 곧바로 게예에게 연결했다....
                </div>
            </div>
            <!-- /news -->


            <div class="keyword bg-green-gradient">&nbsp; 2. 대구 수돗물</div>
            <!-- 연관검색어 -->
            <div class="relation_word">대구 상수도,대구 수돗물 발암물질, 운문댐 저수율, 대구 수돗물 환경호르몬, 대구 물, 대구 수도, 대구수도사업소, 대구 발암물질, 수성구 수돗물, 대구 동구 수돗물 </div>
            <!-- /.box-header -->
            <!-- Swiper -->
            <!-- Swiper -->
            <div class="swiper-container">
                    <div class="swiper-wrapper">
                        <div class="swiper-slide"><img src="https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.com%2Fimage%2F001%2F2009%2F03%2F09%2FPYH2009030900040099000_P2.jpg&amp;type=b360"></div>
                        <div class="swiper-slide"><img src="https://search.pstatic.net/common/?src=http%3A%2F%2Fpost.phinf.naver.net%2FMjAxODAzMjRfNTIg%2FMDAxNTIxODQwMDkzNTQ2.S1RaeK3B_tU924Fdq_0mbAWvBe7xwZPYKKaYy13Abi4g.4kIWgG9F90u2ldMtphxsLrLTU72hYFHNx0W4MsQAL7wg.PNG%2FI_qiFX_Asolk2eREG_cYt-ZzGcEU.jpg&amp;type=b360"></div>
                        <div class="swiper-slide"><img src="https://search.pstatic.net/common/?src=https%3A%2F%2Fpost-phinf.pstatic.net%2FMjAxODAzMDlfMjcg%2FMDAxNTIwNTY1MzI4MjIx.ENOZGuE65WxQdZfmmIRoidy8L4EAW1EXoP8cxAwsL3Mg.OadS7QEwGZ0x3qjxzRg3sVSx6e3kyGnOzq6oM0sO83wg.JPEG%2FI13bpyuGPkGvfUZKP1__sWP6GKEY.jpg&amp;type=b360"></div>
                        <div class="swiper-slide"><img src="https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.com%2Fimage%2F009%2F2009%2F03%2F07%2F0090002076970_0.jpg&amp;type=b360"></div>
                        <div class="swiper-slide"><img src="https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.com%2Fimage%2F5469%2F2017%2F12%2F26%2F0000020621_001_20171226091204731.jpg&amp;type=b360"></div>
                    </div>
                <!-- Add Pagination -->
                <div class="swiper-pagination"></div>
                <!-- Add Arrows -->
            </div>
            <!-- Swiper -->


            <div class="news_box">
                <!-- news -->
                <div class="margin-bottom">
                    <div class="news_title_box">
                        <span class="news_author">스포츠투데이</span>
                        <span class="pub_date">2018-06-20 00:46</span>
                    </div>
                    <div class="new_title" >[폴란드 세네갈]'게예 선제골' 세네갈, 폴란드에 1-0 리드(1보)</div>
                    <div class="news_description">
                        좌우 측면의 스피드를 앞세워 폴란드를 괴롭히던 세네갈은 전반 37분 선제골을 터트렸다. 니앙이 좌측에서 수비와의 경합에서 승리해 공을 잡아낸 후 전진해 마네에게 패스했고, 마네가 이를 곧바로 게예에게 연결했다....
                    </div>
                </div>
                <div class="margin-bottom">
                    <div class="news_title_box">
                        <span class="news_author">스포츠투데이</span>
                        <span class="pub_date">2018-06-20 00:46</span>
                    </div>
                    <div class="new_title" >[폴란드 세네갈]'게예 선제골' 세네갈, 폴란드에 1-0 리드(1보)</div>
                    <div class="news_description">
                        좌우 측면의 스피드를 앞세워 폴란드를 괴롭히던 세네갈은 전반 37분 선제골을 터트렸다. 니앙이 좌측에서 수비와의 경합에서 승리해 공을 잡아낸 후 전진해 마네에게 패스했고, 마네가 이를 곧바로 게예에게 연결했다....
                    </div>
                </div>
            </div>
            <!-- /news -->
        </section>

        <!-- /.content-wrapper -->
        <footer class="main-footer">
            <div class="pull-right hidden-xs">
                <b>Version</b> 0.0.0.1
            </div>
            <strong>Copyright &copy; 2018 akami.app All rights reserved.</strong>
        </footer>
    </div>
</div>
</div>




<!-- /.box (chat box) -->



<!-- /.row (main row) -->




<!-- ./wrapper -->

<!-- jQuery 3 -->
<script src="bower_components/jquery/dist/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="bower_components/jquery-ui/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->

<!-- Bootstrap 3.3.7 -->
<script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<!-- Swiper JS -->
<script src="dist/js/swiper.min.js"></script>
<script>

    $(document).ready(function() {

        init();
       /* $("#dataBtn").click(function(){
           init();
        });*/

        function init(){
            $.getJSON("/rankJson", function(data){
                console.log("data.length : " + data.length);
                var _keywordSet ;
                var _section ;
                $(data).each(
                    function (){
                        _section = "<div class=\"keyword bg-green-gradient\">&nbsp; " + this.rankIndex + ". " + this.searchWord + "</div>";
                       // alert(this.searchWord);
                        //console.log("this.searchWord : " + this.searchWord);
                       // for (var keyword in data) {

                        _section += "<div class=\"relation_word\">";

                        //연관검색어
                        $.each(this.relationWord, function(wordIndex, element) {
                            _section += "<a href=\"https://m.search.naver.com/search.naver?query="+element+"\" target='_blank'>"+element+" </a>&nbsp;&nbsp;";
                        })

                        _section += "</div>";

                        //images
                        _section +="<div class=\"swiper-container\">";
                        _section +="   <div class=\"swiper-wrapper\">";
                            $.each(this.imageList, function(index, images) {
                                _section += "<div class=\"swiper-slide\"><img src ="+images.url +"></div>";
                           });

                        _section +="</div>";
                        _section +="<div class=\"swiper-pagination\"></div> </div>";

                        <!-- Swiper -->


                        _section +="<div class=\"news_box\">";
                        $.each(this.newsList, function(index, news) {
                            _section +="<div class=\"margin-bottom\">";
                            _section +="<div class=\"news_title_box\">";
                            _section +="<span class=\"news_author\">"+news.author+"</span>";
                            _section +="<span class=\"pub_date\">"+news.pubDate+"</span>";
                            _section +="</div>";
                            _section +="<div class=\"new_title\" ><a href=\""+news.link+"\">"+news.title+"</a></div>";
                            _section +="<div class=\"news_description\">"+news.description+"</div>";
                            _section +="</div>";

                        });
                        _section +="</div>";
                        _keywordSet += _section;
                    }
                )
                $('#rankList').html(_keywordSet);
            })
        }

        var swiper = new Swiper('.swiper-container', {
            slidesPerView: 1,
            spaceBetween: 30,
            keyboard: {
                enabled: true,
            },
            pagination: {
                el: '.swiper-pagination',
                clickable: true,
            }
        });

    });





</script>


</body>
</html>
