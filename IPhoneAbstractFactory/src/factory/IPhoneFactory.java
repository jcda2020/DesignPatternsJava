package factory;

import iPhone12abstract.IPhone12;
import iphone13abstract.IPhone13;

public interface IPhoneFactory {
	IPhone12 createIPhone12();
	IPhone13 createIPhone13();	
}
