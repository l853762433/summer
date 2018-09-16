package Test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pojo.Orders;
import pojo.Product;

public class Test {

	public static void main(String[] args) {
			
		SqlSession session =SessionManager.getInstance().getSession();
		System.out.println(session);
		
		
	
		/*String sql="mapping.productMapper.selectAll";
		
		List<Product> list =session.selectList(sql);
		for(Product product:list) {
			System.out.println(product.getId()+" "+product.getName()+" "+product.getPrice()+" "+product.getNumber());
		}*/
		
		
	/*	User user=new User();
		user.setId(3);
		user.setName("xm");
		user.setContact("15868146666");
		
		String sql="mapping.userMapper.insertUser";
		session.insert(sql, user);*/
	
		
		
		/*Orders orders=new Orders();
		orders.setId(1);
		orders.setUserId(1);
		orders.setProductId(1);
		orders.setBuyNum(5);*/
		
		String sql2="mapping.ordersMapper.selectoo";
		List<Orders> list =session.selectList(sql2);
		for(Orders product:list) {
			System.out.println(product.getId()+" "+product.getProductId()+" "+product.getUserId()+" "+product.getBuyNum());
		}
		
		session.commit();
		session.close();
		
		
	}

}
