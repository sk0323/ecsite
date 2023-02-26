package jp.co.internous.ecsite.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
// Entityアノテーション：付与したクラスがEntityとして振る舞うようになる
@Table(name="User")
// Tableアノテーション：DBにあるどのテーブルの実体なのかを指定（今回はUserテーブルの実体）
public class User {

	@Id
	// プライマリーキーであることを指定
	@Column(name="id")
	// テーブル内のどのカラムと紐づけるかを指定
	@GeneratedValue(strategy=GenerationType. IDENTITY)
	// IDフィールドの振る舞い方を指定。今回はAuto_incrementとして振る舞う
	private long id;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="is_admin")
	private int isAdmin;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public int getIsAdmin() {
		return isAdmin;
	}
	
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
}
