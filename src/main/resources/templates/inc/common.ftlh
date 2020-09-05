<#macro paging pageData>
    <div style="text-align: center">

        <#--分页容器-->
        <div id="laypage-main">


        </div>


        <script>
            layui.use('laypage', function () {
                var laypage = layui.laypage;

                //执行一个laypage实例
                laypage.render({
                    elem: 'laypage-main',//注意，这里的 test1 是 ID，不用加 # 号
                    count: ${pageData.total},//数据总数，从服务端得到
                    curr:${pageData.current},
                    limit:${pageData.size},
                    jump: function(obj, first){
                        //obj包含了当前分页的所有参数，比如：
                        console.log(obj.curr); //得到当前页，以便向服务端请求对应页的数据。
                        console.log(obj.limit); //得到每页显示的条数

                        //首次不执行
                        if(!first){
                            //do something
                            location.href = 'http://localhost:8080/index?current=' + this.curr;
                        }
                    }
                });
            });
        </script>


    </div>

</#macro>


<#macro articleList article>
    <li>
        <a href="/user/${article.authorId}" class="fly-avatar">
            <img src="${article.authorAvatar}"
                 alt="${article.authorName}">
        </a>
        <h2>
            <a class="layui-badge">${article.categoryName}</a>
            <a href="jie/detail.html">${article.title}</a>
        </h2>
        <div class="fly-list-info">
            <a href="/user/${article.authorId}" link>
                <cite>${article.authorName}</cite>

            </a>
            <span>${timeAgo(article.created?date("yyyy-MM-dd"))}</span>

            <span class="fly-list-nums">
                <i class="iconfont icon-pinglun1" title="回答"></i>${article.commentCount}
              </span>
        </div>
        <div class="fly-list-badge">
            <!--
            <span class="layui-badge layui-bg-black">置顶</span>
            <span class="layui-badge layui-bg-red">精帖</span>
            -->
        </div>
    </li>

</#macro>