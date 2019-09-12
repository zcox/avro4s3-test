scalaVersion := "2.12.8"

scalacOptions ++= Seq("-feature", "-language:higherKinds")

libraryDependencies ++= Seq(
  "com.sksamuel.avro4s" %% "avro4s-core" % "3.0.1",
)
