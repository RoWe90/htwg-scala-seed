[![Build Status](https://travis-ci.org/travis-ci/travis-web.svg?branch=master)](https://travis-ci.org/travis-ci/travis-web)
[![Coverage Status](https://coveralls.io/repos/github/RoWe90/TankCommander/badge.svg?branch=master)](https://coveralls.io/github/RoWe90/TankCommander?branch=master)

# Htwg TankCommander Project 
This is a seed project to create a basic scala project as used in the
class Software Engineering at the University of Applied Science HTWG Konstanz.

It requires Java 8 on your local platform.
The project has
* a folder structure prepared for a MVC-style application
* *ScalaTest* and as dependency aswell as dependencies to other libraries in the build.sbt (commented out at start).
* *scalastyle-sbt-plugin* and *sbt-scoverage* sbt plugins
* .gitignore defaults

# Commands to play
* Start: Start the game
* Exit: Leave the Application
* up,down,right,left: Move your Tank accordingly
* shoot: shoot the enemy's tank
* end turn: End your turn
* undo: undo your last command
* redo: redo your last command
* save: save the current state of the game
* load: load the game from a file
