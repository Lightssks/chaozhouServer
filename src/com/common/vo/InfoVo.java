package com.common.vo;

import java.util.Date;

import com.po.Tbuser;

public class InfoVo extends Tbuser {
	private Long sentId;		//产生消息用户Id
	private String shareId;		//分享id 
	private String shareText;	//分享内容
	private String comments; 	//评论
	private Date time;			//时间
	
	public InfoVo() { }
	
	public InfoVo(Long uid, Long sentId, String uname, String shareId, String shareText) {
		this.setUid(uid);
		this.setUname(uname);
		this.sentId = sentId;
		this.shareId = shareId;
		this.shareText = shareText;
	} 
	
	public InfoVo(Long uid, Long sentId, String uname, String shareId, String shareText, Date time) {
		this(uid, sentId, uname, shareId, shareText);
		this.time = time;
	} 
	
	
	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public void setSentId(Long sentId) {
		this.sentId = sentId;
	}

	public Long getSentId() {
		return sentId;
	}
	public void setSentId(long sentId) {
		this.sentId = sentId;
	}
	public String getShareId() {
		return shareId;
	}
	public void setShareId(String shareId) {
		this.shareId = shareId;
	}
	public String getShareText() {
		return shareText;
	}
	public void setShareText(String shareText) {
		this.shareText = shareText;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	
	
	
}
