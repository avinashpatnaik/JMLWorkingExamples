# JavaModellingLanguageWorkingExamples
This repository contains few working examples of Java Modelling Language - A software verification language for Java.

A part of my research involved trying to understand the software verification systems. There are many software verification tools available. The one I focused on is Java Modelling Language which is specifically developed to work with Java. I used OpenJML to perform software verification on different programs listed out in the repository. OpenJML is a program verification tool for Java programs that allows you to check the specifications of programs annotated in the Java Modeling Language.

More on JML : http://www.eecs.ucf.edu/~leavens/JML//index.shtml

More on OpenJML : http://www.openjml.org/

This is an ongoing research. I will upload more examples once I finish coding them up.

<b>GiftCardManagement</b> : This application will allow a customer to load a certain amount of cash into different forms like a gift card, single-use gift card, reloadable gift card, or a debit card using which he/she can purchase a product. It will also allow the available gift card amount to be converted into cash just in case the user needs the cash. Essentially, we have defined different classes( Cash, GiftCard, DebitCard, SingleUseGiftCard, and ReloadableGiftCard) and constructed design-time contracts around those classes using JML. The goal of the project is to ensure all the classes are protected by JML to ensure there are no design-time errors.  (Of course, this doesn't apply to Client.java)

<b>Client.java</b>: This is the client file that is used for testing the program. All the design time tests are passed. 
