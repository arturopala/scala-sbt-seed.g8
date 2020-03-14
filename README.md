A [Giter8](http://www.foundweekends.org/giter8/) template for creating scala-seed

How to create a new project based on the template?
==

* Install g8 commandline tool (http://www.foundweekends.org/giter8/setup.html)
* Go to the directory where you want to create the template
* Decide your service name (the hardest part :))
* Run the command

    `g8 arturopala/scala-sbt-seed.g8 --projectName="Seed Test" --userName="Artur Opala" --package="com.github.arturopala.seedtest" -o seed-test`
    
and then
    
    cd seed-test
    git init
	git add .
	git commit -m start
  
* Test generated project using command 

    `sbt test`
    

How to test the template and generate an example project?
==

* Run `./test.sh` 

An example project will be then created and tested in `target/sandbox/seed-test`

How to modify the template?
==

 * review template sources in `/src/main/g8`
 * modify files as you need, but be careful about placeholders, paths and so on
 * run `./test.sh` in template root to validate your changes
 
or (safer) ...

* run `./test.sh` first
* open `target/sandbox/seed-test` in your preferred IDE, 
* modify the generated example project as you wish, 
* build and test it as usual, you can run `sbt test`,
* when you are done switch back to the template root
* run `./update-g8.sh` in order to port your changes back to the template.
* run `./test.sh` again to validate your changes

What is in the template?
==

Assuming the command above 
the template will supply the following values for the placeholders:

    $packaged$ -> com/github/arturopala/seedtest
	$package$ -> com.github.arturopala.seedtest
	$userNameCamel$ -> ArturOpala
	$userNamecamel$ -> arturOpala
	$userNameNoSpaceLowercase$ -> arturopala
	$userNameNoSpaceUppercase$ -> ARTUROPALA
	$userNamesnake$ -> artur_opala
	$userNameSnake$ -> ARTUR_OPALA
	$userNamePackage$ -> Artur.Opala
	$userNamePackageLowercase$ -> artur.opala
	$userNamePackaged$ -> Artur/Opala
	$userNamePackagedLowercase$ -> artur/opala
	$userNameHyphen$ -> artur-opala
	$userNameLowercase$ -> artur opala
	$userNameUppercase$ -> ARTUR OPALA
	$userName$ -> Artur Opala
	$projectNameCamel$ -> SeedTest
	$projectNamecamel$ -> seedTest
	$projectNameNoSpaceLowercase$ -> seedtest
	$projectNameNoSpaceUppercase$ -> SEEDTEST
	$projectNamesnake$ -> seed_test
	$projectNameSnake$ -> SEED_TEST
	$projectNamePackage$ -> Seed.Test
	$projectNamePackageLowercase$ -> seed.test
	$projectNamePackaged$ -> Seed/Test
	$projectNamePackagedLowercase$ -> seed/test
	$projectNameHyphen$ -> seed-test
	$projectNameLowercase$ -> seed test
	$projectNameUppercase$ -> SEED TEST
	$projectName$ -> Seed Test

and produce the folders and files as shown below:

    ├── .gitignore
	├── .scalafmt.conf
	├── build.sbt
	├── LICENSE
	├── project
	│   ├── build.properties
	│   └── plugins.sbt
	│
	├── README.md
	├── sonatype.sbt
	├── src
	│   ├── main
	│   │   └── scala
	│   │       └── com
	│   │           └── github
	│   │               └── arturopala
	│   │                   └── seedtest
	│   │                       └── SeedTest.scala
	│   │
	│   └── test
	│       └── scala
	│           └── com
	│               └── github
	│                   └── arturopala
	│                       └── seedtest
	│                           └── SeedTestSpec.scala
	│
	└── version.sbt