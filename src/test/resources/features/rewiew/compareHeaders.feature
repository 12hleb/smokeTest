Feature: : compare headers
@rew
  Scenario: compare two titles
  Given user go the "https://dzone.com/articles/gradle-vs-maven"
  When user write down firs header
  And user go the "https://dzone.com/articles/api-security-weekly-issue-71"
  And user write down second header
  Then compere the headers

