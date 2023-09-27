/**
 * 
 */
document.getElementById("view_time").innerHTML = getNow();

function getNow() {
	var now = new Date();
	var year = now.getFullYear();
	var mon = now.getMonth() + 1; //１を足すこと
	var day = now.getDate();
	var hour = now.getHours();
	var min = now.getMinutes();

	//出力用
	var s = "期日-時間：" + year + "/" + mon + "/" + day + " " + hour + ":" + min;
	return s;
}
