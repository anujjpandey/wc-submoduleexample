# wc-submoduleexample
The code contain nothing just a class for elaborate binary search, the purpose of creating this repo is just to show how the sub-module can be used from git to other projects


To setup a submodule write the following command to your project root directory (Make sure that you have setup enviornment variable for git)

1. Use the following command to pull the module code from Git    
    git submodule add https://github.com/anujjpandey/wc-submoduleexample.git
    (If it's throw error :: "fatal : not a git repository" call the 'git init' and then execute the above command again)
    
    
    git init
    
    git submodule update
    
    cd wc-submoduleexample
    
    git submodule init
    
    git submodule update
    
2. Make the following changes:


setting.gradle  ==> include ':app', ':wc-submoduleexample'

app.gradle      ==> implementation project(path: 'wc-submoduleexample')

Note :: This is just to show you how this work, you need to create your android lib and have to push it to your git public or private repo, and then need to do the same execersize with it.
