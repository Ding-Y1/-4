package shiyan4;

public class Test {
    public static void main(String[] args) {
        Graduate graduate = new Graduate();
        graduate.setName("dy");//��������
        graduate.setmoney(4000, 1400);//����ÿѧ�ڵķ���,�¹���
        System.out.println("dyѧ��Ϊ��"+graduate.getxuefei());
        System.out.println("dy������Ϊ��"+graduate.getsalary()); 
        System.out.println("dy��˰�"+((graduate.getsalary()*0.25)-1005));
        graduate.setmoney(30000, 25000);//����ÿѧ�ڵķ���,�¹���
        System.out.println("dyѧ��Ϊ��"+graduate.getxuefei());
        System.out.println("dy������Ϊ��"+graduate.getsalary()); 
        System.out.println("dy��˰�"+((graduate.getsalary()*0.25)-1005));	
        }
        
        
}