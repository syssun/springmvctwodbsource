package com.sys.commons.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;

/**
 * 统一API响应结果封装
 */
public class Result {
    private String code;
    private String message;
    private Object data;
    

	public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code();
        return this;
    }

    public Result() {
		super();
		this.code = "1";
		this.message = "操作成功";
		this.data=null;
	}
    public Result(String code,String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }
   
    public Object getData() {
        return data;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
    	ValueFilter filter = new ValueFilter() {
			@Override
			public Object process(Object object, String name, Object value) {
				if (value == null && !"data".equals(name))
                    return "";
				if("data".equals(name)&&value!=null&&value.toString().length()<5) {
					value=null;
				}
                return value;
			}
		};
		SerializeFilter[] filters = new SerializeFilter[1];
		filters[0] = filter ;
		return JSON.toJSONString(this,SerializeConfig.globalInstance,filters,"yyyy-MM-dd HH:mm:ss",JSON.DEFAULT_GENERATE_FEATURE,SerializerFeature.WriteMapNullValue);
		
    }

    public String toStringNoHms() {
        ValueFilter filter = new ValueFilter() {
            @Override
            public Object process(Object object, String name, Object value) {
                if (value == null && !"data".equals(name))
                    return "";
                if("data".equals(name)&&value!=null&&value.toString().length()<5) {
                    value=null;
                }
                return value;
            }
        };
        SerializeFilter[] filters = new SerializeFilter[1];
        filters[0] = filter ;
        return JSON.toJSONString(this,SerializeConfig.globalInstance,filters,"yyyy-MM-dd",JSON.DEFAULT_GENERATE_FEATURE,SerializerFeature.WriteMapNullValue);

    }
}
