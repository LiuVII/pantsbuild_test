# Basic pants-scala project 2018 @LiuVII

scala_library(
  name = 'scala_library',
  sources = globs('*.scala'),
)

jvm_binary(
  name = 'bin',
  dependencies = [
    ':scala_library',
  ],
  source = 'BasicConsolePrinter.scala',
  main = 'jvm.basics.bin.BasicConsolePrinter',
  basename = 'basic',
)
