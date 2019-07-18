$(function(){
	trString();
	function trString(){
		$("#tbody tr").remove();
    			$.get("/BaiXian/res/ziYuan",{"page":$("#page").val()},function(data){
    				$("#dqym").val(data.pg.page).html("当前第"+data.pg.page+"页");
    				$("#zym").val(data.pg.pageCount).html("共"+data.pg.pageCount+"页");
    				$("#page").val(data.pg.page);
    				$("#pageCount").val(data.pg.pageCount);
						$.each(data.data,function(i,val){
							var str='<tr><td><a href="javascript:;" class="name">';
							str+=val.resourcesSingle.companyInfo.companyName;
							str+='</a></td>';
							str+='<td><p>';
							str+=val.classThree.classTwo.twoClassName;
							str+='</p></td>';
							str+='</td><td>';
							str+=val.classThree.threeClassName;
							str+='</td><td>';
							str+=val.resourcesSingle.resourceState;
							str+='</td><td>';
							//日期处理   毫秒数转换为"yyyy年MM月dd日"格式
							var date =new Date(val.resourcesSingle.uploadDate);
							str+=date.getFullYear();
							str+='年'+(date.getMonth()+1);
							str+='月'+date.getDate()+'日';
							str+='</td><td><a href="/1-2-我的超鲜/资源-快速预览.html" class="btn04">快速预览</a></td></tr>';
							$("#tbody").append(str);
						})
    				})
			}
	//定义一个全局变量控制页码的加减
		var i=1;
		/* 分页查询资源单 */
	//trString();
	/* 上一页 */
	$("#up").click(function(){
		if($("#page").val()<=1){
			alert("没有上一页了");
		}else{
			i-=1;
			$("#page").val(i);
			trString();
		}		
			});
  	/* 下一页 */
	$("#down").click(function(){
		if(parseInt($("#page").val())>=parseInt($("#pageCount").val())){
			alert("没有下一页了");
		}else{
			i+=1;
			$("#page").val(i);
			console.log($("#page").val())
			trString();
		}
			});
	/* 首页 */
	$("#first").click(function(){
		if($("#page").val()==1){
			alert("已经是第一页");
		}else{
			$("#page").val("1");
			trString();
		}
			});
	/* 尾页 */
	$("#last").click(function(){
		if($("#page").val()==$("#pageCount").val()){
			alert("已经是最后页");
		}else{
			$("#page").val($("#pageCount").val());				
			trString();
		}
			});
 		})
 			
