 import utils from './js/utils' ;
 Vue.prototype.$utils=utils;   
 new Vue({
	el:"#xx",
	data:{
		purchaseorder:{
			purchaseNo:"",
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
		},
		uid:{
			id:""
		}
		
	},
 methods:{
	 queryPurchaseorderById:function(id){
		 var _this=this;
		axios.get("caigou/queryPurchaseorderById",{params:{id:""}})
		.then(function(response){
			_this.purchaseorder=response.data;
		})
	 }
	 
 },
 created:function(){
	 this.id = this.$utils.getUrlKey("id");
	 this.queryPurchaseorderById();
 }


})
 