# pantsbuild_test
Test repo for basic pants structure


## Installation
Install Homebrew (http://brew.sh)

    /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"

Install Java

    brew cask install caskroom/versions/java8

Install Scala 2.11, most likely via

    brew install scala@2.11

Clone the repo and run

    ./pants
    
Check `pants` installation: version should be the same as the one specified in `pants.ini`

    ./pants --version
