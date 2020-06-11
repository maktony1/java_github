package test0608;

import java.util.Random;
import java.util.Scanner;

/*����(strategy) ������ ���� ����*/
//���ø����̼ǿ��� �޶����� �κ��� ã�Ƴ���, �޶����� �ʴ� �κ����κ��� �и���Ų��.
/*������ ��Ģ
- ���ø����̼ǿ��� �޶����� �κ��� ã�Ƴ��� �޶����� �ʴ� �κ����� ���� �и����� ĸ��ȭ �Ѵ�. 
- ������ �ƴ� �������̽��� ���ļ� ���α׷����Ѵ�. 
- ��Ӻ��� ������ Ȱ���Ѵ�. ("A�� B�̴�" ���� "A���� B�� �ִ�"�� ���� �� �ִ�)
- ������ �̿��Ͽ� �ý����� ����� �������� ũ�� ����ų �� �ִ�. 
- �˰����� ������ Ŭ������ �������� ĸ��ȭ�� �� �ֵ��� ����� �� �Ӹ� �ƴ϶�, ����� �ൿ�� �ٲ��ְ� �ȴ�.
*/

interface RPCGetable{
   public static String[] RPC = {"����","����","��"};
   String generateRPC();   
}

class ComputerRPC  implements RPCGetable{

   @Override
   public String generateRPC() {
      Random random = new Random();
      int value = random.nextInt(3);
      
      return RPCGetable.RPC[value];      
   }   
}

class PersonRPC implements RPCGetable{
   
   public boolean isRPCString(String rpc) {
      boolean isRPC = false;
      
      for(String str : RPC) {
         if(rpc.trim().equals(str))
            return true;
      }      
      return isRPC;
   }
   
   @Override
   public String generateRPC() {
      System.out.println("���� ���� �� �Է��ϼ���");
      Scanner scanner = null; 
      String personRPC;
      
      while(true) {
         try {         
            scanner = new Scanner(System.in);
            personRPC = scanner.next();            
            boolean isRPC = isRPCString(personRPC);
            
            if(isRPC == false) {
               System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է� �� �ּ���.");
               System.out.println("���� ���� �� �߿� �ϳ��� �־� �ּ���");
               continue;
            }else {
               break;
            }            
            
         } catch (Exception e) {
            e.printStackTrace();
            System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է� �� �ּ���.");
            continue;
         }   
      }
      return personRPC;
   }
}


class User {
   private String name;
   private String rpc;
   private String rpcNum;
   
   //���������� �ٽ�
   /*����� �ƴ� ������ Ȱ��*/
   RPCGetable rpcGetable;
   
   //����
   //�������� ������������ ���� �˰����� �����Ҽ� �ִ�
   public void setRpcGetable(RPCGetable rpcGetable) {
      this.rpcGetable = rpcGetable;
   }

   public void setRpc() {
      this.rpc = rpcGetable.generateRPC();
   }
   
   public int getRpcNum() {      
      for(int i=0;i<3;i++) {
         if(rpc.equals(RPCGetable.RPC[i])) {
            return i;
         }
      }      
      return 0;
   }
   
   public User(String name) {
      this.name = name;
   }
   
   public String getRpc() {
      return rpc;      
   }
   
   public void printCompare(User user) {
   
      System.out.println("-------- ���� ���� �� !----------"); 
      System.out.printf("[ %s ] VS [ %s ] \n", this.name, user.name);
      
      int myNum = getRpcNum();
      int userNum = user.getRpcNum();
      
      
      if ((myNum == 0 && userNum == 0) || (myNum == 1 && userNum == 1) || (myNum == 2 && userNum == 2)){ 
            System.out.println(this.name + ":" + this.getRpc() + "  " + user.name + ":" + user.getRpc() +  " " +"���º�..."); 
      } else if ((myNum == 0 && userNum == 1) || (myNum == 1 && userNum == 2) || (myNum == 2 && userNum == 0)) { 
         System.out.println(this.name + ":" + this.getRpc() + "  " + user.name + ":" + user.getRpc() +" " +"����� �й�Ф�"); 
      } 
      else if ((myNum == 0 && userNum == 2) || (myNum == 1 && userNum == 0) || (myNum == 2 && userNum == 1)) { 
         System.out.println(this.name + ":" + this.getRpc() + "  " + user.name + ":" + user.getRpc() + " " +"����� �¸�!");
      }
      
   }

}

class RPCGame{
   
   private static int count = 0; //Ƚ��
   
   void execute() {
      User computer = new User("��ǻ��");
      computer.setRpcGetable(new ComputerRPC());
      
      User person = new User("���");
      person.setRpcGetable(new PersonRPC());
      
      while(true) {
         
         computer.setRpc();
         person.setRpc();
         
         person.printCompare(computer);
         
         count++;
         System.out.println("����� " + count + "ȸ ���Դϴ�.");
         
      }
         
   }
         
}      
         
      
   


public class RPCTest {
   
   public static void main(String[] args) {
      RPCGame rpcGame = new RPCGame();
      rpcGame.execute();
   }
}