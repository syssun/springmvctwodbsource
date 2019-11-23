package com.sys.commons.common;



import java.util.List;

/**
 * 响应结果生成工具
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "成功";
    private static final String DEFAULT_NODATA_MESSAGE = "暂无数据";
    /**
       *    成功，不需要返回数据
     * @return
     */
    public static Result genSuccessResult() {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setData(null)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
        
    }
     //成功，正常返回数据
    public static Result genSuccessResult(Object data) {
    	if(data==null)
    		return new Result()
                    .setCode(ResultCode.SUCCESS)
                    .setData(null)
                    .setMessage(DEFAULT_NODATA_MESSAGE);
    	if(data instanceof List) {
    		if(((List)data).size()<=0) {
    			return new Result()
                        .setCode(ResultCode.SUCCESS)
                        .setData(null)
                        .setMessage(DEFAULT_NODATA_MESSAGE);
    		}
    	 }


    	
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    //失败需要返回失败信息
    public static Result genFailResult(String message) {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setData(null)
                .setMessage(message);
    }
    //成功无数据返回
    @Deprecated
    public static Result genNodataResult() {
    	return new Result()
                .setCode(ResultCode.FAIL)
                .setData(null)
                .setMessage(DEFAULT_NODATA_MESSAGE);
    }
    //成功无数据返回
    @Deprecated
    public static Result genNodataMessageResult() {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setData(null)
                .setMessage(DEFAULT_NODATA_MESSAGE);
    }
    //接口返回提示信息
    public static Result genResult(String message) {
        return new Result()
                .setCode(ResultCode.OUTCODE)
                .setData(null)
                .setMessage(message);
        
    }
    
    
}
