package Mediator;

/**
 * �н���ģʽ
 * @author localuser
 *
 */
public class MediatorMain {

	public static void main(String[] args)
	{
		// ʵ���������н�  
        Mediator mediator = new HouseMediator();  
          
        Person landlordA, landlordB, renter;  
        landlordA = new Landlord("������", mediator);  
        landlordB = new Landlord("������", mediator);  
                  
        renter = new Renter("С��",mediator);  
          
        // ����ע���н�  
        mediator.registerLandlord(landlordA);  
        mediator.registerLandlord(landlordB);  
        // ������ע���н�  
        mediator.registerRenter(renter);  
          
        // ������ ����������Ϣ  
        renter.sendMessage("����ӹ�԰�������׷��ӣ��۸�1000Ԫ����һ����");  
        System.out.println("--------------------------");  
        // ����A ���ͷ��ݳ�����Ϣ  
        landlordA.sendMessage("��ӹ�԰ѧԺվ����27����¥��һ��һ������  1200/��  ���ߺ� ������վ");  
	}
}
