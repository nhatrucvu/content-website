package com.website.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.website.entity.Content;

public class ContentDAO extends JpaDAO<Content> implements GenericDAO<Content> {

	public ContentDAO(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Content create(Content content) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Content update(Content content) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Content get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Content> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
