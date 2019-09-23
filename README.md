# CMPSC 100-03 Lab Session 4: Hail, Geiwev%
* Assigned: 22 September 2019
* Due: 29 September 2019
* Point value: 35 pts

> If he had anything confidential to say, he wrote it in cipher, that is, by so changing the order of the letters of the alphabet, that not a word could be made out. If anyone wishes to decipher these, and get at their meaning, he must substitute the fourth letter of the alphabet, namely D, for A, and so with the others. 
— Suetonius, _Life of Julius Caesar_

In this laboratory session, we explore topics including: 

* "casting"
* file inputs
* primitives like `char` and `int` 

in pursuit of implementing a "Caesar" cipher, a simple way of encoding messages.

## General guidelines for laboratory sessions

* **Follow steps carefully.** Laboratory sessions often get a bit more complicated than their preceeding Practical sessions. Especially for early sessions which expose you to platforms with which you may not be familiar, take notes on `command`s you run and their corresponding effects/outputs. If you find yourself stuck on a step, let a TL or the professor know! Laboratory sessions do not mean that we won't help you in the same way we do during Practicals.
* **Regularly ask and answer questions.** Some of you may have more experience with the topics we're discussing than others. We can use this knowledge to our advantage. But, like in Practicals, let students try things for a while before offering help (**always _offer_ first**). To ask questions, use our [Slack](https://cmpsc100fall2019.slack.com)'s `#labs` channel.
* **Store and transfer files using GitHub.** Various forms of file storage are more or less volatile. *You* are responsible for backing up and storing files. If you're unsure of files which have been changed, you can always type `git status` in the terminal for your working folder to determine what you need to back up.
* **Keep all of your files.** See above, but also remember that you're responsible for the files you create.
* **Back up your files regularly.** See above (& above-above).
* **Review the [Honor Code](https://sites.allegheny.edu/about/honor-code/) reguarly when working.** If you're taking a solution from another student or the Internet at-large (_especially_ [Stack Overflow](https://stackoverflow.com)), bear in mind that using these solutions _can_ constitute a form of plagiarism that violates the Allegheny Honor Code. While it may seem easy and convenient to use these sources, it is equally easy and convenient to rely on them and create bad habits which include not attributing credit or relying exclusively on others to solve issues. Neither are productive uses of your intellect. Really.

## Further helpful reading for this assignment

If you have not already done so, I recommend reading the [GitHub Guides](https://guides.github.com) which GitHub makes available. In particular, the guides:
* [Mastering markdown](https://guides.github.com/features/mastering-markdown/)
* [Documenting your projects on GitHub](https://guides.github.com/features/wikis/)
* [GitHub Handbook](https://guides.github.com/introduction/git-handbook/)
* GitHub handouts distributed at the beginning of the lab session

As for a markdown cheatsheet, [this GitHub repository](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet) serves as a useful online, single-page guide.

## Required deliverables

A successful submission for this lab will include a Java program which:

* Compiles
* Runs successfully
* Contains:
    * No instances of the `TODO` placeholder
    * No instances of the `{YOUR NAME HERE}` placeholder
    * At least one (1) instance of the `charAt` method
    * An enciphered word stored in a `String` variable named `encipheredWord`
    * Use of the `+=` assignment operator in the correct context
    * One (1) method named `newCharValue` with a `return` statement returning an `int` value
    * At least one (1) use of the `newCharValue`
    * Output printed on two lines using the `System.out.print` method with a line break
    * Correct program output which prints the enciphered value `Geiwev%`
    * Three (3) multiline "Javadoc" comments accompanying classes and methods
    * Five (5) single line comments separating different parts of the program, each containing descriptions of the code following them

This submission should be accompanied by:

* A 300-word reflection included in a file named `reflection.md`, located in a directory called `writing` located in the main directory of your `commit`ted repository.
    * This file must contain:
        * One (1) level one header which should read "CMPSC 100-03: Lab 4" under which is written:
            * A brief, general description of how the program works
        * Five (5) additional headers (of the second and third levels) which describe:
            * Specific description of the `main` method, including key method calls such as `charAt`
            * Specific description of the `newCharValue` method, including:
                * Its relationship to `main`
                * Why it uses a `return` statement
                * The reason why it is separate from the `main` method
            * A description of "casting" and why you had to invoke the strategy (see pages 83-84 in the textbook for more information)
            
## Write your code

- [ ] If you have not already cloned the repository, do so now.
* Remember proper file management here. You should have a directory where you've started storing files for this course which may be in one of the following locations:
    * ~/Desktop
    * ~/OneDrive/Desktop
- [ ] When you're ready, begin coding in the `DisplayCipher.java` file located in the `/src/main/java/cipher/` directory.

## GatorGrader

### Docker `container`

If you do not already have the GatorGrader `container`, in a new terminal or Docker Quickstart Terminal, type `docker pull gatoreducator/dockagator` to download the correct `container`.

In the last lab session, we were able to get Docker `container` versions of GatorGrader working! That means that everyone can choose to use the `container` if they'd like. Here are a couple of ways to do it.

#### Running GatorGrader directly on `container` start

* Be sure that you are in the main directory of your practicals repository when running these commands, or you'll certainly experience issues!
* Remember that if you run `ls -la`, you should see a `.git` folder if you're in the main repository folder.
* To make sure you're in the right repository, run a `pwd` command.
    * If you recieve the expected path, you're in the right place. Else, find your way to the right location.

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator
```

#### Run `gradle` commands in the container`

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator /bin/bash
```

- [ ] To `build` your Java work, type `gradle build` at the `command` prompt and press the `Enter` key.
- [ ] To `grade` your Java work, type `gradle grade` at the `command` prompt and press the `Enter` key.

### Using `gradle` commands directly

- [ ] In a terminal, ensure you're in the main folder of your practical repository and type `gradle build`
- [ ] After the `command` completes successfully, type `gradle grade`

## `commit` your work

When you've finished your work: remember that there are three (3) steps to submitting a `git` repository: to "pack," to "label," and to "ship."

* Note: attempt all of these from the main directory of the repository.

- [ ] To "pack" the submission: `git add .`
- [ ] To "label" the submission: `git commit -m "{ADD MESSAGE DESCRIPTING PURPOSE OF COMMIT HERE}"`
- [ ] To "ship" the submission: `git push`