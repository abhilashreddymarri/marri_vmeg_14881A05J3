import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents(){
		// Add your implementation here
		if(students!=null)
			return students;
		else
			return null;
	}

	@Override
	public void setStudents(Student[] students) throws IllegalArgumentException {
		// Add your implementation here
		if(students==null)
			throw new IllegalArgumentException();
		else
			this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index>=students.length || index<0){
			throw new IllegalArgumentException();
		}
		else{
			return students[index];
		}
	}

	@Override
	public void setStudent(Student student, int index) throws IllegalArgumentException{
		// Add your implementation here
		if(index<0 || student==null || index>=this.students.length)
			throw new IllegalArgumentException();
		else
			this.students[index]=student;
	}

	@Override
	public void addFirst(Student student) throws IllegalArgumentException{
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		Student stud=students[0];
		students[0]=student;
		Student stud1;
		for(int r=1;r<students.length;r++)
		{
			stud1=students[r];
			students[r]=stud;
			stud=stud1;
		}	
	}

	@Override
	public void addLast(Student student) throws IllegalArgumentException{
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		for(int s=0;s<students.length;s++)
		{
			if(students[s]!=null){
				students[s]=student;
				break;
			}
		}	
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(index>=this.students.length || index<0 || student==null)
			throw new IllegalArgumentException();
		Student stud=students[index];
		students[index]=student;
		Student stud1;
		for(int j=index+1;j<students.length;j++)
		{
			stud1=students[j];
			students[j]=stud;
			stud=stud1;
		}
	}

	@Override
	public void remove(int index) throws IllegalArgumentException{
		// Add your implementation here
		if(index<0 || index>=students.length)
			throw new IllegalArgumentException();
		for(int m=index;m<students.length;m++)
		{
			students[m]=students[m+1];
		}
	}

	@Override
	public void remove(Student student) throws IllegalArgumentException{
		// Add your implementation here
		int number=0;
		if(student==null)
			throw new IllegalArgumentException();
		for(int b=0;b<students.length;b++)
		{
			if(students[b]==student)
			{
				for(int c=b;c<students.length-1;c++)
				{
					students[c]=students[c+1];
				}
				number++;
				break;
			}
		}
		if(number==0)
			throw new IllegalArgumentException("Student not exist");
	}

	@Override
	public void removeFromIndex(int index) throws IllegalArgumentException{
		// Add your implementation here
		if(index>=students.length || index<0)
			throw new IllegalArgumentException();
		else{
			for(int d=index+1;d<students.length;d++)
			{
				students[d]=null;
			}
		}
	}

	@Override
	public void removeFromElement(Student student) throws IllegalArgumentException{
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		for(int e=0;e<students.length;e++)
		{
			if(students[e]==student)
			{
				for(int f=e+1;f<students.length;f++)
				{
					students[f]=null;
				}
				break;
			}
		}
	}

	@Override
	public void removeToIndex(int index) throws IllegalArgumentException{
		// Add your implementation here
		int g=0;
		if(index<0 || index>=students.length)
			throw new IllegalArgumentException();
		for(int h=index+1;h<students.length;h++)
		{
			students[g++]=students[h];
		}
		for(int i=g;i<students.length;i++)
		{
			students[i]=null;
		}
	}

	@Override
	public void removeToElement(Student student) throws IllegalArgumentException{
		// Add your implementation here
		int c=0;
		/*if(index<0 || index>=students.length)
			throw new IllegalArgumentException();*/
		for(int j=0;j<students.length;j++)
		{
			if(students[j]==student)
			{
				for(int k=j+1;k<students.length;k++)
				{
					students[c++]=students[k];
				}
				break;
			}
		}
		for(int l=c;l<students.length;l++)
		{
			students[l]=null;
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		Student stud;
		for (int n=0;n<students.length-1;n++)
		{
			for(int p=0;p<students.length-1;p++)
			{
				if(this.students[p].getId()>this.students[p+1].getId())
				{
					stud=this.students[p];
					this.students[p]=this.students[p+1];
					this.students[p+1]=stud;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
