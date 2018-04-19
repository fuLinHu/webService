package com.lida.dream_webservice.client;

import com.lida.dream_webservice.server.MyWebService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by DuLida on 2016/11/15.
 *
 * 璇ョ被涓簀ava鍙戝竷鐨剋ebservice锛堟湇鍔＄瀹㈡埛绔湪涓�璧凤紝璇ュ鎴风骞堕潪鐢眞sdl2java鐢熸垚锛夐�氳繃main鏂规硶璁块棶
 *
 */
public class ClientForCXF {
    public static MyWebService getInterFace(){
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(MyWebService.class);
        factoryBean.setAddress("http://localhost:8080/webservice/server/web-publish");
        return (MyWebService) factoryBean.create();
    }

    public static void main(String[] args) {
        MyWebService myWebService = getInterFace();
        System.out.println("client: "+myWebService.add(1,3));
    }
}
