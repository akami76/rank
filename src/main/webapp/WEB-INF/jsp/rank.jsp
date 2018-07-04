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


    .relation_word a {
        text-decoration: none;
        color: #ffff;
    }
    .keyword a {
        text-decoration: none;
        color: #ffff;
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
            Data Loading....
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
        runImage();
       /* $("#dataBtn").click(function(){
           init();
        });*/

        function init(){
            $.getJSON("/rankJson", function(data){
               // console.log("data.length : " + data.length);
                var _keywordSet = "" ;
                var _section = "" ;
                $(data).each(
                    function (){
                        _section = "<div class=\"keyword bg-green-gradient\"><a href='https://m.search.naver.com/search.naver?query="+this.searchWord+"' target='_blank'>&nbsp; " + this.rankIndex + ". " + this.searchWord + "</a></div>";
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
                      //  if(this.rankIndex == 1) {
                            _section +="<div class=\"swiper-container\">";
                            _section +="   <div class=\"swiper-wrapper\">";

                            $.each(this.imageList, function(index, images) {
                                _section += "<div class=\"swiper-slide\"><img src ="+images.url +"></div>";
                            });

                            _section +="</div>";
                            _section +="<div class=\"swiper-pagination\"></div> </div>";
                     //   }


                        <!-- Swiper -->


                        _section +="<div class=\"news_box\">";
                        $.each(this.newsList, function(index, news) {
                                _section += "<div class=\"margin-bottom\">";
                                _section += "<div class=\"news_title_box\">";
                                _section += "<span class=\"news_author\">" + news.author + "</span>";
                                _section += "<span class=\"pub_date\">" + news.pubDate + "</span>";
                                _section += "</div>";
                                _section += "<div class=\"new_title\" ><a href=\"" + news.link + "\">" + news.title + "</a></div>";
                                _section += "<div class=\"news_description\">" + news.description + "</div>";
                                _section += "</div>";
                        });
                        _section +="</div>";
                        _keywordSet += _section;
                    }
                )
                $('#rankList').html(_keywordSet);

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

            })
        }

        function runImage(){
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
        }


    });






</script>


</body>
</html>
