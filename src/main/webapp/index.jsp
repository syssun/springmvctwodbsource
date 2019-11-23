<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta charset="UTF-8">
    <title>定时器</title>
    <style>
        .roll{
            width: 150px;
            height: 150px;
            line-height: 150px;
            background: deepskyblue;
            text-align:center;
            cursor: pointer;
            display: inline-block;
            border-radius: 10px;
            margin: 50px 50px 3px 50px;
        }


    </style>
</head>
<body>
<div style="width: 100%;height: 100%;text-align: center;line-height: 100%">
    <div class="roll shadow"  onclick="to()">quartz</div>
    <div class="roll shadow" style="" >
        <a href="" target="_blank">Logs</a>
    </div>
    <div  style="height: 1px;width: 100%;background: bisque;box-shadow: 2px -5px 50px  rgba(0,0,0,0.3)" ></div>
</div>
<script>
    function to(){
        var href = window.location.hostname;
        var port = window.location.port ;
        var path = window.location.pathname;
        var  a = "http://"+href+":"+port+path+"quartzweb";
        location.href=a ;
    }
</script>
</body>
</html>
