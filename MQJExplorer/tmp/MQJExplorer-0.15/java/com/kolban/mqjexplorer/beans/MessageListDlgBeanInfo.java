// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MessageListDlgBeanInfo.java

package com.kolban.mqjexplorer.beans;

import java.awt.ComponentOrientation;
import java.beans.*;
import java.lang.reflect.Method;

public class MessageListDlgBeanInfo extends SimpleBeanInfo
{

    public MessageListDlgBeanInfo()
    {
    }

    public MethodDescriptor close_ActionEventsMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = new Class[0];
                method = getBeanClass().getMethod("close_ActionEvents", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "close_ActionEvents", 0);
            }
            try
            {
                ParameterDescriptor aparameterdescriptor[] = new ParameterDescriptor[0];
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

    public MethodDescriptor columns_ActionEventsMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = new Class[0];
                method = getBeanClass().getMethod("columns_ActionEvents", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "columns_ActionEvents", 0);
            }
            try
            {
                ParameterDescriptor aparameterdescriptor[] = new ParameterDescriptor[0];
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

    public MethodDescriptor connEtoM1_QmgrMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = new Class[0];
                method = getBeanClass().getMethod("connEtoM1_Qmgr", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "connEtoM1_Qmgr", 0);
            }
            try
            {
                ParameterDescriptor aparameterdescriptor[] = new ParameterDescriptor[0];
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
        return com.kolban.mqjexplorer.beans.MessageListDlg.class;
    }

    public static String getBeanClassName()
    {
        return "com.kolban.mqjexplorer.beans.MessageListDlg";
    }

    public BeanDescriptor getBeanDescriptor()
    {
        BeanDescriptor beandescriptor = null;
        try
        {
            beandescriptor = new BeanDescriptor(com.kolban.mqjexplorer.beans.MessageListDlg.class);
        }
        catch(Throwable _ex) { }
        return beandescriptor;
    }

    public EventSetDescriptor[] getEventSetDescriptors()
    {
        try
        {
            EventSetDescriptor aeventsetdescriptor[] = new EventSetDescriptor[0];
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
                close_ActionEventsMethodDescriptor(), columns_ActionEventsMethodDescriptor(), connEtoM1_QmgrMethodDescriptor(), getQNameMethodDescriptor(), main_javalangString__MethodDescriptor(), properties_ActionEventsMethodDescriptor()
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
                componentOrientationPropertyDescriptor(), messageListTableSelectionModePropertyDescriptor(), QNamePropertyDescriptor(), viewportView1BackgroundPropertyDescriptor()
            };
            return apropertydescriptor;
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return null;
    }

    public MethodDescriptor getQNameMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = new Class[0];
                method = getBeanClass().getMethod("getQName", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "getQName", 0);
            }
            try
            {
                ParameterDescriptor aparameterdescriptor[] = new ParameterDescriptor[0];
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

    public PropertyDescriptor messageListTableSelectionModePropertyDescriptor()
    {
        PropertyDescriptor propertydescriptor = null;
        try
        {
            try
            {
                Method method = null;
                Method method1 = null;
                propertydescriptor = new PropertyDescriptor("messageListTableSelectionMode", method, method1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
                propertydescriptor = new PropertyDescriptor("messageListTableSelectionMode", getBeanClass());
            }
        }
        catch(Throwable throwable1)
        {
            handleException(throwable1);
        }
        return propertydescriptor;
    }

    public MethodDescriptor properties_ActionEventsMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = new Class[0];
                method = getBeanClass().getMethod("properties_ActionEvents", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "properties_ActionEvents", 0);
            }
            try
            {
                ParameterDescriptor aparameterdescriptor[] = new ParameterDescriptor[0];
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

    public PropertyDescriptor QNamePropertyDescriptor()
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
                    method = getBeanClass().getMethod("getQName", aclass);
                }
                catch(Throwable throwable2)
                {
                    handleException(throwable2);
                    method = findMethod(getBeanClass(), "getQName", 0);
                }
                Method method1 = null;
                propertydescriptor = new PropertyDescriptor("QName", method, method1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
                propertydescriptor = new PropertyDescriptor("QName", getBeanClass());
            }
        }
        catch(Throwable throwable1)
        {
            handleException(throwable1);
        }
        return propertydescriptor;
    }

    public PropertyDescriptor viewportView1BackgroundPropertyDescriptor()
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
                    method = getBeanClass().getMethod("getViewportView1Background", aclass);
                }
                catch(Throwable throwable2)
                {
                    handleException(throwable2);
                    method = findMethod(getBeanClass(), "getViewportView1Background", 0);
                }
                Method method1 = null;
                try
                {
                    Class aclass1[] = {
                        java.awt.Color.class
                    };
                    method1 = getBeanClass().getMethod("setViewportView1Background", aclass1);
                }
                catch(Throwable throwable3)
                {
                    handleException(throwable3);
                    method1 = findMethod(getBeanClass(), "setViewportView1Background", 1);
                }
                propertydescriptor = new PropertyDescriptor("viewportView1Background", method, method1);
            }
            catch(Throwable throwable)
            {
                handleException(throwable);
                propertydescriptor = new PropertyDescriptor("viewportView1Background", getBeanClass());
            }
            propertydescriptor.setBound(true);
        }
        catch(Throwable throwable1)
        {
            handleException(throwable1);
        }
        return propertydescriptor;
    }
}
