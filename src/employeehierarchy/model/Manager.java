package employeehierarchy.model;

public class Manager extends Employee
{
    private int teamSize;
    public Manager()
    {
        System.out.println("Manager Initialized");
    }
    public Manager(int id, String name, String email,float salary,int teamSize)
    {
        super(id,name,email,salary);
        this.teamSize=teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    public void display()
    {
        System.out.println("Manager Info:");
        super.display();
        System.out.println("TeamSize:"+teamSize);
    }
}
