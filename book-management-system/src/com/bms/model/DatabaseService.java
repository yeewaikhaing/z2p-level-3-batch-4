package com.bms.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.bms.BMS;

public class DatabaseService {

	public static User login(String email, String pass) {
		User user = null;
		
		try(var con = MyConnection.createConnection()) {
			
			var sql = "SELECT * FROM users WHERE email = ? AND password = ?";
			var pstm = con.prepareStatement(sql);
			pstm.setString(1, email);
			pstm.setString(2, pass);
			
			var rs = pstm.executeQuery();
			if(rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public static void saveCategory(String name) throws Exception {
		try(var con = MyConnection.createConnection()){
			
			var sql = "INSERT INTO categories(name, created_at, updated_at, created_by)VALUES(?, ?, ?, ?)";
			var pstm = con.prepareStatement(sql);
			pstm.setString(1, name);
			pstm.setDate(2, Date.valueOf(LocalDate.now()));
			pstm.setDate(3, Date.valueOf(LocalDate.now()));
			pstm.setInt(4, BMS.loginUser.getId());
			
			pstm.executeUpdate();
		}
		catch (Exception e) {
			throw e;
		}
		
	}

	public static List<Category> findAllCategories() {
		List<Category> list = new ArrayList<>();
		
		try(var con = MyConnection.createConnection()) {
			
			var sql = "SELECT * FROM categories ORDER BY created_at";
			var pstm = con.prepareStatement(sql);
			
			var rs = pstm.executeQuery();
			while(rs.next()) {
				// create new category object
				var cat = new Category();
				
				// convert row to object(col value -> obj's field)
				cat.setId(rs.getInt("id"));
				cat.setName(rs.getString("name"));
				cat.setUpdated_at(LocalDate.parse(rs.getString("updated_at"))); // string = 2022-10-4 (rs.getstring())
				cat.setCreated_at(LocalDate.parse(rs.getString("created_at")));
				
				// add to list
				list.add(cat);
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
	}

	public static void updateCategory(Category category) throws Exception {
		
		try(var con = MyConnection.createConnection()) {
			
			var sql = "UPDATE categories SET name = ?, updated_at = ? WHERE id = ?";
			var pstm = con.prepareStatement(sql);
			pstm.setString(1, category.getName());
			pstm.setInt(3, category.getId());
			pstm.setDate(2, Date.valueOf(LocalDate.now()));
			
			pstm.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
		
	}

	public static List<Book> findAllBook() {
		List<Book> list = new ArrayList<>();
		
		try(var con = MyConnection.createConnection()) {
			
			var sql = """
					SELECT b.code, b.title, b.price, c.name 'category', a.name 'author', u.email
					FROM books b, authors a, categories c, users u
					WHERE b.author_id = a.id AND
						b.created_by = u.id AND
						b.category_id = c.id
					""";
			var pstm = con.prepareStatement(sql);
			
			var rs = pstm.executeQuery();
			
			while(rs.next()) {
				// create obj
				var book = new Book();
				// bind table's row to java obj
				book.setId(rs.getInt("code"));
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getDouble("price"));
				book.getAuthor().setName(rs.getString("author"));
				book.getCategory().setName(rs.getString("category"));
				book.getCreated_by().setEmail(rs.getString("email"));
				// add to list
				list.add(book);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
