$(function () {
   $.post({
       url:'user/getAll',
       success:function (data) {
           console.log()
           for(var i = 0;i<data.length;i++){
               // console.log(data[i]);
               var text = "<tr>\n" +
                   "            <td>"+data[i].id+"</td>\n" +
                   "            <td>"+data[i].username+"</td>\n"+
                   "            <td>"+data[i].password+"</td>\n" +
                   "            <td>"+data[i].createtime+"</td>\n" +
                   "            <td>"+data[i].status+"</td>\n" +
                   "            <td>\n" +
                   "                <a href=\"#\" class=\"btn btn-info\" >修改</a>\n" +
                   "                <a href=\"user/delById?id="+data[i].id+"\" class=\"btn btn-danger\">删除</a>\n" +
                   "            </td>\n" +
                   "        </tr>"
               var obj = $(".pool");
               obj.append(text);
               // console.log(text);
           }
       }
   })
});