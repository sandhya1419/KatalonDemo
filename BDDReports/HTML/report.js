$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Search.feature");
formatter.feature({
  "name": "Test Search functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check search is successful for a valid product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user launch the webiste",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter the \u003cproduct\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on search button",
  "keyword": "And "
});
formatter.step({
  "name": "user is naviagted to results page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "macbook"
      ]
    }
  ],
  "tags": [
    {
      "name": "@P1"
    }
  ]
});
formatter.scenario({
  "name": "Check search is successful for a valid product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@P1"
    }
  ]
});
formatter.step({
  "name": "user launch the webiste",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchSetps.user_launch_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the macbook",
  "keyword": "When "
});
formatter.match({
  "location": "SearchSetps.user_enter_the_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on search button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSetps.clicks_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is naviagted to results page",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSetps.user_is_naviagted_to_results_page()"
});
formatter.result({
  "status": "passed"
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "Dell"
      ]
    }
  ],
  "tags": [
    {
      "name": "@P2"
    }
  ]
});
formatter.scenario({
  "name": "Check search is successful for a valid product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@P2"
    }
  ]
});
formatter.step({
  "name": "user launch the webiste",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchSetps.user_launch_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the Dell",
  "keyword": "When "
});
formatter.match({
  "location": "SearchSetps.user_enter_the_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on search button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSetps.clicks_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is naviagted to results page",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSetps.user_is_naviagted_to_results_page()"
});
formatter.result({
  "status": "passed"
});
});