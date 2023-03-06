# poc oracle-jdbc

## Stack trace

```
#15 66.76 [INFO] --- quarkus:2.16.3.Final:build (default) @ test-application ---
#15 67.90 [WARNING] [io.quarkus.deployment.steps.NativeImageAllowIncompleteClasspathAggregateStep] The following extensions have required native-image to allow run-time resolution of classes: {quarkus-jdbc-oracle}. This is a global requirement which might have unexpected effects on other extensions as 
well, and is a hint of the library needing some additional refactoring to better support GraalVM native-image. In the case of 3rd party dependencies and/or proprietary code there is not much we can do - please ask for support to your library vendor. If you incur in any problem with other Quarkus extensions, please try reproducing the problem without these extensions first.
#15 69.26 [INFO] [org.hibernate.Version] HHH000412: Hibernate ORM core version 5.6.15.Final
#15 70.45 [INFO] [io.quarkus.deployment.pkg.steps.JarResultBuildStep] Building native image source jar: /code/target/test-application-1.0-native-image-source-jar/test-application-1.0-runner.jar
#15 73.09 [INFO] [io.quarkus.deployment.pkg.steps.NativeImageBuildStep] Building native image from /code/target/test-application-1.0-native-image-source-jar/test-application-1.0-runner.jar
#15 73.14 [INFO] [io.quarkus.deployment.pkg.steps.NativeImageBuildStep] Running Quarkus native-image 
plugin on GraalVM 22.3.1 Java 17 CE (Java Version 17.0.6+10-jvmci-22.3-b13)
#15 73.15 [INFO] [io.quarkus.deployment.pkg.steps.NativeImageBuildRunner] /opt/graalvm/bin/native-image -J-Dsun.nio.ch.maxUpdateArraySize=100 -J-DCoordinatorEnvironmentBean.transactionStatusManagerEnable=false -J-Dlogging.initial-configurator.min-level=500 -J-Djava.util.logging.manager=org.jboss.logmanager.LogManager -J-Dvertx.logger-delegate-factory-class-name=io.quarkus.vertx.core.runtime.VertxLogDelegateFactory -J-Dvertx.disableDnsResolver=true -J-Dio.netty.noUnsafe=true -J-Dio.netty.leakDetection.level=DISABLED -J-Dio.netty.allocator.maxOrder=3 -J-Duser.language=en -J-Duser.country=US -J-Dfile.encoding=UTF-8 --features=io.quarkus.runner.Feature,io.quarkus.runtime.graal.ResourcesFeature,io.quarkus.runtime.graal.DisableLoggingFeature,io.quarkus.caffeine.runtime.graal.CacheConstructorsFeature,org.hibernate.graalvm.internal.QueryParsingSupport,io.quarkus.hibernate.orm.runtime.graal.DisableLoggingFeature,org.hibernate.graalvm.internal.GraalVMStaticFeature,io.quarkus.hibernate.validator.runtime.DisableLoggingFeature -J--add-exports=java.security.jgss/sun.security.krb5=ALL-UNNAMED -J--add-opens=java.base/java.text=ALL-UNNAMED -J--add-opens=java.base/java.io=ALL-UNNAMED -J--add-opens=java.base/java.lang.invoke=ALL-UNNAMED -J--add-opens=java.base/java.util=ALL-UNNAMED -H:+CollectImageBuildStatistics -H:ImageBuildStatisticsFile=test-application-1.0-runner-timing-stats.json -H:BuildOutputJSONFile=test-application-1.0-runner-build-output-stats.json --trace-class-initialization=oracle.jdbc.driver.BlockSource\$ThreadedCachingBlockSource,oracle.jdbc.driver.BlockSource\$ThreadedCachingBlockSource\$BlockReleaser -H:ResourceConfigurationFiles=resources-config.json -H:ReflectionConfigurationFiles=reflection-config.json -H:+AllowFoldMethods -J-Djava.awt.headless=true --no-fallback -H:+ReportExceptionStackTraces -g -H:DebugInfoSourceSearchPath=app-sources -J-Xmx4G -H:-AddAllCharsets --enable-url-protocols=http,https -H:NativeLinkerOption=-no-pie -H:-UseServiceLoaderFeature -H:+StackTrace -J--add-exports=org.graalvm.sdk/org.graalvm.nativeimage.impl=ALL-UNNAMED -J--add-exports=org.graalvm.nativeimage.builder/com.oracle.svm.core.jdk=ALL-UNNAMED --exclude-config io\.netty\.netty-codec /META-INF/native-image/io\.netty/netty-codec/generated/handlers/reflect-config\.json --exclude-config io\.netty\.netty-handler /META-INF/native-image/io\.netty/netty-handler/generated/handlers/reflect-config\.json --exclude-config com\.oracle\.database\.jdbc /META-INF/native-image/native-image\.properties --exclude-config com\.oracle\.database\.jdbc /META-INF/native-image/reflect-config\.json test-application-1.0-runner -jar test-application-1.0-runner.jar
#15 104.3 ========================================================================================================================
#15 104.3 GraalVM Native Image: Generating 'test-application-1.0-runner' (executable)...
#15 104.3 ========================================================================================================================
#15 105.3 Warning: Feature class oracle.nativeimage.NativeImageFeature is annotated with the deprecated annotation @AutomaticFeature. Support for this annotation will be removed in a future version of GraalVM. Applications should register a feature using the option --features=oracle.nativeimage.NativeImageFeature
#15 113.7 [1/7] Initializing...
             (37.6s @ 0.64GB)
#15 113.7  Version info: 'GraalVM 22.3.1 Java 17 CE'
#15 113.7  Java version info: '17.0.6+10-jvmci-22.3-b13'
#15 113.7  C compiler: gcc (redhat, x86_64, 8.5.0)
#15 113.7  Garbage collector: Serial GC
#15 113.7  9 user-specific feature(s)
#15 113.7  - io.quarkus.caffeine.runtime.graal.CacheConstructorsFeature
#15 113.7  - io.quarkus.hibernate.orm.runtime.graal.DisableLoggingFeature: Disables INFO logging during the analysis phase for the [org.hibernate.Version, org.hibernate.annotations.common.Version, org.hibernate.dialect.Dialect] categories
#15 113.7  - io.quarkus.hibernate.validator.runtime.DisableLoggingFeature: Disables INFO logging during the analysis phase for the [org.hibernate.validator.internal.util.Version] categories
#15 113.7  - io.quarkus.runner.Feature: Auto-generated class by Quarkus from the existing extensions 
#15 113.7  - io.quarkus.runtime.graal.DisableLoggingFeature: Disables INFO logging during the analysis phase for the [org.jboss.threads] categories
#15 113.7  - io.quarkus.runtime.graal.ResourcesFeature: Register each line in META-INF/quarkus-native-resources.txt as a resource on Substrate VM
#15 113.7  - oracle.nativeimage.NativeImageFeature
#15 113.7  - org.hibernate.graalvm.internal.GraalVMStaticFeature: Hibernate ORM's static reflection registrations for GraalVM
#15 113.7  - org.hibernate.graalvm.internal.QueryParsingSupport: Hibernate ORM's support for HQL Parser in GraalVM
#15 114.1 The bundle named: com/sun/rowset/RowSetResourceBundle, has not been found. If the bundle is part of a module, verify the bundle name is a fully qualified class name. Otherwise verify the bundle path is accessible in the classpath.
#15 363.3 [2/7] Performing analysis...  [*********]
            (248.8s @ 1.64GB)
#15 363.3   19,822 (89.66%) of 22,109 classes reachable
#15 363.3   30,345 (60.65%) of 50,034 fields reachable
#15 363.4   97,575 (53.55%) of 182,206 methods reachable
#15 363.4      722 classes,   402 fields, and 3,356 methods registered for reflection
#15 363.4       70 classes,    91 fields, and    56 methods registered for JNI access
#15 363.4        4 native libraries: dl, pthread, rt, z
#15 391.2 [3/7] Building universe...
             (27.8s @ 1.84GB)
#15 422.2 [4/7] Parsing methods...      [*****]
             (31.0s @ 1.76GB)
#15 439.0 [5/7] Inlining methods...     [***]
             (16.1s @ 2.15GB)
#15 654.2 [6/7] Compiling methods...    [**************]
            (215.2s @ 2.51GB)
#15 766.0
#15 766.0 [7/7] Creating image...
              (0.0s @ 2.22GB)
#15 766.0 Error: Classes that should be initialized at run time got initialized during image building:
#15 766.0  oracle.jdbc.driver.BlockSource$ThreadedCachingBlockSource$BlockReleaser the class was requested to be initialized at run time (from feature io.quarkus.runner.Feature.beforeAnalysis with 'BlockSource$ThreadedCachingBlockSource$BlockReleaser.class'). oracle.jdbc.driver.BlockSource$ThreadedCachingBlockSource caused initialization of this class with the following trace:
#15 766.0       at oracle.jdbc.driver.BlockSource$ThreadedCachingBlockSource$BlockReleaser.<clinit>(BlockSource.java:313)
#15 766.0       at oracle.jdbc.driver.BlockSource$ThreadedCachingBlockSource.<clinit>(BlockSource.java:454)
#15 766.0
#15 766.0 oracle.jdbc.driver.BlockSource$ThreadedCachingBlockSource the class was requested to be initialized at run time (from feature io.quarkus.runner.Feature.beforeAnalysis with 'BlockSource$ThreadedCachingBlockSource.class'). oracle.jdbc.driver.BlockSource$ThreadedCachingBlockSource caused initialization of this class with the following trace:
#15 766.0       at oracle.jdbc.driver.BlockSource$ThreadedCachingBlockSource.<clinit>(BlockSource.java:288)
#15 766.0       at oracle.jdbc.driver.BlockSource$ThreadedCachingBlockSource$BlockReleaserListener.handleNotification(BlockSource.java:435)
#15 766.0       at sun.management.NotificationEmitterSupport.sendNotification(NotificationEmitterSupport.java:155)
#15 766.0       at sun.management.MemoryImpl.createNotification(MemoryImpl.java:161)
#15 766.0       at sun.management.MemoryPoolImpl$CollectionSensor.triggerAction(MemoryPoolImpl.java:326)
#15 766.0       at sun.management.Sensor.trigger(Sensor.java:134)
#15 766.0
#15 766.0
#15 766.0 com.oracle.svm.core.util.UserError$UserException: Classes that should be initialized at run time got initialized during image building:
#15 766.0  oracle.jdbc.driver.BlockSource$ThreadedCachingBlockSource$BlockReleaser the class was requested to be initialized at run time (from feature io.quarkus.runner.Feature.beforeAnalysis with 'BlockSource$ThreadedCachingBlockSource$BlockReleaser.class'). oracle.jdbc.driver.BlockSource$ThreadedCachingBlockSource caused initialization of this class with the following trace:
#15 766.0       at oracle.jdbc.driver.BlockSource$ThreadedCachingBlockSource$BlockReleaser.<clinit>(BlockSource.java:313)
#15 766.0       at oracle.jdbc.driver.BlockSource$ThreadedCachingBlockSource.<clinit>(BlockSource.java:454)
#15 766.0
#15 766.0 oracle.jdbc.driver.BlockSource$ThreadedCachingBlockSource the class was requested to be initialized at run time (from feature io.quarkus.runner.Feature.beforeAnalysis with 'BlockSource$ThreadedCachingBlockSource.class'). oracle.jdbc.driver.BlockSource$ThreadedCachingBlockSource caused initialization of this class with the following trace:
#15 766.0       at oracle.jdbc.driver.BlockSource$ThreadedCachingBlockSource.<clinit>(BlockSource.java:288)
#15 766.0       at oracle.jdbc.driver.BlockSource$ThreadedCachingBlockSource$BlockReleaserListener.handleNotification(BlockSource.java:435)
#15 766.0       at sun.management.NotificationEmitterSupport.sendNotification(NotificationEmitterSupport.java:155)
#15 766.0       at sun.management.MemoryImpl.createNotification(MemoryImpl.java:161)
#15 766.0       at sun.management.MemoryPoolImpl$CollectionSensor.triggerAction(MemoryPoolImpl.java:326)
#15 766.0       at sun.management.Sensor.trigger(Sensor.java:134)
#15 766.0
#15 766.0
#15 766.0       at org.graalvm.nativeimage.builder/com.oracle.svm.core.util.UserError.abort(UserError.java:73)
#15 766.0       at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.classinitialization.ProvenSafeClassInitializationSupport.checkDelayedInitialization(ProvenSafeClassInitializationSupport.java:273)
#15 766.0       at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.classinitialization.ClassInitializationFeature.afterImageWrite(ClassInitializationFeature.java:244)
#15 766.0       at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGenerator.lambda$doRun$8(NativeImageGenerator.java:724)
#15 766.0       at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.FeatureHandler.forEachFeature(FeatureHandler.java:85)
#15 766.0       at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGenerator.doRun(NativeImageGenerator.java:724)
#15 766.0       at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGenerator.run(NativeImageGenerator.java:535)
#15 766.0       at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGeneratorRunner.buildImage(NativeImageGeneratorRunner.java:403)
#15 766.0       at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGeneratorRunner.build(NativeImageGeneratorRunner.java:580)
#15 766.0       at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGeneratorRunner.main(NativeImageGeneratorRunner.java:128)
#15 766.0 ------------------------------------------------------------------------------------------------------------------------
#15 766.0                        70.6s (10.2% of total time) in 151 GCs | Peak RSS: 4.96GB | CPU load: 3.38
#15 766.0 ------------------------------------------------------------------------------------------------------------------------
#15 766.0 Produced artifacts:
#15 766.1  /code/target/test-application-1.0-native-image-source-jar/sources (debug_info)
#15 766.1  /code/target/test-application-1.0-native-image-source-jar/test-application-1.0-runner (executable, debug_info)
#15 766.1  /code/target/test-application-1.0-native-image-source-jar/test-application-1.0-runner-timing-stats.json (raw)
#15 766.1  /code/target/test-application-1.0-native-image-source-jar/test-application-1.0-runner.build_artifacts.txt (txt)
#15 766.1 ========================================================================================================================
#15 766.1 Failed generating 'test-application-1.0-runner' after 11m 30s.
#15 766.2 Error: Image build request failed with exit status 1
#15 766.7 [INFO] ------------------------------------------------------------------------
#15 766.7 [INFO] BUILD FAILURE
#15 766.7 [INFO] ------------------------------------------------------------------------
#15 766.7 [INFO] Total time:  12:41 min
#15 766.7 [INFO] Finished at: 2023-03-06T10:36:49Z
#15 766.7 [INFO] ------------------------------------------------------------------------
#15 766.7 [ERROR] Failed to execute goal io.quarkus.platform:quarkus-maven-plugin:2.16.3.Final:build 
(default) on project test-application: Failed to build quarkus application: io.quarkus.builder.BuildException: Build failure: Build failed due to errors
#15 766.7 [ERROR]       [error]: Build step io.quarkus.deployment.pkg.steps.NativeImageBuildStep#build threw an exception: io.quarkus.deployment.pkg.steps.NativeImageBuildStep$ImageGenerationFailureException: Image generation failed. Exit code: 1
#15 766.7 [ERROR]       at io.quarkus.deployment.pkg.steps.NativeImageBuildStep.imageGenerationFailed(NativeImageBuildStep.java:422)
#15 766.7 [ERROR]       at io.quarkus.deployment.pkg.steps.NativeImageBuildStep.build(NativeImageBuildStep.java:263)
#15 766.7 [ERROR]       at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
#15 766.7 [ERROR]       at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
#15 766.7 [ERROR]       at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
#15 766.7 [ERROR]       at java.base/java.lang.reflect.Method.invoke(Method.java:568)
#15 766.7 [ERROR]       at io.quarkus.deployment.ExtensionLoader$3.execute(ExtensionLoader.java:909) 
#15 766.7 [ERROR]       at io.quarkus.builder.BuildContext.run(BuildContext.java:281)
#15 766.7 [ERROR]       at org.jboss.threads.ContextHandler$1.runWith(ContextHandler.java:18)        
#15 766.7 [ERROR]       at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
#15 766.7 [ERROR]       at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
#15 766.7 [ERROR]       at java.base/java.lang.Thread.run(Thread.java:833)
#15 766.7 [ERROR]       at org.jboss.threads.JBossThread.run(JBossThread.java:501)
#15 766.7 [ERROR] -> [Help 1]
#15 766.7 org.apache.maven.lifecycle.LifecycleExecutionException: Failed to execute goal io.quarkus.platform:quarkus-maven-plugin:2.16.3.Final:build (default) on project test-application: Failed to build quarkus application
#15 766.7     at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute2 (MojoExecutor.java:347) 
#15 766.7     at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute (MojoExecutor.java:330)  
#15 766.7     at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:213)    
#15 766.7     at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:175)    
#15 766.7     at org.apache.maven.lifecycle.internal.MojoExecutor.access$000 (MojoExecutor.java:76)  
#15 766.7     at org.apache.maven.lifecycle.internal.MojoExecutor$1.run (MojoExecutor.java:163)      
#15 766.7     at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute (DefaultMojosExecutionStrategy.java:39)
#15 766.7     at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:160)    
#15 766.7     at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:105)
#15 766.7     at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:73)
#15 766.7     at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:53)
#15 766.7     at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:118)
#15 766.7     at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:260)
#15 766.7     at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:172)
#15 766.7     at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:100)
#15 766.7     at org.apache.maven.cli.MavenCli.execute (MavenCli.java:821)
#15 766.7     at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:270)
#15 766.7     at org.apache.maven.cli.MavenCli.main (MavenCli.java:192)
#15 766.7     at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
#15 766.7     at jdk.internal.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:77)
#15 766.7     at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
#15 766.7     at java.lang.reflect.Method.invoke (Method.java:568)
#15 766.7     at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:282)#15 766.7     at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:225)        
#15 766.7     at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:406)
#15 766.7     at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:347)
#15 766.7     at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
#15 766.7     at jdk.internal.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:77)
#15 766.7     at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
#15 766.7     at java.lang.reflect.Method.invoke (Method.java:568)
#15 766.7     at org.apache.maven.wrapper.BootstrapMainStarter.start (BootstrapMainStarter.java:53)  
#15 766.7     at org.apache.maven.wrapper.WrapperExecutor.execute (WrapperExecutor.java:152)
#15 766.7     at org.apache.maven.wrapper.MavenWrapperMain.main (MavenWrapperMain.java:76)
#15 766.7 Caused by: org.apache.maven.plugin.MojoExecutionException: Failed to build quarkus application
#15 766.8     at io.quarkus.maven.BuildMojo.doExecute (BuildMojo.java:170)
#15 766.8     at io.quarkus.maven.QuarkusBootstrapMojo.execute (QuarkusBootstrapMojo.java:154)       
#15 766.8     at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:126)
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute2 (MojoExecutor.java:342) 
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute (MojoExecutor.java:330)  
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:213)    
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:175)    
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor.access$000 (MojoExecutor.java:76)  
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor$1.run (MojoExecutor.java:163)      
#15 766.8     at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute (DefaultMojosExecutionStrategy.java:39)
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:160)
#15 766.8     at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:105)
#15 766.8     at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:73)
#15 766.8     at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:53)
#15 766.8     at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:118)
#15 766.8     at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:260)
#15 766.8     at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:172)
#15 766.8     at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:100)
#15 766.8     at org.apache.maven.cli.MavenCli.execute (MavenCli.java:821)
#15 766.8     at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:270)
#15 766.8     at org.apache.maven.cli.MavenCli.main (MavenCli.java:192)
#15 766.8     at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
#15 766.8     at jdk.internal.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:77)
#15 766.8     at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
#15 766.8     at java.lang.reflect.Method.invoke (Method.java:568)
#15 766.8     at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:282)#15 766.8     at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:225)        
#15 766.8     at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:406)
#15 766.8     at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:347)
#15 766.8     at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
#15 766.8     at jdk.internal.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:77)
#15 766.8     at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
#15 766.8     at java.lang.reflect.Method.invoke (Method.java:568)
#15 766.8     at org.apache.maven.wrapper.BootstrapMainStarter.start (BootstrapMainStarter.java:53)  
#15 766.8     at org.apache.maven.wrapper.WrapperExecutor.execute (WrapperExecutor.java:152)
#15 766.8     at org.apache.maven.wrapper.MavenWrapperMain.main (MavenWrapperMain.java:76)
#15 766.8 Caused by: java.lang.RuntimeException: io.quarkus.builder.BuildException: Build failure: Build failed due to errors
#15 766.8       [error]: Build step io.quarkus.deployment.pkg.steps.NativeImageBuildStep#build threw 
an exception: io.quarkus.deployment.pkg.steps.NativeImageBuildStep$ImageGenerationFailureException: Image generation failed. Exit code: 1
#15 766.8       at io.quarkus.deployment.pkg.steps.NativeImageBuildStep.imageGenerationFailed(NativeImageBuildStep.java:422)
#15 766.8       at io.quarkus.deployment.pkg.steps.NativeImageBuildStep.build(NativeImageBuildStep.java:263)
#15 766.8       at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)    
#15 766.8       at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
#15 766.8       at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
#15 766.8       at java.base/java.lang.reflect.Method.invoke(Method.java:568)
#15 766.8       at io.quarkus.deployment.ExtensionLoader$3.execute(ExtensionLoader.java:909)
#15 766.8       at io.quarkus.builder.BuildContext.run(BuildContext.java:281)
#15 766.8       at org.jboss.threads.ContextHandler$1.runWith(ContextHandler.java:18)
#15 766.8       at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449) 
#15 766.8       at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
#15 766.8       at java.base/java.lang.Thread.run(Thread.java:833)
#15 766.8       at org.jboss.threads.JBossThread.run(JBossThread.java:501)
#15 766.8
#15 766.8     at io.quarkus.runner.bootstrap.AugmentActionImpl.runAugment (AugmentActionImpl.java:335)
#15 766.8     at io.quarkus.runner.bootstrap.AugmentActionImpl.createProductionApplication (AugmentActionImpl.java:175)
#15 766.8     at io.quarkus.maven.BuildMojo.doExecute (BuildMojo.java:133)
#15 766.8     at io.quarkus.maven.QuarkusBootstrapMojo.execute (QuarkusBootstrapMojo.java:154)       
#15 766.8     at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:126)
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute2 (MojoExecutor.java:342) 
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute (MojoExecutor.java:330)  
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:213)    
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:175)    
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor.access$000 (MojoExecutor.java:76)  
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor$1.run (MojoExecutor.java:163)
#15 766.8     at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute (DefaultMojosExecutionStrategy.java:39)
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:160)    
#15 766.8     at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:105)
#15 766.8     at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:73)
#15 766.8     at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:53)
#15 766.8     at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:118)
#15 766.8     at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:260)
#15 766.8     at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:172)
#15 766.8     at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:100)
#15 766.8     at org.apache.maven.cli.MavenCli.execute (MavenCli.java:821)
#15 766.8     at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:270)
#15 766.8     at org.apache.maven.cli.MavenCli.main (MavenCli.java:192)
#15 766.8     at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
#15 766.8     at jdk.internal.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:77)
#15 766.8     at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
#15 766.8     at java.lang.reflect.Method.invoke (Method.java:568)
#15 766.8     at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:282)#15 766.8     at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:225)        
#15 766.8     at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:406)
#15 766.8     at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:347)
#15 766.8     at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
#15 766.8     at jdk.internal.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:77)
#15 766.8     at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
#15 766.8     at java.lang.reflect.Method.invoke (Method.java:568)
#15 766.8     at org.apache.maven.wrapper.BootstrapMainStarter.start (BootstrapMainStarter.java:53)  
#15 766.8     at org.apache.maven.wrapper.WrapperExecutor.execute (WrapperExecutor.java:152)
#15 766.8     at org.apache.maven.wrapper.MavenWrapperMain.main (MavenWrapperMain.java:76)
#15 766.8 Caused by: io.quarkus.builder.BuildException: Build failure: Build failed due to errors    
#15 766.8       [error]: Build step io.quarkus.deployment.pkg.steps.NativeImageBuildStep#build threw 
an exception: io.quarkus.deployment.pkg.steps.NativeImageBuildStep$ImageGenerationFailureException: Image generation failed. Exit code: 1
#15 766.8       at io.quarkus.deployment.pkg.steps.NativeImageBuildStep.imageGenerationFailed(NativeImageBuildStep.java:422)
#15 766.8       at io.quarkus.deployment.pkg.steps.NativeImageBuildStep.build(NativeImageBuildStep.java:263)
#15 766.8       at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)    
#15 766.8       at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
#15 766.8       at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
#15 766.8       at java.base/java.lang.reflect.Method.invoke(Method.java:568)
#15 766.8       at io.quarkus.deployment.ExtensionLoader$3.execute(ExtensionLoader.java:909)
#15 766.8       at io.quarkus.builder.BuildContext.run(BuildContext.java:281)
#15 766.8       at org.jboss.threads.ContextHandler$1.runWith(ContextHandler.java:18)
#15 766.8       at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449) 
#15 766.8       at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
#15 766.8       at java.base/java.lang.Thread.run(Thread.java:833)
#15 766.8       at org.jboss.threads.JBossThread.run(JBossThread.java:501)
#15 766.8
#15 766.8     at io.quarkus.builder.Execution.run (Execution.java:123)
#15 766.8     at io.quarkus.builder.BuildExecutionBuilder.execute (BuildExecutionBuilder.java:79)    
#15 766.8     at io.quarkus.deployment.QuarkusAugmentor.run (QuarkusAugmentor.java:160)
#15 766.8     at io.quarkus.runner.bootstrap.AugmentActionImpl.runAugment (AugmentActionImpl.java:331)
#15 766.8     at io.quarkus.runner.bootstrap.AugmentActionImpl.createProductionApplication (AugmentActionImpl.java:175)
#15 766.8     at io.quarkus.maven.BuildMojo.doExecute (BuildMojo.java:133)
#15 766.8     at io.quarkus.maven.QuarkusBootstrapMojo.execute (QuarkusBootstrapMojo.java:154)       
#15 766.8     at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:126)
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute2 (MojoExecutor.java:342) 
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute (MojoExecutor.java:330)  
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:213)    
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:175)    
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor.access$000 (MojoExecutor.java:76)
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor$1.run (MojoExecutor.java:163)
#15 766.8     at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute (DefaultMojosExecutionStrategy.java:39)
#15 766.8     at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:160)    
#15 766.8     at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:105)
#15 766.8     at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:73)
#15 766.8     at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:53)
#15 766.8     at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:118)
#15 766.8     at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:260)
#15 766.8     at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:172)
#15 766.8     at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:100)
#15 766.8     at org.apache.maven.cli.MavenCli.execute (MavenCli.java:821)
#15 766.8     at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:270)
#15 766.8     at org.apache.maven.cli.MavenCli.main (MavenCli.java:192)
#15 766.8     at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
#15 766.8     at jdk.internal.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:77)
#15 766.8     at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
#15 766.8     at java.lang.reflect.Method.invoke (Method.java:568)
#15 766.8     at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:282)#15 766.8     at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:225)        
#15 766.8     at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:406)
#15 766.8     at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:347)
#15 766.8     at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
#15 766.8     at jdk.internal.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:77)
#15 766.8     at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
#15 766.8     at java.lang.reflect.Method.invoke (Method.java:568)
#15 766.8     at org.apache.maven.wrapper.BootstrapMainStarter.start (BootstrapMainStarter.java:53)
#15 766.8     at org.apache.maven.wrapper.WrapperExecutor.execute (WrapperExecutor.java:152)
#15 766.8     at org.apache.maven.wrapper.MavenWrapperMain.main (MavenWrapperMain.java:76)
#15 766.8 Caused by: io.quarkus.deployment.pkg.steps.NativeImageBuildStep$ImageGenerationFailureException: Image generation failed. Exit code: 1
#15 766.8     at io.quarkus.deployment.pkg.steps.NativeImageBuildStep.imageGenerationFailed (NativeImageBuildStep.java:422)
#15 766.8     at io.quarkus.deployment.pkg.steps.NativeImageBuildStep.build (NativeImageBuildStep.java:263)
#15 766.8     at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
#15 766.8     at jdk.internal.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:77)
#15 766.8     at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
#15 766.8     at java.lang.reflect.Method.invoke (Method.java:568)
#15 766.8     at io.quarkus.deployment.ExtensionLoader$3.execute (ExtensionLoader.java:909)
#15 766.8     at io.quarkus.builder.BuildContext.run (BuildContext.java:281)
#15 766.8     at org.jboss.threads.ContextHandler$1.runWith (ContextHandler.java:18)
#15 766.8     at org.jboss.threads.EnhancedQueueExecutor$Task.run (EnhancedQueueExecutor.java:2449)  
#15 766.8     at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run (EnhancedQueueExecutor.java:1478)
#15 766.8     at java.lang.Thread.run (Thread.java:833)
#15 766.8     at org.jboss.threads.JBossThread.run (JBossThread.java:501)
#15 766.8 [ERROR]
#15 766.8 [ERROR] Re-run Maven using the -X switch to enable full debug logging.
#15 766.8 [ERROR]
#15 766.8 [ERROR] For more information about the errors and possible solutions, please read the following articles:
#15 766.8 [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
```