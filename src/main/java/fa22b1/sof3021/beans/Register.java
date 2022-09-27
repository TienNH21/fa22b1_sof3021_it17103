package fa22b1.sof3021.beans;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Register {
	@NotEmpty()
	@NotBlank()
	@NotNull
	private String hoTen;
	
	@NotEmpty
	private String sdt;
	
	@NotEmpty
	private String email;
	
	@NotEmpty
	private String password;
	
	@NotEmpty
	private String rePassword;

	@NotEmpty
	private String diaChi;

	@NotEmpty
	private String ngaySinh;

	@NotEmpty
	private String gioiTinh;

	@NotEmpty
	private String avatar;
	
	public Register(String hoTen, String sdt, String email, String password, String rePassword, String diaChi,
			String ngaySinh, String gioiTinh, String avatar) {
		super();
		this.hoTen = hoTen;
		this.sdt = sdt;
		this.email = email;
		this.password = password;
		this.rePassword = rePassword;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.avatar = avatar;
	}

	public Register() {
		super();
	}
	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRePassword() {
		return rePassword;
	}
	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
}
