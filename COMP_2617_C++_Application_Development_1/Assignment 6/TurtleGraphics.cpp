// Assignment 6: TurtleGraphics.cpp
// turtle moves to print letters BOB and border
// Author: Vladislav Gudkov
// Version 1.0
// Date: November 09, 2020

#include "TurtleGraphics.h"
#include <iostream>
using namespace std;

//constructor
TurtleGraphics::TurtleGraphics()
{
	for (auto& row : m_Floor)
	{
		for (auto& column : row)
		{
			column = 0;
		}
	}

	currentRow = STARTING_ROW;
	currentColumn =STARTING_COL;
	penPosition = STARTING_PEN_POSITION;
	currentDirection = STARTING_DIRECTION;	
}


// reads in all the commands and passes to displayFloor
void TurtleGraphics::processTurtleMoves(const array< int, ARRAY_SIZE>& commands)
{
	int position = 0; // index of commands array position
	int numberOfSteps = 0; // the count of steps

	while (static_cast<Cmds>(commands[position]) != Cmds::END_OF_DATA && position < ARRAY_SIZE) 
	{
		switch (static_cast<Cmds> (commands[position])) 
		{
		case Cmds::PEN_UP:
			penPosition = false;
			break;

		case Cmds::PEN_DWN:
			penPosition = true;
			break;

		case Cmds::TURN_RIGHT:
			switch (currentDirection)
			{
			case Directions::NORTH:
				currentDirection = Directions::EAST;
				break;

			case Directions::EAST:
				currentDirection = Directions::SOUTH;
				break;

			case Directions::SOUTH:
				currentDirection = Directions::WEST;
				break;

			case Directions::WEST:
				currentDirection = Directions::NORTH;
				break;

			default:
				currentDirection = Directions::NORTH; // default direction if turning right
			}
			break;

		case Cmds::TURN_LEFT:
			switch (currentDirection) 
			{
			case Directions::NORTH:
				currentDirection = Directions::WEST;
				break;

			case Directions::EAST:
				currentDirection = Directions::NORTH;
				break;

			case Directions::SOUTH:
				currentDirection = Directions::EAST;
				break;

			case Directions::WEST:
				currentDirection = Directions::SOUTH;
				break;

			default:
				currentDirection = Directions::NORTH; // default direction if turning left
			}
			break;

		case Cmds::MOVE:  // move to the next command
			++position;
			if (commands[position] < 1)
				break;

			switch (currentDirection) 
			{
			case Directions::EAST:
				for (numberOfSteps = 1; numberOfSteps <= commands[position]; ++currentColumn, ++numberOfSteps)
				{
					if (currentColumn >= NCOLS)
					{
						currentColumn = NCOLS;   // set current column to columns maximum
						break;
					}
					if (penPosition)
					{
						m_Floor[currentRow][currentColumn] = true;
					}
				}
				break;

			case Directions::SOUTH:
				for (numberOfSteps = 1; numberOfSteps <= commands[position]; ++currentRow, ++numberOfSteps)
				{
					if (currentRow >= NROWS) 
					{
						currentRow = NROWS; // set current row to row maximum
						break;
					}

					if (penPosition)
					{
						m_Floor[currentRow][currentColumn] = true;
					}
				}
				break;

			case Directions::WEST:
				for (numberOfSteps = 1; numberOfSteps <= commands[position]; --currentColumn, ++numberOfSteps)
				{
					{
						if (currentColumn <= 0) { break; } // reached column 0
					}
					if (penPosition)
					{
						m_Floor[currentRow][currentColumn] = true;
					}
				}
				break;

			case Directions::NORTH:
				for (numberOfSteps = 1; numberOfSteps <= commands[position]; --currentRow, ++numberOfSteps)
				{
					if (currentRow <= 0) 
					 break;  

					if (penPosition) 
						m_Floor[currentRow][currentColumn] = true;
				}
				break;

			default: 	
				return;
			}
			break;

		case Cmds::DISPLAY:
			displayFloor();
			break;
		default:
			return;
		} // end switch statement
		++position;  // advance to next command in array
	}   //  end while loop
}

// displays floor
void TurtleGraphics::displayFloor() const
{
	for (auto const &row : m_Floor)
	{
		for (auto const& column : row)
		{
			if (column == 1) {
				cout << '*';
			}
			else 
			{
				cout << ' ';
			}
		}
		cout << endl;
	}
}
