import io.gatling.sbt.GatlingPlugin

enablePlugins(GatlingPlugin)

scalaVersion := "2.11.6"

scalacOptions := Seq(
    "-encoding", "UTF-8", "-target:jvm-1.7", "-deprecation",
    "-feature", "-unchecked", "-language:implicitConversions", "-language:postfixOps")

javaOptions in Gatling := overrideDefaultJavaOptions("-Xms1G", "-Xmx12G", "-Djsse.enableSNIExtension=false", "-Dsun.net.inetaddr.ttl=0")

libraryDependencies ++= Seq( 
    "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.1.6" % "test",
    "io.gatling"            % "gatling-test-framework"    % "2.1.6" % "test",
    "org.apache.activemq"   % "activemq-broker"           % "5.8.0" % "test"
)
