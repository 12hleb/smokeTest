$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/rewiew/compareHeaders.feature");
formatter.feature({
  "name": ": compare headers",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "compare two titles",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@rew"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user go the \"https://dzone.com/articles/gradle-vs-maven\"",
  "keyword": "Given "
});
formatter.match({
  "location": "compareHeaders_stepDef.user_go_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user write down firs header",
  "keyword": "When "
});
formatter.match({
  "location": "compareHeaders_stepDef.user_write_down_firs_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user go the \"https://dzone.com/articles/api-security-weekly-issue-71\"",
  "keyword": "And "
});
formatter.match({
  "location": "compareHeaders_stepDef.user_go_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user write down second header",
  "keyword": "And "
});
formatter.match({
  "location": "compareHeaders_stepDef.user_write_down_second_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "compere the headers",
  "keyword": "Then "
});
formatter.match({
  "location": "compareHeaders_stepDef.compere_the_headers()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Gradle vs. Maven]\u003e but was:\u003c[API Security Weekly: Issue #71]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat step_definitions.compareHeaders_stepDef.compere_the_headers(compareHeaders_stepDef.java:40)\n\tat ✽.compere the headers(src/test/resources/features/rewiew/compareHeaders.feature:8)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});