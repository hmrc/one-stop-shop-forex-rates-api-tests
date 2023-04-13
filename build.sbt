lazy val testSuite = (project in file("."))
  .enablePlugins(SbtAutoBuildPlugin)
  .disablePlugins(JUnitXmlReportPlugin) //Required to prevent https://github.com/scalatest/scalatest/issues/1427
  .settings(
    name := "one-stop-shop-forex-rates-api-tests",
    version := "0.1.0",
    scalaVersion := "2.13.8",
    scalacOptions ++= Seq("-feature"),
    libraryDependencies ++= Dependencies.test
  )
