# activeShoppe
Momentum Assessment

Hi I'm Zared im a java dev at investec and thanks for the opportunity to do this project kindly exuse my git as messy as it may be I am open to learning and working with you all should you consider me.

I made the project with repsective endpoints and i do think given more time i would beable to do a finer job but as it comes i managed to do this bit.
as for TDD im an newly grasping how to do this and we are in a journey to do this as an organisation where i am at Investec, but i did try my best to use it where i could.
 
I was contraint of time but no excuses this is what i have come up with.(Thanks for the extention of time really appreciate it.)

i enjoyed th thrill of trying this and I think i'll go on to finish it anyway when i get good time myself.

thanks you and i am greatful for the Opportunity.

as for the project..

if you run the JAR you will need to have tomcat and point it to localhost:8080
and you'll see the first endpoint i set up there was rhe welcome, my thoughts around this was the very beginning of trying to make this a restful service.
just to see if it works or not of course.



there are packages Service, Controller, Model and another dao i was still deciding how i would use that.

the design is very simple and an easy approach to getting your payload onto the web.

the controllers would have the respective endpoints and first up is the MomentumCLient controller which of course follows the welcome controller.
this controller has a MomentumClientService instance injected so that we may access the service level business logic and display it to the controller.

And in the service I am able to make and do as I please to find or work with the methods that will be fed through to my Controller.
in the MomentumClientService.java class we have a Arrays.asList where i hardcoded the users into the application and would have them based on POJOs in the Model packages.
a MomentumClient as the assessment asked should have a name and a unique_id and ofcourse each client comes with their respective points.

the Products of Momentum this approach is much similar to the last where there is a Controller feeding off from the MomentumProductsService with methods to be exposed through the Controllers.
and as well as hardcoded Products which are defined from the MomentumProduct in the Model package
 
I have also made a PurchaseService and Controller which will be ochestrating methods from ProductService and ClientService I have avoided making a full complete production ready service as i think that is fair to show i can do something but not give you the full solution as yet.
there are many ways to achieve this and I very hungry to learn and I am Learning a great deal at my current position I always think i can improve with the correct team work and effort on my side i have no doubt about that at all.

I do look forward to hearing from you on your thoughts to my approach and further the discussion.

running the jar file should get you up and running but would be more suitable to take the zip and open it as a project in intelliJ and run it with Tomcat and see my thinking process around doing this.


kindest regards
Zared
