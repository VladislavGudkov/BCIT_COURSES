// Fig. 12.3: fig12_03.c
// Inserting and deleting nodes in a list
// Modified by Bob Langelaan on July 10th, 2015
// By Vladislav Gudkov (a00921638)

//C4024 AND C4027 warnings on compile

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

// self-referential structure                       
struct listNode {
	char data; // each listNode contains a character 
	struct listNode *nextPtr; // pointer to next node
};

typedef struct listNode ListNode; // synonym for struct listNode
typedef ListNode *ListNodePtr; // synonym for ListNode*

// prototypes
void insert(ListNodePtr *sPtr, char value);
char delete(ListNodePtr *sPtr, char value);
int isEmpty(ListNodePtr sPtr);
void printList(ListNodePtr currentPtr, int listNumber);
void instructions(void);
void merge(struct listNode* list1, struct listNode* list2);

int main(void)
{
	ListNodePtr startPtr1 = NULL; // initially there are no nodes
	ListNodePtr startPtr2 = NULL;
	char item; // char entered by user

	instructions(); // display the menu
	unsigned int choice; // user's choice

	// loop while user does not choose 6

	int timeToExit = 0;  // false to begin with
	do {
		printf("%s", "? ");
		scanf("%u", &choice);

		switch (choice) {
		case 1:
			printf("%s", "Enter a character: ");
			scanf("\n%c", &item);
			insert(&startPtr1, item); // insert item in list 1
			printList(startPtr1,1);
			break;

		case 2: // delete an element
		   // if list is not empty
			if (!isEmpty(startPtr1)) {
				printf("%s", "Enter character to be deleted: ");
				scanf("\n%c", &item);

				// if character is found, remove it
				if (delete(&startPtr1, item)) { // remove item
					printf("%c deleted.\n", item);
					printList(startPtr1,1);
				}
				else {
					printf("%c not found.\n\n", item);
				}
			}
			else {
				puts("List is empty.\n");
			}

			break;

		case 3: //instert list element 2 
			printf("%s", "Enter a character: ");
			scanf("\n%c", &item);
			insert(&startPtr2, item); // insert item in list 1
			printList(startPtr2,2);
			break;

		case 4: //delete list element 2
			if (!isEmpty(startPtr1)) {
				printf("%s", "Enter character to be deleted: ");
				scanf("\n%c", &item);

				// if character is found, remove it
				if (delete(&startPtr2, item)) { // remove item
					printf("%c deleted.\n", item);
					printList(startPtr2,2);
				}
				else {
					printf("%c not found.\n\n", item);
				}
			}
			else {
				puts("List is empty.\n");
			}

			break;


		case 5:
			puts("\nBefore merge, the 2 lists are: \n");
			printList(startPtr1, 1);
			printList(startPtr2, 2);

			merge(&startPtr1, &startPtr2);

			puts("\nAfter merge, the 2 lists are: \n");
			printList(startPtr1, 1);
			printList(startPtr2, 2);

			break;  


		case 6:
			timeToExit = 1; // now set to true
			break;

		default:
			puts("Invalid choice.\n");
			instructions();
			break;
		} // end switch

	} while (!timeToExit);

	puts("End of run.");

	// Time to go home
	_getch();
}

// display program instructions to user
void instructions(void)
{
	puts("Enter your choice:\n"
		"   1 to insert an element into  list 1.\n"
		"   2 to delete an element from  list 1.\n"
		"   3 to insert an element into  list 2.\n"
		"   4 to delete an element from  list 2.\n"
		"   5 merge list 2 into list 1.\n"
		"   6 to end.");
}

// insert a new value into the list in sorted order
void insert(ListNodePtr *sPtr, char value)
{
	ListNodePtr newPtr = malloc(sizeof(ListNode)); // create node

	if (newPtr != NULL) { // is space available
		newPtr->data = value; // place value in node
		newPtr->nextPtr = NULL; // node does not link to another node

		ListNodePtr previousPtr = NULL;
		ListNodePtr currentPtr = *sPtr;

		// loop to find the correct location in the list       
		while (currentPtr != NULL && value > currentPtr->data) {
			previousPtr = currentPtr; // walk to ...               
			currentPtr = currentPtr->nextPtr; // ... next node 
		}

		// insert new node at beginning of list
		if (previousPtr == NULL) {
			newPtr->nextPtr = *sPtr;
			*sPtr = newPtr;
		}
		else { // insert new node between previousPtr and currentPtr
			previousPtr->nextPtr = newPtr;
			newPtr->nextPtr = currentPtr;
		}
	}
	else {
		printf("%c not inserted. No memory available.\n", value);
	}
}

// delete a list element
char delete(ListNodePtr *sPtr, char value)
{
	// delete first node if a match is found
	// we need to treat deleting the first node as a special case
	if (value == (*sPtr)->data) {
		ListNodePtr tempPtr = *sPtr; // hold onto node being removed
		*sPtr = (*sPtr)->nextPtr; // de-thread the node
		free(tempPtr); // free the de-threaded node
		return value;
	}

	// normal case of potentially deleting node, but not first node
	else {
		ListNodePtr previousPtr = *sPtr;
		ListNodePtr currentPtr = (*sPtr)->nextPtr;

		// loop to find the correct location in the list
		while (currentPtr != NULL && currentPtr->data != value) {
			previousPtr = currentPtr; // walk to ...  
			currentPtr = currentPtr->nextPtr; // ... next node  
		}

		// delete node at currentPtr
		if (currentPtr != NULL) {
			ListNodePtr tempPtr = currentPtr;
			previousPtr->nextPtr = currentPtr->nextPtr;
			free(tempPtr);
			return value;
		}

		else // data item not found so return NULL
		{
			return '\0';
		}
	}

}

// return 1 if the list is empty, 0 otherwise
int isEmpty(ListNodePtr sPtr)
{
	return sPtr == NULL;
}

// print the list
void printList(ListNodePtr currentPtr, int listNumber) //int parameter added to printList to select which list to print (to implement)
{
	// if list is empty
	if (isEmpty(currentPtr)) {
		puts("List is empty.\n");
	}
	else {
		puts("The list is:");

		// while not the end of the list
		while (currentPtr != NULL) {
			printf("%c --> ", currentPtr->data);
			currentPtr = currentPtr->nextPtr;
		}

		puts("NULL\n");
	}
}



void merge(struct listNode* list1, struct listNode* list2)
{
	ListNodePtr currentPtr = list2; //set current pointer to destination (list 2)

	while (currentPtr != NULL) //while not pointing to null
	{
		printf("%c --> ", currentPtr->data);		 //print list to data
		currentPtr = currentPtr->nextPtr; //set currentPtr to point to next pointer
	}

	currentPtr->nextPtr = list2;		 //set point to list 2
	list2 = 0; //while null set list to empt

}


