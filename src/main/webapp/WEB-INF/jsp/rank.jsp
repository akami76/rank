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
        height: 250px;
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
    }

    .keyword{
        border-radius: 5px;
        font-size: 20px;
        height: 30px;
        text-shadow: :1px 1px 3px #666666;
    }

    .relation_word{
        border-radius: 5px;
        font-size: 12px;
        color : #666 ;
    }

    .swiper-container {
        width: 100%;
        padding-top: 5px;
        padding-bottom: 50px;
    }
    .swiper-slide {
        background-position: center;
        background-size: cover;
        width: 300px;
        height: 300px;
    }
</style>

<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <header class="box-header with-border bg-blue-gradient">
        <!-- Logo -->
        <!-- logo for regular state and mobile devices -->
        <span class="logo-lg"><b>왜, 떴지?!</b></span>
    </header>


    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper" id="rankList">

        <!-- Main content -->
        <section class="content" style="background-color: #ffffff" >
            <!--  <div class="box-header with-border bg-green-gradient">
                <h3 class="box-title">Naver</h3>
              </div>-->
            <div class="keyword bg-green-gradient">&nbsp; 1. 대구 수돗물</div>
            <!-- 연관검색어 -->
            <div class="relation_word">대구 상수도,대구 수돗물 발암물질, 운문댐 저수율, 대구 수돗물 환경호르몬, 대구 물, 대구 수도, 대구수도사업소, 대구 발암물질, 수성구 수돗물, 대구 동구 수돗물 </div>
            <!-- /.box-header -->
            <!-- Swiper -->
            <div class="swiper-container">
                <div class="swiper-wrapper">
                    <div class="swiper-slide" style="background-image:url(https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.com%2Fimage%2F001%2F2016%2F01%2F04%2FC0A8CA3D00000151474EA5BF000D1039_P2_99_20160104180105.jpeg&type=b360
)" onclick="javascript:imageDetail(this)"></div>
                    <div class="swiper-slide" style="background-image:url(https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles11.naver.net%2FMjAxODAzMDhfNzAg%2FMDAxNTIwNDg2ODY5MDg0.iNZxOzikVOT9SIIQAXUH2OP3jH2doGgrzd7RpQSpjc8g.TRs9ZLSg5HbqvfQxzfcyfp8-1gQQpPE60X2P8q9ItxMg.JPEG.fly3363%2F%25C0%25CC%25C1%25F8%25C8%25C6_%25B4%25EB%25B1%25B8%25BD%25C3%25C0%25E5_%25C8%25C4%25BA%25B8.jpg&type=b360
)"></div>
                    <div class="swiper-slide" style="background-image:url(https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.com%2Fimage%2F5194%2F2018%2F04%2F22%2F0000066678_001_20180422090011690.jpg&type=b360
)"></div>
                    <div class="swiper-slide" style="background-image:url(https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.com%2Fimage%2F001%2F2017%2F12%2F30%2FPYH2017122920480005300_P2_20171230083046400.jpg&type=b360
)"></div>
                    <div class="swiper-slide" style="background-image:url(https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.com%2Fimage%2F5207%2F2018%2F02%2F08%2F0000204735_001_20180208092709620.jpg&type=b360
)"></div>
                </div>
                <!-- Add Pagination -->
                <div class="swiper-pagination"></div>
            </div>

            <div class="news_box">
                <!-- news -->
                <div class="margin-bottom">
                    <div class="direct-chat-info clearfix">
                        <span class="news_author">스포츠투데이</span>
                        <span class="direct-chat-timestamp pull-right">2018-06-20 00:46</span>
                    </div>
                    <div class="new_title" >[폴란드 세네갈]'게예 선제골' 세네갈, 폴란드에 1-0 리드(1보)</div>
                    <div class="news_description">
                        좌우 측면의 스피드를 앞세워 폴란드를 괴롭히던 세네갈은 전반 37분 선제골을 터트렸다. 니앙이 좌측에서 수비와의 경합에서 승리해 공을 잡아낸 후 전진해 마네에게 패스했고, 마네가 이를 곧바로 게예에게 연결했다....
                    </div>
                </div>
                <!-- /news -->
            </div>
        </section>

        <!-- /.content-wrapper -->
        <footer class="main-footer">
            <div class="pull-right hidden-xs">
                <b>Version</b> 0.0.0.1
            </div>
            <strong>Copyright &copy; 2018 akami.app All rights reserved.
        </footer>
    </div>
</div>
</div>




<!-- /.box (chat box) -->



<!-- /.row (main row) -->




