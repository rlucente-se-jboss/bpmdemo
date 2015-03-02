Repository Init Content
=======================

Install - use VM image to setup complete infrastructure that includes JBDS, MySQL and a pre-configured BPM 6.0.3 patch 02. 

bpmdemo for POC ACS

Use this project with bpmmodel.jar. Import the jar file given the following artifcat information

<groupId>org.jboss.bpmdemo.army</groupId>
<artifactId>model</artifactId>
<version>1.2</version>

The demo has a workflow to create new notes. Activating the flow, the user fills out a title and note text. A budget and man hours is given too - these values are used to determine if the note requires approval. 

Approval requirements are set by the decision table "SetApprovalRequirement". There are two types of approval - standard and high meaning two people have to approve separately before the note can be submitted.

The flow will, upon approval, submit the note to a database represented by the 'demo1' project found elsewhere.

A timeout for automatic escalation is set for 3 minutes on the first approval. 
