// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RegistrationOptionsBeanInfo.java

package com.kolban.mqjexplorer.pubsub;

import java.awt.ComponentOrientation;
import java.beans.*;
import java.lang.reflect.Method;

public class RegistrationOptionsBeanInfo extends SimpleBeanInfo
{

    public RegistrationOptionsBeanInfo()
    {
    }

    public MethodDescriptor addRegistrationOptionsListener_comkolbanmqjexplorerpubsubRegistrationOptionsListenerMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    com.kolban.mqjexplorer.pubsub.RegistrationOptionsListener.class
                };
                method = getBeanClass().getMethod("addRegistrationOptionsListener", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "addRegistrationOptionsListener", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("newListener");
                ParameterDescriptor aparameterdescriptor[] = {
                    parameterdescriptor
                };
                methoddescriptor = new MethodDescriptor(method, aparameterdescriptor);
            }
            catch(Throwable throwable2)
            {
                handleException(throwable2);
                methoddescriptor = new MethodDescriptor(method);
            }
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return methoddescriptor;
    }

    public PropertyDescriptor componentOrientationPropertyDescriptor()
    {
        PropertyDescriptor propertydescriptor = null;
        try
        {
            try
            {
                Method method = null;
                try
                {
                    Class aclass[] = new Class[0];
                    method = getBeanClass().getMethod("getComponentOrientation", aclass);
                }
                catch(Throwable throwable2)
                {
                    handleException(throwable2);
                    method = findMethod(getBeanClass(), "getComponentOrientation", 0);
                }
                Method method1 = null;
                try
                {
                    Class aclass1[] = {
                        java.awt.ComponentOrientation.class
                    };
                    method1 = getBeanClass().getMethod("setComponentOrientation", aclass1);
                }
                catch(Throwable throwable3)
                {
                    handleException(throwable3);
                    method1 = findMethod(getBeanClass(), "setComponentOrientation", 1);
                }
                propertydescriptor = new PropertyDescriptor("componentOrientation", method, method1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
                propertydescriptor = new PropertyDescriptor("componentOrientation", getBeanClass());
            }
            propertydescriptor.setValue("enumerationValues", ((Object) (new Object[] {
                "UNKNOWN", ComponentOrientation.UNKNOWN, "java.awt.ComponentOrientation.UNKNOWN", "LEFT_TO_RIGHT", ComponentOrientation.LEFT_TO_RIGHT, "java.awt.ComponentOrientation.LEFT_TO_RIGHT", "RIGHT_TO_LEFT", ComponentOrientation.RIGHT_TO_LEFT, "java.awt.ComponentOrientation.RIGHT_TO_LEFT"
            })));
        }
        catch(Throwable throwable1)
        {
            handleException(throwable1);
        }
        return propertydescriptor;
    }

    public MethodDescriptor correlAsIdItem_itemStateChanged_javaawteventItemEventMethodEventDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    java.util.EventObject.class
                };
                method = com.kolban.mqjexplorer.pubsub.RegistrationOptionsListener.class.getMethod("correlAsIdItem_itemStateChanged", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(com.kolban.mqjexplorer.pubsub.RegistrationOptionsListener.class, "correlAsIdItem_itemStateChanged", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("newEvent");
                ParameterDescriptor aparameterdescriptor[] = {
                    parameterdescriptor
                };
                methoddescriptor = new MethodDescriptor(method, aparameterdescriptor);
            }
            catch(Throwable throwable2)
            {
                handleException(throwable2);
                methoddescriptor = new MethodDescriptor(method);
            }
            methoddescriptor.setDisplayName("correlAsIdItem_itemStateChanged(java.awt.event.ItemEvent)");
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return methoddescriptor;
    }

    public PropertyDescriptor correlAsIdSelectedPropertyDescriptor()
    {
        PropertyDescriptor propertydescriptor = null;
        try
        {
            try
            {
                Method method = null;
                try
                {
                    Class aclass[] = new Class[0];
                    method = getBeanClass().getMethod("getCorrelAsIdSelected", aclass);
                }
                catch(Throwable throwable2)
                {
                    handleException(throwable2);
                    method = findMethod(getBeanClass(), "getCorrelAsIdSelected", 0);
                }
                Method method1 = null;
                try
                {
                    Class aclass1[] = {
                        Boolean.TYPE
                    };
                    method1 = getBeanClass().getMethod("setCorrelAsIdSelected", aclass1);
                }
                catch(Throwable throwable3)
                {
                    handleException(throwable3);
                    method1 = findMethod(getBeanClass(), "setCorrelAsIdSelected", 1);
                }
                propertydescriptor = new PropertyDescriptor("correlAsIdSelected", method, method1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
                propertydescriptor = new PropertyDescriptor("correlAsIdSelected", getBeanClass());
            }
        }
        catch(Throwable throwable1)
        {
            handleException(throwable1);
        }
        return propertydescriptor;
    }

    public static Method findMethod(Class class1, String s, int i)
    {
        try
        {
            Method amethod[] = class1.getMethods();
            for(int j = 0; j < amethod.length; j++)
            {
                Method method = amethod[j];
                if(method.getParameterTypes().length == i && method.getName().equals(s))
                    return method;
            }

        }
        catch(Throwable _ex)
        {
            return null;
        }
        return null;
    }

    public BeanInfo[] getAdditionalBeanInfo()
    {
        BeanInfo beaninfo = null;
        Class class1;
        try
        {
            class1 = getBeanDescriptor().getBeanClass().getSuperclass();
        }
        catch(Throwable _ex)
        {
            return null;
        }
        try
        {
            beaninfo = Introspector.getBeanInfo(class1);
        }
        catch(IntrospectionException _ex) { }
        if(beaninfo != null)
        {
            BeanInfo abeaninfo[] = new BeanInfo[1];
            abeaninfo[0] = beaninfo;
            return abeaninfo;
        } else
        {
            return null;
        }
    }

    public static Class getBeanClass()
    {
        return com.kolban.mqjexplorer.pubsub.RegistrationOptions.class;
    }

    public static String getBeanClassName()
    {
        return "com.kolban.mqjexplorer.pubsub.RegistrationOptions";
    }

    public BeanDescriptor getBeanDescriptor()
    {
        BeanDescriptor beandescriptor = null;
        try
        {
            beandescriptor = new BeanDescriptor(com.kolban.mqjexplorer.pubsub.RegistrationOptions.class);
        }
        catch(Throwable _ex) { }
        return beandescriptor;
    }

    public EventSetDescriptor[] getEventSetDescriptors()
    {
        try
        {
            EventSetDescriptor aeventsetdescriptor[] = {
                registrationOptionsEventSetDescriptor()
            };
            return aeventsetdescriptor;
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return null;
    }

    public MethodDescriptor[] getMethodDescriptors()
    {
        try
        {
            MethodDescriptor amethoddescriptor[] = {
                addRegistrationOptionsListener_comkolbanmqjexplorerpubsubRegistrationOptionsListenerMethodDescriptor(), getRegOpts_comkolbanmqMQRFHMethodDescriptor(), main_javalangString__MethodDescriptor(), removeRegistrationOptionsListener_comkolbanmqjexplorerpubsubRegistrationOptionsListenerMethodDescriptor()
            };
            return amethoddescriptor;
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return null;
    }

    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor apropertydescriptor[] = {
                componentOrientationPropertyDescriptor(), correlAsIdSelectedPropertyDescriptor()
            };
            return apropertydescriptor;
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return null;
    }

    public MethodDescriptor getRegOpts_comkolbanmqMQRFHMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    com.kolban.mq.MQRFH.class
                };
                method = getBeanClass().getMethod("getRegOpts", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "getRegOpts", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("rfh");
                ParameterDescriptor aparameterdescriptor[] = {
                    parameterdescriptor
                };
                methoddescriptor = new MethodDescriptor(method, aparameterdescriptor);
            }
            catch(Throwable throwable2)
            {
                handleException(throwable2);
                methoddescriptor = new MethodDescriptor(method);
            }
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return methoddescriptor;
    }

    private void handleException(Throwable throwable)
    {
    }

    public MethodDescriptor main_javalangString__MethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    java.lang.String[].class
                };
                method = getBeanClass().getMethod("main", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "main", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("args");
                ParameterDescriptor aparameterdescriptor[] = {
                    parameterdescriptor
                };
                methoddescriptor = new MethodDescriptor(method, aparameterdescriptor);
            }
            catch(Throwable throwable2)
            {
                handleException(throwable2);
                methoddescriptor = new MethodDescriptor(method);
            }
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return methoddescriptor;
    }

    public MethodDescriptor registrationOptionscorrelAsIdItem_itemStateChanged_javautilEventObjectMethodEventDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    java.util.EventObject.class
                };
                method = com.kolban.mqjexplorer.pubsub.RegistrationOptionsListener.class.getMethod("correlAsIdItem_itemStateChanged", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(com.kolban.mqjexplorer.pubsub.RegistrationOptionsListener.class, "correlAsIdItem_itemStateChanged", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("newEvent");
                ParameterDescriptor aparameterdescriptor[] = {
                    parameterdescriptor
                };
                methoddescriptor = new MethodDescriptor(method, aparameterdescriptor);
            }
            catch(Throwable throwable2)
            {
                handleException(throwable2);
                methoddescriptor = new MethodDescriptor(method);
            }
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return methoddescriptor;
    }

    public EventSetDescriptor registrationOptionsEventSetDescriptor()
    {
        EventSetDescriptor eventsetdescriptor = null;
        try
        {
            try
            {
                MethodDescriptor amethoddescriptor[] = {
                    registrationOptionscorrelAsIdItem_itemStateChanged_javautilEventObjectMethodEventDescriptor()
                };
                Method method = null;
                try
                {
                    Class aclass[] = {
                        com.kolban.mqjexplorer.pubsub.RegistrationOptionsListener.class
                    };
                    method = getBeanClass().getMethod("addRegistrationOptionsListener", aclass);
                }
                catch(Throwable throwable2)
                {
                    handleException(throwable2);
                    method = findMethod(getBeanClass(), "addRegistrationOptionsListener", 1);
                }
                Method method1 = null;
                try
                {
                    Class aclass1[] = {
                        com.kolban.mqjexplorer.pubsub.RegistrationOptionsListener.class
                    };
                    method1 = getBeanClass().getMethod("removeRegistrationOptionsListener", aclass1);
                }
                catch(Throwable throwable3)
                {
                    handleException(throwable3);
                    method1 = findMethod(getBeanClass(), "removeRegistrationOptionsListener", 1);
                }
                eventsetdescriptor = new EventSetDescriptor("registrationOptions", com.kolban.mqjexplorer.pubsub.RegistrationOptionsListener.class, amethoddescriptor, method, method1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
                String as[] = {
                    "correlAsIdItem_itemStateChanged"
                };
                eventsetdescriptor = new EventSetDescriptor(getBeanClass(), "registrationOptions", com.kolban.mqjexplorer.pubsub.RegistrationOptionsListener.class, as, "addRegistrationOptionsListener", "removeRegistrationOptionsListener");
            }
        }
        catch(Throwable throwable1)
        {
            handleException(throwable1);
        }
        return eventsetdescriptor;
    }

    public MethodDescriptor removeRegistrationOptionsListener_comkolbanmqjexplorerpubsubRegistrationOptionsListenerMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    com.kolban.mqjexplorer.pubsub.RegistrationOptionsListener.class
                };
                method = getBeanClass().getMethod("removeRegistrationOptionsListener", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "removeRegistrationOptionsListener", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("newListener");
                ParameterDescriptor aparameterdescriptor[] = {
                    parameterdescriptor
                };
                methoddescriptor = new MethodDescriptor(method, aparameterdescriptor);
            }
            catch(Throwable throwable2)
            {
                handleException(throwable2);
                methoddescriptor = new MethodDescriptor(method);
            }
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return methoddescriptor;
    }

    static Class class$3; /* synthetic field */
}
