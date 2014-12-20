Maven multi-module skeleton
=====

Goal
----

This project provides a Maven 3 skeleton with:

- multi-module structure,
- parent within a module,
- up-to-date plugins,
- usual quality tools,
- jUnit and Hamcrest,
- markdown edition, 
- UML class diagram in javadoc,
- documentation site with a nice responsive skin, 

It is ready to be imported under Eclipse:

- some launchers are provided,
- quality code rule files can be shared.

The project is published on [Github](http://github.com) with:

- the source code,
- a documentation site,
- a wiki,
- a m2 repository  (to be done).

Requirements
-----

This project required:

- [JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) 8
- [Maven](http://maven.apache.org/) 3.1
- [Git](http://git-scm.com/)
- [Graphviz](http://www.graphviz.org/)

Run
----

To check and update the license:

      mvn clean verify -Dupdate-copyright

To build a local staging repository:

      mvn clean
      mvn verify site:site site:stage
and to publish it under [Github](http://github.com): 
     
      mvn scm-publish:publish-scm
      
Import under Eclipse
-----

##### Import the code source

Use the wizard:

      File > Import... > Git > Project from Git > Clone URi
with:

* https://github.com/atao60/maven-site-demo.git

##### Import the wiki using

Use the same wizard than above with:

* https://github.com/atao60/maven-site-demo.wiki.git


Maven repository
-----

todo

Documentation
----

Visit:

- the [last documentation site](http://atao60.github.io/maven-site-demo).
- the [last documentation wiki](https://github.com/atao60/maven-site-demo/wiki).

Roadmap
-----

- more test frameworks: [assertj](http://joel-costigliola.github.io/assertj/), [mockito](https://code.google.com/p/mockito/), [jnario](http://jnario.org/)
- [OSGi](http://www.osgi.org/Main/HomePage) skeleton with [Tycho](https://eclipse.org/tycho/)

Credits
----

- photo: [Chaval Brasil](https://www.flickr.com/photos/chavals/) ([CC BY-NC-ND 2.0](https://creativecommons.org/licenses/by-nc-nd/2.0/))