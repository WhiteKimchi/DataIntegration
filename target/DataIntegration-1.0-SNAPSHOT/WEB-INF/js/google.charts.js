
google.load('visualization', '1.0', {'packages':['corechart']});
google.load("visualization", "1", {packages:["gauge"]});

google.setOnLoadCallback(drawGauge1);
google.setOnLoadCallback(drawGauge2);
google.setOnLoadCallback(drawGauge3);
google.setOnLoadCallback(drawPie);

function drawGauge1() {

        var data = google.visualization.arrayToDataTable([
          ['Label', 'Value'],
          ['Archived', 80]
        ]);

        var options = {
          width: 180, height: 180,
          redFrom: 90, redTo: 100,
          yellowFrom:30, yellowTo: 90,
          minorTicks: 10
        };

        var gauge = new google.visualization.Gauge(document.getElementById('guage1_div'));

        gauge.draw(data, options);

        setInterval(function() {
          data.setValue(1, 1, 40 + Math.round(60 * Math.random()));
          gauge.draw(data, options);
        }, 5000);
}


function drawGauge2() {

        var data = google.visualization.arrayToDataTable([
          ['Label', 'Value'],
          ['OtherData', 80]
        ]);

        var options = {
          width: 180, height: 180,
          redFrom: 90, redTo: 100,
          yellowFrom:30, yellowTo: 90,
          minorTicks: 10
        };

        var gauge = new google.visualization.Gauge(document.getElementById('guage2_div'));

        gauge.draw(data, options);

        setInterval(function() {
          data.setValue(1, 1, 40 + Math.round(60 * Math.random()));
          gauge.draw(data, options);
        }, 5000);
}


function drawGauge3() {

        var data = google.visualization.arrayToDataTable([
          ['Label', 'Value'],
          ['SomeData', 80]
        ]);

        var options = {
          width: 180, height: 180,
          redFrom: 90, redTo: 100,
          yellowFrom:30, yellowTo: 90,
          minorTicks: 10
        };

        var gauge = new google.visualization.Gauge(document.getElementById('guage3_div'));

        gauge.draw(data, options);

        setInterval(function() {
          data.setValue(1, 1, 40 + Math.round(60 * Math.random()));
          gauge.draw(data, options);
        }, 5000);
}


function drawPie() {

    // Create the data table.
    var data = new google.visualization.DataTable();
    data.addColumn('string', 'Topping');
    data.addColumn('number', 'Slices');
    data.addRows([
      ['Mushrooms', 3],
      ['Onions', 1],
      ['Olives', 1],
      ['Zucchini', 1],
      ['Pepperoni', 2]
    ]);

    // Set chart options
    var options = {width:360, height:240};

    // Instantiate and draw our chart, passing in some options.
    var pie = new google.visualization.PieChart(document.getElementById('pie_div'));
    pie.draw(data, options);
}

