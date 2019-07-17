/**
 * 登录
 */
new Vue({
	el:"#login",
	data:{
		user:{
			userName:"",
			passWord:""
		},
	},
	methods:{
		login:function(user){
			var _this=this;
			axios.post("/BaiXian/user/login",_this.user)
			.then(function(response){
				if(response.data.flag){
					window.location.href='index.html'
				}else{
					alert(response.data.mess);
				}
			}).catch(function (error) {
				console.log(error);
		        });
		      }
		    },
});
//地区
new Vue({
	el:"#diqu",
	data:{
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
		proList:[],
		cityList:[],
	},
	methods:{
		findPro:function(){
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
	},
	 created:function() {//当我们页面加载的时候触发请求，查询所有
	        this.findPro();
	    }
});
//注册
new Vue({
		el:"#reg",
		data:{
			user:{
				userName:"",
				passWord:"",
				phone:""
			},
		},
		methods:{
			login:function(user){
				var _this=this;
				axios.post("/BaiXian/user/login",_this.user)
				.then(function(response){
					if(response.data.flag){
						window.location.href='reg02.html'
					}else{
						alert(response.data.mess);
					}
				}).catch(function (error) {
					console.log(error);
			        });
			      },
			reguser:function(){
				var _this=this;
				axios.post("/BaiXian/user/registered",_this.user)
				.then(function(response){
					if(response.data.flag){
						_this.login(_this.user);
					}else{
						alert(response.data.mess);
					}
				})
				.catch(function (error) {
                    console.log(error);
             })
			}
		}
});






