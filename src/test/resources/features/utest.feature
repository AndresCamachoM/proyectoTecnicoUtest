# Autor: Roberto
@stories
Feature: Utesting web
  as a user, robert want to regisrter on the utest website
  @scenario1
  Scenario: Robert registering for the first time on the Utest Web
    Given Roberto wants to register on the Utest website
    When He register with your valid information
    | strFirstName | strLastName | strEmail           | strLanguage | strMonth | strDay | strYear| strCountry| strCodePostal| strCity       | strComputer | strVersion | strDeviceLanguage | strMobile  | strModel | strOperatingSystem | strPassword  | strConfirmPassword |
    | Carlos       | Contreras   | CContre1@gmail.com | Spanish     | March    | 13     | 2000   | Argentina | 121212       | Buenos aires  | Linux       |  Ubuntu    | Spanish           | Apple      | iPhone 4 | iOS 11.2           | Carlos-178.  | Carlos-178.        |
    Then He should go to the welcome page
