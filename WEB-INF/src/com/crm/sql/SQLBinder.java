package com.crm.sql;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import com.crm.utils.Utils;
import com.crm.utils.TextUtils;

public class SQLBinder {
	
	public static enum Action {
		Insert, Select, Delete
	}
	
	private SQLBinder() { /* cannot be instantiated */}
	
	

	public static String INSERT(com.avaya.sce.runtimecommon.SCESession _s, final String _table){
		StringBuilder sql = new StringBuilder();
		StringBuilder holders = new StringBuilder();
		
		Class<?> model = getTableClassByName(_table);
		HashMap<String, String> _map = new HashMap<String, String>();
		Class[] classes = model.getDeclaredClasses();
	    for(Class innerClass: classes){
	        if(innerClass.getName().endsWith("Column")){
	        	Field[] fields = innerClass.getDeclaredFields();
		        for(Field field : fields){
					String name = field.getName();
					String value = TextUtils.emptyIfNull(Utils.getFieldString(_s, _table, name));
					_map.put(name, value);
		        } 
	        }
	    }

		sql.append("INSERT INTO ").append(_table).append("(");
		int size=_map.size();
		for (Iterator<Entry<String, String>> it = _map.entrySet().iterator(); it.hasNext();) {
			Entry<String, String> item = it.next();
			sql.append(item.getKey());
		    holders.append("'").append(item.getValue()).append("'");
		    if (it.hasNext()) {
		        sql.append(",");
		        holders.append(",");
		    }
		}
		sql.append(") VALUES (").append(holders).append(")");
    	return sql.toString();
    }
	
	public static String getFieldName(Object fieldObject, Object parent) {

		java.lang.reflect.Field[] allFields = parent.getClass().getFields();
		for (java.lang.reflect.Field field : allFields) {
			Object currentFieldObject;
			try {
				currentFieldObject = field.get(parent);
			} catch (Exception e) {
				return null;
			}
			boolean isWantedField = fieldObject.equals(currentFieldObject);
			if (isWantedField) {
				String fieldName = field.getName();
				return fieldName;
			}
		}
		return null;
	}
	
	public static Class<?> getTableClassByName(String _table){
		try {
		    Class<?> c = Class.forName("com.crm.model."+ _table);
		    return c;
		 } catch (ClassNotFoundException e) {
		        e.printStackTrace();
		        return null;
		}
	}
}
