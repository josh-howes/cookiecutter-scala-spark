name := "{{cookiecutter.app_name}}"

version := "{{cookiecutter.version}}"

scalaVersion := "{{cookiecutter.scala_version}}"

description := "{{cookiecutter.project_short_description}}"

organization := "{{cookiecutter.org_package}}"

organizationName := "{{cookiecutter.org_name}}"

homepage := Some(url("{{cookiecutter.org_website}}"))

libraryDependencies ++= Seq(
"org.apache.spark" %% "spark-core" % "{{cookiecutter.spark_version}}" % "provided",
"org.apache.spark" %% "spark-streaming" % "{{cookiecutter.spark_version}}" % "provided",
"org.apache.spark" %% "spark-mllib" % "{{cookiecutter.spark_version}}" % "provided",
"org.scalatest" %% "scalatest" % "2.2.1" % "test"
)
