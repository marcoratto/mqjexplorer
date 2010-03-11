// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QueueExtendedPaneBeanInfo.java

package com.kolban.mqjexplorer.panels;

import java.awt.ComponentOrientation;
import java.beans.*;
import java.lang.reflect.Method;

public class QueueExtendedPaneBeanInfo extends SimpleBeanInfo
{

    public QueueExtendedPaneBeanInfo()
    {
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

    public MethodDescriptor definitionTypeGetValueMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = new Class[0];
                method = getBeanClass().getMethod("definitionTypeGetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "definitionTypeGetValue", 0);
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

    public MethodDescriptor definitionTypeSetEditable_booleanMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    Boolean.TYPE
                };
                method = getBeanClass().getMethod("definitionTypeSetEditable", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "definitionTypeSetEditable", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("aBool");
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

    public MethodDescriptor definitionTypeSetValue_intMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    Integer.TYPE
                };
                method = getBeanClass().getMethod("definitionTypeSetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "definitionTypeSetValue", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("value");
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

    public MethodDescriptor defInputOpenOptionGetValueMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = new Class[0];
                method = getBeanClass().getMethod("defInputOpenOptionGetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "defInputOpenOptionGetValue", 0);
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

    public MethodDescriptor defInputOpenOptionSetValue_intMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    Integer.TYPE
                };
                method = getBeanClass().getMethod("defInputOpenOptionSetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "defInputOpenOptionSetValue", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("value");
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

    public MethodDescriptor distListsGetValueMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = new Class[0];
                method = getBeanClass().getMethod("distListsGetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "distListsGetValue", 0);
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

    public MethodDescriptor distListsSetValue_intMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    Integer.TYPE
                };
                method = getBeanClass().getMethod("distListsSetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "distListsSetValue", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("value");
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
        return com.kolban.mqjexplorer.panels.QueueExtendedPane.class;
    }

    public static String getBeanClassName()
    {
        return "com.kolban.mqjexplorer.panels.QueueExtendedPane";
    }

    public BeanDescriptor getBeanDescriptor()
    {
        BeanDescriptor beandescriptor = null;
        try
        {
            beandescriptor = new BeanDescriptor(com.kolban.mqjexplorer.panels.QueueExtendedPane.class);
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
                definitionTypeGetValueMethodDescriptor(), definitionTypeSetEditable_booleanMethodDescriptor(), definitionTypeSetValue_intMethodDescriptor(), defInputOpenOptionGetValueMethodDescriptor(), defInputOpenOptionSetValue_intMethodDescriptor(), distListsGetValueMethodDescriptor(), distListsSetValue_intMethodDescriptor(), main_javalangString__MethodDescriptor(), maxMsgLengthGetValueMethodDescriptor(), maxMsgLengthSetValue_intMethodDescriptor(), 
                maxQDepthGetValueMethodDescriptor(), maxQDepthSetValue_intMethodDescriptor(), msgDeliverySequenceGetValueMethodDescriptor(), msgDeliverySequenceSetValue_intMethodDescriptor(), retentionIntervalGetValueMethodDescriptor(), retentionIntervalSetValue_intMethodDescriptor(), shareabilityGetValueMethodDescriptor(), shareabilitySetValue_intMethodDescriptor()
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
                componentOrientationPropertyDescriptor()
            };
            return apropertydescriptor;
        }
        catch(Throwable throwable)
        {
            handleException(throwable);
        }
        return null;
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

    public MethodDescriptor maxMsgLengthGetValueMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = new Class[0];
                method = getBeanClass().getMethod("maxMsgLengthGetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "maxMsgLengthGetValue", 0);
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

    public MethodDescriptor maxMsgLengthSetValue_intMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    Integer.TYPE
                };
                method = getBeanClass().getMethod("maxMsgLengthSetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "maxMsgLengthSetValue", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("val");
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

    public MethodDescriptor maxQDepthGetValueMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = new Class[0];
                method = getBeanClass().getMethod("maxQDepthGetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "maxQDepthGetValue", 0);
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

    public MethodDescriptor maxQDepthSetValue_intMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    Integer.TYPE
                };
                method = getBeanClass().getMethod("maxQDepthSetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "maxQDepthSetValue", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("val");
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

    public MethodDescriptor msgDeliverySequenceGetValueMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = new Class[0];
                method = getBeanClass().getMethod("msgDeliverySequenceGetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "msgDeliverySequenceGetValue", 0);
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

    public MethodDescriptor msgDeliverySequenceSetValue_intMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    Integer.TYPE
                };
                method = getBeanClass().getMethod("msgDeliverySequenceSetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "msgDeliverySequenceSetValue", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("value");
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

    public MethodDescriptor retentionIntervalGetValueMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = new Class[0];
                method = getBeanClass().getMethod("retentionIntervalGetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "retentionIntervalGetValue", 0);
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

    public MethodDescriptor retentionIntervalSetValue_intMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    Integer.TYPE
                };
                method = getBeanClass().getMethod("retentionIntervalSetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "retentionIntervalSetValue", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("val");
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

    public MethodDescriptor shareabilityGetValueMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = new Class[0];
                method = getBeanClass().getMethod("shareabilityGetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "shareabilityGetValue", 0);
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

    public MethodDescriptor shareabilitySetValue_intMethodDescriptor()
    {
        MethodDescriptor methoddescriptor = null;
        try
        {
            Method method = null;
            try
            {
                Class aclass[] = {
                    Integer.TYPE
                };
                method = getBeanClass().getMethod("shareabilitySetValue", aclass);
            }
            catch(Throwable throwable1)
            {
                handleException(throwable1);
                method = findMethod(getBeanClass(), "shareabilitySetValue", 1);
            }
            try
            {
                ParameterDescriptor parameterdescriptor = new ParameterDescriptor();
                parameterdescriptor.setName("arg1");
                parameterdescriptor.setDisplayName("value");
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

    static Class class$1; /* synthetic field */
    static Class class$2; /* synthetic field */
}
