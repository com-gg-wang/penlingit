var table_1, table_2;

table_1 = function (params) {
	tableData(params, $.extend($("#taskForm").values(), {
		isProcessed: false
	}), "getLunboList");
};


var handle,tableEvent,isShow;

handle = function (value, row, index) {
	var modifyMenu = "<li><a class='del'>删除</a></li>";
    return ["<div class='btn-group btn-group-xs'>", "<button type='button' class='btn btn-primary dropdown-toggle' data-toggle='dropdown'>操作", "<span class='caret'></span>", "<span class='sr-only'>下拉切换</span>", "</button>", "<ul class='dropdown-menu' role='menu'>", "<li><a class='update'>修改</a></li>", modifyMenu, "</ul>", "</div>"].join("");
};
isShow = function (value, row, index) {
	return ["否","是"][value];
};
tableEvent = {
	"click .update" : function(e, a, item, index) {
		comn.addTab({
			title: '修改轮播',
			href: 'Modal/newsmanager/lunbomanager/add.html?id='+item.id
		});
	},
	"click .del" : function(e, a, item, index) {
		oppSureModal("确定删除该轮播？");
   	 	$("#sureOption").unbind("click").click(function () {
   	 		$.ajax({
   	 			url: "/delLunbo",
   	 			data: {
   	 				"id":item.id
   	 			},
   	 			success: function(item){
   	 				$("#table1").bootstrapTable("refresh", {url: "..."});
   	 				if(item.code!=0){
	   	 				tip({
	   	 					content:item.msg
	   	 				})
   	 				}else{
	   	 				tip({
	   	 					content:"删除成功！"
	   	 				})
   	 				}
   	 				$("#sureModal").modal('hide')
   	 			}
   	 		});
   	 	})
	}
};



$("#btn-search").click(function () {
    $("#table1").bootstrapTable("refresh", {url: "..."});
});
//添加设备类型
$("#addDeviceType").click(function(){
	comn.addTab({
		title: '添加轮播',
		href: 'Modal/newsmanager/lunbomanager/add.html'
	});
})

