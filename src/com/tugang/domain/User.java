package com.tugang.domain;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private String uid;
	private String uname;
	private String uaddress;
	private String uage;
	private String usex;
	private String ujoindate;
	private String umail;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public String getUage() {
		return uage;
	}

	public void setUage(String uage) {
		this.uage = uage;
	}

	public String getUsex() {
		return usex;
	}

	public void setUsex(String usex) {
		this.usex = usex;
	}

	public String getUjoindate() {
		return ujoindate;
	}

	public void setUjoindate(String ujoindate) {
		this.ujoindate = ujoindate;
	}

	public String getUmail() {
		return umail;
	}

	public void setUmail(String umail) {
		this.umail = umail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uaddress == null) ? 0 : uaddress.hashCode());
		result = prime * result + ((uage == null) ? 0 : uage.hashCode());
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
		result = prime * result + ((ujoindate == null) ? 0 : ujoindate.hashCode());
		result = prime * result + ((umail == null) ? 0 : umail.hashCode());
		result = prime * result + ((uname == null) ? 0 : uname.hashCode());
		result = prime * result + ((usex == null) ? 0 : usex.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (uaddress == null) {
			if (other.uaddress != null)
				return false;
		} else if (!uaddress.equals(other.uaddress))
			return false;
		if (uage == null) {
			if (other.uage != null)
				return false;
		} else if (!uage.equals(other.uage))
			return false;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		if (ujoindate == null) {
			if (other.ujoindate != null)
				return false;
		} else if (!ujoindate.equals(other.ujoindate))
			return false;
		if (umail == null) {
			if (other.umail != null)
				return false;
		} else if (!umail.equals(other.umail))
			return false;
		if (uname == null) {
			if (other.uname != null)
				return false;
		} else if (!uname.equals(other.uname))
			return false;
		if (usex == null) {
			if (other.usex != null)
				return false;
		} else if (!usex.equals(other.usex))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uaddress=" + uaddress + ", uage=" + uage + ", usex=" + usex
				+ ", ujoindate=" + ujoindate + ", umail=" + umail + "]";
	}

}
