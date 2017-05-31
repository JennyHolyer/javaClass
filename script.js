$(document).ready(function() {
  $.getJSON('http://127.0.0.1:8000/academyAward.json', function(arr){
    // console.log(arr);
      for(var i = 0; i < arr.length; i++){  //47 or arr.length
        // console.log(arr[i].year);
        // console.log(arr[i].actress);
        // console.log(arr[i].movie);
        var year = arr[i].year;
        var actress = arr[i].actress;
        var movie = arr[i].movie;

        $('#awards tbody').append('<tr class="table"><td>' + year + '</td> <td>' +actress + '</td> <td>' + movie + '</td></tr>')

      } //end for loop
  });

  $('tr.table').click(function() {
    var tableData = $(this).children("td").map(function() {
        return $(this).text();
    }).get();

    alert("Your data is: " + $.trim(tableData[0]) + " , " + $.trim(tableData[1]) + " , " + $.trim(tableData[2]));
    // console.log("clicked");
    // alert("You!");
  })


})
