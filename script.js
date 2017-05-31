$(document).ready(function() {
  $.getJSON('http://127.0.0.1:8000/academyAward.json', function(arr){
      for(var i = 0; i < arr.length; i++){
        var year = arr[i].year;
        var actress = arr[i].actress;
        var movie = arr[i].movie;
        $('#awards tbody').append('<tr class="table"><td>' + year + '</td> <td>' +actress + '</td> <td>' + movie + '</td></tr>')
      } //end for loop
  });

  $('#awards').on('click', 'tr.table', function() {
    var tableData = $(this).children("td").map(function() {
        return $(this).text();
    }).get();
    alert($.trim(tableData[0]) + " • " + $.trim(tableData[1]) + " • " + $.trim(tableData[2]));
  });

});
