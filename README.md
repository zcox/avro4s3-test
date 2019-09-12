```
$ sbt compile
[info] Loading project definition from /Users/zcox/code/zcox/avro4s3-test/project
[info] Loading settings for project avro4s3-test from build.sbt ...
[info] Set current project to avro4s3-test (in build file:/Users/zcox/code/zcox/avro4s3-test/)
[info] Executing in batch mode. For better performance use sbt's shell
[info] Compiling 1 Scala source to /Users/zcox/code/zcox/avro4s3-test/target/scala-2.12/classes ...
[info] /Users/zcox/code/zcox/avro4s3-test/src/main/scala/test.scala:20:43: magnolia: could not find any direct subtypes of trait CNil
[info]   implicit val recordFormat = RecordFormat[Good1]
[info]                                           ^
[info] /Users/zcox/code/zcox/avro4s3-test/src/main/scala/test.scala:20:43: magnolia: could not find any direct subtypes of trait CNil
[info]   implicit val recordFormat = RecordFormat[Good1]
[info]                                           ^
[info] /Users/zcox/code/zcox/avro4s3-test/src/main/scala/test.scala:20:43: magnolia: could not find any direct subtypes of trait CNil
[info]   implicit val recordFormat = RecordFormat[Good1]
[info]                                           ^
[info] /Users/zcox/code/zcox/avro4s3-test/src/main/scala/test.scala:28:43: magnolia: could not find any direct subtypes of trait CNil
[info]   implicit val recordFormat = RecordFormat[Good2]
[info]                                           ^
[info] /Users/zcox/code/zcox/avro4s3-test/src/main/scala/test.scala:28:43: magnolia: could not find any direct subtypes of trait CNil
[info]   implicit val recordFormat = RecordFormat[Good2]
[info]                                           ^
[info] /Users/zcox/code/zcox/avro4s3-test/src/main/scala/test.scala:28:43: magnolia: could not find any direct subtypes of trait CNil
[info]   implicit val recordFormat = RecordFormat[Good2]
[info]                                           ^
[info] /Users/zcox/code/zcox/avro4s3-test/src/main/scala/test.scala:36:43: magnolia: could not find any direct subtypes of trait CNil
[info]   implicit val recordFormat = RecordFormat[Bad1]
[info]                                           ^
[info] /Users/zcox/code/zcox/avro4s3-test/src/main/scala/test.scala:36:43: magnolia: could not find any direct subtypes of trait CNil
[info]   implicit val recordFormat = RecordFormat[Bad1]
[info]                                           ^
[info] /Users/zcox/code/zcox/avro4s3-test/src/main/scala/test.scala:36:43: magnolia: could not find any direct subtypes of trait CNil
[info]   implicit val recordFormat = RecordFormat[Bad1]
[info]                                           ^
[error] ## Exception when compiling 1 sources to /Users/zcox/code/zcox/avro4s3-test/target/scala-2.12/classes
[error] java.lang.AssertionError: assertion failed:
[error]
[error]      while compiling: /Users/zcox/code/zcox/avro4s3-test/src/main/scala/test.scala
[error]         during phase: delambdafy
[error]      library version: version 2.12.8
[error]     compiler version: version 2.12.8
[error]   reconstructed args: -language:higherKinds -feature -classpath /Users/zcox/code/zcox/avro4s3-test/target/scala-2.12/classes:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-core_2.12/3.6.7/json4s-core_2.12-3.6.7.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-scalap_2.12/3.6.7/json4s-scalap_2.12-3.6.7.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/typelevel/macro-compat_2.12/1.1.1/macro-compat_2.12-1.1.1.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.9.0/jackson-annotations-2.9.0.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-compress/1.18/commons-compress-1.18.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.9.8/jackson-core-2.9.8.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-ast_2.12/3.6.7/json4s-ast_2.12-3.6.7.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/chuusai/shapeless_2.12/2.3.3/shapeless_2.12-2.3.3.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/thoughtworks/paranamer/paranamer/2.8/paranamer-2.8.jar:/Users/zcox/.sbt/boot/scala-2.12.8/lib/scala-compiler.jar:/Users/zcox/.sbt/boot/scala-2.12.8/lib/scala-reflect.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/propensive/magnolia_2.12/0.11.0/magnolia_2.12-0.11.0.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/sksamuel/avro4s/avro4s-core_2.12/3.0.1/avro4s-core_2.12-3.0.1.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/avro/avro/1.9.0/avro-1.9.0.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-native_2.12/3.6.7/json4s-native_2.12-3.6.7.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.9.8/jackson-databind-2.9.8.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-xml_2.12/1.0.6/scala-xml_2.12-1.0.6.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/propensive/mercator_2.12/0.2.1/mercator_2.12-0.2.1.jar -bootclasspath /Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/classes:/Users/zcox/.sbt/boot/scala-2.12.8/lib/scala-library.jar
[error]
[error]   last tree to typer: Literal(Constant(test.A2))
[error]        tree position: line 36 of /Users/zcox/code/zcox/avro4s3-test/src/main/scala/test.scala
[error]             tree tpe: Class(classOf[test.A2])
[error]               symbol: null
[error]            call site: method constructMonadic in package test
[error]
[error] == Source file context for tree position ==
[error]
[error]     33   as2: As,
[error]     34 )
[error]     35 object Bad1 {
[error]     36   implicit val recordFormat = RecordFormat[Bad1]
[error]     37 }
[error]     38
[error] scala.reflect.internal.SymbolTable.throwAssertionError(SymbolTable.scala:183)
[error] scala.reflect.internal.SymbolTable.assert(SymbolTable.scala:160)
[error] scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transformFunction(Delambdafy.scala:254)
[error] scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:289)
[error] scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:68)
[error] scala.reflect.internal.Trees.itransform(Trees.scala:1402)
[error] scala.reflect.internal.Trees.itransform$(Trees.scala:1372)
[error] scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error] scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error] scala.reflect.api.Trees$Transformer.transform(Trees.scala:2563)
[error] scala.tools.nsc.transform.TypingTransformers$TypingTransformer.transform(TypingTransformers.scala:51)
[error] scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:317)
[error] scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:68)
[error] scala.reflect.api.Trees$Transformer.$anonfun$transformTrees$1(Trees.scala:2567)
[error] scala.reflect.api.Trees$Transformer.transformTrees(Trees.scala:2567)
[error] scala.reflect.internal.Trees.itransform(Trees.scala:1383)
[error] scala.reflect.internal.Trees.itransform$(Trees.scala:1372)
[error] scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error] scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error] scala.reflect.api.Trees$Transformer.transform(Trees.scala:2563)
[error] scala.tools.nsc.transform.TypingTransformers$TypingTransformer.transform(TypingTransformers.scala:51)
[error] scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:317)
[error] scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:68)
[error] scala.reflect.internal.Trees.$anonfun$itransform$2(Trees.scala:1399)
[error] scala.tools.nsc.transform.TypingTransformers$TypingTransformer.atOwner(TypingTransformers.scala:37)
[error] scala.tools.nsc.transform.TypingTransformers$TypingTransformer.atOwner(TypingTransformers.scala:32)
[error] scala.reflect.internal.Trees.itransform(Trees.scala:1397)
[error] scala.reflect.internal.Trees.itransform$(Trees.scala:1372)
[error] scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error] scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error] scala.reflect.api.Trees$Transformer.transform(Trees.scala:2563)
[error] scala.tools.nsc.transform.TypingTransformers$TypingTransformer.transform(TypingTransformers.scala:51)
[error] scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:317)
[error] scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:68)
[error] scala.reflect.api.Trees$Transformer.$anonfun$transformStats$1(Trees.scala:2597)
[error] scala.reflect.api.Trees$Transformer.transformStats(Trees.scala:2595)
[error] scala.reflect.internal.Trees.itransform(Trees.scala:1440)
[error] scala.reflect.internal.Trees.itransform$(Trees.scala:1372)
[error] scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error] scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error] scala.reflect.api.Trees$Transformer.transform(Trees.scala:2563)
[error] scala.tools.nsc.transform.TypingTransformers$TypingTransformer.super$transform(TypingTransformers.scala:47)
[error] scala.tools.nsc.transform.TypingTransformers$TypingTransformer.$anonfun$transform$1(TypingTransformers.scala:47)
[error] scala.tools.nsc.transform.TypingTransformers$TypingTransformer.atOwner(TypingTransformers.scala:37)
[error] scala.tools.nsc.transform.TypingTransformers$TypingTransformer.transform(TypingTransformers.scala:32)
[error] scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:303)
[error] scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:68)
[error] scala.reflect.api.Trees$Transformer.transformTemplate(Trees.scala:2571)
[error] scala.reflect.internal.Trees.$anonfun$itransform$4(Trees.scala:1444)
[error] scala.tools.nsc.transform.TypingTransformers$TypingTransformer.atOwner(TypingTransformers.scala:37)
[error] scala.tools.nsc.transform.TypingTransformers$TypingTransformer.atOwner(TypingTransformers.scala:32)
[error] scala.reflect.internal.Trees.itransform(Trees.scala:1443)
[error] scala.reflect.internal.Trees.itransform$(Trees.scala:1372)
[error] scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error] scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error] scala.reflect.api.Trees$Transformer.transform(Trees.scala:2563)
[error] scala.tools.nsc.transform.TypingTransformers$TypingTransformer.transform(TypingTransformers.scala:51)
[error] scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:317)
[error] scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:68)
[error] scala.reflect.api.Trees$Transformer.$anonfun$transformStats$1(Trees.scala:2597)
[error] scala.reflect.api.Trees$Transformer.transformStats(Trees.scala:2595)
[error] scala.reflect.internal.Trees.$anonfun$itransform$7(Trees.scala:1462)
[error] scala.tools.nsc.transform.TypingTransformers$TypingTransformer.atOwner(TypingTransformers.scala:37)
[error] scala.tools.nsc.transform.TypingTransformers$TypingTransformer.atOwner(TypingTransformers.scala:32)
[error] scala.reflect.internal.Trees.itransform(Trees.scala:1462)
[error] scala.reflect.internal.Trees.itransform$(Trees.scala:1372)
[error] scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error] scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error] scala.reflect.api.Trees$Transformer.transform(Trees.scala:2563)
[error] scala.tools.nsc.transform.TypingTransformers$TypingTransformer.super$transform(TypingTransformers.scala:47)
[error] scala.tools.nsc.transform.TypingTransformers$TypingTransformer.$anonfun$transform$2(TypingTransformers.scala:49)
[error] scala.tools.nsc.transform.TypingTransformers$TypingTransformer.atOwner(TypingTransformers.scala:37)
[error] scala.tools.nsc.transform.TypingTransformers$TypingTransformer.transform(TypingTransformers.scala:32)
[error] scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:317)
[error] scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:68)
[error] scala.tools.nsc.ast.Trees$Transformer.transformUnit(Trees.scala:147)
[error] scala.tools.nsc.transform.Transform$Phase.apply(Transform.scala:37)
[error] scala.tools.nsc.Global$GlobalPhase.applyPhase(Global.scala:448)
[error] scala.tools.nsc.Global$GlobalPhase.run(Global.scala:398)
[error] scala.tools.nsc.Global$Run.compileUnitsInternal(Global.scala:1498)
[error] scala.tools.nsc.Global$Run.compileUnits(Global.scala:1482)
[error] scala.tools.nsc.Global$Run.compileSources(Global.scala:1475)
[error] scala.tools.nsc.Global$Run.compile(Global.scala:1598)
[error] xsbt.CachedCompiler0.run(CompilerInterface.scala:153)
[error] xsbt.CachedCompiler0.run(CompilerInterface.scala:125)
[error] xsbt.CompilerInterface.run(CompilerInterface.scala:39)
[error] sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
[error] sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
[error] sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
[error] java.lang.reflect.Method.invoke(Method.java:498)
[error] sbt.internal.inc.AnalyzingCompiler.call(AnalyzingCompiler.scala:248)
[error] sbt.internal.inc.AnalyzingCompiler.compile(AnalyzingCompiler.scala:122)
[error] sbt.internal.inc.AnalyzingCompiler.compile(AnalyzingCompiler.scala:95)
[error] sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$4(MixedAnalyzingCompiler.scala:91)
[error] scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:23)
[error] sbt.internal.inc.MixedAnalyzingCompiler.timed(MixedAnalyzingCompiler.scala:186)
[error] sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$3(MixedAnalyzingCompiler.scala:82)
[error] sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$3$adapted(MixedAnalyzingCompiler.scala:77)
[error] sbt.internal.inc.JarUtils$.withPreviousJar(JarUtils.scala:215)
[error] sbt.internal.inc.MixedAnalyzingCompiler.compileScala$1(MixedAnalyzingCompiler.scala:77)
[error] sbt.internal.inc.MixedAnalyzingCompiler.compile(MixedAnalyzingCompiler.scala:146)
[error] sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1(IncrementalCompilerImpl.scala:343)
[error] sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1$adapted(IncrementalCompilerImpl.scala:343)
[error] sbt.internal.inc.Incremental$.doCompile(Incremental.scala:120)
[error] sbt.internal.inc.Incremental$.$anonfun$compile$4(Incremental.scala:100)
[error] sbt.internal.inc.IncrementalCommon.recompileClasses(IncrementalCommon.scala:180)
[error] sbt.internal.inc.IncrementalCommon.cycle(IncrementalCommon.scala:98)
[error] sbt.internal.inc.Incremental$.$anonfun$compile$3(Incremental.scala:102)
[error] sbt.internal.inc.Incremental$.manageClassfiles(Incremental.scala:155)
[error] sbt.internal.inc.Incremental$.compile(Incremental.scala:92)
[error] sbt.internal.inc.IncrementalCompile$.apply(Compile.scala:75)
[error] sbt.internal.inc.IncrementalCompilerImpl.compileInternal(IncrementalCompilerImpl.scala:348)
[error] sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileIncrementally$1(IncrementalCompilerImpl.scala:301)
[error] sbt.internal.inc.IncrementalCompilerImpl.handleCompilationError(IncrementalCompilerImpl.scala:168)
[error] sbt.internal.inc.IncrementalCompilerImpl.compileIncrementally(IncrementalCompilerImpl.scala:248)
[error] sbt.internal.inc.IncrementalCompilerImpl.compile(IncrementalCompilerImpl.scala:74)
[error] sbt.Defaults$.compileIncrementalTaskImpl(Defaults.scala:1736)
[error] sbt.Defaults$.$anonfun$compileIncrementalTask$1(Defaults.scala:1709)
[error] scala.Function1.$anonfun$compose$1(Function1.scala:49)
[error] sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:62)
[error] sbt.std.Transform$$anon$4.work(Transform.scala:67)
[error] sbt.Execute.$anonfun$submit$2(Execute.scala:280)
[error] sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:19)
[error] sbt.Execute.work(Execute.scala:289)
[error] sbt.Execute.$anonfun$submit$1(Execute.scala:280)
[error] sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:178)
[error] sbt.CompletionService$$anon$2.call(CompletionService.scala:37)
[error] java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
[error] java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
[error] java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
[error] java.lang.Thread.run(Thread.java:748)
[error]
[error] java.lang.AssertionError: assertion failed:
[error]
[error]      while compiling: /Users/zcox/code/zcox/avro4s3-test/src/main/scala/test.scala
[error]         during phase: delambdafy
[error]      library version: version 2.12.8
[error]     compiler version: version 2.12.8
[error]   reconstructed args: -language:higherKinds -feature -classpath /Users/zcox/code/zcox/avro4s3-test/target/scala-2.12/classes:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-core_2.12/3.6.7/json4s-core_2.12-3.6.7.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-scalap_2.12/3.6.7/json4s-scalap_2.12-3.6.7.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/typelevel/macro-compat_2.12/1.1.1/macro-compat_2.12-1.1.1.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.9.0/jackson-annotations-2.9.0.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-compress/1.18/commons-compress-1.18.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.9.8/jackson-core-2.9.8.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-ast_2.12/3.6.7/json4s-ast_2.12-3.6.7.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/chuusai/shapeless_2.12/2.3.3/shapeless_2.12-2.3.3.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/thoughtworks/paranamer/paranamer/2.8/paranamer-2.8.jar:/Users/zcox/.sbt/boot/scala-2.12.8/lib/scala-compiler.jar:/Users/zcox/.sbt/boot/scala-2.12.8/lib/scala-reflect.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/propensive/magnolia_2.12/0.11.0/magnolia_2.12-0.11.0.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/sksamuel/avro4s/avro4s-core_2.12/3.0.1/avro4s-core_2.12-3.0.1.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/avro/avro/1.9.0/avro-1.9.0.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-native_2.12/3.6.7/json4s-native_2.12-3.6.7.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.9.8/jackson-databind-2.9.8.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-xml_2.12/1.0.6/scala-xml_2.12-1.0.6.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/propensive/mercator_2.12/0.2.1/mercator_2.12-0.2.1.jar -bootclasspath /Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/classes:/Users/zcox/.sbt/boot/scala-2.12.8/lib/scala-library.jar
[error]
[error]   last tree to typer: Literal(Constant(test.A2))
[error]        tree position: line 36 of /Users/zcox/code/zcox/avro4s3-test/src/main/scala/test.scala
[error]             tree tpe: Class(classOf[test.A2])
[error]               symbol: null
[error]            call site: method constructMonadic in package test
[error]
[error] == Source file context for tree position ==
[error]
[error]     33   as2: As,
[error]     34 )
[error]     35 object Bad1 {
[error]     36   implicit val recordFormat = RecordFormat[Bad1]
[error]     37 }
[error]     38
[error]     at scala.reflect.internal.SymbolTable.throwAssertionError(SymbolTable.scala:183)
[error]     at scala.reflect.internal.SymbolTable.assert(SymbolTable.scala:160)
[error]     at scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transformFunction(Delambdafy.scala:254)
[error]     at scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:289)
[error]     at scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:68)
[error]     at scala.reflect.internal.Trees.itransform(Trees.scala:1402)
[error]     at scala.reflect.internal.Trees.itransform$(Trees.scala:1372)
[error]     at scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error]     at scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error]     at scala.reflect.api.Trees$Transformer.transform(Trees.scala:2563)
[error]     at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.transform(TypingTransformers.scala:51)
[error]     at scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:317)
[error]     at scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:68)
[error]     at scala.reflect.api.Trees$Transformer.$anonfun$transformTrees$1(Trees.scala:2567)
[error]     at scala.reflect.api.Trees$Transformer.transformTrees(Trees.scala:2567)
[error]     at scala.reflect.internal.Trees.itransform(Trees.scala:1383)
[error]     at scala.reflect.internal.Trees.itransform$(Trees.scala:1372)
[error]     at scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error]     at scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error]     at scala.reflect.api.Trees$Transformer.transform(Trees.scala:2563)
[error]     at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.transform(TypingTransformers.scala:51)
[error]     at scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:317)
[error]     at scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:68)
[error]     at scala.reflect.internal.Trees.$anonfun$itransform$2(Trees.scala:1399)
[error]     at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.atOwner(TypingTransformers.scala:37)
[error]     at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.atOwner(TypingTransformers.scala:32)
[error]     at scala.reflect.internal.Trees.itransform(Trees.scala:1397)
[error]     at scala.reflect.internal.Trees.itransform$(Trees.scala:1372)
[error]     at scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error]     at scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error]     at scala.reflect.api.Trees$Transformer.transform(Trees.scala:2563)
[error]     at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.transform(TypingTransformers.scala:51)
[error]     at scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:317)
[error]     at scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:68)
[error]     at scala.reflect.api.Trees$Transformer.$anonfun$transformStats$1(Trees.scala:2597)
[error]     at scala.reflect.api.Trees$Transformer.transformStats(Trees.scala:2595)
[error]     at scala.reflect.internal.Trees.itransform(Trees.scala:1440)
[error]     at scala.reflect.internal.Trees.itransform$(Trees.scala:1372)
[error]     at scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error]     at scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error]     at scala.reflect.api.Trees$Transformer.transform(Trees.scala:2563)
[error]     at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.super$transform(TypingTransformers.scala:47)
[error]     at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.$anonfun$transform$1(TypingTransformers.scala:47)
[error]     at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.atOwner(TypingTransformers.scala:37)
[error]     at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.transform(TypingTransformers.scala:32)
[error]     at scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:303)
[error]     at scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:68)
[error]     at scala.reflect.api.Trees$Transformer.transformTemplate(Trees.scala:2571)
[error]     at scala.reflect.internal.Trees.$anonfun$itransform$4(Trees.scala:1444)
[error]     at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.atOwner(TypingTransformers.scala:37)
[error]     at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.atOwner(TypingTransformers.scala:32)
[error]     at scala.reflect.internal.Trees.itransform(Trees.scala:1443)
[error]     at scala.reflect.internal.Trees.itransform$(Trees.scala:1372)
[error]     at scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error]     at scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error]     at scala.reflect.api.Trees$Transformer.transform(Trees.scala:2563)
[error]     at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.transform(TypingTransformers.scala:51)
[error]     at scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:317)
[error]     at scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:68)
[error]     at scala.reflect.api.Trees$Transformer.$anonfun$transformStats$1(Trees.scala:2597)
[error]     at scala.reflect.api.Trees$Transformer.transformStats(Trees.scala:2595)
[error]     at scala.reflect.internal.Trees.$anonfun$itransform$7(Trees.scala:1462)
[error]     at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.atOwner(TypingTransformers.scala:37)
[error]     at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.atOwner(TypingTransformers.scala:32)
[error]     at scala.reflect.internal.Trees.itransform(Trees.scala:1462)
[error]     at scala.reflect.internal.Trees.itransform$(Trees.scala:1372)
[error]     at scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error]     at scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:27)
[error]     at scala.reflect.api.Trees$Transformer.transform(Trees.scala:2563)
[error]     at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.super$transform(TypingTransformers.scala:47)
[error]     at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.$anonfun$transform$2(TypingTransformers.scala:49)
[error]     at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.atOwner(TypingTransformers.scala:37)
[error]     at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.transform(TypingTransformers.scala:32)
[error]     at scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:317)
[error]     at scala.tools.nsc.transform.Delambdafy$DelambdafyTransformer.transform(Delambdafy.scala:68)
[error]     at scala.tools.nsc.ast.Trees$Transformer.transformUnit(Trees.scala:147)
[error]     at scala.tools.nsc.transform.Transform$Phase.apply(Transform.scala:37)
[error]     at scala.tools.nsc.Global$GlobalPhase.applyPhase(Global.scala:448)
[error]     at scala.tools.nsc.Global$GlobalPhase.run(Global.scala:398)
[error]     at scala.tools.nsc.Global$Run.compileUnitsInternal(Global.scala:1498)
[error]     at scala.tools.nsc.Global$Run.compileUnits(Global.scala:1482)
[error]     at scala.tools.nsc.Global$Run.compileSources(Global.scala:1475)
[error]     at scala.tools.nsc.Global$Run.compile(Global.scala:1598)
[error]     at xsbt.CachedCompiler0.run(CompilerInterface.scala:153)
[error]     at xsbt.CachedCompiler0.run(CompilerInterface.scala:125)
[error]     at xsbt.CompilerInterface.run(CompilerInterface.scala:39)
[error]     at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
[error]     at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
[error]     at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
[error]     at java.lang.reflect.Method.invoke(Method.java:498)
[error]     at sbt.internal.inc.AnalyzingCompiler.call(AnalyzingCompiler.scala:248)
[error]     at sbt.internal.inc.AnalyzingCompiler.compile(AnalyzingCompiler.scala:122)
[error]     at sbt.internal.inc.AnalyzingCompiler.compile(AnalyzingCompiler.scala:95)
[error]     at sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$4(MixedAnalyzingCompiler.scala:91)
[error]     at scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:23)
[error]     at sbt.internal.inc.MixedAnalyzingCompiler.timed(MixedAnalyzingCompiler.scala:186)
[error]     at sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$3(MixedAnalyzingCompiler.scala:82)
[error]     at sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$3$adapted(MixedAnalyzingCompiler.scala:77)
[error]     at sbt.internal.inc.JarUtils$.withPreviousJar(JarUtils.scala:215)
[error]     at sbt.internal.inc.MixedAnalyzingCompiler.compileScala$1(MixedAnalyzingCompiler.scala:77)
[error]     at sbt.internal.inc.MixedAnalyzingCompiler.compile(MixedAnalyzingCompiler.scala:146)
[error]     at sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1(IncrementalCompilerImpl.scala:343)
[error]     at sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1$adapted(IncrementalCompilerImpl.scala:343)
[error]     at sbt.internal.inc.Incremental$.doCompile(Incremental.scala:120)
[error]     at sbt.internal.inc.Incremental$.$anonfun$compile$4(Incremental.scala:100)
[error]     at sbt.internal.inc.IncrementalCommon.recompileClasses(IncrementalCommon.scala:180)
[error]     at sbt.internal.inc.IncrementalCommon.cycle(IncrementalCommon.scala:98)
[error]     at sbt.internal.inc.Incremental$.$anonfun$compile$3(Incremental.scala:102)
[error]     at sbt.internal.inc.Incremental$.manageClassfiles(Incremental.scala:155)
[error]     at sbt.internal.inc.Incremental$.compile(Incremental.scala:92)
[error]     at sbt.internal.inc.IncrementalCompile$.apply(Compile.scala:75)
[error]     at sbt.internal.inc.IncrementalCompilerImpl.compileInternal(IncrementalCompilerImpl.scala:348)
[error]     at sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileIncrementally$1(IncrementalCompilerImpl.scala:301)
[error]     at sbt.internal.inc.IncrementalCompilerImpl.handleCompilationError(IncrementalCompilerImpl.scala:168)
[error]     at sbt.internal.inc.IncrementalCompilerImpl.compileIncrementally(IncrementalCompilerImpl.scala:248)
[error]     at sbt.internal.inc.IncrementalCompilerImpl.compile(IncrementalCompilerImpl.scala:74)
[error]     at sbt.Defaults$.compileIncrementalTaskImpl(Defaults.scala:1736)
[error]     at sbt.Defaults$.$anonfun$compileIncrementalTask$1(Defaults.scala:1709)
[error]     at scala.Function1.$anonfun$compose$1(Function1.scala:49)
[error]     at sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:62)
[error]     at sbt.std.Transform$$anon$4.work(Transform.scala:67)
[error]     at sbt.Execute.$anonfun$submit$2(Execute.scala:280)
[error]     at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:19)
[error]     at sbt.Execute.work(Execute.scala:289)
[error]     at sbt.Execute.$anonfun$submit$1(Execute.scala:280)
[error]     at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:178)
[error]     at sbt.CompletionService$$anon$2.call(CompletionService.scala:37)
[error]     at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error]     at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
[error]     at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error]     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
[error]     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
[error]     at java.lang.Thread.run(Thread.java:748)
[error] (Compile / compileIncremental) java.lang.AssertionError: assertion failed:
[error]
[error]      while compiling: /Users/zcox/code/zcox/avro4s3-test/src/main/scala/test.scala
[error]         during phase: delambdafy
[error]      library version: version 2.12.8
[error]     compiler version: version 2.12.8
[error]   reconstructed args: -language:higherKinds -feature -classpath /Users/zcox/code/zcox/avro4s3-test/target/scala-2.12/classes:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-core_2.12/3.6.7/json4s-core_2.12-3.6.7.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-scalap_2.12/3.6.7/json4s-scalap_2.12-3.6.7.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/typelevel/macro-compat_2.12/1.1.1/macro-compat_2.12-1.1.1.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.9.0/jackson-annotations-2.9.0.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/commons/commons-compress/1.18/commons-compress-1.18.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.9.8/jackson-core-2.9.8.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-ast_2.12/3.6.7/json4s-ast_2.12-3.6.7.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/chuusai/shapeless_2.12/2.3.3/shapeless_2.12-2.3.3.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/thoughtworks/paranamer/paranamer/2.8/paranamer-2.8.jar:/Users/zcox/.sbt/boot/scala-2.12.8/lib/scala-compiler.jar:/Users/zcox/.sbt/boot/scala-2.12.8/lib/scala-reflect.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/propensive/magnolia_2.12/0.11.0/magnolia_2.12-0.11.0.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/sksamuel/avro4s/avro4s-core_2.12/3.0.1/avro4s-core_2.12-3.0.1.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/avro/avro/1.9.0/avro-1.9.0.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/json4s/json4s-native_2.12/3.6.7/json4s-native_2.12-3.6.7.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.9.8/jackson-databind-2.9.8.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-xml_2.12/1.0.6/scala-xml_2.12-1.0.6.jar:/Users/zcox/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/propensive/mercator_2.12/0.2.1/mercator_2.12-0.2.1.jar -bootclasspath /Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home/jre/classes:/Users/zcox/.sbt/boot/scala-2.12.8/lib/scala-library.jar
[error]
[error]   last tree to typer: Literal(Constant(test.A2))
[error]        tree position: line 36 of /Users/zcox/code/zcox/avro4s3-test/src/main/scala/test.scala
[error]             tree tpe: Class(classOf[test.A2])
[error]               symbol: null
[error]            call site: method constructMonadic in package test
[error]
[error] == Source file context for tree position ==
[error]
[error]     33   as2: As,
[error]     34 )
[error]     35 object Bad1 {
[error]     36   implicit val recordFormat = RecordFormat[Bad1]
[error]     37 }
[error]     38
[error] Total time: 7 s, completed Sep 12, 2019 10:44:43 AM
```