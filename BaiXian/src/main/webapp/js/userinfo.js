new Vue({
	el:"#info",
	data:{
		userName:"",
		flag:true,
		inp:false,
		url:"",
		imgflag:true,
			pro:{
				id:"",
				prono:"",
				proname:""
			},
			city:{
				id:"",
				cityno:"",
				cityName:""
			},
			user:{
				id:"",
				nickName:"",
				avatar:"",
				phone:"",
				email:"",
				province:"",
				city:"",
				district:"",
				address:""
			},
			bank:{
				id:"",
				userId:"",
				account:"",
				bank:"",
				accountNo:""
			},
			proList:[],
			cityList:[],
	},
	methods:{
		index:function(){
			var _this=this;
			axios.get("/BaiXian/user/findUser")
			.then(function(response){
				if(response.data.user!=null){
					_this.userName=response.data.user.userName;
					_this.user=response.data.user;
					_this.url=response.data.user.avatar;
					if(response.data.user.avatar!=null){
						_this.imgflag=false;
						alert(response.data.user.avatar);
					}
					console.log(response);
					_this.flag=false;
				}else{
					_this.flag=true;
				}
			})
			.catch(function (error) {
                    console.log(error);
             })
		},
		findpro:function(){
			var _this=this;
			axios.get("/BaiXian/city/pro")
			.then(function(response){
				_this.proList=response.data.pro;
				console.log(response);
			})
			.catch(function (error) {
                    console.log(error);
             })
		},
		findCity:function(proid){
			var _this=this;
			axios.get("/BaiXian/city/city",{params:{proId:proid}})
			.then(function(response){
				_this.cityList=response.data.city;
				console.log(response);
			})
			.catch(function (error) {
                    console.log(error);
             })
		},
		changeinpt:function(){
			if(this.inp){
				this.inp=false;
			}else{
				this.inp=true;
			}
		},
		updateuser:function(){
			var _this=this;
			axios.post("/BaiXian/user/updateUser",_this.user)
			.then(function(response){
				if(response.data.flag){
					_this.index();
				}
				else{
					alert(response.data.mess);
				}
			})
			.catch(function (error) {
                    console.log(error);
             })
		},
		findBank:function(){
			var _this=this;
			axios.get("/BaiXian/bank/find")
			.then(function(response){
				_this.bank=response.data.bank;
				console.log(response);
			})
			.catch(function (error) {
                    console.log(error);
             })
		},
		updateBank:function(){
			var _this=this;
			axios.post("/BaiXian/bank/updateAdd",_this.bank)
			.then(function(response){
				_this.bank=response.data.bank;
				console.log(response);
			})
			.catch(function (error) {
                    console.log(error);
             })
		},
		handlerUpload:function (){
			var _this=this;
			this.file = event.target.files[0]; //获取input的图片file值
			let param = new FormData(); // 创建form对象
			param.append('imgFile', this.file);//对应后台接收图片名
			axios.post('/BaiXian/user/upload',param) 
			.then(function(res){
				if(res.data.flag){
					_this.url=res.data.url;
					_this.user.avatar=res.data.url;
					_this.imgflag=false;
					console.log(res);
				}else{
					alert("图片上传失败");
				}
			})
			.catch(function(error){
		          console.log(error);
		        });
		},
	},
	created:function() {//当我们页面加载的时候触发请求，查询所有
	       this.index();
	       this.findpro();
	       this.findBank();
	  }
});