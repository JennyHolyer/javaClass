TaskEasy Junior Candidate Test Project
Goals:
Translate a csv file into a JSON object using a Java class and print to standard out.
Make a request to a Rest API endpoint (hosted locally) and render the reults in a web UI table.
Tools Provided:
Instructions for starting your local Node.js server
An example csv file to import academy_award_actresses.csv
A format example for how the final JSON should look (and will be the file you download for the Ajax portion) academy_award_actresses.json


Setup:
Clone this repo
Setup the local server that you will use for Ajax requests
Navigate to your cloned repo
npm install -g local-web-server
run ws
Open a browser and navigate to http://127.0.0.1:8000/academy_award_actresses.json to verify the json is being served locally
Prepare your Java class.
Part of the fun is setting up your environment. Enjoy!


Requirements:
From a Java class, that can be run from the command line, read in a csv file and translate the output to a valid JSON object in the provided format and print to stdout. a. Bonus points for outputs other than standard out b. Minus points for string concatenation
Make an Ajax request to the provided url above and use the returned data to render an html table of the data.
You can use any javascript library you want to perform requests and/or render data. Or, you can go straight vanilla.
The table should have alternating row colors.
Add a click handler to the table row to show a basic alert
Bonus points: show the data for that row in the alert.


Hints:
You can do the front end or back end task first. It's up to you.
Use any libraries or frameworks that you feel like can help your progress, both for the Java code and front end UI code.
You can make the UI as minimal or as flamboyant as you want.
