# Chaos-Engineering

Chaos engineering is the process of testing a distributed computing system to ensure that it can withstand unexpected disruptions. It relies on concepts underlying chaos theory, which focus on random and unpredictable behavior. The goal of chaos engineering is to identify weakness in a system through controlled experiments that introduce random and unpredictable behavior.

In practice this takes the form of a four-step process:

    1. Defining the “steady state” of a system to set a baseline for normal behavior.

    2. Hypothesize that this steady state will continue in both the control group and the experimental group.

    3. Introduce variables that reflect real world events like servers that crash, hard drives that malfunction, or network connections that are severed.

    4. Try to disprove the hypothesis by looking for a difference between the control group and the experimental group.

# Chaos-Monkey

Chaos Monkey is a service which identifies groups of systems and randomly terminates one of the systems in a group. The service operates at a controlled time (does not run on weekends and holidays) and interval (only operates during business hours). In most cases we have designed our applications to continue working when a peer goes offline, but in those special cases we want to make sure there are people around to resolve and learn from any problems. With this in mind Chaos Monkey only runs in business hours with the intent that engineers will be alert and able to respond.

# Why Run Chaos Monkey?

Failures happen, and they inevitably happen when least desired. If your application can't tolerate a system failure even if you are confident that your architecture can tolerate a system failure, are you sure it will still be able to do in down the time. Software is complex and dynamic, that "simple fix" you put in place last week could have undesired consequences. Are the traffic load balancers correctly detect and route requests around system failures, can we reliably rebuild our systems.

# Installation

1.  Make sure the system is configured with python3 as chaos-toolkit cli is based on python3

2.  Create a directory in my case its chaostk

3.  Create a virtual environment using python as:-

           python3 -m venv ~/.venvs/chaostk

4.  Activate the new virtualenv using:-

           source  ~/.venvs/chaostk/bin/activate

5.  Run the chaos cli by provinding the absolute path of the experimen.json file for testing our application

           chaos run /Path/to/experiment.json

# Dependencies And Configuration

We need an openApi and a choas-monkey dependency to be added in our pom.xml as:-

    <!-- Spring-Openapi-ui -->
      	<dependency>
    		<groupId>org.springdoc</groupId>
    		<artifactId>springdoc-openapi-ui</artifactId>
    		<version>1.5.10</version>
    	</dependency>

    <!-- Chaos-Monkey -->
    	<dependency>
    		<groupId>de.codecentric</groupId>
    		<artifactId>chaos-monkey-spring-boot</artifactId>
    		<version>2.5.1</version>
    	</dependency>

Below is the experiment.json file path

      https://github.com/Abhishek010397/Chaos-Engineering/blob/main/experiments/experiment.json
