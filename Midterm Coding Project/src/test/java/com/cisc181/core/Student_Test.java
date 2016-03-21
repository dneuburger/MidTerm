package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	private static ArrayList<Course> CourseList;
	private static ArrayList<Semester> SemesterList;
	private static ArrayList<Section> SectionList;
	private static ArrayList<Student> StudentList;
	private static ArrayList<Enrollment> EnrollmentList;
	@BeforeClass
	public static void setup() {
		CourseList = new ArrayList<Course>();
		CourseList.add(new Course (UUID.randomUUID(), "CISC181", 100, eMajor.COMPSI));
		CourseList.add(new Course (UUID.randomUUID(), "CHEM104", 100, eMajor.CHEM));
		CourseList.add(new Course (UUID.randomUUID(), "PHYS207", 100, eMajor.PHYSICS));
		SemesterList.add(new Semester (UUID.randomUUID(),new GregorianCalendar(2016, 1, 1).getTime(), new GregorianCalendar(2000, 4, 30).getTime()));
		SemesterList.add(new Semester (UUID.randomUUID(),new GregorianCalendar(2016, 9, 1).getTime(), new GregorianCalendar(2000, 12, 30).getTime()));
		SectionList.add(new Section (CourseList.get(0).getCourseID(), SemesterList.get(0).getSemesterID(), UUID.randomUUID(), 1));
		SectionList.add(new Section (CourseList.get(1).getCourseID(), SemesterList.get(1).getSemesterID(), UUID.randomUUID(), 1));
		SectionList.add(new Section (CourseList.get(2).getCourseID(), SemesterList.get(0).getSemesterID(), UUID.randomUUID(), 1));
		SectionList.add(new Section (CourseList.get(0).getCourseID(), SemesterList.get(1).getSemesterID(), UUID.randomUUID(), 1));
		SectionList.add(new Section (CourseList.get(1).getCourseID(), SemesterList.get(0).getSemesterID(), UUID.randomUUID(), 1));
		SectionList.add(new Section (CourseList.get(2).getCourseID(), SemesterList.get(1).getSemesterID(), UUID.randomUUID(), 1));
		StudentList.add(new Student ("A", "B", "C",new GregorianCalendar(2000, 1, 1).getTime(), eMajor.COMPSI,
			"123 Maple Street", "123456789", "D@email.com"));
		StudentList.add(new Student ("A", "B", "C",new GregorianCalendar(2000, 1, 1).getTime(), eMajor.COMPSI,
				"123 Maple Street", "123456789", "D@email.com"));
		StudentList.add(new Student ("A", "B", "C",new GregorianCalendar(2000, 1, 1).getTime(), eMajor.COMPSI,
				"123 Maple Street", "123456789", "D@email.com"));
		StudentList.add(new Student ("A", "B", "C",new GregorianCalendar(2000, 1, 1).getTime(), eMajor.COMPSI,
				"123 Maple Street", "123456789", "D@email.com"));
		StudentList.add(new Student ("A", "B", "C",new GregorianCalendar(2000, 1, 1).getTime(), eMajor.COMPSI,
				"123 Maple Street", "123456789", "D@email.com"));
		StudentList.add(new Student ("A", "B", "C",new GregorianCalendar(2000, 1, 1).getTime(), eMajor.COMPSI,
				"123 Maple Street", "123456789", "D@email.com"));
		StudentList.add(new Student ("A", "B", "C",new GregorianCalendar(2000, 1, 1).getTime(), eMajor.COMPSI,
				"123 Maple Street", "123456789", "D@email.com"));
		StudentList.add(new Student ("A", "B", "C",new GregorianCalendar(2000, 1, 1).getTime(), eMajor.COMPSI,
				"123 Maple Street", "123456789", "D@email.com"));
		StudentList.add(new Student ("A", "B", "C",new GregorianCalendar(2000, 1, 1).getTime(), eMajor.COMPSI,
				"123 Maple Street", "123456789", "D@email.com"));
		StudentList.add(new Student ("A", "B", "C",new GregorianCalendar(2000, 1, 1).getTime(), eMajor.COMPSI,
				"123 Maple Street", "123456789", "D@email.com"));
		EnrollmentList.add(new Enrollment (SectionList.get(0).getSectionID(),StudentList.get(0).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(1).getSectionID(),StudentList.get(0).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(2).getSectionID(),StudentList.get(0).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(3).getSectionID(),StudentList.get(0).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(4).getSectionID(),StudentList.get(0).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(5).getSectionID(),StudentList.get(0).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(0).getSectionID(),StudentList.get(1).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(1).getSectionID(),StudentList.get(1).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(2).getSectionID(),StudentList.get(1).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(3).getSectionID(),StudentList.get(1).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(4).getSectionID(),StudentList.get(1).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(5).getSectionID(),StudentList.get(1).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(0).getSectionID(),StudentList.get(2).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(1).getSectionID(),StudentList.get(2).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(2).getSectionID(),StudentList.get(2).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(3).getSectionID(),StudentList.get(2).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(4).getSectionID(),StudentList.get(2).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(5).getSectionID(),StudentList.get(2).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(0).getSectionID(),StudentList.get(3).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(1).getSectionID(),StudentList.get(3).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(2).getSectionID(),StudentList.get(3).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(3).getSectionID(),StudentList.get(3).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(4).getSectionID(),StudentList.get(3).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(5).getSectionID(),StudentList.get(3).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(0).getSectionID(),StudentList.get(4).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(1).getSectionID(),StudentList.get(4).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(2).getSectionID(),StudentList.get(4).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(3).getSectionID(),StudentList.get(4).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(4).getSectionID(),StudentList.get(4).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(5).getSectionID(),StudentList.get(4).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(0).getSectionID(),StudentList.get(5).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(1).getSectionID(),StudentList.get(5).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(2).getSectionID(),StudentList.get(5).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(3).getSectionID(),StudentList.get(5).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(4).getSectionID(),StudentList.get(5).getStudentID(),100));
		EnrollmentList.add(new Enrollment (SectionList.get(5).getSectionID(),StudentList.get(5).getStudentID(),100));
		}

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		double gpa = (EnrollmentList.get(0).getGrade()/25);
		assertEquals(gpa, 4.0);
	}
	
	@Test
	public void test2() {
		StudentList.get(0).setMajor(eMajor.CHEM);
	}
}