root@book-virtual-machine:/work/JAVA/12_access_control/03# javac -d . Mymath.java 
root@book-virtual-machine:/work/JAVA/12_access_control/03# javac -d . Pack.java 
root@book-virtual-machine:/work/JAVA/12_access_control/03# java Pack
Error: Could not find or load main class Pack
root@book-virtual-machine:/work/JAVA/12_access_control/03# cd ..
root@book-virtual-machine:/work/JAVA/12_access_control# cd 04/
root@book-virtual-machine:/work/JAVA/12_access_control/04# javac -d . Mymath.java 
root@book-virtual-machine:/work/JAVA/12_access_control/04# javac -d . Pack.java 
Pack.java:7: error: Mymath is not public in b; cannot be accessed from outside package
		Mymath m = new Mymath();
		^
Pack.java:7: error: Mymath is not public in b; cannot be accessed from outside package
		Mymath m = new Mymath();
		               ^
2 errors

