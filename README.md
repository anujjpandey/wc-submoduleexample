# wc-submoduleexample
The code contain nothing just a class for elaborate binary search, the purpose of creating this repo is just to show how the sub-module can be used from git to other projects


To setup a submodule write the following command to your project root directory (Make sure that you have setup enviornment variable for git)

    
    git submodule add https://github.com/anujjpandey/wc-submoduleexample.git
    
    git init
    
    git submodule update
    
    cd wc-submoduleexample
    
    git submodule init
    
    git submodule update
    
Then in Android Studio File->Project Structure->app->add a new module and give the path to wc-submoduleexample. After that do a clean build.

Note :: This is just to show you how this work, you need to create your android lib and have to push it to your git public or private repo, and then need to do the same execersize with it.

Reference :: https://archie94.github.io/blogs/working-with-submodules-in-git-and-android-studio
