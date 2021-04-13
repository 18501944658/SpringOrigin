package com.itszt.gold.scope;


import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.stereotype.Component;

/**
 * 自定义多例
 */
@Component
public class CustomScope  implements Scope {

  private   ThreadLocal local= new ThreadLocal();

    public Object get(String name, ObjectFactory<?> objectFactory) {
        Object o = local.get();
        if (o!=null){
            return o;
        }else {
            Object object = objectFactory.getObject();
            local.set(object);
            return object;
        }
    }

    public Object remove(String name) {
        Object o = local.get();
        local.remove();
        return o;
    }

    public void registerDestructionCallback(String name, Runnable callback) {

    }

    public Object resolveContextualObject(String key) {
        return null;
    }

    public String getConversationId() {
        return null;
    }
}
