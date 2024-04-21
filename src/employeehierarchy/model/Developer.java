package employeehierarchy.model;

public class Developer extends Employee
{
    private String programmingLanguage;
    public Developer()
    {
        System.out.println("Developer Initialized:");
    }
    public Developer(int id,String name, String email,float salary,String programmingLanguage)
    {
        super(id,name,email,salary);
        this.programmingLanguage=programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    public void display()
    {
        System.out.println("Developer Info:");
        super.display();
        System.out.println("Programming Language:"+programmingLanguage);
    }
}