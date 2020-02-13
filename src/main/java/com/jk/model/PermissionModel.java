package com.jk.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermissionModel implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -9029209307072360126L;

	private Integer id;

    private String name;

    private Integer pid;

    private String text;

    private String url;

    private String state;

    private String description;

    private String checked;

    private Map<String, Object> attributes = new HashMap<String, Object>(); // 添加到节点的自定义属性
    
    private List<PermissionModel> nodes; //子节点数据
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked == null ? null : checked.trim();
    }

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	public List<PermissionModel> getNodes() {
		return nodes;
	}

	public void setNodes(List<PermissionModel> nodes) {
		this.nodes = nodes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PermissionModel [id=" + id + ", name=" + name + ", pid=" + pid + ", text=" + text + ", url=" + url
				+ ", state=" + state + ", description=" + description + ", checked=" + checked + ", attributes="
				+ attributes + ", nodes=" + nodes + ", getId()=" + getId() + ", getName()=" + getName() + ", getPid()="
				+ getPid() + ", getText()=" + getText() + ", getUrl()=" + getUrl() + ", getState()=" + getState()
				+ ", getDescription()=" + getDescription() + ", getChecked()=" + getChecked() + ", getAttributes()="
				+ getAttributes() + ", getNodes()=" + getNodes() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
    
    
}