package Mediator;

public class HouseMediator extends Mediator{

	@Override
	public void operation(Person person, String message) {
		// TODO Auto-generated method stub
		if(person instanceof Renter){  
            // �����ݵ�������Ϣ���ݸ� ע���˵ķ�����  
            for(Person landlord: landlordList){  
                landlord.getMessage(message);  
            }  
        } else if(person instanceof Landlord){  
            // �������ĳ��ⷿ��Ϣ���ݸ� ע���˵� ������������  
            for(Person renter : renterList){  
                renter.getMessage(message);  
            }  
        }  
	}

}
