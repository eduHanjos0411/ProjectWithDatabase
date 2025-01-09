package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
				
		SellerDao SellerDao = DaoFactory.createSellerDao();
		
		Seller seller = SellerDao.findById(3);
		
		System.out.println(seller);
	}

}
