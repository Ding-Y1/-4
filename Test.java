package shiyan4;

public class Test {
    public static void main(String[] args) {
        Graduate graduate = new Graduate();
        graduate.setName("dy");//设置姓名
        graduate.setmoney(4000, 1400);//设置每学期的费用,月工资
        System.out.println("dy学费为："+graduate.getxuefei());
        System.out.println("dy年收入为："+graduate.getsalary()); 
        System.out.println("dy纳税额："+((graduate.getsalary()*0.25)-1005));
        graduate.setmoney(30000, 25000);//设置每学期的费用,月工资
        System.out.println("dy学费为："+graduate.getxuefei());
        System.out.println("dy年收入为："+graduate.getsalary()); 
        System.out.println("dy纳税额："+((graduate.getsalary()*0.25)-1005));	
        }
        
        
}