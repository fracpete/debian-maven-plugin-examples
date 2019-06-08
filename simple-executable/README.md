# simple-executable

Runs a simple Java program that just outputs the provided
command-line arguments and then waits for the user to
press Enter to exit. The Debian package also installs a 
start menu entry called *Simple Executable*.

Two scripts, located in `src/deb/resources/usr/bin`, will get installed in `/usr/bin`:
* `simple-executable` - minimalistic script that just calls the Java program
* `simple-executable-ext` - bit more sophisticated, as it picks up a
  `JAVA_HOME` environment variable and forwards any command-line arguments
  to the Java program

In `src/deb/resources/usr/share/applications` the following `.desktop` file is available:
* `simple-executable.desktop` - calls the `/usr/bin/simple-executable` script and uses
  the PNG `simple-executable.png` located in `src/deb/resources/usr/share/pixmaps`
