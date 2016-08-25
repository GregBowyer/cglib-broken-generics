package test;

import net.sf.cglib.core.DefaultNamingPolicy;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.NoOp;
import test.service.ProxyTarget;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        // Breaks
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ProxyTarget.class);
        enhancer.setUseFactory(false);
        enhancer.setClassLoader(ProxyTarget.class.getClassLoader());
        enhancer.setNamingPolicy(new DefaultNamingPolicy());

        Class<? extends Callback>[] callbacks = new Class[] {
            NoOp.class,
            MethodInterceptor.class
        };

        enhancer.setCallbackFilter(new CallbackFilter() {
            public int accept(Method method) {
                return method.getName().equals("converse") ? 1 : 0;
            }
        });
        enhancer.setCallbackTypes(callbacks);
        Class clazz = enhancer.createClass();

        // We would then intercept methods and use the object, but right now
        // we get a verification error
    }

}
