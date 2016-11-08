import akka._
import com.typesafe.sbt.SbtScalariform.ScalariformKeys

//site.settings
//OSGi.parsing
Dependencies.httpClusterManagement

unmanagedSourceDirectories in ScalariformKeys.format in Test <<= unmanagedSourceDirectories in Test
scalacOptions += "-language:_"

enablePlugins(ScaladocNoVerificationOfDiagrams)
disablePlugins(MimaPlugin)