package com.rhcloud.jobsnetwork.interfaces;

import java.util.List;

public interface IDatabaseCrud<T> {
	public void save(T obj);
	public List<?> findAll();
}
