package ca.bcit.comp1451.Session1LabB;

import java.util.ArrayList;
import java.util.Iterator;

public class Club
{
 private ArrayList <Member> members;

/**
 * @No args constructor for arraylist members
 */
public Club()
{
	members = new ArrayList<Member>();
}

//Method for adding a member to the arrayList members
public void join(Member member)
{
	if (members != null)
	{
		members.add(member);
	}
	else
	{
		throw new IllegalArgumentException("member cannot be null");
	}
}

//Method to display size of ArrayList members
public int numberOfMembers()
{
	return members.size();
}

//Method to show a list of members from ArrayList members
public void showMembers()
{
	for (Member member : members)
	{
		System.out.println(member.getFirstName() + " " + member.getLastName() + " joined the Club in " + member.getMonthOfJoining() + " " + member.getYearOfJoining());
	}
}

//Method to show a list of members from ArrayList members by year
public void showMembersByYear(int year)
{
	Iterator<Member> it = members.iterator();
	while (it.hasNext())
	{
		Member aMember = it.next();
		if(aMember.getYearOfJoining() == year)
		{
			System.out.println(aMember.getFirstName() + " " + aMember.getLastName() + " joined in " + aMember.getYearOfJoining());
		}
 	}
}

//Method to remove a list of members from ArrayList members by year
public void removeMembersByYear(int year) 
{
	Iterator<Member> it = members.iterator();
	while (it.hasNext())
	{
		Member aMember = it.next();
		if(aMember.getYearOfJoining() == year)
		{
			it.remove();
		}
	}
}

 
}
