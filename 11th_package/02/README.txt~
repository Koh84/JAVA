//"package" keyword is used to define where a class need to be store after being compiled 
//compile using javac -d . Pack.java
//explain above, create the folders in current path
//execute using java a.b.c.d.Pack 

//"import" keyword is used to define what class and where I should import it from

//javac -d . lisi/Math.jav
//javac -d . zhangshan/Math.java 
//javac -d . zhangshan/Print.java 
//javac -d . Pack.java 

//java Pack

//To give client, you need to give Pack.class and folder "a" containing all the above
//using jar, 
//jar -help 
//use jar -cvf my.jar a command - to compress folders a and everything inside into a my.jar
root@book-virtual-machine:/work/JAVA/11th_package/02# jar -cvf my.jar a
added manifest
adding: a/(in = 0) (out= 0)(stored 0%)
adding: a/b/(in = 0) (out= 0)(stored 0%)
adding: a/b/c/(in = 0) (out= 0)(stored 0%)
adding: a/b/c/d1/(in = 0) (out= 0)(stored 0%)
adding: a/b/c/d1/Math.class(in = 247) (out= 194)(deflated 21%)
adding: a/b/c/d2/(in = 0) (out= 0)(stored 0%)
adding: a/b/c/d2/Math.class(in = 297) (out= 222)(deflated 25%)
adding: a/b/c/d2/Print.class(in = 410) (out= 289)(deflated 29%)



//but when you try executing using java Pack, you can't find these clases
//to overcome this, we need to define evironment variable CLASSPATH
Exception in thread "main" java.lang.NoClassDefFoundError: a/b/c/d1/Math
	at Pack.main(Pack.java:18)
Caused by: java.lang.ClassNotFoundException: a.b.c.d1.Math
	at java.net.URLClassLoader$1.run(URLClassLoader.java:359)
	at java.net.URLClassLoader$1.run(URLClassLoader.java:348)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.net.URLClassLoader.findClass(URLClassLoader.java:347)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:425)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:308)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:358)
	... 1 more
root@book-virtual-machine:/work/JAVA/11th_package/02# 

//use javac Pack.java -verbose to find out which directory this class trying to search for the other library
//then we can export CLASSPATH=.:my.jar
//explain above, find in current directory if not in my.jar
//then recompile using javac Pack.java
//execute using java Pack

//two main function of CLASSPATH path
//one is when compiling, tell the compiler where to find these files
//one is when executing java app, tell the vm where to find these libraries


root@book-virtual-machine:/work/JAVA/11th_package/02# export CLASSPATH=.:my.jar
root@book-virtual-machine:/work/JAVA/11th_package/02# javac Pack.java -verbose
[parsing started RegularFileObject[Pack.java]]
[parsing completed 17ms]
[search path for source files: .,my.jar]
[search path for class files: /usr/lib/jvm/java-7-openjdk-amd64/jre/lib/resources.jar,/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/rt.jar,/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/sunrsasign.jar,/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/jsse.jar,/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/jce.jar,/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/charsets.jar,/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/rhino.jar,/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/jfr.jar,/usr/lib/jvm/java-7-openjdk-amd64/jre/classes,/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/ext/icedtea-sound.jar,/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/ext/dnsns.jar,/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/ext/sunpkcs11.jar,/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/ext/localedata.jar,/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/ext/java-atk-wrapper.jar,/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/ext/sunjce_provider.jar,/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/ext/zipfs.jar,.,my.jar]
[loading ZipFileIndexFileObject[/usr/lib/jvm/java-7-openjdk-amd64/lib/ct.sym(META-INF/sym/rt.jar/java/lang/Object.class)]]
[loading ZipFileIndexFileObject[/usr/lib/jvm/java-7-openjdk-amd64/lib/ct.sym(META-INF/sym/rt.jar/java/lang/String.class)]]
[checking Pack]
[loading ZipFileIndexFileObject[/usr/lib/jvm/java-7-openjdk-amd64/lib/ct.sym(META-INF/sym/rt.jar/java/lang/AutoCloseable.class)]]
[loading ZipFileIndexFileObject[my.jar(a/b/c/d1/Math.class)]]
[loading ZipFileIndexFileObject[/usr/lib/jvm/java-7-openjdk-amd64/lib/ct.sym(META-INF/sym/rt.jar/java/lang/System.class)]]
[loading ZipFileIndexFileObject[/usr/lib/jvm/java-7-openjdk-amd64/lib/ct.sym(META-INF/sym/rt.jar/java/io/PrintStream.class)]]
[loading ZipFileIndexFileObject[/usr/lib/jvm/java-7-openjdk-amd64/lib/ct.sym(META-INF/sym/rt.jar/java/io/FilterOutputStream.class)]]
[loading ZipFileIndexFileObject[/usr/lib/jvm/java-7-openjdk-amd64/lib/ct.sym(META-INF/sym/rt.jar/java/io/OutputStream.class)]]
[loading ZipFileIndexFileObject[my.jar(a/b/c/d2/Math.class)]]
[loading ZipFileIndexFileObject[my.jar(a/b/c/d2/Print.class)]]
[wrote RegularFileObject[Pack.class]]
[total 426ms]





