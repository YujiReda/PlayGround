# Week_3 notes of CTA meeting notes

From now on we can email the CTA whenever we need any feature clarification

## Added features (and MOSCOW features that were revised)  
MUST:
- Software must be able to hold at least one session at one time
- Software must work with in memory [technically no need for database (but it should)]
- Ability to sort questions based on upvotes
- Presenter view for lecturer and moderator (view with only most relevant questions)
- Lecture must have one permament link/endpoint to the session 
- Ability for lecturer and moderator to close the lecture session
- Software must be packeged, operable and contain a instruction file for software execution and deployment
- Software must support distinction between polls and quizzes: 
  - Polls: Multpile choice, but no correct answer (ex. 'Can you see and hear the lecturer?')
  - Quizes: Multiple choice, but with correct answer (ex. '2+2=?')

SHOULD:
- Support multiple sessions at one time
- Both lecturer and moderator should be able to switch between presenter view and normal view (probably by having different sort filters)
- Ability to reopen a poll
- Ability to sort questions based on relevance (apply other sorting factors such as time)
- Ability for the moderators to see which question has already been answered
- Ability for the moderator to mark questions as answered
- The user should choose a user name
- Admin role:
  - Ability to deploy platform
  - Ability to restart the system without losing data
  - Ability to recover the system without losing data (in case power goes down)
  - Have access to a eventlog (who, when, what)
- Software should use database for the moderator to look back previous questions:
  - Filter to see all questions that were answered
  - Export questions to txt file (question, upvotes, user that posted it)

COULD:
- Limit rate of questions
- Ability for moderator to provide written answers (even after the lecture is over) and exported together with the question
- Add JSON file as export option

## Removed features
- Accessibility: No colour-blind mode & report; No getting started guide
- Open-Answer Polls: Now the polls are multiple-choice only
- Question Merging: No merging questions, mods can just delete duplicate questions
- Tags: There's no more adding tags to questions system
- Scalability


## Other clarifications
- No chat
- Banning a user should be for the current session only
- Lecturer and Moderators have the same abilities (just different roles)
- Have different sorting filters rather than having different sections for "top rated" and "newest" questions

## Potential Questions to CTA: 
- Upon reopening polls/quizes should the system store the previous answers?
- Should Lecturer be able to prepare the polls/quizes before the lecture?
- How should look like the session hierarchy?
	- Lecturer as a 'God role'?
	- Moderators privilages granted by Lecturer?
	- What happens to the session hierarchy when Lecturer gets disconnected?
	- Are there any restriced functionalities of Lecturer that Moderators do not have?
		- If no, is there a need for create two roles of Lectuer and Moderators?