package com.zhy.bean;

import com.zhy.tree.bean.KLTreeNodeId;
import com.zhy.tree.bean.KLTreeNodeLabel;
import com.zhy.tree.bean.KLTreeNodePid;

public class KLBean
{
	@KLTreeNodeId
	private int id;
	@KLTreeNodePid
	private int pId;
	@KLTreeNodeLabel
	private String label;

	public boolean isChecked =false;

	public KLBean()
	{
	}

	public KLBean(int id, int pId, String label)
	{
		this.id = id;
		this.pId = pId;
		this.label = label;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getpId()
	{
		return pId;
	}

	public void setpId(int pId)
	{
		this.pId = pId;
	}

	public String getLabel()
	{
		return label;
	}

	public void setLabel(String label)
	{
		this.label = label;
	}

}
