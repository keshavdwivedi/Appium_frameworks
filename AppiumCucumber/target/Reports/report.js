$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestThree.feature");
formatter.feature({
  "line": 1,
  "name": "To test the seekbar of application",
  "description": "",
  "id": "to-test-the-seekbar-of-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 36710770810,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the main menu of app",
  "keyword": "Given "
});
formatter.match({
  "location": "SeekbarView_Steps.i_am_on_the_main_menu_of_app()"
});
formatter.result({
  "duration": 1200134343,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "To navigate to the seekbar and move the seekbar",
  "description": "",
  "id": "to-test-the-seekbar-of-application;to-navigate-to-the-seekbar-and-move-the-seekbar",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@seek"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "we click on views option of the main menu",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I validate seekbar option by scrolling to it",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click on seekbar option",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "move the seekbar and validate enable checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "SeekbarView_Steps.we_click_on_views_option_of_the_main_menu()"
});
formatter.result({
  "duration": 297798399,
  "status": "passed"
});
formatter.match({
  "location": "SeekbarView_Steps.i_validate_seekbar_option_by_scrolling_to_it()"
});
formatter.result({
  "duration": 5926761682,
  "status": "passed"
});
formatter.match({
  "location": "SeekbarView_Steps.i_click_on_seekbar_option()"
});
formatter.result({
  "duration": 279640890,
  "status": "passed"
});
formatter.match({
  "location": "SeekbarView_Steps.move_the_seekbar_and_validate_enable_checkbox()"
});
formatter.result({
  "duration": 11367197093,
  "status": "passed"
});
formatter.after({
  "duration": 4845060254,
  "status": "passed"
});
});