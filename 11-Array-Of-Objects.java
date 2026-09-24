
class Student
{
	int rollno;
	String name;
	int marks;	
}

class ArrayObj {
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.rollno=8;
		s1.name="Anuj";
		s1.marks=89;
		
		Student s2=new Student();
		s2.rollno=11;
		s2.name="Ankit";
		s2.marks=81;
		
		Student s3=new Student();
		s3.rollno=13;
		s3.name="Piyush";
		s3.marks=69;
		
		System.out.println(s1.name + "--"+ s1.marks);
		
		Student students[]=new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		for(int i=0;i<students.length;i++)
		{
			System.out.println(students[i].name+":"+students[i].marks);
		}
		
		
		
//		int nums[] = new int[6];
//		nums[0]=2;
//		nums[1]=3;
//		nums[2]=4;
//		nums[3]=5;
//		
//		for(int i=0;i<nums.length;i++)
//		{
//			System.out.println(nums[i]);
//		}
	}
}