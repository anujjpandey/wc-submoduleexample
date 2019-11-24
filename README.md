# wc-submoduleexample
The code contain nothing just a class for elaborate binary search, the purpose of creating this repo is just to show how the sub-module can be used from git to other projects


To setup a submodule write the following command to your project root directory
    git submodule add https://github.com/anujjpandey/wc-submoduleexample.git
    
    git init
    
    git submodule update
    
    cd android_gisapp
    
    git submodule init
    
    git submodule update
    
Then in Android Studio File->Project Structure->app->add a new module and give the path to android_gisapp. After that do a clean build.