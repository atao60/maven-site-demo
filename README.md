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
- Eclipse ready (but not OSGified),
- ... 

The project is ready for publishing on [Github](http://github.com):

- the source code ,
- a documentation site,
- a m2 repository  (to be done).

Requirements
-----

- JDK 8
- Maven 3.1
- Graphviz

Run
----

      mvn clean
      mvn verify site:site site:stage
      mvn scm-publish:publish-scm

Maven repository
-----

todo

Documentation
----

Visit the site at [last documentation](http://atao60.github.io/maven-site-demo).

Roadmap
-----

- more test frameworks: assertj, mockito, jnario
- OSGi skeleton with Tycho

Credits
----

- photo: [Chaval Brasil](https://www.flickr.com/photos/chavals/) ([CC BY-NC-ND 2.0](https://creativecommons.org/licenses/by-nc-nd/2.0/))