</div>
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

        function init(){
            $.getJSON("/rankJson", function(data){
                console.log("data.length : " + data.length);
                var _keywordSet ;

                $(data).each(
                    function (){
                        var _section ="<section class=\"content\" style=\"background-color: #ffffff\" >";
                       // alert(this.searchWord);
                        console.log("this.searchWord : " + this.searchWord);
                       // for (var keyword in data) {
                        _section += "<div class=\"keyword bg-green-gradient\">&nbsp; " + this.rankIndex + ". " + this.searchWord + "</div>";
                        _section += "<div class=\"relation_word\">";

                        //연관검색어
                        $.each(this.relationWord, function(wordIndex, element) {
                            _section += "<a href=\"#\">"+element+" </a>&nbsp;&nbsp;";
                        })

                        _section += "</div>";

                        //images
                        _section +="<div class=\"swiper-container\">";
                        _section +="<div class=\"swiper-wrapper\">";
                            $.each(this.imageList, function(index, images) {
                                //if(this.rankIndex == 1)
                                //_section += "<div class=\"swiper-slide\" style=\"background-image:url("+element.url +")\" onclick=\"javascript:imageDetail(this)\"></div>";
                                _section += "<div class=\"swiper-slide\" style=\"background-image:url("+images.url +")\" ></div>";
                            });

                        _section +="</div>";
                        _section +="<div class=\"swiper-pagination\"></div> </div>";

                        <!-- Swiper -->

                        _section +="<div class=\"news_box\">";
                        _section +="<div >";
                        _section +="<div class=\"direct-chat-info clearfix\">";

                        $.each(this.newsList, function(index, news) {
                            _section +="<span class=\"news_author\">"+news.author+"</span>";
                            _section +="<span class=\"direct-chat-timestamp pull-right\">"+news.pubDate+"</span>";
                            _section +="</div>";
                            _section +="<div class=\"new_title\" >"+news.title+"</div>";
                            _section +="<div class=\"news_description\">"+news.description+"</div>";

                        });
                        _section +="</div>";
                        _section += "</section>";
                        _keywordSet += _section;
                    }
                )
                $('#rankList').html(_keywordSet);
            })
        }

        var swiper = new Swiper('.swiper-container', {
            effect: 'coverflow',
            grabCursor: true,
            centeredSlides: true,
            slidesPerView: 'auto',
            coverflowEffect: {
                rotate: 50,
                stretch: 0,
                depth: 100,
                modifier: 1,
                slideShadows : true,
            },
            pagination: {
                el: '.swiper-pagination',
            },
        });

    });





</script>


</body>
</html>

<section class="content" style="background-color: #ffffff" >
    <!--  <div class="box-header with-border bg-green-gradient">
        <h3 class="box-title">Naver</h3>
      </div>-->
    <div class="keyword bg-green-gradient">&nbsp; 1. 대구 수돗물</div>
    <!-- 연관검색어 -->
    <div class="relation_word">대구 상수도,대구 수돗물 발암물질, 운문댐 저수율, 대구 수돗물 환경호르몬, 대구 물, 대구 수도, 대구수도사업소, 대구 발암물질, 수성구 수돗물, 대구 동구 수돗물 </div>
    <!-- /.box-header -->
    <!-- Swiper -->
    <div class="swiper-container">
    <div class="swiper-wrapper">
        <div class="swiper-slide" style="background-image:url(https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.com%2Fimage%2F001%2F2016%2F01%2F04%2FC0A8CA3D00000151474EA5BF000D1039_P2_99_20160104180105.jpeg&type=b360
)" onclick="javascript:imageDetail(this)"></div>
        <div class="swiper-slide" style="background-image:url(https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles11.naver.net%2FMjAxODAzMDhfNzAg%2FMDAxNTIwNDg2ODY5MDg0.iNZxOzikVOT9SIIQAXUH2OP3jH2doGgrzd7RpQSpjc8g.TRs9ZLSg5HbqvfQxzfcyfp8-1gQQpPE60X2P8q9ItxMg.JPEG.fly3363%2F%25C0%25CC%25C1%25F8%25C8%25C6_%25B4%25EB%25B1%25B8%25BD%25C3%25C0%25E5_%25C8%25C4%25BA%25B8.jpg&type=b360
)"></div>
        <div class="swiper-slide" style="background-image:url(https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.com%2Fimage%2F5194%2F2018%2F04%2F22%2F0000066678_001_20180422090011690.jpg&type=b360
)"></div>
        <div class="swiper-slide" style="background-image:url(https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.com%2Fimage%2F001%2F2017%2F12%2F30%2FPYH2017122920480005300_P2_20171230083046400.jpg&type=b360
)"></div>
        <div class="swiper-slide" style="background-image:url(https://search.pstatic.net/common/?src=http%3A%2F%2Fimgnews.naver.com%2Fimage%2F5207%2F2018%2F02%2F08%2F0000204735_001_20180208092709620.jpg&type=b360
)"></div>
    </div>
    <!-- Add Pagination -->
    <div class="swiper-pagination"></div>
</div>

    <div class="news_box">
        <!-- news -->
        <div class="margin-bottom">
            <div class="direct-chat-info clearfix">
                <span class="news_author">스포츠투데이</span>
                <span class="direct-chat-timestamp pull-right">2018-06-20 00:46</span>
            </div>
            <div class="new_title" >[폴란드 세네갈]'게예 선제골' 세네갈, 폴란드에 1-0 리드(1보)</div>
            <div class="news_description">
                좌우 측면의 스피드를 앞세워 폴란드를 괴롭히던 세네갈은 전반 37분 선제골을 터트렸다. 니앙이 좌측에서 수비와의 경합에서 승리해 공을 잡아낸 후 전진해 마네에게 패스했고, 마네가 이를 곧바로 게예에게 연결했다....
            </div>
        </div>
        <!-- /news -->
    </div>
</section>
