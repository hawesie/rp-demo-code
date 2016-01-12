# Robot Programming Demo Code

These are some classes used to quickly created demos in the Robot Programming lectures for the School of Computer Science, University of Birmingham.

## Getting the code

To use this code in your project you first need to clone the project into your Eclipse workspace. The following assumes you use the directory `~/workspace` as your Eclipse workspace as it is the default value. If this is not true, then replace this directory with the correct one for you. 

1. Open a terminal
2. Change into your workspace directory: `cd ~/workspace`
3. Clone this project using Git: `git clone https://github.com/hawesie/rp-demo-code`
4. In Eclipse, create a new leJOS NXT project with the name `rp-demo-code`. This should automatically find the sources you just cloned. You could also create a leJOS PC project for this code, but by creating an NXT project you ensure that you don't accidentally add code here that won't run on the robot.

## Using the code

You should develop your own code in a *separate project* to `rp-demo-code` as this will allow you to easily update the provided code if necessary. To do this, use the `Java Build Path` entry in your other project's properties, and `Add...` the `rp-demo-code` project under the `Projects` tab.

## Fixing bugs

If you find any bugs in my code, please open an [issue](https://github.com/hawesie/rp-demo-code/issues) or create a pull request with the fix.