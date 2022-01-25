package GitTest01;

public class GitTest01 {
    private String name;
    private int age;

    public GitTest01() {
    }

    public GitTest01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void study(){
        System.out.println("i love study");
    }

    @Override
    public String toString() {
        return "GitTest01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
 class Test{

     public static void main(String[] args) {
         GitTest01 gitTest01 = new GitTest01("张三",12);
         System.out.println(gitTest01.getAge() + gitTest01.getName());
         gitTest01.study();
     }
 }