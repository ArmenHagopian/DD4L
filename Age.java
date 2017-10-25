
public class Age {

	int birth_class = 0;
	int age_class = 0;
	public Age(int birth, int age)
	{
		birth_class = birth;
		age_class = age;
	}
    public void setBirth(int birth2)
    {
      this.birth_class = birth2;
      this.age_class = 2017-birth_class;
    }
    public int getAge()
    {
      return this.age_class;
    }  
    public int getBirth()
    {
      return this.birth_class;
    }  
}
