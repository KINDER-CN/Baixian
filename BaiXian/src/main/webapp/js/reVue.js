new Vue({
			el: '.caigou2',
			data: {
				purchaseorder:{
					purchaseName:"",
					purchasingItems:"",
					origin:"",
					specifications:"",
					level:"",
					warehouse:"",
					cargo:"",
					price:"",
					purchastate:"",
					payment:"",
					invoice:"",
					abortDate:"",
					contacter:"",
					companyName:"",
					phone:"",
					province:"",
					city:"",
					district:""
				},
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
					dis:{
						id:"",
						disno:"",
						disName:""
					},
					proList:[],
					cityList:[],
					disList:[],
				},
			methods: {
				submit: function() {
				 var _this=this;
		    	axios.post('caigou/caigou123',_this.purchaseorder)
		    	.then(
		    			alert("请确认信息，是否发布该采购单"),
		    			window.location.href='member-采购管理-我的采购单.html'
		    			)
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
			//change事件触发的查找市方法
			findCity:function(event){
				var _this=this;
				axios.get("/BaiXian/city/city",{params:{proId:event.target.value}})
				.then(function(response){
					_this.cityList=response.data.city;
					_this.purchaseorder.province=event.target.value
					console.log(response);
				})
				.catch(function (error) {
	                    console.log(error);
	             })
			},
			//change事件触发的查找区方法
			findDis:function(event){
				var _this=this;
				axios.get("/BaiXian/city/dis",{params:{cityId:event.target.value}})
				.then(function(response){
					_this.disList=response.data.district;
					_this.purchaseorder.city=event.target.value;
					console.log(response);
				})
				.catch(function (error) {
	                    console.log(error);
	             })
			},
			setDis:function(event){
				this.purchaseorder.district=event.target.value;
			}
		},
		created:function(){
			this.findpro();
		}
})						
